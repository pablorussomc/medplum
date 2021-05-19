/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExplanationOfBenefitFinancialTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExplanationOfBenefit.ExplanationOfBenefitFinancial(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExplanationOfBenefit.ExplanationOfBenefitFinancial.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ExplanationOfBenefit.ExplanationOfBenefitFinancial x = ExplanationOfBenefit.ExplanationOfBenefitFinancial.create().build();
        final ExplanationOfBenefit.ExplanationOfBenefitFinancial y = ExplanationOfBenefit.ExplanationOfBenefitFinancial.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitFinancial.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitFinancial.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitFinancial.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitFinancial.create().type(value).build().type());
    }

    @Test
    public void testAllowedUnsignedInt() {
        assertEquals(1, ExplanationOfBenefit.ExplanationOfBenefitFinancial.create().allowedUnsignedInt(1).build().allowedUnsignedInt());
    }

    @Test
    public void testAllowedString() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitFinancial.create().allowedString("x").build().allowedString());
    }

    @Test
    public void testAllowedMoney() {
        final Money value = Money.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitFinancial.create().allowedMoney(value).build().allowedMoney());
    }

    @Test
    public void testUsedUnsignedInt() {
        assertEquals(1, ExplanationOfBenefit.ExplanationOfBenefitFinancial.create().usedUnsignedInt(1).build().usedUnsignedInt());
    }

    @Test
    public void testUsedMoney() {
        final Money value = Money.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitFinancial.create().usedMoney(value).build().usedMoney());
    }
}
