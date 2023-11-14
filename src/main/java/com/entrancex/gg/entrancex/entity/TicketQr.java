package com.entrancex.gg.entrancex.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketQr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String ticketType;

    @Lob
    @Column(columnDefinition = "longblob")
    private String ticketQr;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticketOrder_id")
    private TicketOrder_History ticketOrder;

}
