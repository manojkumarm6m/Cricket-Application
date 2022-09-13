package com.emids.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emids.entity.Stat;

@Repository
public interface StatRepository extends JpaRepository<Stat, Long>{

}
