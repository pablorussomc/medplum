/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class PaymentNoticeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new PaymentNotice(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(PaymentNotice.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final PaymentNotice x = PaymentNotice.create().build();
        final PaymentNotice y = PaymentNotice.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", PaymentNotice.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, PaymentNotice.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, PaymentNotice.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", PaymentNotice.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, PaymentNotice.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, PaymentNotice.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PaymentNotice.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PaymentNotice.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, PaymentNotice.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", PaymentNotice.create().status("x").build().status());
    }

    @Test
    public void testRequest() {
        final Reference value = Reference.create().build();
        assertEquals(value, PaymentNotice.create().request(value).build().request());
    }

    @Test
    public void testResponse() {
        final Reference value = Reference.create().build();
        assertEquals(value, PaymentNotice.create().response(value).build().response());
    }

    @Test
    public void testCreated() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, PaymentNotice.create().created(value).build().created());
    }

    @Test
    public void testProvider() {
        final Reference value = Reference.create().build();
        assertEquals(value, PaymentNotice.create().provider(value).build().provider());
    }

    @Test
    public void testPayment() {
        final Reference value = Reference.create().build();
        assertEquals(value, PaymentNotice.create().payment(value).build().payment());
    }

    @Test
    public void testPaymentDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, PaymentNotice.create().paymentDate(value).build().paymentDate());
    }

    @Test
    public void testPayee() {
        final Reference value = Reference.create().build();
        assertEquals(value, PaymentNotice.create().payee(value).build().payee());
    }

    @Test
    public void testRecipient() {
        final Reference value = Reference.create().build();
        assertEquals(value, PaymentNotice.create().recipient(value).build().recipient());
    }

    @Test
    public void testAmount() {
        final Money value = Money.create().build();
        assertEquals(value, PaymentNotice.create().amount(value).build().amount());
    }

    @Test
    public void testPaymentStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, PaymentNotice.create().paymentStatus(value).build().paymentStatus());
    }
}
