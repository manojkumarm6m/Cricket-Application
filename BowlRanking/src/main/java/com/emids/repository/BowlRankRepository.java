package com.emids.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emids.entity.BowlerRank;

@Repository
public interface BowlRankRepository extends JpaRepository<BowlerRank,Long> {

}
