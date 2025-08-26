package com.project.hospitalManagement;

import com.project.hospitalManagement.entity.Patient;
import com.project.hospitalManagement.repository.PatientRepository;
import com.project.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        Patient patient = patientService.getStudentById(1L);
        System.out.println(patient);

    }
}
