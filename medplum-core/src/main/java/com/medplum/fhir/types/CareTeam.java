/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class CareTeam extends FhirResource {
    public static final String RESOURCE_TYPE = "CareTeam";
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
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_CATEGORY = "category";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_ENCOUNTER = "encounter";
    public static final String PROPERTY_PERIOD = "period";
    public static final String PROPERTY_PARTICIPANT = "participant";
    public static final String PROPERTY_REASON_CODE = "reasonCode";
    public static final String PROPERTY_REASON_REFERENCE = "reasonReference";
    public static final String PROPERTY_MANAGING_ORGANIZATION = "managingOrganization";
    public static final String PROPERTY_TELECOM = "telecom";
    public static final String PROPERTY_NOTE = "note";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public CareTeam(final JsonObject data) {
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
     * Business identifiers assigned to this care team by the performer or
     * other systems which remain constant as the resource is updated and
     * propagates from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Indicates the current state of the care team.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * Identifies what kind of team.  This is to support differentiation
     * between multiple co-existing teams, such as care plan team, episode of
     * care team, longitudinal care team.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, PROPERTY_CATEGORY);
    }

    /**
     * A label for human use intended to distinguish like teams.  E.g. the
     * &quot;red&quot; vs. &quot;green&quot; trauma teams.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * Identifies the patient or group whose intended care is handled by the
     * team.
     */
    public Reference subject() {
        return getObject(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * The Encounter during which this CareTeam was created or to which the
     * creation of this record is tightly associated.
     */
    public Reference encounter() {
        return getObject(Reference.class, PROPERTY_ENCOUNTER);
    }

    /**
     * Indicates when the team did (or is intended to) come into effect and
     * end.
     */
    public Period period() {
        return getObject(Period.class, PROPERTY_PERIOD);
    }

    /**
     * Identifies all people and organizations who are expected to be
     * involved in the care team.
     */
    public java.util.List<CareTeamParticipant> participant() {
        return getList(CareTeamParticipant.class, PROPERTY_PARTICIPANT);
    }

    /**
     * Describes why the care team exists.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, PROPERTY_REASON_CODE);
    }

    /**
     * Condition(s) that this care team addresses.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, PROPERTY_REASON_REFERENCE);
    }

    /**
     * The organization responsible for the care team.
     */
    public java.util.List<Reference> managingOrganization() {
        return getList(Reference.class, PROPERTY_MANAGING_ORGANIZATION);
    }

    /**
     * A central contact detail for the care team (that applies to all
     * members).
     */
    public java.util.List<ContactPoint> telecom() {
        return getList(ContactPoint.class, PROPERTY_TELECOM);
    }

    /**
     * Comments made about the CareTeam.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
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

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder encounter(final Reference encounter) {
            b.add(PROPERTY_ENCOUNTER, encounter);
            return this;
        }

        public Builder period(final Period period) {
            b.add(PROPERTY_PERIOD, period);
            return this;
        }

        public Builder participant(final java.util.List<CareTeamParticipant> participant) {
            b.add(PROPERTY_PARTICIPANT, FhirObject.toArray(participant));
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

        public Builder managingOrganization(final java.util.List<Reference> managingOrganization) {
            b.add(PROPERTY_MANAGING_ORGANIZATION, FhirObject.toArray(managingOrganization));
            return this;
        }

        public Builder telecom(final java.util.List<ContactPoint> telecom) {
            b.add(PROPERTY_TELECOM, FhirObject.toArray(telecom));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public CareTeam build() {
            return new CareTeam(b.build());
        }
    }

    public static class CareTeamParticipant extends FhirObject {
        public static final String RESOURCE_TYPE = "CareTeamParticipant";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_ROLE = "role";
        public static final String PROPERTY_MEMBER = "member";
        public static final String PROPERTY_ON_BEHALF_OF = "onBehalfOf";
        public static final String PROPERTY_PERIOD = "period";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CareTeamParticipant(final JsonObject data) {
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
         * Indicates specific responsibility of an individual within the care
         * team, such as &quot;Primary care physician&quot;, &quot;Trained social worker
         * counselor&quot;, &quot;Caregiver&quot;, etc.
         */
        public java.util.List<CodeableConcept> role() {
            return getList(CodeableConcept.class, PROPERTY_ROLE);
        }

        /**
         * The specific person or organization who is participating/expected to
         * participate in the care team.
         */
        public Reference member() {
            return getObject(Reference.class, PROPERTY_MEMBER);
        }

        /**
         * The organization of the practitioner.
         */
        public Reference onBehalfOf() {
            return getObject(Reference.class, PROPERTY_ON_BEHALF_OF);
        }

        /**
         * Indicates when the specific member or organization did (or is intended
         * to) come into effect and end.
         */
        public Period period() {
            return getObject(Period.class, PROPERTY_PERIOD);
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

            public Builder role(final java.util.List<CodeableConcept> role) {
                b.add(PROPERTY_ROLE, FhirObject.toArray(role));
                return this;
            }

            public Builder member(final Reference member) {
                b.add(PROPERTY_MEMBER, member);
                return this;
            }

            public Builder onBehalfOf(final Reference onBehalfOf) {
                b.add(PROPERTY_ON_BEHALF_OF, onBehalfOf);
                return this;
            }

            public Builder period(final Period period) {
                b.add(PROPERTY_PERIOD, period);
                return this;
            }

            public CareTeamParticipant build() {
                return new CareTeamParticipant(b.build());
            }
        }
    }
}
