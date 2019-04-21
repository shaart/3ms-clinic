package com.tms.platform.patient.json;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
public class PatientSerializer extends JsonSerializer<Patient> {

  @Override
  public void serialize(Patient patient, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
    FhirContext fhirContext = FhirContext.forR4();
    IParser jsonParser = fhirContext.newJsonParser();
    gen.writeRaw(jsonParser.encodeResourceToString(patient));
  }
}
