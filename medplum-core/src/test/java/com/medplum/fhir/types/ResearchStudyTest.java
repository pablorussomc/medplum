/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ResearchStudyTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ResearchStudy(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ResearchStudy.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", ResearchStudy.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", ResearchStudy.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ResearchStudy.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ResearchStudy.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ResearchStudy.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, ResearchStudy.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().identifier(value).build().identifier());
    }

    @Test
    public void testTitle() {
        assertEquals("x", ResearchStudy.create().title("x").build().title());
    }

    @Test
    public void testProtocol() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().protocol(value).build().protocol());
    }

    @Test
    public void testPartOf() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().partOf(value).build().partOf());
    }

    @Test
    public void testStatus() {
        assertEquals("x", ResearchStudy.create().status("x").build().status());
    }

    @Test
    public void testPrimaryPurposeType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ResearchStudy.create().primaryPurposeType(value).build().primaryPurposeType());
    }

    @Test
    public void testPhase() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ResearchStudy.create().phase(value).build().phase());
    }

    @Test
    public void testCategory() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().category(value).build().category());
    }

    @Test
    public void testFocus() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().focus(value).build().focus());
    }

    @Test
    public void testCondition() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().condition(value).build().condition());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().contact(value).build().contact());
    }

    @Test
    public void testRelatedArtifact() {
        final java.util.List<RelatedArtifact> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().relatedArtifact(value).build().relatedArtifact());
    }

    @Test
    public void testKeyword() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().keyword(value).build().keyword());
    }

    @Test
    public void testLocation() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().location(value).build().location());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ResearchStudy.create().description("x").build().description());
    }

    @Test
    public void testEnrollment() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().enrollment(value).build().enrollment());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, ResearchStudy.create().period(value).build().period());
    }

    @Test
    public void testSponsor() {
        final Reference value = Reference.create().build();
        assertEquals(value, ResearchStudy.create().sponsor(value).build().sponsor());
    }

    @Test
    public void testPrincipalInvestigator() {
        final Reference value = Reference.create().build();
        assertEquals(value, ResearchStudy.create().principalInvestigator(value).build().principalInvestigator());
    }

    @Test
    public void testSite() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().site(value).build().site());
    }

    @Test
    public void testReasonStopped() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ResearchStudy.create().reasonStopped(value).build().reasonStopped());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().note(value).build().note());
    }

    @Test
    public void testArm() {
        final java.util.List<ResearchStudy.ResearchStudyArm> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().arm(value).build().arm());
    }

    @Test
    public void testObjective() {
        final java.util.List<ResearchStudy.ResearchStudyObjective> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchStudy.create().objective(value).build().objective());
    }
}
