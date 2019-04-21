package com.tms.platform.patient.controller;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.parser.JsonParser;
import com.tms.platform.patient.service.PatientService;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/patient")
@RestController
public class PatientController {

  @Autowired
  private PatientService patientService;

  @GetMapping("/{id}")
  public Patient getPatient(@PathVariable String id) {
    return patientService.getPatient(id);
  }

  @PostMapping(consumes = "application/json")
  public Patient savePatient(@RequestBody String patientJson) {
    FhirContext fhirContext = FhirContext.forR4();
    IParser jsonParser = fhirContext.newJsonParser();
    Patient patient = jsonParser.parseResource(Patient.class, patientJson);
    return patientService.savePatient(patient);
  }
}
