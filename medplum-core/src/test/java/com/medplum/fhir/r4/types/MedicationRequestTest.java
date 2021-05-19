/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicationRequestTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicationRequest(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicationRequest.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final MedicationRequest x = MedicationRequest.create().build();
        final MedicationRequest y = MedicationRequest.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MedicationRequest.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, MedicationRequest.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, MedicationRequest.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", MedicationRequest.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, MedicationRequest.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", MedicationRequest.create().status("x").build().status());
    }

    @Test
    public void testStatusReason() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationRequest.create().statusReason(value).build().statusReason());
    }

    @Test
    public void testIntent() {
        assertEquals("x", MedicationRequest.create().intent("x").build().intent());
    }

    @Test
    public void testCategory() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().category(value).build().category());
    }

    @Test
    public void testPriority() {
        assertEquals("x", MedicationRequest.create().priority("x").build().priority());
    }

    @Test
    public void testDoNotPerform() {
        assertEquals(true, MedicationRequest.create().doNotPerform(true).build().doNotPerform());
    }

    @Test
    public void testReportedBoolean() {
        assertEquals(true, MedicationRequest.create().reportedBoolean(true).build().reportedBoolean());
    }

    @Test
    public void testReportedReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationRequest.create().reportedReference(value).build().reportedReference());
    }

    @Test
    public void testMedicationCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationRequest.create().medicationCodeableConcept(value).build().medicationCodeableConcept());
    }

    @Test
    public void testMedicationReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationRequest.create().medicationReference(value).build().medicationReference());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationRequest.create().subject(value).build().subject());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationRequest.create().encounter(value).build().encounter());
    }

    @Test
    public void testSupportingInformation() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().supportingInformation(value).build().supportingInformation());
    }

    @Test
    public void testAuthoredOn() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, MedicationRequest.create().authoredOn(value).build().authoredOn());
    }

    @Test
    public void testRequester() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationRequest.create().requester(value).build().requester());
    }

    @Test
    public void testPerformer() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationRequest.create().performer(value).build().performer());
    }

    @Test
    public void testPerformerType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationRequest.create().performerType(value).build().performerType());
    }

    @Test
    public void testRecorder() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationRequest.create().recorder(value).build().recorder());
    }

    @Test
    public void testReasonCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().reasonCode(value).build().reasonCode());
    }

    @Test
    public void testReasonReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().reasonReference(value).build().reasonReference());
    }

    @Test
    public void testInstantiatesCanonical() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().instantiatesCanonical(value).build().instantiatesCanonical());
    }

    @Test
    public void testInstantiatesUri() {
        final java.util.List<java.net.URI> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().instantiatesUri(value).build().instantiatesUri());
    }

    @Test
    public void testBasedOn() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().basedOn(value).build().basedOn());
    }

    @Test
    public void testGroupIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, MedicationRequest.create().groupIdentifier(value).build().groupIdentifier());
    }

    @Test
    public void testCourseOfTherapyType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationRequest.create().courseOfTherapyType(value).build().courseOfTherapyType());
    }

    @Test
    public void testInsurance() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().insurance(value).build().insurance());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().note(value).build().note());
    }

    @Test
    public void testDosageInstruction() {
        final java.util.List<Dosage> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().dosageInstruction(value).build().dosageInstruction());
    }

    @Test
    public void testDispenseRequest() {
        final MedicationRequest.MedicationRequestDispenseRequest value = MedicationRequest.MedicationRequestDispenseRequest.create().build();
        assertEquals(value, MedicationRequest.create().dispenseRequest(value).build().dispenseRequest());
    }

    @Test
    public void testSubstitution() {
        final MedicationRequest.MedicationRequestSubstitution value = MedicationRequest.MedicationRequestSubstitution.create().build();
        assertEquals(value, MedicationRequest.create().substitution(value).build().substitution());
    }

    @Test
    public void testPriorPrescription() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationRequest.create().priorPrescription(value).build().priorPrescription());
    }

    @Test
    public void testDetectedIssue() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().detectedIssue(value).build().detectedIssue());
    }

    @Test
    public void testEventHistory() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.create().eventHistory(value).build().eventHistory());
    }
}
