/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TestScriptSetupTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TestScript.TestScriptSetup(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TestScript.TestScriptSetup.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final TestScript.TestScriptSetup x = TestScript.TestScriptSetup.create().build();
        final TestScript.TestScriptSetup y = TestScript.TestScriptSetup.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", TestScript.TestScriptSetup.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptSetup.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptSetup.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAction() {
        final java.util.List<TestScript.TestScriptAction> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptSetup.create().action(value).build().action());
    }
}
