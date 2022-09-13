package com.emids.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emids.entity.BowlerRank;
import com.emids.service.BowlRankService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/ball")
public class BowlRankController {
	
	@Autowired
	private BowlRankService serv;
	
	@GetMapping("/all")
	public ResponseEntity<List<BowlerRank>> findRankAll(){
		return new ResponseEntity<List<BowlerRank>>(serv.findRankAll(),HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<String> saveRank(@RequestBody BowlerRank rank) {
		serv.saveRank(rank);
		return new ResponseEntity<String>("Added",HttpStatus.OK);
	}
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> DeleteRank(@PathVariable("id") Long id) {
		return new ResponseEntity<String>(serv.DeleteRank(id),HttpStatus.OK);
	}

}
