/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TerminologyCapabilitiesImplementationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TerminologyCapabilities.TerminologyCapabilitiesImplementation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TerminologyCapabilities.TerminologyCapabilitiesImplementation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesImplementation.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesImplementation.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesImplementation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDescription() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesImplementation.create().description("x").build().description());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesImplementation.create().url(value).build().url());
    }
}
