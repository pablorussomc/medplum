/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TimingTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Timing(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Timing.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Timing x = Timing.create().build();
        final Timing y = Timing.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Timing.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Timing.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Timing.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testEvent() {
        final java.util.List<java.time.Instant> value = java.util.Collections.emptyList();
        assertEquals(value, Timing.create().event(value).build().event());
    }

    @Test
    public void testRepeat() {
        final Timing.TimingRepeat value = Timing.TimingRepeat.create().build();
        assertEquals(value, Timing.create().repeat(value).build().repeat());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Timing.create().code(value).build().code());
    }
}
