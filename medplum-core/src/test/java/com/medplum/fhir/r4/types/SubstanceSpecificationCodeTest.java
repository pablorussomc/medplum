/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceSpecificationCodeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceSpecification.SubstanceSpecificationCode(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceSpecification.SubstanceSpecificationCode.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final SubstanceSpecification.SubstanceSpecificationCode x = SubstanceSpecification.SubstanceSpecificationCode.create().build();
        final SubstanceSpecification.SubstanceSpecificationCode y = SubstanceSpecification.SubstanceSpecificationCode.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceSpecification.SubstanceSpecificationCode.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationCode.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationCode.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationCode.create().code(value).build().code());
    }

    @Test
    public void testStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationCode.create().status(value).build().status());
    }

    @Test
    public void testStatusDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationCode.create().statusDate(value).build().statusDate());
    }

    @Test
    public void testComment() {
        assertEquals("x", SubstanceSpecification.SubstanceSpecificationCode.create().comment("x").build().comment());
    }

    @Test
    public void testSource() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationCode.create().source(value).build().source());
    }
}
