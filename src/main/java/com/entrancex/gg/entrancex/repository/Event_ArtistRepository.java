package com.entrancex.gg.entrancex.repository;

import com.entrancex.gg.entrancex.entity.Event_Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Event_ArtistRepository extends JpaRepository<Event_Artist, Integer> {

}
