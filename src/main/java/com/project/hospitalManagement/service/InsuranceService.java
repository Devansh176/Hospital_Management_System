package com.project.hospitalManagement.service;

import com.project.hospitalManagement.entity.Insurance;
import com.project.hospitalManagement.entity.Patient;
import com.project.hospitalManagement.repository.InsuranceRepository;
import com.project.hospitalManagement.repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Patient assignInsuraceToPatient(Insurance insurance, Long patientId) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new EntityNotFoundException("Patient not found with id: "+patientId));

        patient.setInsurance(insurance);
        insurance.setPatient(patient); // To maintain Bi-directional consistency

        return patient;
    }
}
