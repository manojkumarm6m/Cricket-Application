package com.emids.service;

import java.util.List;

import com.emids.entity.Recommend;
import com.emids.exception.RecommendAlreadyExists;
import com.emids.exception.RecommendNotFound;

public interface RecService {

	public void savRec(Recommend recommend) throws RecommendAlreadyExists;
	
	public List<Recommend> findAllRec();

	public void deleteRecommended(long id) throws RecommendNotFound;
}
