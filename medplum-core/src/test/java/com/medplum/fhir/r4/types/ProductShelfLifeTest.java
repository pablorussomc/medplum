/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ProductShelfLifeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ProductShelfLife(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ProductShelfLife.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ProductShelfLife x = ProductShelfLife.create().build();
        final ProductShelfLife y = ProductShelfLife.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ProductShelfLife.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ProductShelfLife.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ProductShelfLife.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, ProductShelfLife.create().identifier(value).build().identifier());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ProductShelfLife.create().type(value).build().type());
    }

    @Test
    public void testPeriod() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ProductShelfLife.create().period(value).build().period());
    }

    @Test
    public void testSpecialPrecautionsForStorage() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ProductShelfLife.create().specialPrecautionsForStorage(value).build().specialPrecautionsForStorage());
    }
}
