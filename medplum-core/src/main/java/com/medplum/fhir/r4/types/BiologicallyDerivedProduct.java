/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A material substance originating from a biological entity intended to
 * be transplanted or infused
 * into another (possibly the same) biological entity.
 */
public class BiologicallyDerivedProduct extends DomainResource {
    public static final String RESOURCE_TYPE = "BiologicallyDerivedProduct";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public BiologicallyDerivedProduct(final JsonObject data) {
        super(data);
    }

    /**
     * This records identifiers associated with this biologically derived
     * product instance that are defined by business processes and/or used to
     * refer to it when a direct URL reference to the resource itself is not
     * appropriate (e.g. in CDA documents, or in written / printed
     * documentation).
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * Broad category of this product.
     */
    public String productCategory() {
        return getString(FhirPropertyNames.PROPERTY_PRODUCT_CATEGORY);
    }

    /**
     * A code that identifies the kind of this biologically derived product
     * (SNOMED Ctcode).
     */
    public CodeableConcept productCode() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PRODUCT_CODE);
    }

    /**
     * Whether the product is currently available.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Procedure request to obtain this biologically derived product.
     */
    public java.util.List<Reference> request() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REQUEST);
    }

    /**
     * Number of discrete units within this product.
     */
    public Integer quantity() {
        return data.getInt(FhirPropertyNames.PROPERTY_QUANTITY);
    }

    /**
     * Parent product (if any).
     */
    public java.util.List<Reference> parent() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_PARENT);
    }

    /**
     * How this product was collected.
     */
    public BiologicallyDerivedProductCollection collection() {
        return getObject(BiologicallyDerivedProductCollection.class, FhirPropertyNames.PROPERTY_COLLECTION);
    }

    /**
     * Any processing of the product during collection that does not change
     * the fundamental nature of the product. For example adding
     * anti-coagulants during the collection of Peripheral Blood Stem Cells.
     */
    public java.util.List<BiologicallyDerivedProductProcessing> processing() {
        return getList(BiologicallyDerivedProductProcessing.class, FhirPropertyNames.PROPERTY_PROCESSING);
    }

    /**
     * Any manipulation of product post-collection that is intended to alter
     * the product.  For example a buffy-coat enrichment or CD8 reduction of
     * Peripheral Blood Stem Cells to make it more suitable for infusion.
     */
    public BiologicallyDerivedProductManipulation manipulation() {
        return getObject(BiologicallyDerivedProductManipulation.class, FhirPropertyNames.PROPERTY_MANIPULATION);
    }

    /**
     * Product storage.
     */
    public java.util.List<BiologicallyDerivedProductStorage> storage() {
        return getList(BiologicallyDerivedProductStorage.class, FhirPropertyNames.PROPERTY_STORAGE);
    }

    public static final class Builder extends DomainResource.Builder<BiologicallyDerivedProduct, BiologicallyDerivedProduct.Builder> {

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

        public Builder productCategory(final String productCategory) {
            b.add(FhirPropertyNames.PROPERTY_PRODUCT_CATEGORY, productCategory);
            return this;
        }

        public Builder productCode(final CodeableConcept productCode) {
            b.add(FhirPropertyNames.PROPERTY_PRODUCT_CODE, productCode);
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder request(final java.util.List<Reference> request) {
            b.add(FhirPropertyNames.PROPERTY_REQUEST, FhirObject.toArray(request));
            return this;
        }

        public Builder quantity(final Integer quantity) {
            b.add(FhirPropertyNames.PROPERTY_QUANTITY, quantity);
            return this;
        }

        public Builder parent(final java.util.List<Reference> parent) {
            b.add(FhirPropertyNames.PROPERTY_PARENT, FhirObject.toArray(parent));
            return this;
        }

        public Builder collection(final BiologicallyDerivedProductCollection collection) {
            b.add(FhirPropertyNames.PROPERTY_COLLECTION, collection);
            return this;
        }

        public Builder processing(final java.util.List<BiologicallyDerivedProductProcessing> processing) {
            b.add(FhirPropertyNames.PROPERTY_PROCESSING, FhirObject.toArray(processing));
            return this;
        }

        public Builder manipulation(final BiologicallyDerivedProductManipulation manipulation) {
            b.add(FhirPropertyNames.PROPERTY_MANIPULATION, manipulation);
            return this;
        }

        public Builder storage(final java.util.List<BiologicallyDerivedProductStorage> storage) {
            b.add(FhirPropertyNames.PROPERTY_STORAGE, FhirObject.toArray(storage));
            return this;
        }

        public BiologicallyDerivedProduct build() {
            return new BiologicallyDerivedProduct(b.build());
        }
    }

    /**
     * A material substance originating from a biological entity intended to
     * be transplanted or infused
     * into another (possibly the same) biological entity.
     */
    public static class BiologicallyDerivedProductCollection extends FhirObject {
        public static final String RESOURCE_TYPE = "BiologicallyDerivedProductCollection";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public BiologicallyDerivedProductCollection(final JsonObject data) {
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
         * Healthcare professional who is performing the collection.
         */
        public Reference collector() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_COLLECTOR);
        }

        /**
         * The patient or entity, such as a hospital or vendor in the case of a
         * processed/manipulated/manufactured product, providing the product.
         */
        public Reference source() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_SOURCE);
        }

        /**
         * Time of product collection.
         */
        public String collectedDateTime() {
            return getString(FhirPropertyNames.PROPERTY_COLLECTED_DATE_TIME);
        }

        /**
         * Time of product collection.
         */
        public Period collectedPeriod() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_COLLECTED_PERIOD);
        }

        public static final class Builder extends FhirObject.Builder<BiologicallyDerivedProductCollection, BiologicallyDerivedProductCollection.Builder> {

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

            public Builder collector(final Reference collector) {
                b.add(FhirPropertyNames.PROPERTY_COLLECTOR, collector);
                return this;
            }

            public Builder source(final Reference source) {
                b.add(FhirPropertyNames.PROPERTY_SOURCE, source);
                return this;
            }

            public Builder collectedDateTime(final String collectedDateTime) {
                b.add(FhirPropertyNames.PROPERTY_COLLECTED_DATE_TIME, collectedDateTime);
                return this;
            }

            public Builder collectedPeriod(final Period collectedPeriod) {
                b.add(FhirPropertyNames.PROPERTY_COLLECTED_PERIOD, collectedPeriod);
                return this;
            }

            public BiologicallyDerivedProductCollection build() {
                return new BiologicallyDerivedProductCollection(b.build());
            }
        }
    }

    /**
     * A material substance originating from a biological entity intended to
     * be transplanted or infused
     * into another (possibly the same) biological entity.
     */
    public static class BiologicallyDerivedProductManipulation extends FhirObject {
        public static final String RESOURCE_TYPE = "BiologicallyDerivedProductManipulation";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public BiologicallyDerivedProductManipulation(final JsonObject data) {
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
         * Description of manipulation.
         */
        public String description() {
            return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
        }

        /**
         * Time of manipulation.
         */
        public String timeDateTime() {
            return getString(FhirPropertyNames.PROPERTY_TIME_DATE_TIME);
        }

        /**
         * Time of manipulation.
         */
        public Period timePeriod() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_TIME_PERIOD);
        }

        public static final class Builder extends FhirObject.Builder<BiologicallyDerivedProductManipulation, BiologicallyDerivedProductManipulation.Builder> {

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

            public Builder description(final String description) {
                b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder timeDateTime(final String timeDateTime) {
                b.add(FhirPropertyNames.PROPERTY_TIME_DATE_TIME, timeDateTime);
                return this;
            }

            public Builder timePeriod(final Period timePeriod) {
                b.add(FhirPropertyNames.PROPERTY_TIME_PERIOD, timePeriod);
                return this;
            }

            public BiologicallyDerivedProductManipulation build() {
                return new BiologicallyDerivedProductManipulation(b.build());
            }
        }
    }

    /**
     * A material substance originating from a biological entity intended to
     * be transplanted or infused
     * into another (possibly the same) biological entity.
     */
    public static class BiologicallyDerivedProductProcessing extends FhirObject {
        public static final String RESOURCE_TYPE = "BiologicallyDerivedProductProcessing";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public BiologicallyDerivedProductProcessing(final JsonObject data) {
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
         * Description of of processing.
         */
        public String description() {
            return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
        }

        /**
         * Procesing code.
         */
        public CodeableConcept procedure() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PROCEDURE);
        }

        /**
         * Substance added during processing.
         */
        public Reference additive() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ADDITIVE);
        }

        /**
         * Time of processing.
         */
        public String timeDateTime() {
            return getString(FhirPropertyNames.PROPERTY_TIME_DATE_TIME);
        }

        /**
         * Time of processing.
         */
        public Period timePeriod() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_TIME_PERIOD);
        }

        public static final class Builder extends FhirObject.Builder<BiologicallyDerivedProductProcessing, BiologicallyDerivedProductProcessing.Builder> {

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

            public Builder description(final String description) {
                b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder procedure(final CodeableConcept procedure) {
                b.add(FhirPropertyNames.PROPERTY_PROCEDURE, procedure);
                return this;
            }

            public Builder additive(final Reference additive) {
                b.add(FhirPropertyNames.PROPERTY_ADDITIVE, additive);
                return this;
            }

            public Builder timeDateTime(final String timeDateTime) {
                b.add(FhirPropertyNames.PROPERTY_TIME_DATE_TIME, timeDateTime);
                return this;
            }

            public Builder timePeriod(final Period timePeriod) {
                b.add(FhirPropertyNames.PROPERTY_TIME_PERIOD, timePeriod);
                return this;
            }

            public BiologicallyDerivedProductProcessing build() {
                return new BiologicallyDerivedProductProcessing(b.build());
            }
        }
    }

    /**
     * A material substance originating from a biological entity intended to
     * be transplanted or infused
     * into another (possibly the same) biological entity.
     */
    public static class BiologicallyDerivedProductStorage extends FhirObject {
        public static final String RESOURCE_TYPE = "BiologicallyDerivedProductStorage";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public BiologicallyDerivedProductStorage(final JsonObject data) {
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
         * Description of storage.
         */
        public String description() {
            return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
        }

        /**
         * Storage temperature.
         */
        public Double temperature() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_TEMPERATURE).doubleValue();
        }

        /**
         * Temperature scale used.
         */
        public String scale() {
            return getString(FhirPropertyNames.PROPERTY_SCALE);
        }

        /**
         * Storage timeperiod.
         */
        public Period duration() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_DURATION);
        }

        public static final class Builder extends FhirObject.Builder<BiologicallyDerivedProductStorage, BiologicallyDerivedProductStorage.Builder> {

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

            public Builder description(final String description) {
                b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder temperature(final Double temperature) {
                b.add(FhirPropertyNames.PROPERTY_TEMPERATURE, temperature);
                return this;
            }

            public Builder scale(final String scale) {
                b.add(FhirPropertyNames.PROPERTY_SCALE, scale);
                return this;
            }

            public Builder duration(final Period duration) {
                b.add(FhirPropertyNames.PROPERTY_DURATION, duration);
                return this;
            }

            public BiologicallyDerivedProductStorage build() {
                return new BiologicallyDerivedProductStorage(b.build());
            }
        }
    }
}
