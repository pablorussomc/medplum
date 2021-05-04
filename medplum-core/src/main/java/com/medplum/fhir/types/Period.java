/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Period extends FhirResource {
    public static final String RESOURCE_TYPE = "Period";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_START = "start";
    public static final String PROPERTY_END = "end";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Period(final JsonObject data) {
        super(data);
    }

    /**
     * Unique id for the element within a resource (for internal references).
     * This may be any string value that does not contain spaces.
     */
    public String id() {
        return getString(PROPERTY_ID);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the element. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, PROPERTY_EXTENSION);
    }

    /**
     * The start of the period. The boundary is inclusive.
     */
    public java.time.Instant start() {
        return getInstant(PROPERTY_START);
    }

    /**
     * The end of the period. If the end of the period is missing, it means
     * no end was known or planned at the time the instance was created. The
     * start may be in the past, and the end date in the future, which means
     * that period is expected/planned to end at that time.
     */
    public java.time.Instant end() {
        return getInstant(PROPERTY_END);
    }

    public static class Builder {
        private final JsonObjectBuilder b;

        private Builder() {
            b = Json.createObjectBuilder();
        }

        private Builder(final JsonObject data) {
            b = Json.createObjectBuilder(data);
        }

        public Builder id(final String id) {
            b.add(PROPERTY_ID, id);
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder start(final java.time.Instant start) {
            b.add(PROPERTY_START, start.toString());
            return this;
        }

        public Builder end(final java.time.Instant end) {
            b.add(PROPERTY_END, end.toString());
            return this;
        }

        public Period build() {
            return new Period(b.build());
        }
    }
}
