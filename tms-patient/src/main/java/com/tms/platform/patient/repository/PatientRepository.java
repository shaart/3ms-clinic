package com.tms.platform.patient.repository;

import java.util.Optional;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {

  Optional<Patient> findById_MyUnqualifiedId(String id);

  Long deleteById_MyUnqualifiedId(String id);
}
