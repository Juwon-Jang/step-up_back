package com.stepup.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;
    private String name;
    private String studentNumber;

    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role {
        MENTOR, MENTEE
    }
}
