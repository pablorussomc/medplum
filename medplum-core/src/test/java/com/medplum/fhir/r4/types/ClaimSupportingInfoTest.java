/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClaimSupportingInfoTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Claim.ClaimSupportingInfo(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Claim.ClaimSupportingInfo.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Claim.ClaimSupportingInfo x = Claim.ClaimSupportingInfo.create().build();
        final Claim.ClaimSupportingInfo y = Claim.ClaimSupportingInfo.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Claim.ClaimSupportingInfo.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimSupportingInfo.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimSupportingInfo.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSequence() {
        assertEquals(1, Claim.ClaimSupportingInfo.create().sequence(1).build().sequence());
    }

    @Test
    public void testCategory() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.ClaimSupportingInfo.create().category(value).build().category());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.ClaimSupportingInfo.create().code(value).build().code());
    }

    @Test
    public void testTimingDate() {
        assertEquals("x", Claim.ClaimSupportingInfo.create().timingDate("x").build().timingDate());
    }

    @Test
    public void testTimingPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Claim.ClaimSupportingInfo.create().timingPeriod(value).build().timingPeriod());
    }

    @Test
    public void testValueBoolean() {
        assertEquals(true, Claim.ClaimSupportingInfo.create().valueBoolean(true).build().valueBoolean());
    }

    @Test
    public void testValueString() {
        assertEquals("x", Claim.ClaimSupportingInfo.create().valueString("x").build().valueString());
    }

    @Test
    public void testValueQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, Claim.ClaimSupportingInfo.create().valueQuantity(value).build().valueQuantity());
    }

    @Test
    public void testValueAttachment() {
        final Attachment value = Attachment.create().build();
        assertEquals(value, Claim.ClaimSupportingInfo.create().valueAttachment(value).build().valueAttachment());
    }

    @Test
    public void testValueReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.ClaimSupportingInfo.create().valueReference(value).build().valueReference());
    }

    @Test
    public void testReason() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.ClaimSupportingInfo.create().reason(value).build().reason());
    }
}
