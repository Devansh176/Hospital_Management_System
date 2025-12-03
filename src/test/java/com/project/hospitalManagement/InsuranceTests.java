package com.project.hospitalManagement;

import com.project.hospitalManagement.entity.Insurance;
import com.project.hospitalManagement.entity.Patient;
import com.project.hospitalManagement.service.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class InsuranceTests {

    @Autowired
    private InsuranceService insuranceService;

    @Test
    public void testInsurance() {
        Insurance insurance = Insurance.builder()
                .policyNumber("AXIS_1234")
                .provider("AXIS")
                .validUntil(LocalDate.of(2040, 12, 12))
                .build();

        Patient patient = insuranceService.assignInsuraceToPatient(insurance, 1L);
//        System.out.println(patient);
    }
}
