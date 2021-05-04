/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class InsurancePlanTest {

    @Test
    public void testConstructor() {
        assertNotNull(new InsurancePlan(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(InsurancePlan.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", InsurancePlan.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", InsurancePlan.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, InsurancePlan.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, InsurancePlan.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", InsurancePlan.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, InsurancePlan.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", InsurancePlan.create().status("x").build().status());
    }

    @Test
    public void testType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().type(value).build().type());
    }

    @Test
    public void testName() {
        assertEquals("x", InsurancePlan.create().name("x").build().name());
    }

    @Test
    public void testAlias() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().alias(value).build().alias());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, InsurancePlan.create().period(value).build().period());
    }

    @Test
    public void testOwnedBy() {
        final Reference value = Reference.create().build();
        assertEquals(value, InsurancePlan.create().ownedBy(value).build().ownedBy());
    }

    @Test
    public void testAdministeredBy() {
        final Reference value = Reference.create().build();
        assertEquals(value, InsurancePlan.create().administeredBy(value).build().administeredBy());
    }

    @Test
    public void testCoverageArea() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().coverageArea(value).build().coverageArea());
    }

    @Test
    public void testContact() {
        final java.util.List<InsurancePlan.InsurancePlanContact> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().contact(value).build().contact());
    }

    @Test
    public void testEndpoint() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().endpoint(value).build().endpoint());
    }

    @Test
    public void testNetwork() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().network(value).build().network());
    }

    @Test
    public void testCoverage() {
        final java.util.List<InsurancePlan.InsurancePlanCoverage> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().coverage(value).build().coverage());
    }

    @Test
    public void testPlan() {
        final java.util.List<InsurancePlan.InsurancePlanPlan> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.create().plan(value).build().plan());
    }
}
