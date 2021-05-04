/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class GuidanceResponseTest {

    @Test
    public void testConstructor() {
        assertNotNull(new GuidanceResponse(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(GuidanceResponse.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", GuidanceResponse.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", GuidanceResponse.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, GuidanceResponse.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, GuidanceResponse.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", GuidanceResponse.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, GuidanceResponse.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, GuidanceResponse.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, GuidanceResponse.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, GuidanceResponse.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testRequestIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, GuidanceResponse.create().requestIdentifier(value).build().requestIdentifier());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, GuidanceResponse.create().identifier(value).build().identifier());
    }

    @Test
    public void testModuleUri() {
        assertEquals("x", GuidanceResponse.create().moduleUri("x").build().moduleUri());
    }

    @Test
    public void testModuleCanonical() {
        assertEquals("x", GuidanceResponse.create().moduleCanonical("x").build().moduleCanonical());
    }

    @Test
    public void testModuleCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, GuidanceResponse.create().moduleCodeableConcept(value).build().moduleCodeableConcept());
    }

    @Test
    public void testStatus() {
        assertEquals("x", GuidanceResponse.create().status("x").build().status());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, GuidanceResponse.create().subject(value).build().subject());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, GuidanceResponse.create().encounter(value).build().encounter());
    }

    @Test
    public void testOccurrenceDateTime() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, GuidanceResponse.create().occurrenceDateTime(value).build().occurrenceDateTime());
    }

    @Test
    public void testPerformer() {
        final Reference value = Reference.create().build();
        assertEquals(value, GuidanceResponse.create().performer(value).build().performer());
    }

    @Test
    public void testReasonCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, GuidanceResponse.create().reasonCode(value).build().reasonCode());
    }

    @Test
    public void testReasonReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, GuidanceResponse.create().reasonReference(value).build().reasonReference());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, GuidanceResponse.create().note(value).build().note());
    }

    @Test
    public void testEvaluationMessage() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, GuidanceResponse.create().evaluationMessage(value).build().evaluationMessage());
    }

    @Test
    public void testOutputParameters() {
        final Reference value = Reference.create().build();
        assertEquals(value, GuidanceResponse.create().outputParameters(value).build().outputParameters());
    }

    @Test
    public void testResult() {
        final Reference value = Reference.create().build();
        assertEquals(value, GuidanceResponse.create().result(value).build().result());
    }

    @Test
    public void testDataRequirement() {
        final java.util.List<DataRequirement> value = java.util.Collections.emptyList();
        assertEquals(value, GuidanceResponse.create().dataRequirement(value).build().dataRequirement());
    }
}
