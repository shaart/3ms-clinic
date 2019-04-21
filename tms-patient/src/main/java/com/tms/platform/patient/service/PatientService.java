package com.tms.platform.patient.service;

import com.tms.platform.patient.exception.NotFoundException;
import com.tms.platform.patient.repository.PatientRepository;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

  @Autowired
  private PatientRepository patientRepository;

  public Patient getPatient(String id) {
    return patientRepository.findById(id)
        .orElseThrow(NotFoundException::new);
  }

  public Patient savePatient(Patient patient) {
    return patientRepository.save(patient);
  }
}
