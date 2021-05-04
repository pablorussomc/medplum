/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ResearchSubjectTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ResearchSubject(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ResearchSubject.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", ResearchSubject.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", ResearchSubject.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ResearchSubject.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ResearchSubject.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ResearchSubject.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, ResearchSubject.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchSubject.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchSubject.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchSubject.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchSubject.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", ResearchSubject.create().status("x").build().status());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, ResearchSubject.create().period(value).build().period());
    }

    @Test
    public void testStudy() {
        final Reference value = Reference.create().build();
        assertEquals(value, ResearchSubject.create().study(value).build().study());
    }

    @Test
    public void testIndividual() {
        final Reference value = Reference.create().build();
        assertEquals(value, ResearchSubject.create().individual(value).build().individual());
    }

    @Test
    public void testAssignedArm() {
        assertEquals("x", ResearchSubject.create().assignedArm("x").build().assignedArm());
    }

    @Test
    public void testActualArm() {
        assertEquals("x", ResearchSubject.create().actualArm("x").build().actualArm());
    }

    @Test
    public void testConsent() {
        final Reference value = Reference.create().build();
        assertEquals(value, ResearchSubject.create().consent(value).build().consent());
    }
}
