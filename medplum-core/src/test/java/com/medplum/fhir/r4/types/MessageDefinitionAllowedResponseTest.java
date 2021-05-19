/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MessageDefinitionAllowedResponseTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MessageDefinition.MessageDefinitionAllowedResponse(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MessageDefinition.MessageDefinitionAllowedResponse.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final MessageDefinition.MessageDefinitionAllowedResponse x = MessageDefinition.MessageDefinitionAllowedResponse.create().build();
        final MessageDefinition.MessageDefinitionAllowedResponse y = MessageDefinition.MessageDefinitionAllowedResponse.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MessageDefinition.MessageDefinitionAllowedResponse.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MessageDefinition.MessageDefinitionAllowedResponse.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MessageDefinition.MessageDefinitionAllowedResponse.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testMessage() {
        assertEquals("x", MessageDefinition.MessageDefinitionAllowedResponse.create().message("x").build().message());
    }

    @Test
    public void testSituation() {
        assertEquals("x", MessageDefinition.MessageDefinitionAllowedResponse.create().situation("x").build().situation());
    }
}
