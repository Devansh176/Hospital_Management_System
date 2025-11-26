package com.project.hospitalManagement;

import com.project.hospitalManagement.entity.Patient;
import com.project.hospitalManagement.repository.PatientRepository;
import com.project.hospitalManagement.service.PatientService;
import com.project.hospitalManagement.type.BloodGroupType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void TestPatientRepository() {
        List<Patient> patients = patientRepository.findAll();
        System.out.println(patients);
    }

    @Test
    public void testTransactionMethods() {
//        Patient patient = patientService.getStudentById(1L);
//        Patient patient = patientRepository.findByName("Rohan Patel");

        List<Patient> patients = patientRepository
                .findByBirthDateOrEmail(
                        LocalDate.of(1998,5,14),
                        "aarav.sharma@example.com"
                );

//        List<Patient> patientList = patientRepository.findByNameContaining("ma");
//        for(Patient pt : patientList) System.out.println(pt);

        List<Patient> patientList = patientRepository.findByBloodGroup(BloodGroupType.A_POSITIVE);
        System.out.println(patientList);
    }
}
