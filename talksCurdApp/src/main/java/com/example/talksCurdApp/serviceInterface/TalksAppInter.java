package com.example.talksCurdApp.serviceInterface;

import java.util.List;

import com.example.talksCurdApp.dto.TalksAppDto;

public interface TalksAppInter {
	TalksAppDto save(TalksAppDto talks);
	void deleteById(int id);
	TalksAppDto getUbyId(int id);
	List<TalksAppDto> getAllU();
	void deleteAll();
	void saveAll(List<TalksAppDto> talksAppDto);
}
