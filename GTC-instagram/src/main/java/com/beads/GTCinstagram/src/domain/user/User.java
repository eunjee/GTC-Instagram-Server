package com.beads.GTCinstagram.src.domain.user;

import javax.persistence.*;

@Entity
public class User {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long userId;
}
