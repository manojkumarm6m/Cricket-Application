package com.emids.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emids.entity.Stat;
import com.emids.repository.StatRepository;

@Service
public class StatServiceImpl implements StatService{

	@Autowired
	private StatRepository repo;
	
	@Override
	public List<Stat> findStatAll() {
		List<Stat> list = repo.findAll();
		return list;
	}

	@Override
	public Stat findById(long id) {
		Stat stat = new Stat();
		if(repo.existsById(id)) {
			stat = repo.findById(id).get();
		}
		return stat;
	}

	@Override
	public void saveStat(Stat stat) {
		repo.save(stat);
	}

}
