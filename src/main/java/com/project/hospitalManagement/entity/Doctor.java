package com.project.hospitalManagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 50)
    private String Specialization;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

     @ManyToMany(mappedBy = "doctors")
    private Set<Department> departments = new HashSet<>();
}
