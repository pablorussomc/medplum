/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class PatientTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Patient(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Patient.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Patient x = Patient.create().build();
        final Patient y = Patient.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Patient.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Patient.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Patient.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Patient.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Patient.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().identifier(value).build().identifier());
    }

    @Test
    public void testActive() {
        assertEquals(true, Patient.create().active(true).build().active());
    }

    @Test
    public void testName() {
        final java.util.List<HumanName> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().name(value).build().name());
    }

    @Test
    public void testTelecom() {
        final java.util.List<ContactPoint> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().telecom(value).build().telecom());
    }

    @Test
    public void testGender() {
        assertEquals("x", Patient.create().gender("x").build().gender());
    }

    @Test
    public void testBirthDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, Patient.create().birthDate(value).build().birthDate());
    }

    @Test
    public void testDeceasedBoolean() {
        assertEquals(true, Patient.create().deceasedBoolean(true).build().deceasedBoolean());
    }

    @Test
    public void testDeceasedDateTime() {
        assertEquals("x", Patient.create().deceasedDateTime("x").build().deceasedDateTime());
    }

    @Test
    public void testAddress() {
        final java.util.List<Address> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().address(value).build().address());
    }

    @Test
    public void testMaritalStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Patient.create().maritalStatus(value).build().maritalStatus());
    }

    @Test
    public void testMultipleBirthBoolean() {
        assertEquals(true, Patient.create().multipleBirthBoolean(true).build().multipleBirthBoolean());
    }

    @Test
    public void testMultipleBirthInteger() {
        assertEquals(1, Patient.create().multipleBirthInteger(1).build().multipleBirthInteger());
    }

    @Test
    public void testPhoto() {
        final java.util.List<Attachment> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().photo(value).build().photo());
    }

    @Test
    public void testContact() {
        final java.util.List<Patient.PatientContact> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().contact(value).build().contact());
    }

    @Test
    public void testCommunication() {
        final java.util.List<Patient.PatientCommunication> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().communication(value).build().communication());
    }

    @Test
    public void testGeneralPractitioner() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().generalPractitioner(value).build().generalPractitioner());
    }

    @Test
    public void testManagingOrganization() {
        final Reference value = Reference.create().build();
        assertEquals(value, Patient.create().managingOrganization(value).build().managingOrganization());
    }

    @Test
    public void testLink() {
        final java.util.List<Patient.PatientLink> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.create().link(value).build().link());
    }
}
