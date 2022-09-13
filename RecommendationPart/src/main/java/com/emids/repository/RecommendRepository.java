package com.emids.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emids.entity.Recommend;

@Repository
public interface RecommendRepository extends JpaRepository<Recommend, Long>{

}
