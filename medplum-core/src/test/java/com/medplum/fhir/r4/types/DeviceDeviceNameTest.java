/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DeviceDeviceNameTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Device.DeviceDeviceName(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Device.DeviceDeviceName.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Device.DeviceDeviceName x = Device.DeviceDeviceName.create().build();
        final Device.DeviceDeviceName y = Device.DeviceDeviceName.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Device.DeviceDeviceName.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Device.DeviceDeviceName.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Device.DeviceDeviceName.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", Device.DeviceDeviceName.create().name("x").build().name());
    }

    @Test
    public void testType() {
        assertEquals("x", Device.DeviceDeviceName.create().type("x").build().type());
    }
}
