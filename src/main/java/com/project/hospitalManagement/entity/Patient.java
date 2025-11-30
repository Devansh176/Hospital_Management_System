package com.project.hospitalManagement.entity;

import com.project.hospitalManagement.entity.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@ToString
@Setter
@Getter
@Table(
        indexes = {
                @Index(name = "idx_Patient_name", columnList = "name")
        }
)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @ToString.Exclude
    private LocalDate birthDate;

    @Column(unique = true, nullable = false)
    private String email;

    private String gender;

    @Column(updatable = false)
    @CreationTimestamp //Current time will be updated
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;

    @OneToOne
    @JoinColumn(name = "patient_insurance_id") // Owning Side
    private Insurance insurance;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointmentList;

}
