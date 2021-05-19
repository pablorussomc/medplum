/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A populatioof people with some set of grouping criteria.
 */
public class Population extends FhirObject {
    public static final String RESOURCE_TYPE = "Population";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Population(final JsonObject data) {
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
     * The age of the specific population.
     */
    public Range ageRange() {
        return getObject(Range.class, FhirPropertyNames.PROPERTY_AGE_RANGE);
    }

    /**
     * The age of the specific population.
     */
    public CodeableConcept ageCodeableConcept() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_AGE_CODEABLE_CONCEPT);
    }

    /**
     * The gender of the specific population.
     */
    public CodeableConcept gender() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_GENDER);
    }

    /**
     * Race of the specific population.
     */
    public CodeableConcept race() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_RACE);
    }

    /**
     * The existing physiological conditions of the specific population to
     * which this applies.
     */
    public CodeableConcept physiologicalCondition() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PHYSIOLOGICAL_CONDITION);
    }

    public static final class Builder extends FhirObject.Builder<Population, Population.Builder> {

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

        public Builder ageRange(final Range ageRange) {
            b.add(FhirPropertyNames.PROPERTY_AGE_RANGE, ageRange);
            return this;
        }

        public Builder ageCodeableConcept(final CodeableConcept ageCodeableConcept) {
            b.add(FhirPropertyNames.PROPERTY_AGE_CODEABLE_CONCEPT, ageCodeableConcept);
            return this;
        }

        public Builder gender(final CodeableConcept gender) {
            b.add(FhirPropertyNames.PROPERTY_GENDER, gender);
            return this;
        }

        public Builder race(final CodeableConcept race) {
            b.add(FhirPropertyNames.PROPERTY_RACE, race);
            return this;
        }

        public Builder physiologicalCondition(final CodeableConcept physiologicalCondition) {
            b.add(FhirPropertyNames.PROPERTY_PHYSIOLOGICAL_CONDITION, physiologicalCondition);
            return this;
        }

        public Population build() {
            return new Population(b.build());
        }
    }
}
