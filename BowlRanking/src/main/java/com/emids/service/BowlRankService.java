package com.emids.service;

import java.util.List;

import com.emids.entity.BowlerRank;



public interface BowlRankService {
    public List<BowlerRank> findRankAll();
	
	public void saveRank(BowlerRank rank);
	
	public String DeleteRank(Long id);

}
