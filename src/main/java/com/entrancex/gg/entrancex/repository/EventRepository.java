package com.entrancex.gg.entrancex.repository;


import com.entrancex.gg.entrancex.entity.Artist;
import com.entrancex.gg.entrancex.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    List <Event> findByOrganizerId(int organizerId);
    List <Event> findByEventNameContainingIgnoreCase(String eventName);
    List <Event> findByStatus(int status);
    List<Event> findByPromotionGreaterThan(int promotion);

    @Query("SELECT ea.artist FROM Event_Artist ea WHERE ea.event.id = :eventId")
    List<Artist> findArtistsByEventId(int eventId);
    List<Event> findByEventNameContainingIgnoreCaseAndOrganizerId(String eventName, int organizerId);




}
