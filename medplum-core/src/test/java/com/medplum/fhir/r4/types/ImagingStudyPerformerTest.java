/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ImagingStudyPerformerTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ImagingStudy.ImagingStudyPerformer(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ImagingStudy.ImagingStudyPerformer.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ImagingStudy.ImagingStudyPerformer x = ImagingStudy.ImagingStudyPerformer.create().build();
        final ImagingStudy.ImagingStudyPerformer y = ImagingStudy.ImagingStudyPerformer.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ImagingStudy.ImagingStudyPerformer.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImagingStudy.ImagingStudyPerformer.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImagingStudy.ImagingStudyPerformer.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testFunction() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ImagingStudy.ImagingStudyPerformer.create().function(value).build().function());
    }

    @Test
    public void testActor() {
        final Reference value = Reference.create().build();
        assertEquals(value, ImagingStudy.ImagingStudyPerformer.create().actor(value).build().actor());
    }
}
