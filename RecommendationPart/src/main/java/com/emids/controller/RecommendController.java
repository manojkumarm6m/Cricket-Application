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

import com.emids.entity.Recommend;
import com.emids.exception.RecommendAlreadyExists;
import com.emids.exception.RecommendNotFound;
import com.emids.repository.RecommendRepository;
import com.emids.service.RecService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/rec")
public class RecommendController {

	@Autowired
	private RecService service;
	
	@PostMapping("/add")
	public ResponseEntity<Void> add(@RequestBody Recommend recommend) throws RecommendAlreadyExists {
		service.savRec(recommend);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Recommend>> all(){
		List<Recommend> list = service.findAllRec();
		return new ResponseEntity<List<Recommend>>(list,HttpStatus.OK);
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") long id) throws RecommendNotFound{
		service.deleteRecommended(id);
		return new ResponseEntity<String>(id+" deleted",HttpStatus.OK);
	}
}
