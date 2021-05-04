/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class FamilyMemberHistory extends FhirResource {
    public static final String RESOURCE_TYPE = "FamilyMemberHistory";
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
    public static final String PROPERTY_INSTANTIATES_CANONICAL = "instantiatesCanonical";
    public static final String PROPERTY_INSTANTIATES_URI = "instantiatesUri";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_DATA_ABSENT_REASON = "dataAbsentReason";
    public static final String PROPERTY_PATIENT = "patient";
    public static final String PROPERTY_DATE = "date";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_RELATIONSHIP = "relationship";
    public static final String PROPERTY_SEX = "sex";
    public static final String PROPERTY_BORN_PERIOD = "bornPeriod";
    public static final String PROPERTY_BORN_DATE = "bornDate";
    public static final String PROPERTY_BORN_STRING = "bornString";
    public static final String PROPERTY_AGE_AGE = "ageAge";
    public static final String PROPERTY_AGE_RANGE = "ageRange";
    public static final String PROPERTY_AGE_STRING = "ageString";
    public static final String PROPERTY_ESTIMATED_AGE = "estimatedAge";
    public static final String PROPERTY_DECEASED_BOOLEAN = "deceasedBoolean";
    public static final String PROPERTY_DECEASED_AGE = "deceasedAge";
    public static final String PROPERTY_DECEASED_RANGE = "deceasedRange";
    public static final String PROPERTY_DECEASED_DATE = "deceasedDate";
    public static final String PROPERTY_DECEASED_STRING = "deceasedString";
    public static final String PROPERTY_REASON_CODE = "reasonCode";
    public static final String PROPERTY_REASON_REFERENCE = "reasonReference";
    public static final String PROPERTY_NOTE = "note";
    public static final String PROPERTY_CONDITION = "condition";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public FamilyMemberHistory(final JsonObject data) {
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
     * Business identifiers assigned to this family member history by the
     * performer or other systems which remain constant as the resource is
     * updated and propagates from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or
     * other definition that is adhered to in whole or in part by this
     * FamilyMemberHistory.
     */
    public java.util.List<String> instantiatesCanonical() {
        return getList(String.class, PROPERTY_INSTANTIATES_CANONICAL);
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline,
     * orderset or other definition that is adhered to in whole or in part by
     * this FamilyMemberHistory.
     */
    public java.util.List<java.net.URI> instantiatesUri() {
        return getList(java.net.URI.class, PROPERTY_INSTANTIATES_URI);
    }

    /**
     * A code specifying the status of the record of the family history of a
     * specific family member.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * Describes why the family member's history is not available.
     */
    public CodeableConcept dataAbsentReason() {
        return getObject(CodeableConcept.class, PROPERTY_DATA_ABSENT_REASON);
    }

    /**
     * The person who this history concerns.
     */
    public Reference patient() {
        return getObject(Reference.class, PROPERTY_PATIENT);
    }

    /**
     * The date (and possibly time) when the family member history was
     * recorded or last updated.
     */
    public java.time.Instant date() {
        return getInstant(PROPERTY_DATE);
    }

    /**
     * This will either be a name or a description; e.g. &quot;Aunt Susan&quot;, &quot;my
     * cousin with the red hair&quot;.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * The type of relationship this person has to the patient (father,
     * mother, brother etc.).
     */
    public CodeableConcept relationship() {
        return getObject(CodeableConcept.class, PROPERTY_RELATIONSHIP);
    }

    /**
     * The birth sex of the family member.
     */
    public CodeableConcept sex() {
        return getObject(CodeableConcept.class, PROPERTY_SEX);
    }

    /**
     * The actual or approximate date of birth of the relative.
     */
    public Period bornPeriod() {
        return getObject(Period.class, PROPERTY_BORN_PERIOD);
    }

    /**
     * The actual or approximate date of birth of the relative.
     */
    public String bornDate() {
        return getString(PROPERTY_BORN_DATE);
    }

    /**
     * The actual or approximate date of birth of the relative.
     */
    public String bornString() {
        return getString(PROPERTY_BORN_STRING);
    }

    /**
     * The age of the relative at the time the family member history is
     * recorded.
     */
    public Age ageAge() {
        return getObject(Age.class, PROPERTY_AGE_AGE);
    }

    /**
     * The age of the relative at the time the family member history is
     * recorded.
     */
    public Range ageRange() {
        return getObject(Range.class, PROPERTY_AGE_RANGE);
    }

    /**
     * The age of the relative at the time the family member history is
     * recorded.
     */
    public String ageString() {
        return getString(PROPERTY_AGE_STRING);
    }

    /**
     * If true, indicates that the age value specified is an estimated value.
     */
    public Boolean estimatedAge() {
        return data.getBoolean(PROPERTY_ESTIMATED_AGE);
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the
     * time of death for the family member history record.
     */
    public Boolean deceasedBoolean() {
        return data.getBoolean(PROPERTY_DECEASED_BOOLEAN);
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the
     * time of death for the family member history record.
     */
    public Age deceasedAge() {
        return getObject(Age.class, PROPERTY_DECEASED_AGE);
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the
     * time of death for the family member history record.
     */
    public Range deceasedRange() {
        return getObject(Range.class, PROPERTY_DECEASED_RANGE);
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the
     * time of death for the family member history record.
     */
    public String deceasedDate() {
        return getString(PROPERTY_DECEASED_DATE);
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the
     * time of death for the family member history record.
     */
    public String deceasedString() {
        return getString(PROPERTY_DECEASED_STRING);
    }

    /**
     * Describes why the family member history occurred in coded or textual
     * form.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, PROPERTY_REASON_CODE);
    }

    /**
     * Indicates a Condition, Observation, AllergyIntolerance, or
     * QuestionnaireResponse that justifies this family member history event.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, PROPERTY_REASON_REFERENCE);
    }

    /**
     * This property allows a non condition-specific note to the made about
     * the related person. Ideally, the note would be in the condition
     * property, but this is not always possible.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
    }

    /**
     * The significant Conditions (or condition) that the family member had.
     * This is a repeating section to allow a system to represent more than
     * one condition per resource, though there is nothing stopping multiple
     * resources - one per condition.
     */
    public java.util.List<FamilyMemberHistoryCondition> condition() {
        return getList(FamilyMemberHistoryCondition.class, PROPERTY_CONDITION);
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

        public Builder instantiatesCanonical(final java.util.List<String> instantiatesCanonical) {
            b.add(PROPERTY_INSTANTIATES_CANONICAL, FhirObject.toStringArray(instantiatesCanonical));
            return this;
        }

        public Builder instantiatesUri(final java.util.List<java.net.URI> instantiatesUri) {
            b.add(PROPERTY_INSTANTIATES_URI, FhirObject.toUriArray(instantiatesUri));
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder dataAbsentReason(final CodeableConcept dataAbsentReason) {
            b.add(PROPERTY_DATA_ABSENT_REASON, dataAbsentReason);
            return this;
        }

        public Builder patient(final Reference patient) {
            b.add(PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder relationship(final CodeableConcept relationship) {
            b.add(PROPERTY_RELATIONSHIP, relationship);
            return this;
        }

        public Builder sex(final CodeableConcept sex) {
            b.add(PROPERTY_SEX, sex);
            return this;
        }

        public Builder bornPeriod(final Period bornPeriod) {
            b.add(PROPERTY_BORN_PERIOD, bornPeriod);
            return this;
        }

        public Builder bornDate(final String bornDate) {
            b.add(PROPERTY_BORN_DATE, bornDate);
            return this;
        }

        public Builder bornString(final String bornString) {
            b.add(PROPERTY_BORN_STRING, bornString);
            return this;
        }

        public Builder ageAge(final Age ageAge) {
            b.add(PROPERTY_AGE_AGE, ageAge);
            return this;
        }

        public Builder ageRange(final Range ageRange) {
            b.add(PROPERTY_AGE_RANGE, ageRange);
            return this;
        }

        public Builder ageString(final String ageString) {
            b.add(PROPERTY_AGE_STRING, ageString);
            return this;
        }

        public Builder estimatedAge(final Boolean estimatedAge) {
            b.add(PROPERTY_ESTIMATED_AGE, estimatedAge);
            return this;
        }

        public Builder deceasedBoolean(final Boolean deceasedBoolean) {
            b.add(PROPERTY_DECEASED_BOOLEAN, deceasedBoolean);
            return this;
        }

        public Builder deceasedAge(final Age deceasedAge) {
            b.add(PROPERTY_DECEASED_AGE, deceasedAge);
            return this;
        }

        public Builder deceasedRange(final Range deceasedRange) {
            b.add(PROPERTY_DECEASED_RANGE, deceasedRange);
            return this;
        }

        public Builder deceasedDate(final String deceasedDate) {
            b.add(PROPERTY_DECEASED_DATE, deceasedDate);
            return this;
        }

        public Builder deceasedString(final String deceasedString) {
            b.add(PROPERTY_DECEASED_STRING, deceasedString);
            return this;
        }

        public Builder reasonCode(final java.util.List<CodeableConcept> reasonCode) {
            b.add(PROPERTY_REASON_CODE, FhirObject.toArray(reasonCode));
            return this;
        }

        public Builder reasonReference(final java.util.List<Reference> reasonReference) {
            b.add(PROPERTY_REASON_REFERENCE, FhirObject.toArray(reasonReference));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder condition(final java.util.List<FamilyMemberHistoryCondition> condition) {
            b.add(PROPERTY_CONDITION, FhirObject.toArray(condition));
            return this;
        }

        public FamilyMemberHistory build() {
            return new FamilyMemberHistory(b.build());
        }
    }

    public static class FamilyMemberHistoryCondition extends FhirObject {
        public static final String RESOURCE_TYPE = "FamilyMemberHistoryCondition";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_OUTCOME = "outcome";
        public static final String PROPERTY_CONTRIBUTED_TO_DEATH = "contributedToDeath";
        public static final String PROPERTY_ONSET_AGE = "onsetAge";
        public static final String PROPERTY_ONSET_RANGE = "onsetRange";
        public static final String PROPERTY_ONSET_PERIOD = "onsetPeriod";
        public static final String PROPERTY_ONSET_STRING = "onsetString";
        public static final String PROPERTY_NOTE = "note";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public FamilyMemberHistoryCondition(final JsonObject data) {
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
         * The actual condition specified. Could be a coded condition (like MI or
         * Diabetes) or a less specific string like 'cancer' depending on how
         * much is known about the condition and the capabilities of the creating
         * system.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, PROPERTY_CODE);
        }

        /**
         * Indicates what happened following the condition.  If the condition
         * resulted in death, deceased date is captured on the relation.
         */
        public CodeableConcept outcome() {
            return getObject(CodeableConcept.class, PROPERTY_OUTCOME);
        }

        /**
         * This condition contributed to the cause of death of the related
         * person. If contributedToDeath is not populated, then it is unknown.
         */
        public Boolean contributedToDeath() {
            return data.getBoolean(PROPERTY_CONTRIBUTED_TO_DEATH);
        }

        /**
         * Either the age of onset, range of approximate age or descriptive
         * string can be recorded.  For conditions with multiple occurrences,
         * this describes the first known occurrence.
         */
        public Age onsetAge() {
            return getObject(Age.class, PROPERTY_ONSET_AGE);
        }

        /**
         * Either the age of onset, range of approximate age or descriptive
         * string can be recorded.  For conditions with multiple occurrences,
         * this describes the first known occurrence.
         */
        public Range onsetRange() {
            return getObject(Range.class, PROPERTY_ONSET_RANGE);
        }

        /**
         * Either the age of onset, range of approximate age or descriptive
         * string can be recorded.  For conditions with multiple occurrences,
         * this describes the first known occurrence.
         */
        public Period onsetPeriod() {
            return getObject(Period.class, PROPERTY_ONSET_PERIOD);
        }

        /**
         * Either the age of onset, range of approximate age or descriptive
         * string can be recorded.  For conditions with multiple occurrences,
         * this describes the first known occurrence.
         */
        public String onsetString() {
            return getString(PROPERTY_ONSET_STRING);
        }

        /**
         * An area where general notes can be placed about this specific
         * condition.
         */
        public java.util.List<Annotation> note() {
            return getList(Annotation.class, PROPERTY_NOTE);
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

            public Builder code(final CodeableConcept code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder outcome(final CodeableConcept outcome) {
                b.add(PROPERTY_OUTCOME, outcome);
                return this;
            }

            public Builder contributedToDeath(final Boolean contributedToDeath) {
                b.add(PROPERTY_CONTRIBUTED_TO_DEATH, contributedToDeath);
                return this;
            }

            public Builder onsetAge(final Age onsetAge) {
                b.add(PROPERTY_ONSET_AGE, onsetAge);
                return this;
            }

            public Builder onsetRange(final Range onsetRange) {
                b.add(PROPERTY_ONSET_RANGE, onsetRange);
                return this;
            }

            public Builder onsetPeriod(final Period onsetPeriod) {
                b.add(PROPERTY_ONSET_PERIOD, onsetPeriod);
                return this;
            }

            public Builder onsetString(final String onsetString) {
                b.add(PROPERTY_ONSET_STRING, onsetString);
                return this;
            }

            public Builder note(final java.util.List<Annotation> note) {
                b.add(PROPERTY_NOTE, FhirObject.toArray(note));
                return this;
            }

            public FamilyMemberHistoryCondition build() {
                return new FamilyMemberHistoryCondition(b.build());
            }
        }
    }
}
