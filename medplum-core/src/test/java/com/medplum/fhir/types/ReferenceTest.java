/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ReferenceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Reference(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Reference.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Reference.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Reference.create().extension(value).build().extension());
    }

    @Test
    public void testReference() {
        assertEquals("x", Reference.create().reference("x").build().reference());
    }

    @Test
    public void testType() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Reference.create().type(value).build().type());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, Reference.create().identifier(value).build().identifier());
    }

    @Test
    public void testDisplay() {
        assertEquals("x", Reference.create().display("x").build().display());
    }

    @Test
    public void testResource() {
        final Patient p = Patient.create().build();
        assertEquals(p, Reference.create().resource(p).build().resource());
    }

    @Test
    public void testResourceAsClass() {
        final Patient p = Patient.create().build();
        assertEquals(p, Reference.create().resource(p).build().resource(Patient.class));
    }
}
