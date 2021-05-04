/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class VisionPrescriptionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new VisionPrescription(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(VisionPrescription.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", VisionPrescription.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", VisionPrescription.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, VisionPrescription.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, VisionPrescription.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", VisionPrescription.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, VisionPrescription.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, VisionPrescription.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, VisionPrescription.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, VisionPrescription.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, VisionPrescription.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", VisionPrescription.create().status("x").build().status());
    }

    @Test
    public void testCreated() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, VisionPrescription.create().created(value).build().created());
    }

    @Test
    public void testPatient() {
        final Reference value = Reference.create().build();
        assertEquals(value, VisionPrescription.create().patient(value).build().patient());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, VisionPrescription.create().encounter(value).build().encounter());
    }

    @Test
    public void testDateWritten() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, VisionPrescription.create().dateWritten(value).build().dateWritten());
    }

    @Test
    public void testPrescriber() {
        final Reference value = Reference.create().build();
        assertEquals(value, VisionPrescription.create().prescriber(value).build().prescriber());
    }

    @Test
    public void testLensSpecification() {
        final java.util.List<VisionPrescription.VisionPrescriptionLensSpecification> value = java.util.Collections.emptyList();
        assertEquals(value, VisionPrescription.create().lensSpecification(value).build().lensSpecification());
    }
}
