package com.emids.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emids.entity.Match;

@Repository
public interface MatchRepository extends JpaRepository <Match, Long> {

}


