package com.emids.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emids.entity.Recommend;
import com.emids.exception.RecommendAlreadyExists;
import com.emids.exception.RecommendNotFound;
import com.emids.repository.RecommendRepository;
@Service
public class RecServiceImpl implements RecService{

	
	@Autowired
	private RecommendRepository repo;
	
	@Override
	public void savRec(Recommend recommend) throws RecommendAlreadyExists{
		if(recommend == null) {
			throw new RecommendAlreadyExists();
		}
		repo.save(recommend);
	}

	@Override
	public List<Recommend> findAllRec() {
		List<Recommend> list = repo.findAll();
		return list;
	}

	@Override
	public void deleteRecommended(long id) throws RecommendNotFound {
		if(!repo.existsById(id)) {
			throw new RecommendNotFound();
		}
		repo.deleteById(id);
	}

}
