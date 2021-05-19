/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClaimResponseSubDetail1Test {

    @Test
    public void testConstructor() {
        assertNotNull(new ClaimResponse.ClaimResponseSubDetail1(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ClaimResponse.ClaimResponseSubDetail1.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ClaimResponse.ClaimResponseSubDetail1 x = ClaimResponse.ClaimResponseSubDetail1.create().build();
        final ClaimResponse.ClaimResponseSubDetail1 y = ClaimResponse.ClaimResponseSubDetail1.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ClaimResponse.ClaimResponseSubDetail1.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClaimResponse.ClaimResponseSubDetail1.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClaimResponse.ClaimResponseSubDetail1.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testProductOrService() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ClaimResponse.ClaimResponseSubDetail1.create().productOrService(value).build().productOrService());
    }

    @Test
    public void testModifier() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ClaimResponse.ClaimResponseSubDetail1.create().modifier(value).build().modifier());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ClaimResponse.ClaimResponseSubDetail1.create().quantity(value).build().quantity());
    }

    @Test
    public void testUnitPrice() {
        final Money value = Money.create().build();
        assertEquals(value, ClaimResponse.ClaimResponseSubDetail1.create().unitPrice(value).build().unitPrice());
    }

    @Test
    public void testFactor() {
        assertEquals(1.0, ClaimResponse.ClaimResponseSubDetail1.create().factor(1.0).build().factor());
    }

    @Test
    public void testNet() {
        final Money value = Money.create().build();
        assertEquals(value, ClaimResponse.ClaimResponseSubDetail1.create().net(value).build().net());
    }

    @Test
    public void testNoteNumber() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, ClaimResponse.ClaimResponseSubDetail1.create().noteNumber(value).build().noteNumber());
    }

    @Test
    public void testAdjudication() {
        final java.util.List<ClaimResponse.ClaimResponseAdjudication> value = java.util.Collections.emptyList();
        assertEquals(value, ClaimResponse.ClaimResponseSubDetail1.create().adjudication(value).build().adjudication());
    }
}
