package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;
import com.example.lesson02.mapper.UsedGoodsMapper;

@Service // Spring Bean으로 등록 (BO)
public class UsedGoodsBO {
	
	@Autowired // Dependency injection (DI): 의존성 주입
				// Spring Bean을 가져온다.
	private UsedGoodsMapper usedGoodsMapper;
	
	// input: X (컨트롤러한테 받아온다)
	// output:  (Repository한테 받은 것을) List<UsedGoods> (컨트롤러한테 준다)
	public List<UsedGoods> getUsedGoodsList() {
		return usedGoodsMapper.selectUsedGoodsList(); 
	}
}
