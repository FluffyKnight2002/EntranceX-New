package com.entrancex.gg.entrancex.repository;

import com.entrancex.gg.entrancex.entity.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizerRepository extends JpaRepository <Organizer, Integer>{
    Organizer findByUserName(String userName);
    Organizer findByOrganizerEmail(String email);


}
