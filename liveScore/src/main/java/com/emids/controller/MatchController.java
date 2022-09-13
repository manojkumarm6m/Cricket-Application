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

import com.emids.entity.Match;
import com.emids.service.MatchService;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/score")
@RestController
public class MatchController {

	@Autowired
	private MatchService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Match>> findMatchAll() {
		List<Match> list = service.findMatchAll();
		return new ResponseEntity<List<Match>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Void> addMatch(@RequestBody Match match){
		service.saveMatch(match);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/call/{id}")
	public ResponseEntity<Match> findById(@PathVariable("id") long id) {
		Match stat = service.findById(id);
		return new ResponseEntity<Match>(stat,HttpStatus.OK);
	}
}
