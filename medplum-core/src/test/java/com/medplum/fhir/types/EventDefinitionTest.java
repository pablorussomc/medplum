/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class EventDefinitionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new EventDefinition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(EventDefinition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", EventDefinition.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", EventDefinition.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, EventDefinition.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, EventDefinition.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", EventDefinition.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, EventDefinition.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, EventDefinition.create().url(value).build().url());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().identifier(value).build().identifier());
    }

    @Test
    public void testVersion() {
        assertEquals("x", EventDefinition.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", EventDefinition.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", EventDefinition.create().title("x").build().title());
    }

    @Test
    public void testSubtitle() {
        assertEquals("x", EventDefinition.create().subtitle("x").build().subtitle());
    }

    @Test
    public void testStatus() {
        assertEquals("x", EventDefinition.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, EventDefinition.create().experimental(true).build().experimental());
    }

    @Test
    public void testSubjectCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, EventDefinition.create().subjectCodeableConcept(value).build().subjectCodeableConcept());
    }

    @Test
    public void testSubjectReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, EventDefinition.create().subjectReference(value).build().subjectReference());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, EventDefinition.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", EventDefinition.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", EventDefinition.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", EventDefinition.create().purpose("x").build().purpose());
    }

    @Test
    public void testUsage() {
        assertEquals("x", EventDefinition.create().usage("x").build().usage());
    }

    @Test
    public void testCopyright() {
        assertEquals("x", EventDefinition.create().copyright("x").build().copyright());
    }

    @Test
    public void testApprovalDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, EventDefinition.create().approvalDate(value).build().approvalDate());
    }

    @Test
    public void testLastReviewDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, EventDefinition.create().lastReviewDate(value).build().lastReviewDate());
    }

    @Test
    public void testEffectivePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, EventDefinition.create().effectivePeriod(value).build().effectivePeriod());
    }

    @Test
    public void testTopic() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().topic(value).build().topic());
    }

    @Test
    public void testAuthor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().author(value).build().author());
    }

    @Test
    public void testEditor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().editor(value).build().editor());
    }

    @Test
    public void testReviewer() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().reviewer(value).build().reviewer());
    }

    @Test
    public void testEndorser() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().endorser(value).build().endorser());
    }

    @Test
    public void testRelatedArtifact() {
        final java.util.List<RelatedArtifact> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().relatedArtifact(value).build().relatedArtifact());
    }

    @Test
    public void testTrigger() {
        final java.util.List<TriggerDefinition> value = java.util.Collections.emptyList();
        assertEquals(value, EventDefinition.create().trigger(value).build().trigger());
    }
}
