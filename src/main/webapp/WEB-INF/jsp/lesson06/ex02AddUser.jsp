<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<%-- AJAX를 사용하려면 jquery 원본 필요 --%>
<script src="https://code.jquery.com/jquery-3.6.4.js" integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>회원 가입</h1>
		
		<form method="post" action="/lesson06/ex01/add_user">
			<div class="form-group">
				<label for="name"><b>이름</b></label>
				
				<div class="d-flex">
					<input type="text" id="name" name="name" class="form-control col-3">
					<button type="button" id="nameCheckBtn" class="btn btn-info">중복확인</button>	
				</div>
				
				<small id="nameStatusArea"></small>
			</div>
			
			<!-- <input type="submit" class="btn btn-success" value="회원가입"> -->
			<%-- AJAX 통신일 때는 반드시 button 타입으로 지정한다. --%>
			<input type="button" id="joinBtn" class="btn btn-success" value="회원가입">
		</form>
	</div>
	
	<script>
		$(document).ready(function() {
			// 중복확인 버튼 클릭
			$("#nameCheckBtn").on('click', function() {
				
				// nameStatusArea 하위 태그들을 초기화
				$('nameStatusArea').empty(); // 자식 태그들을 모두 비운다.
				
				
				// alert("중복확인");
				let name = $("#name").val().trim();
				
				// validation
				// 이름이 비어있는지 확인
				if (!name) {
					$('#nameStatusArea').append('<span class="text-danger">이름이 비어있습니다.</span>');
					return;
				}
				
				// AJAX 통신 - 중복된 이름인지 DB에서 확인
				$.ajax({
					// request
					type:"GET"
					, url:"/lesson06/ex02/is-duplication-name"
					, data:{"name":name}
				
					// response
					, success:function(data) {
						// {"code":200, "is_duplication":true}
						if (data.is_duplication) {
							// 중복일 때
							$('#nameStatusArea').append('<span class="text-danger">중복된 이름입니다.</span>');
						}
					}
					, error:function(request, status, error){
						alert("이름 중복확인에 실패했습니다.");
					}
				 });
			});
			
			// 회원가입 버튼 클릭
			$("#joinBtn").on('click', function() {
				// alert("회원가입");
				
				// nameStatusArea에 아무 자식 태그가 없다면 가입 진행
				console.log($('#nameStatusArea').children());
				
				if ($('#nameStatusArea').children().length < 1) {
					alert("회원가입 진행");
				} else {
					alert("회원가입 불가");
				}
				
			});
			
		});
	
	</script>
</body>
</html>