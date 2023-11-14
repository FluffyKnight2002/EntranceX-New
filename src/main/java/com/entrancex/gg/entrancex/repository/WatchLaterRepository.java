package com.entrancex.gg.entrancex.repository;

import com.entrancex.gg.entrancex.entity.WatchLater;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WatchLaterRepository extends JpaRepository<WatchLater,Integer> {
    WatchLater findByUserIdAndEventId(int userId, int eventId);
    List<WatchLater> findByUserId(int userId);
}
