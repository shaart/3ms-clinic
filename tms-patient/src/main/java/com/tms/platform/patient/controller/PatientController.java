package com.tms.platform.patient.controller;

import com.tms.platform.patient.service.PatientService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@RequiredArgsConstructor
public class PatientController {

  private final PatientService patientService;

  @GetMapping("/{id}")
  public Patient getPatient(@PathVariable String id) {
    return patientService.getPatient(id);
  }

  @DeleteMapping("/{id}")
  public Long deletePatient(@PathVariable String id) {
    return patientService.deletePatientById(id);
  }

  @PostMapping
  public Patient savePatient(@RequestBody Patient patient) {
    return patientService.savePatient(patient);
  }

  @GetMapping
  public List<Patient> getPatientsList() {
    return patientService.getPatientsList();
  }
}
