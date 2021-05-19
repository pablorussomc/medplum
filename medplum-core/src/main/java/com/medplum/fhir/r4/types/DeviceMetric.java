/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Describes a measurement, calculation or setting capability of a
 * medical device.
 */
public class DeviceMetric extends DomainResource {
    public static final String RESOURCE_TYPE = "DeviceMetric";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public DeviceMetric(final JsonObject data) {
        super(data);
    }

    /**
     * Unique instance identifiers assigned to a device by the device or
     * gateway software, manufacturers, other organizations or owners. For
     * example: handle ID.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * Describes the type of the metric. For example: Heart Rate, PEEP
     * Setting, etc.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * Describes the unit that an observed value determined for this metric
     * will have. For example: Percent, Seconds, etc.
     */
    public CodeableConcept unit() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_UNIT);
    }

    /**
     * Describes the link to the  Device that this DeviceMetric belongs to
     * and that contains administrative device information such as
     * manufacturer, serial number, etc.
     */
    public Reference source() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SOURCE);
    }

    /**
     * Describes the link to the  Device that this DeviceMetric belongs to
     * and that provide information about the location of this DeviceMetric
     * in the containment structure of the parent Device. An example would be
     * a Device that represents a Channel. This reference can be used by a
     * client application to distinguish DeviceMetrics that have the same
     * type, but should be interpreted based on their containment location.
     */
    public Reference parent() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PARENT);
    }

    /**
     * Indicates current operational state of the device. For example: On,
     * Off, Standby, etc.
     */
    public String operationalStatus() {
        return getString(FhirPropertyNames.PROPERTY_OPERATIONAL_STATUS);
    }

    /**
     * Describes the color representation for the metric. This is often used
     * to aid clinicians to track and identify parameter types by color. In
     * practice, consider a Patient Monitor that has ECG/HR and Pleth for
     * example; the parameters are displayed in different characteristic
     * colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     */
    public String color() {
        return getString(FhirPropertyNames.PROPERTY_COLOR);
    }

    /**
     * Indicates the category of the observation generation process. A
     * DeviceMetric can be for example a setting, measurement, or
     * calculation.
     */
    public String category() {
        return getString(FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * Describes the measurement repetition time. This is not necessarily the
     * same as the update period. The measurement repetition time can range
     * from milliseconds up to hours. An example for a measurement repetition
     * time in the range of milliseconds is the sampling rate of an ECG. An
     * example for a measurement repetition time in the range of hours is a
     * NIBP that is triggered automatically every hour. The update period may
     * be different than the measurement repetition time, if the device does
     * not update the published observed value with the same frequency as it
     * was measured.
     */
    public Timing measurementPeriod() {
        return getObject(Timing.class, FhirPropertyNames.PROPERTY_MEASUREMENT_PERIOD);
    }

    /**
     * Describes the calibrations that have been performed or that are
     * required to be performed.
     */
    public java.util.List<DeviceMetricCalibration> calibration() {
        return getList(DeviceMetricCalibration.class, FhirPropertyNames.PROPERTY_CALIBRATION);
    }

    public static final class Builder extends DomainResource.Builder<DeviceMetric, DeviceMetric.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder unit(final CodeableConcept unit) {
            b.add(FhirPropertyNames.PROPERTY_UNIT, unit);
            return this;
        }

        public Builder source(final Reference source) {
            b.add(FhirPropertyNames.PROPERTY_SOURCE, source);
            return this;
        }

        public Builder parent(final Reference parent) {
            b.add(FhirPropertyNames.PROPERTY_PARENT, parent);
            return this;
        }

        public Builder operationalStatus(final String operationalStatus) {
            b.add(FhirPropertyNames.PROPERTY_OPERATIONAL_STATUS, operationalStatus);
            return this;
        }

        public Builder color(final String color) {
            b.add(FhirPropertyNames.PROPERTY_COLOR, color);
            return this;
        }

        public Builder category(final String category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, category);
            return this;
        }

        public Builder measurementPeriod(final Timing measurementPeriod) {
            b.add(FhirPropertyNames.PROPERTY_MEASUREMENT_PERIOD, measurementPeriod);
            return this;
        }

        public Builder calibration(final java.util.List<DeviceMetricCalibration> calibration) {
            b.add(FhirPropertyNames.PROPERTY_CALIBRATION, FhirObject.toArray(calibration));
            return this;
        }

        public DeviceMetric build() {
            return new DeviceMetric(b.build());
        }
    }

    /**
     * Describes a measurement, calculation or setting capability of a
     * medical device.
     */
    public static class DeviceMetricCalibration extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceMetricCalibration";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceMetricCalibration(final JsonObject data) {
            super(data);
        }

        /**
         * Unique id for the element within a resource (for internal references).
         * This may be any string value that does not contain spaces.
         */
        public String id() {
            return getString(FhirPropertyNames.PROPERTY_ID);
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
            return getList(Extension.class, FhirPropertyNames.PROPERTY_EXTENSION);
        }

        /**
         * May be used to represent additional information that is not part of
         * the basic definition of the element and that modifies the
         * understanding of the element in which it is contained and/or the
         * understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use
         * of extensions safe and manageable, there is a strict set of governance
         * applied to the definition and use of extensions. Though any
         * implementer can define an extension, there is a set of requirements
         * that SHALL be met as part of the definition of the extension.
         * Applications processing a resource are required to check for modifier
         * extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on
         * Resource or DomainResource (including cannot change the meaning of
         * modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * Describes the type of the calibration method.
         */
        public String type() {
            return getString(FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * Describes the state of the calibration.
         */
        public String state() {
            return getString(FhirPropertyNames.PROPERTY_STATE);
        }

        /**
         * Describes the time last calibration has been performed.
         */
        public java.time.Instant time() {
            return getInstant(FhirPropertyNames.PROPERTY_TIME);
        }

        public static final class Builder extends FhirObject.Builder<DeviceMetricCalibration, DeviceMetricCalibration.Builder> {

            private Builder() {
                super();
            }

            private Builder(final JsonObject data) {
                super(data);
            }

            public Builder id(final String id) {
                b.add(FhirPropertyNames.PROPERTY_ID, id);
                return this;
            }

            public Builder extension(final java.util.List<Extension> extension) {
                b.add(FhirPropertyNames.PROPERTY_EXTENSION, FhirObject.toArray(extension));
                return this;
            }

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder type(final String type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder state(final String state) {
                b.add(FhirPropertyNames.PROPERTY_STATE, state);
                return this;
            }

            public Builder time(final java.time.Instant time) {
                b.add(FhirPropertyNames.PROPERTY_TIME, time.toString());
                return this;
            }

            public DeviceMetricCalibration build() {
                return new DeviceMetricCalibration(b.build());
            }
        }
    }
}
