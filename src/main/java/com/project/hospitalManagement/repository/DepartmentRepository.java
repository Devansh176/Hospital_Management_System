package com.project.hospitalManagement.repository;

import com.project.hospitalManagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}