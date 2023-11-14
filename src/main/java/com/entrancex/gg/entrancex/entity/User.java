package com.entrancex.gg.entrancex.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 30)
    private String userName, email, gender;

    @Column(length = 15)
    private String phone;

    private String password;
    //    one to many from user to order & history
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TicketOrder_History> orderHistory = new ArrayList<>();

    //one to many from user to watch later
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WatchLater> watchLater = new ArrayList<>();


}
