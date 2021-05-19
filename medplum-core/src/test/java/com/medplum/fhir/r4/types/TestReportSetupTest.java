/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TestReportSetupTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TestReport.TestReportSetup(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TestReport.TestReportSetup.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final TestReport.TestReportSetup x = TestReport.TestReportSetup.create().build();
        final TestReport.TestReportSetup y = TestReport.TestReportSetup.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", TestReport.TestReportSetup.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.TestReportSetup.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.TestReportSetup.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAction() {
        final java.util.List<TestReport.TestReportAction> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.TestReportSetup.create().action(value).build().action());
    }
}
