/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ContractTermTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Contract.ContractTerm(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Contract.ContractTerm.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Contract.ContractTerm x = Contract.ContractTerm.create().build();
        final Contract.ContractTerm y = Contract.ContractTerm.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Contract.ContractTerm.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractTerm.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractTerm.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, Contract.ContractTerm.create().identifier(value).build().identifier());
    }

    @Test
    public void testIssued() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Contract.ContractTerm.create().issued(value).build().issued());
    }

    @Test
    public void testApplies() {
        final Period value = Period.create().build();
        assertEquals(value, Contract.ContractTerm.create().applies(value).build().applies());
    }

    @Test
    public void testTopicCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Contract.ContractTerm.create().topicCodeableConcept(value).build().topicCodeableConcept());
    }

    @Test
    public void testTopicReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Contract.ContractTerm.create().topicReference(value).build().topicReference());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Contract.ContractTerm.create().type(value).build().type());
    }

    @Test
    public void testSubType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Contract.ContractTerm.create().subType(value).build().subType());
    }

    @Test
    public void testText() {
        assertEquals("x", Contract.ContractTerm.create().text("x").build().text());
    }

    @Test
    public void testSecurityLabel() {
        final java.util.List<Contract.ContractSecurityLabel> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractTerm.create().securityLabel(value).build().securityLabel());
    }

    @Test
    public void testOffer() {
        final Contract.ContractOffer value = Contract.ContractOffer.create().build();
        assertEquals(value, Contract.ContractTerm.create().offer(value).build().offer());
    }

    @Test
    public void testAsset() {
        final java.util.List<Contract.ContractAsset> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractTerm.create().asset(value).build().asset());
    }

    @Test
    public void testAction() {
        final java.util.List<Contract.ContractAction> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractTerm.create().action(value).build().action());
    }

    @Test
    public void testGroup() {
        final java.util.List<Contract.ContractTerm> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractTerm.create().group(value).build().group());
    }
}
