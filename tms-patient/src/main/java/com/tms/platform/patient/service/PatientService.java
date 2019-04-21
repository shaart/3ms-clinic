package com.tms.platform.patient.service;

import com.tms.platform.patient.exception.NotFoundException;
import com.tms.platform.patient.repository.PatientRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

  private final PatientRepository patientRepository;

  public Patient getPatient(String id) {
    return patientRepository.findById_MyUnqualifiedId(id)
        .orElseThrow(NotFoundException::new);
  }

  public Patient savePatient(Patient patient) {
    return patientRepository.save(patient);
  }

  public List<Patient> getPatientsList() {
    return patientRepository.findAll();
  }

  public Long deletePatientById(String id) {
    return patientRepository.deleteById_MyUnqualifiedId(id);
  }
}
