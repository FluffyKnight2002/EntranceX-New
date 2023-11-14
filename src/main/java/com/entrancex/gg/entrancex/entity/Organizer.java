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
public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 30)
    private String userName, companyName, organizerEmail, companyEmail;


    @Column(length = 15)
    private String organizerPhone, companyPhone, role;

    private String companyAddress, companyBio, password;
    private int status;
//    0 for unban and 1 for ban in status


    @OneToMany(mappedBy = "organizer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Event> events = new ArrayList<>();


}
