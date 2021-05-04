/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubscriptionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Subscription(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Subscription.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testResourceType() {
        assertEquals("x", Subscription.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Subscription.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Subscription.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Subscription.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Subscription.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Subscription.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Subscription.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Subscription.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Subscription.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Subscription.create().status("x").build().status());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactPoint> value = java.util.Collections.emptyList();
        assertEquals(value, Subscription.create().contact(value).build().contact());
    }

    @Test
    public void testEnd() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Subscription.create().end(value).build().end());
    }

    @Test
    public void testReason() {
        assertEquals("x", Subscription.create().reason("x").build().reason());
    }

    @Test
    public void testCriteria() {
        assertEquals("x", Subscription.create().criteria("x").build().criteria());
    }

    @Test
    public void testError() {
        assertEquals("x", Subscription.create().error("x").build().error());
    }

    @Test
    public void testChannel() {
        final Subscription.SubscriptionChannel value = Subscription.SubscriptionChannel.create().build();
        assertEquals(value, Subscription.create().channel(value).build().channel());
    }
}
