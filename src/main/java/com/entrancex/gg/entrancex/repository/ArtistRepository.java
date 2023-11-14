package com.entrancex.gg.entrancex.repository;

import com.entrancex.gg.entrancex.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    List<Artist> findByArtistNameContainingIgnoreCase(String searchName);
    Artist findByArtistName(String artistName);
//    List<Artist> findByArtistNameContainingIgnoreCase(String searchName);

}
