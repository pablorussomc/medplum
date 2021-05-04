/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class GroupTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Group(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Group.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", Group.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Group.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Group.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Group.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Group.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Group.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Group.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Group.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Group.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Group.create().identifier(value).build().identifier());
    }

    @Test
    public void testActive() {
        assertEquals(true, Group.create().active(true).build().active());
    }

    @Test
    public void testType() {
        assertEquals("x", Group.create().type("x").build().type());
    }

    @Test
    public void testActual() {
        assertEquals(true, Group.create().actual(true).build().actual());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Group.create().code(value).build().code());
    }

    @Test
    public void testName() {
        assertEquals("x", Group.create().name("x").build().name());
    }

    @Test
    public void testQuantity() {
        assertEquals(1, Group.create().quantity(1).build().quantity());
    }

    @Test
    public void testManagingEntity() {
        final Reference value = Reference.create().build();
        assertEquals(value, Group.create().managingEntity(value).build().managingEntity());
    }

    @Test
    public void testCharacteristic() {
        final java.util.List<Group.GroupCharacteristic> value = java.util.Collections.emptyList();
        assertEquals(value, Group.create().characteristic(value).build().characteristic());
    }

    @Test
    public void testMember() {
        final java.util.List<Group.GroupMember> value = java.util.Collections.emptyList();
        assertEquals(value, Group.create().member(value).build().member());
    }
}
