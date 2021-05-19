/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ValueSetIncludeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ValueSet.ValueSetInclude(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ValueSet.ValueSetInclude.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ValueSet.ValueSetInclude x = ValueSet.ValueSetInclude.create().build();
        final ValueSet.ValueSetInclude y = ValueSet.ValueSetInclude.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ValueSet.ValueSetInclude.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetInclude.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetInclude.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSystem() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ValueSet.ValueSetInclude.create().system(value).build().system());
    }

    @Test
    public void testVersion() {
        assertEquals("x", ValueSet.ValueSetInclude.create().version("x").build().version());
    }

    @Test
    public void testConcept() {
        final java.util.List<ValueSet.ValueSetConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetInclude.create().concept(value).build().concept());
    }

    @Test
    public void testFilter() {
        final java.util.List<ValueSet.ValueSetFilter> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetInclude.create().filter(value).build().filter());
    }

    @Test
    public void testValueSet() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetInclude.create().valueSet(value).build().valueSet());
    }
}
