package com.rahul.conferenceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.conferenceapp.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
