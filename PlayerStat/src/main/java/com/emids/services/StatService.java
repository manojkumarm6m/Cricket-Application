package com.emids.services;

import java.util.List;

import com.emids.entity.Stat;

public interface StatService {

	public List<Stat> findStatAll();
	
	public Stat findById(long id);

	public void saveStat(Stat stat);
}
