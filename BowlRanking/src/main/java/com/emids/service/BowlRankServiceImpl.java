package com.emids.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emids.entity.BowlerRank;
import com.emids.repository.BowlRankRepository;

@Service
public class BowlRankServiceImpl implements BowlRankService{
	
	@Autowired
	private BowlRankRepository bRepo;
	
	@Override
	public List<BowlerRank> findRankAll(){
		List<BowlerRank> rank=bRepo.findAll();
		return rank;
	}
	
	@Override
	public void saveRank(BowlerRank rank) {
		bRepo.save(rank);
	}
	@Override
	public String DeleteRank(Long id) {
		if(bRepo.existsById(id)) {
			bRepo.deleteById(id);
			return "Rank with:"+id+"deleted";
		}
		return "Rank not found";
	}
}