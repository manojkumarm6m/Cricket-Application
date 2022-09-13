package com.emids.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stat")
public class Stat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// batting
	private String fullName;
	private String country;
	private String role;
	private int matches;
	private int runs;
	
	private double average;
	private double strike;
	private int hundreds;
	private int fiftys;
	// bowling
	private int wickets;
	private double eco;
	private int best;
	private double bAverage;
}
