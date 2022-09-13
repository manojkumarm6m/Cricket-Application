package com.emids.service;
import java.util.List;
import com.emids.entity.Match;
public interface MatchService {
	
	public List<Match> findMatchAll();
	
	public Match findById(long id);

	public void saveMatch(Match match);
}
