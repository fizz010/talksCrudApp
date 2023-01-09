package com.example.talksCurdApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.talksCurdApp.dto.TalksAppDto;
import com.example.talksCurdApp.serviceInterface.TalksAppInter;

import lombok.CustomLog;
@RestController
@CrossOrigin("*")
public class AppController {

	@Autowired
	TalksAppInter talksAppInter;
	
	@PostMapping("/app")
	public String saveU(@RequestBody TalksAppDto talksAppDto) {
		talksAppInter.save(talksAppDto);
		return "Data Inserted";
	}
	
	@DeleteMapping("/app/{id}")
	public String deleteU(@PathVariable int id) {
		talksAppInter.deleteById(id);
		return "User Deleted";
	}
	@GetMapping("/app/{id}")
	public TalksAppDto getById(@PathVariable int id) {
		return talksAppInter.getUbyId(id);
	}
	
	@GetMapping("/apps")
	public List<TalksAppDto> getAll() {
		return talksAppInter.getAllU();
	}
	
	@DeleteMapping("/apps")
	public String deleteAll() {
		talksAppInter.deleteAll();
		return "All User Deleted";
	}
	
	@PostMapping("/apps")
	public String saveAll(@RequestBody List<TalksAppDto> talksAppDto) {
		 talksAppInter.saveAll(talksAppDto);
		 return "saved";
	}
}
