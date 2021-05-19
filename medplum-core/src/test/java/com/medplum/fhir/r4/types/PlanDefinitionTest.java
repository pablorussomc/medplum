/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class PlanDefinitionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new PlanDefinition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(PlanDefinition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final PlanDefinition x = PlanDefinition.create().build();
        final PlanDefinition y = PlanDefinition.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", PlanDefinition.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, PlanDefinition.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, PlanDefinition.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", PlanDefinition.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, PlanDefinition.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, PlanDefinition.create().url(value).build().url());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().identifier(value).build().identifier());
    }

    @Test
    public void testVersion() {
        assertEquals("x", PlanDefinition.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", PlanDefinition.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", PlanDefinition.create().title("x").build().title());
    }

    @Test
    public void testSubtitle() {
        assertEquals("x", PlanDefinition.create().subtitle("x").build().subtitle());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, PlanDefinition.create().type(value).build().type());
    }

    @Test
    public void testStatus() {
        assertEquals("x", PlanDefinition.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, PlanDefinition.create().experimental(true).build().experimental());
    }

    @Test
    public void testSubjectCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, PlanDefinition.create().subjectCodeableConcept(value).build().subjectCodeableConcept());
    }

    @Test
    public void testSubjectReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, PlanDefinition.create().subjectReference(value).build().subjectReference());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, PlanDefinition.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", PlanDefinition.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", PlanDefinition.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", PlanDefinition.create().purpose("x").build().purpose());
    }

    @Test
    public void testUsage() {
        assertEquals("x", PlanDefinition.create().usage("x").build().usage());
    }

    @Test
    public void testCopyright() {
        assertEquals("x", PlanDefinition.create().copyright("x").build().copyright());
    }

    @Test
    public void testApprovalDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, PlanDefinition.create().approvalDate(value).build().approvalDate());
    }

    @Test
    public void testLastReviewDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, PlanDefinition.create().lastReviewDate(value).build().lastReviewDate());
    }

    @Test
    public void testEffectivePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, PlanDefinition.create().effectivePeriod(value).build().effectivePeriod());
    }

    @Test
    public void testTopic() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().topic(value).build().topic());
    }

    @Test
    public void testAuthor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().author(value).build().author());
    }

    @Test
    public void testEditor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().editor(value).build().editor());
    }

    @Test
    public void testReviewer() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().reviewer(value).build().reviewer());
    }

    @Test
    public void testEndorser() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().endorser(value).build().endorser());
    }

    @Test
    public void testRelatedArtifact() {
        final java.util.List<RelatedArtifact> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().relatedArtifact(value).build().relatedArtifact());
    }

    @Test
    public void testLibrary() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().library(value).build().library());
    }

    @Test
    public void testGoal() {
        final java.util.List<PlanDefinition.PlanDefinitionGoal> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().goal(value).build().goal());
    }

    @Test
    public void testAction() {
        final java.util.List<PlanDefinition.PlanDefinitionAction> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.create().action(value).build().action());
    }
}
