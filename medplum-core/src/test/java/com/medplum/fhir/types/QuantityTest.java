/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class QuantityTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Quantity(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Quantity.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testId() {
        assertEquals("x", Quantity.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Quantity.create().extension(value).build().extension());
    }

    @Test
    public void testValue() {
        assertEquals(1.0, Quantity.create().value(1.0).build().value());
    }

    @Test
    public void testComparator() {
        assertEquals("x", Quantity.create().comparator("x").build().comparator());
    }

    @Test
    public void testUnit() {
        assertEquals("x", Quantity.create().unit("x").build().unit());
    }

    @Test
    public void testSystem() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Quantity.create().system(value).build().system());
    }

    @Test
    public void testCode() {
        assertEquals("x", Quantity.create().code("x").build().code());
    }
}
