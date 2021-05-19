/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MolecularSequenceStructureVariantTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MolecularSequence.MolecularSequenceStructureVariant(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MolecularSequence.MolecularSequenceStructureVariant.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final MolecularSequence.MolecularSequenceStructureVariant x = MolecularSequence.MolecularSequenceStructureVariant.create().build();
        final MolecularSequence.MolecularSequenceStructureVariant y = MolecularSequence.MolecularSequenceStructureVariant.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MolecularSequence.MolecularSequenceStructureVariant.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceStructureVariant.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceStructureVariant.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testVariantType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MolecularSequence.MolecularSequenceStructureVariant.create().variantType(value).build().variantType());
    }

    @Test
    public void testExact() {
        assertEquals(true, MolecularSequence.MolecularSequenceStructureVariant.create().exact(true).build().exact());
    }

    @Test
    public void testLength() {
        assertEquals(1, MolecularSequence.MolecularSequenceStructureVariant.create().length(1).build().length());
    }

    @Test
    public void testOuter() {
        final MolecularSequence.MolecularSequenceOuter value = MolecularSequence.MolecularSequenceOuter.create().build();
        assertEquals(value, MolecularSequence.MolecularSequenceStructureVariant.create().outer(value).build().outer());
    }

    @Test
    public void testInner() {
        final MolecularSequence.MolecularSequenceInner value = MolecularSequence.MolecularSequenceInner.create().build();
        assertEquals(value, MolecularSequence.MolecularSequenceStructureVariant.create().inner(value).build().inner());
    }
}
