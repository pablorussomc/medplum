/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * An authorization for the provision of glasses and/or contact lenses to
 * a patient.
 */
public class VisionPrescription extends DomainResource {
    public static final String RESOURCE_TYPE = "VisionPrescription";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public VisionPrescription(final JsonObject data) {
        super(data);
    }

    /**
     * A unique identifier assigned to this vision prescription.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The status of the resource instance.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * The date this resource was created.
     */
    public java.time.Instant created() {
        return getInstant(FhirPropertyNames.PROPERTY_CREATED);
    }

    /**
     * A resource reference to the person to whom the vision prescription
     * applies.
     */
    public Reference patient() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PATIENT);
    }

    /**
     * A reference to a resource that identifies the particular occurrence of
     * contact between patient and health care provider during which the
     * prescription was issued.
     */
    public Reference encounter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENCOUNTER);
    }

    /**
     * The date (and perhaps time) when the prescription was written.
     */
    public java.time.Instant dateWritten() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE_WRITTEN);
    }

    /**
     * The healthcare professional responsible for authorizing the
     * prescription.
     */
    public Reference prescriber() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PRESCRIBER);
    }

    /**
     * Contain the details of  the individual lens specifications and serves
     * as the authorization for the fullfillment by certified professionals.
     */
    public java.util.List<VisionPrescriptionLensSpecification> lensSpecification() {
        return getList(VisionPrescriptionLensSpecification.class, FhirPropertyNames.PROPERTY_LENS_SPECIFICATION);
    }

    public static final class Builder extends DomainResource.Builder<VisionPrescription, VisionPrescription.Builder> {

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

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder created(final java.time.Instant created) {
            b.add(FhirPropertyNames.PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder patient(final Reference patient) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder encounter(final Reference encounter) {
            b.add(FhirPropertyNames.PROPERTY_ENCOUNTER, encounter);
            return this;
        }

        public Builder dateWritten(final java.time.Instant dateWritten) {
            b.add(FhirPropertyNames.PROPERTY_DATE_WRITTEN, dateWritten.toString());
            return this;
        }

        public Builder prescriber(final Reference prescriber) {
            b.add(FhirPropertyNames.PROPERTY_PRESCRIBER, prescriber);
            return this;
        }

        public Builder lensSpecification(final java.util.List<VisionPrescriptionLensSpecification> lensSpecification) {
            b.add(FhirPropertyNames.PROPERTY_LENS_SPECIFICATION, FhirObject.toArray(lensSpecification));
            return this;
        }

        public VisionPrescription build() {
            return new VisionPrescription(b.build());
        }
    }

    /**
     * An authorization for the provision of glasses and/or contact lenses to
     * a patient.
     */
    public static class VisionPrescriptionLensSpecification extends FhirObject {
        public static final String RESOURCE_TYPE = "VisionPrescriptionLensSpecification";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public VisionPrescriptionLensSpecification(final JsonObject data) {
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
         * Identifies the type of vision correction product which is required for
         * the patient.
         */
        public CodeableConcept product() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PRODUCT);
        }

        /**
         * The eye for which the lens specification applies.
         */
        public String eye() {
            return getString(FhirPropertyNames.PROPERTY_EYE);
        }

        /**
         * Lens power measured in dioptres (0.25 units).
         */
        public Double sphere() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_SPHERE).doubleValue();
        }

        /**
         * Power adjustment for astigmatism measured in dioptres (0.25 units).
         */
        public Double cylinder() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_CYLINDER).doubleValue();
        }

        /**
         * Adjustment for astigmatism measured in integer degrees.
         */
        public Integer axis() {
            return data.getInt(FhirPropertyNames.PROPERTY_AXIS);
        }

        /**
         * Allows for adjustment on two axis.
         */
        public java.util.List<VisionPrescriptionPrism> prism() {
            return getList(VisionPrescriptionPrism.class, FhirPropertyNames.PROPERTY_PRISM);
        }

        /**
         * Power adjustment for multifocal lenses measured in dioptres (0.25
         * units).
         */
        public Double add() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_ADD).doubleValue();
        }

        /**
         * Contact lens power measured in dioptres (0.25 units).
         */
        public Double power() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_POWER).doubleValue();
        }

        /**
         * Back curvature measured in millimetres.
         */
        public Double backCurve() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_BACK_CURVE).doubleValue();
        }

        /**
         * Contact lens diameter measured in millimetres.
         */
        public Double diameter() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_DIAMETER).doubleValue();
        }

        /**
         * The recommended maximum wear period for the lens.
         */
        public Quantity duration() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_DURATION);
        }

        /**
         * Special color or pattern.
         */
        public String color() {
            return getString(FhirPropertyNames.PROPERTY_COLOR);
        }

        /**
         * Brand recommendations or restrictions.
         */
        public String brand() {
            return getString(FhirPropertyNames.PROPERTY_BRAND);
        }

        /**
         * Notes for special requirements such as coatings and lens materials.
         */
        public java.util.List<Annotation> note() {
            return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
        }

        public static final class Builder extends FhirObject.Builder<VisionPrescriptionLensSpecification, VisionPrescriptionLensSpecification.Builder> {

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

            public Builder product(final CodeableConcept product) {
                b.add(FhirPropertyNames.PROPERTY_PRODUCT, product);
                return this;
            }

            public Builder eye(final String eye) {
                b.add(FhirPropertyNames.PROPERTY_EYE, eye);
                return this;
            }

            public Builder sphere(final Double sphere) {
                b.add(FhirPropertyNames.PROPERTY_SPHERE, sphere);
                return this;
            }

            public Builder cylinder(final Double cylinder) {
                b.add(FhirPropertyNames.PROPERTY_CYLINDER, cylinder);
                return this;
            }

            public Builder axis(final Integer axis) {
                b.add(FhirPropertyNames.PROPERTY_AXIS, axis);
                return this;
            }

            public Builder prism(final java.util.List<VisionPrescriptionPrism> prism) {
                b.add(FhirPropertyNames.PROPERTY_PRISM, FhirObject.toArray(prism));
                return this;
            }

            public Builder add(final Double add) {
                b.add(FhirPropertyNames.PROPERTY_ADD, add);
                return this;
            }

            public Builder power(final Double power) {
                b.add(FhirPropertyNames.PROPERTY_POWER, power);
                return this;
            }

            public Builder backCurve(final Double backCurve) {
                b.add(FhirPropertyNames.PROPERTY_BACK_CURVE, backCurve);
                return this;
            }

            public Builder diameter(final Double diameter) {
                b.add(FhirPropertyNames.PROPERTY_DIAMETER, diameter);
                return this;
            }

            public Builder duration(final Quantity duration) {
                b.add(FhirPropertyNames.PROPERTY_DURATION, duration);
                return this;
            }

            public Builder color(final String color) {
                b.add(FhirPropertyNames.PROPERTY_COLOR, color);
                return this;
            }

            public Builder brand(final String brand) {
                b.add(FhirPropertyNames.PROPERTY_BRAND, brand);
                return this;
            }

            public Builder note(final java.util.List<Annotation> note) {
                b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
                return this;
            }

            public VisionPrescriptionLensSpecification build() {
                return new VisionPrescriptionLensSpecification(b.build());
            }
        }
    }

    /**
     * An authorization for the provision of glasses and/or contact lenses to
     * a patient.
     */
    public static class VisionPrescriptionPrism extends FhirObject {
        public static final String RESOURCE_TYPE = "VisionPrescriptionPrism";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public VisionPrescriptionPrism(final JsonObject data) {
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
         * Amount of prism to compensate for eye alignment in fractional units.
         */
        public Double amount() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_AMOUNT).doubleValue();
        }

        /**
         * The relative base, or reference lens edge, for the prism.
         */
        public String base() {
            return getString(FhirPropertyNames.PROPERTY_BASE);
        }

        public static final class Builder extends FhirObject.Builder<VisionPrescriptionPrism, VisionPrescriptionPrism.Builder> {

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

            public Builder amount(final Double amount) {
                b.add(FhirPropertyNames.PROPERTY_AMOUNT, amount);
                return this;
            }

            public Builder base(final String base) {
                b.add(FhirPropertyNames.PROPERTY_BASE, base);
                return this;
            }

            public VisionPrescriptionPrism build() {
                return new VisionPrescriptionPrism(b.build());
            }
        }
    }
}
