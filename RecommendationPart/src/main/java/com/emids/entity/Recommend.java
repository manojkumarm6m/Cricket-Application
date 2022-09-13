package com.emids.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Recommend {

	@Id
	private Long id;
	
	private String fullName;
	private String majorTeam;
	private String img;
	private String countryName;
}
