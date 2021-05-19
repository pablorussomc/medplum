/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DocumentReferenceContextTest {

    @Test
    public void testConstructor() {
        assertNotNull(new DocumentReference.DocumentReferenceContext(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(DocumentReference.DocumentReferenceContext.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final DocumentReference.DocumentReferenceContext x = DocumentReference.DocumentReferenceContext.create().build();
        final DocumentReference.DocumentReferenceContext y = DocumentReference.DocumentReferenceContext.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", DocumentReference.DocumentReferenceContext.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentReference.DocumentReferenceContext.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentReference.DocumentReferenceContext.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testEncounter() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentReference.DocumentReferenceContext.create().encounter(value).build().encounter());
    }

    @Test
    public void testEvent() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentReference.DocumentReferenceContext.create().event(value).build().event());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, DocumentReference.DocumentReferenceContext.create().period(value).build().period());
    }

    @Test
    public void testFacilityType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, DocumentReference.DocumentReferenceContext.create().facilityType(value).build().facilityType());
    }

    @Test
    public void testPracticeSetting() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, DocumentReference.DocumentReferenceContext.create().practiceSetting(value).build().practiceSetting());
    }

    @Test
    public void testSourcePatientInfo() {
        final Reference value = Reference.create().build();
        assertEquals(value, DocumentReference.DocumentReferenceContext.create().sourcePatientInfo(value).build().sourcePatientInfo());
    }

    @Test
    public void testRelated() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentReference.DocumentReferenceContext.create().related(value).build().related());
    }
}
