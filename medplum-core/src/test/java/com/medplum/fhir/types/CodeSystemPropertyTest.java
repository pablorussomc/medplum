/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CodeSystemPropertyTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CodeSystem.CodeSystemProperty(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CodeSystem.CodeSystemProperty.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", CodeSystem.CodeSystemProperty.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CodeSystem.CodeSystemProperty.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CodeSystem.CodeSystemProperty.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        assertEquals("x", CodeSystem.CodeSystemProperty.create().code("x").build().code());
    }

    @Test
    public void testUri() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, CodeSystem.CodeSystemProperty.create().uri(value).build().uri());
    }

    @Test
    public void testDescription() {
        assertEquals("x", CodeSystem.CodeSystemProperty.create().description("x").build().description());
    }

    @Test
    public void testType() {
        assertEquals("x", CodeSystem.CodeSystemProperty.create().type("x").build().type());
    }
}
