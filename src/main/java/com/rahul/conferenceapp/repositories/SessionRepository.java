package com.rahul.conferenceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.conferenceapp.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long>{

}
