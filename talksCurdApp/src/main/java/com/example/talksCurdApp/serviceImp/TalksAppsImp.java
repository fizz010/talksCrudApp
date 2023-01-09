package com.example.talksCurdApp.serviceImp;

import java.util.List;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.talksCurdApp.dto.TalksAppDto;
import com.example.talksCurdApp.repository.TalksRepository;
//import com.example.talksCurdApp.dto.TalksAppDto;
import com.example.talksCurdApp.serviceInterface.TalksAppInter;

@Service
public class TalksAppsImp implements TalksAppInter {
	
	@Autowired
	TalksRepository talksRepository;

	@Override
	public TalksAppDto save(TalksAppDto talksAppDto) {
		
		return talksRepository.save(talksAppDto);
	}

	@Override
	public void deleteById(int id) {
		talksRepository.deleteById(id);
	}

	@Override
	public TalksAppDto getUbyId(int id) {
		
		return talksRepository.findById(id).get();
	}

	@Override
	public List<TalksAppDto> getAllU() {
		
		return talksRepository.findAll();
	}

	@Override
	public void deleteAll() {
		talksRepository.deleteAll();
		
	}

	@Override
	public void saveAll(List<TalksAppDto> talksAppDto) {
		
		 talksRepository.saveAll(talksAppDto);
	}

	
	
	
}
