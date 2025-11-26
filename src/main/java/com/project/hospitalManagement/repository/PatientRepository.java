package com.project.hospitalManagement.repository;

import com.project.hospitalManagement.entity.Patient;
import com.project.hospitalManagement.type.BloodGroupType;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findByName(String name);
    Patient findByBirthDate(LocalDate birthDate);
    List<Patient> findByBirthDateOrEmail(LocalDate birthDate, String email);
    List<Patient> findByNameContaining(String query);

    //for more type of queries, visit:
    //https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

    //This is JPQL - Jakarta Persistence Query Language
    //JPQL is used when you want to write the query by yourself without predefined queries.
    @Query("Select p from Patient p where p.bloodGroup = ?1")
    List<Patient> findByBloodGroup(@Param("bloodGroup") BloodGroupType bloodGroup);

    @Query("select p from Patient p ")
    List<Patient> findByBornAfterDate(@Param("birthDate") LocalDate birthDate);
}
