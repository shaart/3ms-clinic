package com.tms.platform.patient.json;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
public class PatientDeserializer extends JsonDeserializer<Patient> {

  @Override
  public Patient deserialize(JsonParser p, DeserializationContext ctxt)
      throws IOException {
    FhirContext fhirContext = FhirContext.forR4();
    IParser jsonParser = fhirContext.newJsonParser();

    return jsonParser.parseResource(Patient.class, p.getCodec().readTree(p).toString());
  }
}
