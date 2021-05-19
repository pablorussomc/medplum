/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicationKnowledgeMonographTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicationKnowledge.MedicationKnowledgeMonograph(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicationKnowledge.MedicationKnowledgeMonograph.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final MedicationKnowledge.MedicationKnowledgeMonograph x = MedicationKnowledge.MedicationKnowledgeMonograph.create().build();
        final MedicationKnowledge.MedicationKnowledgeMonograph y = MedicationKnowledge.MedicationKnowledgeMonograph.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MedicationKnowledge.MedicationKnowledgeMonograph.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMonograph.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMonograph.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMonograph.create().type(value).build().type());
    }

    @Test
    public void testSource() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMonograph.create().source(value).build().source());
    }
}
