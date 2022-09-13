package com.emids.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emids.entity.Stat;
import com.emids.services.StatService;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/stat")
@RestController
public class StatController {

	@Autowired
	private StatService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Stat>> findStatAll() {
		List<Stat> list = service.findStatAll();
		return new ResponseEntity<List<Stat>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Void> addStat(@RequestBody Stat stat){
		service.saveStat(stat);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/call/{id}")
	public ResponseEntity<Stat> findById(@PathVariable("id") long id) {
		Stat stat = service.findById(id);
		return new ResponseEntity<Stat>(stat,HttpStatus.OK);
	}
}
