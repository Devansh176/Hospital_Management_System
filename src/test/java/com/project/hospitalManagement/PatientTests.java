package com.project.hospitalManagement;

import com.project.hospitalManagement.entity.Patient;
import com.project.hospitalManagement.repository.PatientRepository;
import com.project.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

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

//        List<Patient> patients = patientRepository
//                .findByBirthDateOrEmail(
//                        LocalDate.of(1998,5,14),
//                        "aarav.sharma@example.com"
//                );
//
////        List<Patient> patientList = patientRepository.findByNameContaining("ma");
//
////        List<Patient> patientList = patientRepository.findByBloodGroup(BloodGroupType.A_POSITIVE);
////        System.out.println(patientList);
//
//        Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(1, 2));
//        for(Patient pt : patientList) System.out.println(pt);

//        int rowsUpdated = patientRepository.updateNameWithId("Shreyas Iyer", 4L);
//        System.out.println(rowsUpdated);

//        List<BloodGroupResponseEntity> bloodGroupList = patientRepository.countEachBloodGroupType();
//        for(BloodGroupResponseEntity bloodGroupResponseEntity : bloodGroupList) {
//            System.out.println(bloodGroupResponseEntity);
//        }
    }
}
