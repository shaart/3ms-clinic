package com.tms.platform.patient.controller;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import com.tms.platform.patient.service.PatientService;
import java.util.List;
import java.util.StringJoiner;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/patient")
@RestController
public class PatientController {

  private static final FhirContext FHIR_CONTEXT = FhirContext.forR4();

  @Autowired
  private PatientService patientService;

  @GetMapping("/{id}")
  public String getPatient(@PathVariable String id) {
    IParser jsonParser = FHIR_CONTEXT.newJsonParser();
    Patient patient = patientService.getPatient(id);
    return patientToJson(jsonParser, patient);
  }

  @DeleteMapping("/{id}")
  public Long deletePatient(@PathVariable String id) {
    return patientService.deletePatientById(id);
  }

  @PostMapping
  public Patient savePatient(@RequestBody String patientJson) {
    IParser jsonParser = FHIR_CONTEXT.newJsonParser();
    Patient patient = jsonParser.parseResource(Patient.class, patientJson);
    return patientService.savePatient(patient);
  }

  @GetMapping(produces = "application/json")
  public String getPatientsList() {
    IParser jsonParser = FHIR_CONTEXT.newJsonParser();
    List<Patient> patientsList = patientService.getPatientsList();
    StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
    patientsList.forEach(patient -> stringJoiner.add(patientToJson(jsonParser, patient)));
    return stringJoiner.toString();
  }

  private String patientToJson(IParser jsonParser, Patient patient) {
    return jsonParser.encodeResourceToString(patient);
  }
}
