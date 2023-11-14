package com.entrancex.gg.entrancex.repository;


import com.entrancex.gg.entrancex.entity.TicketQr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketQrRepository extends JpaRepository<TicketQr, Integer> {
    List<TicketQr> findByTicketOrderId(int eventId);
}
