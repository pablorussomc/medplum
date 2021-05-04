/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class ObservationDefinition extends FhirResource {
    public static final String RESOURCE_TYPE = "ObservationDefinition";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_CATEGORY = "category";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_PERMITTED_DATA_TYPE = "permittedDataType";
    public static final String PROPERTY_MULTIPLE_RESULTS_ALLOWED = "multipleResultsAllowed";
    public static final String PROPERTY_METHOD = "method";
    public static final String PROPERTY_PREFERRED_REPORT_NAME = "preferredReportName";
    public static final String PROPERTY_QUANTITATIVE_DETAILS = "quantitativeDetails";
    public static final String PROPERTY_QUALIFIED_INTERVAL = "qualifiedInterval";
    public static final String PROPERTY_VALID_CODED_VALUE_SET = "validCodedValueSet";
    public static final String PROPERTY_NORMAL_CODED_VALUE_SET = "normalCodedValueSet";
    public static final String PROPERTY_ABNORMAL_CODED_VALUE_SET = "abnormalCodedValueSet";
    public static final String PROPERTY_CRITICAL_CODED_VALUE_SET = "criticalCodedValueSet";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ObservationDefinition(final JsonObject data) {
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
     * A code that classifies the general type of observation.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, PROPERTY_CATEGORY);
    }

    /**
     * Describes what will be observed. Sometimes this is called the
     * observation &quot;name&quot;.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, PROPERTY_CODE);
    }

    /**
     * A unique identifier assigned to this ObservationDefinition artifact.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The data types allowed for the value element of the instance
     * observations conforming to this ObservationDefinition.
     */
    public java.util.List<String> permittedDataType() {
        return getList(String.class, PROPERTY_PERMITTED_DATA_TYPE);
    }

    /**
     * Multiple results allowed for observations conforming to this
     * ObservationDefinition.
     */
    public Boolean multipleResultsAllowed() {
        return data.getBoolean(PROPERTY_MULTIPLE_RESULTS_ALLOWED);
    }

    /**
     * The method or technique used to perform the observation.
     */
    public CodeableConcept method() {
        return getObject(CodeableConcept.class, PROPERTY_METHOD);
    }

    /**
     * The preferred name to be used when reporting the results of
     * observations conforming to this ObservationDefinition.
     */
    public String preferredReportName() {
        return getString(PROPERTY_PREFERRED_REPORT_NAME);
    }

    /**
     * Characteristics for quantitative results of this observation.
     */
    public ObservationDefinitionQuantitativeDetails quantitativeDetails() {
        return getObject(ObservationDefinitionQuantitativeDetails.class, PROPERTY_QUANTITATIVE_DETAILS);
    }

    /**
     * Multiple  ranges of results qualified by different contexts for
     * ordinal or continuous observations conforming to this
     * ObservationDefinition.
     */
    public java.util.List<ObservationDefinitionQualifiedInterval> qualifiedInterval() {
        return getList(ObservationDefinitionQualifiedInterval.class, PROPERTY_QUALIFIED_INTERVAL);
    }

    /**
     * The set of valid coded results for the observations  conforming to
     * this ObservationDefinition.
     */
    public Reference validCodedValueSet() {
        return getObject(Reference.class, PROPERTY_VALID_CODED_VALUE_SET);
    }

    /**
     * The set of normal coded results for the observations conforming to
     * this ObservationDefinition.
     */
    public Reference normalCodedValueSet() {
        return getObject(Reference.class, PROPERTY_NORMAL_CODED_VALUE_SET);
    }

    /**
     * The set of abnormal coded results for the observation conforming to
     * this ObservationDefinition.
     */
    public Reference abnormalCodedValueSet() {
        return getObject(Reference.class, PROPERTY_ABNORMAL_CODED_VALUE_SET);
    }

    /**
     * The set of critical coded results for the observation conforming to
     * this ObservationDefinition.
     */
    public Reference criticalCodedValueSet() {
        return getObject(Reference.class, PROPERTY_CRITICAL_CODED_VALUE_SET);
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

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(PROPERTY_CODE, code);
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder permittedDataType(final java.util.List<String> permittedDataType) {
            b.add(PROPERTY_PERMITTED_DATA_TYPE, FhirObject.toStringArray(permittedDataType));
            return this;
        }

        public Builder multipleResultsAllowed(final Boolean multipleResultsAllowed) {
            b.add(PROPERTY_MULTIPLE_RESULTS_ALLOWED, multipleResultsAllowed);
            return this;
        }

        public Builder method(final CodeableConcept method) {
            b.add(PROPERTY_METHOD, method);
            return this;
        }

        public Builder preferredReportName(final String preferredReportName) {
            b.add(PROPERTY_PREFERRED_REPORT_NAME, preferredReportName);
            return this;
        }

        public Builder quantitativeDetails(final ObservationDefinitionQuantitativeDetails quantitativeDetails) {
            b.add(PROPERTY_QUANTITATIVE_DETAILS, quantitativeDetails);
            return this;
        }

        public Builder qualifiedInterval(final java.util.List<ObservationDefinitionQualifiedInterval> qualifiedInterval) {
            b.add(PROPERTY_QUALIFIED_INTERVAL, FhirObject.toArray(qualifiedInterval));
            return this;
        }

        public Builder validCodedValueSet(final Reference validCodedValueSet) {
            b.add(PROPERTY_VALID_CODED_VALUE_SET, validCodedValueSet);
            return this;
        }

        public Builder normalCodedValueSet(final Reference normalCodedValueSet) {
            b.add(PROPERTY_NORMAL_CODED_VALUE_SET, normalCodedValueSet);
            return this;
        }

        public Builder abnormalCodedValueSet(final Reference abnormalCodedValueSet) {
            b.add(PROPERTY_ABNORMAL_CODED_VALUE_SET, abnormalCodedValueSet);
            return this;
        }

        public Builder criticalCodedValueSet(final Reference criticalCodedValueSet) {
            b.add(PROPERTY_CRITICAL_CODED_VALUE_SET, criticalCodedValueSet);
            return this;
        }

        public ObservationDefinition build() {
            return new ObservationDefinition(b.build());
        }
    }

    public static class ObservationDefinitionQualifiedInterval extends FhirObject {
        public static final String RESOURCE_TYPE = "ObservationDefinitionQualifiedInterval";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CATEGORY = "category";
        public static final String PROPERTY_RANGE = "range";
        public static final String PROPERTY_CONTEXT = "context";
        public static final String PROPERTY_APPLIES_TO = "appliesTo";
        public static final String PROPERTY_GENDER = "gender";
        public static final String PROPERTY_AGE = "age";
        public static final String PROPERTY_GESTATIONAL_AGE = "gestationalAge";
        public static final String PROPERTY_CONDITION = "condition";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ObservationDefinitionQualifiedInterval(final JsonObject data) {
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
         * The category of interval of values for continuous or ordinal
         * observations conforming to this ObservationDefinition.
         */
        public String category() {
            return getString(PROPERTY_CATEGORY);
        }

        /**
         * The low and high values determining the interval. There may be only
         * one of the two.
         */
        public Range range() {
            return getObject(Range.class, PROPERTY_RANGE);
        }

        /**
         * Codes to indicate the health context the range applies to. For
         * example, the normal or therapeutic range.
         */
        public CodeableConcept context() {
            return getObject(CodeableConcept.class, PROPERTY_CONTEXT);
        }

        /**
         * Codes to indicate the target population this reference range applies
         * to.
         */
        public java.util.List<CodeableConcept> appliesTo() {
            return getList(CodeableConcept.class, PROPERTY_APPLIES_TO);
        }

        /**
         * Sex of the population the range applies to.
         */
        public String gender() {
            return getString(PROPERTY_GENDER);
        }

        /**
         * The age at which this reference range is applicable. This is a
         * neonatal age (e.g. number of weeks at term) if the meaning says so.
         */
        public Range age() {
            return getObject(Range.class, PROPERTY_AGE);
        }

        /**
         * The gestational age to which this reference range is applicable, in
         * the context of pregnancy.
         */
        public Range gestationalAge() {
            return getObject(Range.class, PROPERTY_GESTATIONAL_AGE);
        }

        /**
         * Text based condition for which the reference range is valid.
         */
        public String condition() {
            return getString(PROPERTY_CONDITION);
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

            public Builder category(final String category) {
                b.add(PROPERTY_CATEGORY, category);
                return this;
            }

            public Builder range(final Range range) {
                b.add(PROPERTY_RANGE, range);
                return this;
            }

            public Builder context(final CodeableConcept context) {
                b.add(PROPERTY_CONTEXT, context);
                return this;
            }

            public Builder appliesTo(final java.util.List<CodeableConcept> appliesTo) {
                b.add(PROPERTY_APPLIES_TO, FhirObject.toArray(appliesTo));
                return this;
            }

            public Builder gender(final String gender) {
                b.add(PROPERTY_GENDER, gender);
                return this;
            }

            public Builder age(final Range age) {
                b.add(PROPERTY_AGE, age);
                return this;
            }

            public Builder gestationalAge(final Range gestationalAge) {
                b.add(PROPERTY_GESTATIONAL_AGE, gestationalAge);
                return this;
            }

            public Builder condition(final String condition) {
                b.add(PROPERTY_CONDITION, condition);
                return this;
            }

            public ObservationDefinitionQualifiedInterval build() {
                return new ObservationDefinitionQualifiedInterval(b.build());
            }
        }
    }

    public static class ObservationDefinitionQuantitativeDetails extends FhirObject {
        public static final String RESOURCE_TYPE = "ObservationDefinitionQuantitativeDetails";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CUSTOMARY_UNIT = "customaryUnit";
        public static final String PROPERTY_UNIT = "unit";
        public static final String PROPERTY_CONVERSION_FACTOR = "conversionFactor";
        public static final String PROPERTY_DECIMAL_PRECISION = "decimalPrecision";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ObservationDefinitionQuantitativeDetails(final JsonObject data) {
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
         * Customary unit used to report quantitative results of observations
         * conforming to this ObservationDefinition.
         */
        public CodeableConcept customaryUnit() {
            return getObject(CodeableConcept.class, PROPERTY_CUSTOMARY_UNIT);
        }

        /**
         * SI unit used to report quantitative results of observations conforming
         * to this ObservationDefinition.
         */
        public CodeableConcept unit() {
            return getObject(CodeableConcept.class, PROPERTY_UNIT);
        }

        /**
         * Factor for converting value expressed with SI unit to value expressed
         * with customary unit.
         */
        public Double conversionFactor() {
            return data.getJsonNumber(PROPERTY_CONVERSION_FACTOR).doubleValue();
        }

        /**
         * Number of digits after decimal separator when the results of such
         * observations are of type Quantity.
         */
        public Integer decimalPrecision() {
            return data.getInt(PROPERTY_DECIMAL_PRECISION);
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

            public Builder customaryUnit(final CodeableConcept customaryUnit) {
                b.add(PROPERTY_CUSTOMARY_UNIT, customaryUnit);
                return this;
            }

            public Builder unit(final CodeableConcept unit) {
                b.add(PROPERTY_UNIT, unit);
                return this;
            }

            public Builder conversionFactor(final Double conversionFactor) {
                b.add(PROPERTY_CONVERSION_FACTOR, conversionFactor);
                return this;
            }

            public Builder decimalPrecision(final Integer decimalPrecision) {
                b.add(PROPERTY_DECIMAL_PRECISION, decimalPrecision);
                return this;
            }

            public ObservationDefinitionQuantitativeDetails build() {
                return new ObservationDefinitionQuantitativeDetails(b.build());
            }
        }
    }
}
