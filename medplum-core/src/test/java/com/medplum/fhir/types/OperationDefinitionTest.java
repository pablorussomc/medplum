/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class OperationDefinitionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new OperationDefinition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(OperationDefinition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", OperationDefinition.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", OperationDefinition.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, OperationDefinition.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, OperationDefinition.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", OperationDefinition.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, OperationDefinition.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, OperationDefinition.create().url(value).build().url());
    }

    @Test
    public void testVersion() {
        assertEquals("x", OperationDefinition.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", OperationDefinition.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", OperationDefinition.create().title("x").build().title());
    }

    @Test
    public void testStatus() {
        assertEquals("x", OperationDefinition.create().status("x").build().status());
    }

    @Test
    public void testKind() {
        assertEquals("x", OperationDefinition.create().kind("x").build().kind());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, OperationDefinition.create().experimental(true).build().experimental());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, OperationDefinition.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", OperationDefinition.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", OperationDefinition.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", OperationDefinition.create().purpose("x").build().purpose());
    }

    @Test
    public void testAffectsState() {
        assertEquals(true, OperationDefinition.create().affectsState(true).build().affectsState());
    }

    @Test
    public void testCode() {
        assertEquals("x", OperationDefinition.create().code("x").build().code());
    }

    @Test
    public void testComment() {
        assertEquals("x", OperationDefinition.create().comment("x").build().comment());
    }

    @Test
    public void testBase() {
        assertEquals("x", OperationDefinition.create().base("x").build().base());
    }

    @Test
    public void testResource() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.create().resource(value).build().resource());
    }

    @Test
    public void testSystem() {
        assertEquals(true, OperationDefinition.create().system(true).build().system());
    }

    @Test
    public void testType() {
        assertEquals(true, OperationDefinition.create().type(true).build().type());
    }

    @Test
    public void testInstance() {
        assertEquals(true, OperationDefinition.create().instance(true).build().instance());
    }

    @Test
    public void testInputProfile() {
        assertEquals("x", OperationDefinition.create().inputProfile("x").build().inputProfile());
    }

    @Test
    public void testOutputProfile() {
        assertEquals("x", OperationDefinition.create().outputProfile("x").build().outputProfile());
    }

    @Test
    public void testParameter() {
        final java.util.List<OperationDefinition.OperationDefinitionParameter> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.create().parameter(value).build().parameter());
    }

    @Test
    public void testOverload() {
        final java.util.List<OperationDefinition.OperationDefinitionOverload> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.create().overload(value).build().overload());
    }
}
