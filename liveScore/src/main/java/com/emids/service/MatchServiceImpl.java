package com.emids.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emids.entity.Match;
import com.emids.repository.MatchRepository;

@Service
public class MatchServiceImpl implements MatchService{

	@Autowired
	private MatchRepository repo;
	
	@Override
	public List<Match> findMatchAll() {
		List<Match> list = repo.findAll();
		return list;
	}

	@Override
	public Match findById(long id) {
		Match stat = new Match();
		if(repo.existsById(id)) {
			stat = repo.findById(id).get();
		}
		return stat;	
	}

	public void saveMatch(Match match) {
		repo.save(match);
	}
}

