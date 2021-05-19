/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExplanationOfBenefitDiagnosisTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExplanationOfBenefit.ExplanationOfBenefitDiagnosis(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ExplanationOfBenefit.ExplanationOfBenefitDiagnosis x = ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create().build();
        final ExplanationOfBenefit.ExplanationOfBenefitDiagnosis y = ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSequence() {
        assertEquals(1, ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create().sequence(1).build().sequence());
    }

    @Test
    public void testDiagnosisCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create().diagnosisCodeableConcept(value).build().diagnosisCodeableConcept());
    }

    @Test
    public void testDiagnosisReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create().diagnosisReference(value).build().diagnosisReference());
    }

    @Test
    public void testType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create().type(value).build().type());
    }

    @Test
    public void testOnAdmission() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create().onAdmission(value).build().onAdmission());
    }

    @Test
    public void testPackageCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDiagnosis.create().packageCode(value).build().packageCode());
    }
}
