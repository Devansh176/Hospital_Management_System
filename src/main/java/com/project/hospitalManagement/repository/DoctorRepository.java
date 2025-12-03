package com.project.hospitalManagement.repository;

import com.project.hospitalManagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}