/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Medication extends FhirResource {
    public static final String RESOURCE_TYPE = "Medication";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_MANUFACTURER = "manufacturer";
    public static final String PROPERTY_FORM = "form";
    public static final String PROPERTY_AMOUNT = "amount";
    public static final String PROPERTY_INGREDIENT = "ingredient";
    public static final String PROPERTY_BATCH = "batch";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Medication(final JsonObject data) {
        super(data);
    }

    /**
     * A reference to a set of rules that were followed when the resource was
     * constructed, and which must be understood when processing the content.
     * Often, this is a reference to an implementation guide that defines the
     * special rules along with other profiles etc.
     */
    public java.net.URI implicitRules() {
        return getUri(PROPERTY_IMPLICIT_RULES);
    }

    /**
     * The base language in which the resource is written.
     */
    public String language() {
        return getString(PROPERTY_LANGUAGE);
    }

    /**
     * A human-readable narrative that contains a summary of the resource and
     * can be used to represent the content of the resource to a human. The
     * narrative need not encode all the structured data, but is required to
     * contain sufficient detail to make it &quot;clinically safe&quot; for a human to
     * just read the narrative. Resource definitions may define what content
     * should be represented in the narrative to ensure clinical safety.
     */
    public Narrative text() {
        return getObject(Narrative.class, PROPERTY_TEXT);
    }

    /**
     * These resources do not have an independent existence apart from the
     * resource that contains them - they cannot be identified independently,
     * and nor can they have their own independent transaction scope.
     */
    public java.util.List<FhirResource> contained() {
        return getList(FhirResource.class, PROPERTY_CONTAINED);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, PROPERTY_EXTENSION);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource and that modifies the
     * understanding of the element that contains it and/or the understanding
     * of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe
     * and manageable, there is a strict set of governance applied to the
     * definition and use of extensions. Though any implementer is allowed to
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension. Applications processing a
     * resource are required to check for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on
     * Resource or DomainResource (including cannot change the meaning of
     * modifierExtension itself).
     */
    public java.util.List<Extension> modifierExtension() {
        return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
    }

    /**
     * Business identifier for this medication.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * A code (or set of codes) that specify this medication, or a textual
     * description if no code is available. Usage note: This could be a
     * standard medication code such as a code from RxNorm, SNOMED CT, IDMP
     * etc. It could also be a national or local formulary code, optionally
     * with translations to other code systems.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, PROPERTY_CODE);
    }

    /**
     * A code to indicate if the medication is in active use.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * Describes the details of the manufacturer of the medication product. 
     * This is not intended to represent the distributor of a medication
     * product.
     */
    public Reference manufacturer() {
        return getObject(Reference.class, PROPERTY_MANUFACTURER);
    }

    /**
     * Describes the form of the item.  Powder; tablets; capsule.
     */
    public CodeableConcept form() {
        return getObject(CodeableConcept.class, PROPERTY_FORM);
    }

    /**
     * Specific amount of the drug in the packaged product.  For example,
     * when specifying a product that has the same strength (For example,
     * Insulin glargine 100 unit per mL solution for injection), this
     * attribute provides additional clarification of the package amount (For
     * example, 3 mL, 10mL, etc.).
     */
    public Ratio amount() {
        return getObject(Ratio.class, PROPERTY_AMOUNT);
    }

    /**
     * Identifies a particular constituent of interest in the product.
     */
    public java.util.List<MedicationIngredient> ingredient() {
        return getList(MedicationIngredient.class, PROPERTY_INGREDIENT);
    }

    /**
     * Information that only applies to packages (not products).
     */
    public MedicationBatch batch() {
        return getObject(MedicationBatch.class, PROPERTY_BATCH);
    }

    public static class Builder extends FhirResource.Builder {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder resourceType(final String resourceType) {
            b.add(PROPERTY_RESOURCE_TYPE, resourceType);
            return this;
        }

        public Builder id(final String id) {
            b.add(PROPERTY_ID, id);
            return this;
        }

        public Builder meta(final Meta meta) {
            b.add(PROPERTY_META, meta);
            return this;
        }

        public Builder implicitRules(final java.net.URI implicitRules) {
            b.add(PROPERTY_IMPLICIT_RULES, implicitRules.toString());
            return this;
        }

        public Builder language(final String language) {
            b.add(PROPERTY_LANGUAGE, language);
            return this;
        }

        public Builder text(final Narrative text) {
            b.add(PROPERTY_TEXT, text);
            return this;
        }

        public Builder contained(final java.util.List<FhirResource> contained) {
            b.add(PROPERTY_CONTAINED, FhirObject.toArray(contained));
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
            b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(PROPERTY_CODE, code);
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder manufacturer(final Reference manufacturer) {
            b.add(PROPERTY_MANUFACTURER, manufacturer);
            return this;
        }

        public Builder form(final CodeableConcept form) {
            b.add(PROPERTY_FORM, form);
            return this;
        }

        public Builder amount(final Ratio amount) {
            b.add(PROPERTY_AMOUNT, amount);
            return this;
        }

        public Builder ingredient(final java.util.List<MedicationIngredient> ingredient) {
            b.add(PROPERTY_INGREDIENT, FhirObject.toArray(ingredient));
            return this;
        }

        public Builder batch(final MedicationBatch batch) {
            b.add(PROPERTY_BATCH, batch);
            return this;
        }

        public Medication build() {
            return new Medication(b.build());
        }
    }

    public static class MedicationBatch extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicationBatch";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_LOT_NUMBER = "lotNumber";
        public static final String PROPERTY_EXPIRATION_DATE = "expirationDate";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicationBatch(final JsonObject data) {
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
            return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * The assigned lot number of a batch of the specified product.
         */
        public String lotNumber() {
            return getString(PROPERTY_LOT_NUMBER);
        }

        /**
         * When this specific batch of product will expire.
         */
        public java.time.Instant expirationDate() {
            return getInstant(PROPERTY_EXPIRATION_DATE);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder lotNumber(final String lotNumber) {
                b.add(PROPERTY_LOT_NUMBER, lotNumber);
                return this;
            }

            public Builder expirationDate(final java.time.Instant expirationDate) {
                b.add(PROPERTY_EXPIRATION_DATE, expirationDate.toString());
                return this;
            }

            public MedicationBatch build() {
                return new MedicationBatch(b.build());
            }
        }
    }

    public static class MedicationIngredient extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicationIngredient";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_ITEM_CODEABLE_CONCEPT = "itemCodeableConcept";
        public static final String PROPERTY_ITEM_REFERENCE = "itemReference";
        public static final String PROPERTY_IS_ACTIVE = "isActive";
        public static final String PROPERTY_STRENGTH = "strength";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicationIngredient(final JsonObject data) {
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
            return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * The actual ingredient - either a substance (simple ingredient) or
         * another medication of a medication.
         */
        public CodeableConcept itemCodeableConcept() {
            return getObject(CodeableConcept.class, PROPERTY_ITEM_CODEABLE_CONCEPT);
        }

        /**
         * The actual ingredient - either a substance (simple ingredient) or
         * another medication of a medication.
         */
        public Reference itemReference() {
            return getObject(Reference.class, PROPERTY_ITEM_REFERENCE);
        }

        /**
         * Indication of whether this ingredient affects the therapeutic action
         * of the drug.
         */
        public Boolean isActive() {
            return data.getBoolean(PROPERTY_IS_ACTIVE);
        }

        /**
         * Specifies how many (or how much) of the items there are in this
         * Medication.  For example, 250 mg per tablet.  This is expressed as a
         * ratio where the numerator is 250mg and the denominator is 1 tablet.
         */
        public Ratio strength() {
            return getObject(Ratio.class, PROPERTY_STRENGTH);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder itemCodeableConcept(final CodeableConcept itemCodeableConcept) {
                b.add(PROPERTY_ITEM_CODEABLE_CONCEPT, itemCodeableConcept);
                return this;
            }

            public Builder itemReference(final Reference itemReference) {
                b.add(PROPERTY_ITEM_REFERENCE, itemReference);
                return this;
            }

            public Builder isActive(final Boolean isActive) {
                b.add(PROPERTY_IS_ACTIVE, isActive);
                return this;
            }

            public Builder strength(final Ratio strength) {
                b.add(PROPERTY_STRENGTH, strength);
                return this;
            }

            public MedicationIngredient build() {
                return new MedicationIngredient(b.build());
            }
        }
    }
}
