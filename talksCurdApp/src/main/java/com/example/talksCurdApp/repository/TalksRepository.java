package com.example.talksCurdApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.talksCurdApp.dto.TalksAppDto;
@Repository
public interface TalksRepository extends JpaRepository<TalksAppDto, Integer> {

}
