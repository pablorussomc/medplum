/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class HealthcareServiceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new HealthcareService(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(HealthcareService.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final HealthcareService x = HealthcareService.create().build();
        final HealthcareService y = HealthcareService.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", HealthcareService.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, HealthcareService.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, HealthcareService.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", HealthcareService.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, HealthcareService.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().identifier(value).build().identifier());
    }

    @Test
    public void testActive() {
        assertEquals(true, HealthcareService.create().active(true).build().active());
    }

    @Test
    public void testProvidedBy() {
        final Reference value = Reference.create().build();
        assertEquals(value, HealthcareService.create().providedBy(value).build().providedBy());
    }

    @Test
    public void testCategory() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().category(value).build().category());
    }

    @Test
    public void testType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().type(value).build().type());
    }

    @Test
    public void testSpecialty() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().specialty(value).build().specialty());
    }

    @Test
    public void testLocation() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().location(value).build().location());
    }

    @Test
    public void testName() {
        assertEquals("x", HealthcareService.create().name("x").build().name());
    }

    @Test
    public void testComment() {
        assertEquals("x", HealthcareService.create().comment("x").build().comment());
    }

    @Test
    public void testExtraDetails() {
        assertEquals("x", HealthcareService.create().extraDetails("x").build().extraDetails());
    }

    @Test
    public void testPhoto() {
        final Attachment value = Attachment.create().build();
        assertEquals(value, HealthcareService.create().photo(value).build().photo());
    }

    @Test
    public void testTelecom() {
        final java.util.List<ContactPoint> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().telecom(value).build().telecom());
    }

    @Test
    public void testCoverageArea() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().coverageArea(value).build().coverageArea());
    }

    @Test
    public void testServiceProvisionCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().serviceProvisionCode(value).build().serviceProvisionCode());
    }

    @Test
    public void testEligibility() {
        final java.util.List<HealthcareService.HealthcareServiceEligibility> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().eligibility(value).build().eligibility());
    }

    @Test
    public void testProgram() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().program(value).build().program());
    }

    @Test
    public void testCharacteristic() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().characteristic(value).build().characteristic());
    }

    @Test
    public void testCommunication() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().communication(value).build().communication());
    }

    @Test
    public void testReferralMethod() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().referralMethod(value).build().referralMethod());
    }

    @Test
    public void testAppointmentRequired() {
        assertEquals(true, HealthcareService.create().appointmentRequired(true).build().appointmentRequired());
    }

    @Test
    public void testAvailableTime() {
        final java.util.List<HealthcareService.HealthcareServiceAvailableTime> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().availableTime(value).build().availableTime());
    }

    @Test
    public void testNotAvailable() {
        final java.util.List<HealthcareService.HealthcareServiceNotAvailable> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().notAvailable(value).build().notAvailable());
    }

    @Test
    public void testAvailabilityExceptions() {
        assertEquals("x", HealthcareService.create().availabilityExceptions("x").build().availabilityExceptions());
    }

    @Test
    public void testEndpoint() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.create().endpoint(value).build().endpoint());
    }
}
