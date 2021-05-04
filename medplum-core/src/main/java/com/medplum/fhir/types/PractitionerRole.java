/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class PractitionerRole extends FhirResource {
    public static final String RESOURCE_TYPE = "PractitionerRole";
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
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_PERIOD = "period";
    public static final String PROPERTY_PRACTITIONER = "practitioner";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_SPECIALTY = "specialty";
    public static final String PROPERTY_LOCATION = "location";
    public static final String PROPERTY_HEALTHCARE_SERVICE = "healthcareService";
    public static final String PROPERTY_TELECOM = "telecom";
    public static final String PROPERTY_AVAILABLE_TIME = "availableTime";
    public static final String PROPERTY_NOT_AVAILABLE = "notAvailable";
    public static final String PROPERTY_AVAILABILITY_EXCEPTIONS = "availabilityExceptions";
    public static final String PROPERTY_ENDPOINT = "endpoint";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public PractitionerRole(final JsonObject data) {
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
     * Business Identifiers that are specific to a role/location.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Whether this practitioner role record is in active use.
     */
    public Boolean active() {
        return data.getBoolean(PROPERTY_ACTIVE);
    }

    /**
     * The period during which the person is authorized to act as a
     * practitioner in these role(s) for the organization.
     */
    public Period period() {
        return getObject(Period.class, PROPERTY_PERIOD);
    }

    /**
     * Practitioner that is able to provide the defined services for the
     * organization.
     */
    public Reference practitioner() {
        return getObject(Reference.class, PROPERTY_PRACTITIONER);
    }

    /**
     * The organization where the Practitioner performs the roles associated.
     */
    public Reference organization() {
        return getObject(Reference.class, PROPERTY_ORGANIZATION);
    }

    /**
     * Roles which this practitioner is authorized to perform for the
     * organization.
     */
    public java.util.List<CodeableConcept> code() {
        return getList(CodeableConcept.class, PROPERTY_CODE);
    }

    /**
     * Specific specialty of the practitioner.
     */
    public java.util.List<CodeableConcept> specialty() {
        return getList(CodeableConcept.class, PROPERTY_SPECIALTY);
    }

    /**
     * The location(s) at which this practitioner provides care.
     */
    public java.util.List<Reference> location() {
        return getList(Reference.class, PROPERTY_LOCATION);
    }

    /**
     * The list of healthcare services that this worker provides for this
     * role's Organization/Location(s).
     */
    public java.util.List<Reference> healthcareService() {
        return getList(Reference.class, PROPERTY_HEALTHCARE_SERVICE);
    }

    /**
     * Contact details that are specific to the role/location/service.
     */
    public java.util.List<ContactPoint> telecom() {
        return getList(ContactPoint.class, PROPERTY_TELECOM);
    }

    /**
     * A collection of times the practitioner is available or performing this
     * role at the location and/or healthcareservice.
     */
    public java.util.List<PractitionerRoleAvailableTime> availableTime() {
        return getList(PractitionerRoleAvailableTime.class, PROPERTY_AVAILABLE_TIME);
    }

    /**
     * The practitioner is not available or performing this role during this
     * period of time due to the provided reason.
     */
    public java.util.List<PractitionerRoleNotAvailable> notAvailable() {
        return getList(PractitionerRoleNotAvailable.class, PROPERTY_NOT_AVAILABLE);
    }

    /**
     * A description of site availability exceptions, e.g. public holiday
     * availability. Succinctly describing all possible exceptions to normal
     * site availability as details in the available Times and not available
     * Times.
     */
    public String availabilityExceptions() {
        return getString(PROPERTY_AVAILABILITY_EXCEPTIONS);
    }

    /**
     * Technical endpoints providing access to services operated for the
     * practitioner with this role.
     */
    public java.util.List<Reference> endpoint() {
        return getList(Reference.class, PROPERTY_ENDPOINT);
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

        public Builder active(final Boolean active) {
            b.add(PROPERTY_ACTIVE, active);
            return this;
        }

        public Builder period(final Period period) {
            b.add(PROPERTY_PERIOD, period);
            return this;
        }

        public Builder practitioner(final Reference practitioner) {
            b.add(PROPERTY_PRACTITIONER, practitioner);
            return this;
        }

        public Builder organization(final Reference organization) {
            b.add(PROPERTY_ORGANIZATION, organization);
            return this;
        }

        public Builder code(final java.util.List<CodeableConcept> code) {
            b.add(PROPERTY_CODE, FhirObject.toArray(code));
            return this;
        }

        public Builder specialty(final java.util.List<CodeableConcept> specialty) {
            b.add(PROPERTY_SPECIALTY, FhirObject.toArray(specialty));
            return this;
        }

        public Builder location(final java.util.List<Reference> location) {
            b.add(PROPERTY_LOCATION, FhirObject.toArray(location));
            return this;
        }

        public Builder healthcareService(final java.util.List<Reference> healthcareService) {
            b.add(PROPERTY_HEALTHCARE_SERVICE, FhirObject.toArray(healthcareService));
            return this;
        }

        public Builder telecom(final java.util.List<ContactPoint> telecom) {
            b.add(PROPERTY_TELECOM, FhirObject.toArray(telecom));
            return this;
        }

        public Builder availableTime(final java.util.List<PractitionerRoleAvailableTime> availableTime) {
            b.add(PROPERTY_AVAILABLE_TIME, FhirObject.toArray(availableTime));
            return this;
        }

        public Builder notAvailable(final java.util.List<PractitionerRoleNotAvailable> notAvailable) {
            b.add(PROPERTY_NOT_AVAILABLE, FhirObject.toArray(notAvailable));
            return this;
        }

        public Builder availabilityExceptions(final String availabilityExceptions) {
            b.add(PROPERTY_AVAILABILITY_EXCEPTIONS, availabilityExceptions);
            return this;
        }

        public Builder endpoint(final java.util.List<Reference> endpoint) {
            b.add(PROPERTY_ENDPOINT, FhirObject.toArray(endpoint));
            return this;
        }

        public PractitionerRole build() {
            return new PractitionerRole(b.build());
        }
    }

    public static class PractitionerRoleAvailableTime extends FhirObject {
        public static final String RESOURCE_TYPE = "PractitionerRoleAvailableTime";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_DAYS_OF_WEEK = "daysOfWeek";
        public static final String PROPERTY_ALL_DAY = "allDay";
        public static final String PROPERTY_AVAILABLE_START_TIME = "availableStartTime";
        public static final String PROPERTY_AVAILABLE_END_TIME = "availableEndTime";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PractitionerRoleAvailableTime(final JsonObject data) {
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
         * Indicates which days of the week are available between the start and
         * end Times.
         */
        public java.util.List<String> daysOfWeek() {
            return getList(String.class, PROPERTY_DAYS_OF_WEEK);
        }

        /**
         * Is this always available? (hence times are irrelevant) e.g. 24 hour
         * service.
         */
        public Boolean allDay() {
            return data.getBoolean(PROPERTY_ALL_DAY);
        }

        /**
         * The opening time of day. Note: If the AllDay flag is set, then this
         * time is ignored.
         */
        public java.time.Instant availableStartTime() {
            return getInstant(PROPERTY_AVAILABLE_START_TIME);
        }

        /**
         * The closing time of day. Note: If the AllDay flag is set, then this
         * time is ignored.
         */
        public java.time.Instant availableEndTime() {
            return getInstant(PROPERTY_AVAILABLE_END_TIME);
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

            public Builder daysOfWeek(final java.util.List<String> daysOfWeek) {
                b.add(PROPERTY_DAYS_OF_WEEK, FhirObject.toStringArray(daysOfWeek));
                return this;
            }

            public Builder allDay(final Boolean allDay) {
                b.add(PROPERTY_ALL_DAY, allDay);
                return this;
            }

            public Builder availableStartTime(final java.time.Instant availableStartTime) {
                b.add(PROPERTY_AVAILABLE_START_TIME, availableStartTime.toString());
                return this;
            }

            public Builder availableEndTime(final java.time.Instant availableEndTime) {
                b.add(PROPERTY_AVAILABLE_END_TIME, availableEndTime.toString());
                return this;
            }

            public PractitionerRoleAvailableTime build() {
                return new PractitionerRoleAvailableTime(b.build());
            }
        }
    }

    public static class PractitionerRoleNotAvailable extends FhirObject {
        public static final String RESOURCE_TYPE = "PractitionerRoleNotAvailable";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_DESCRIPTION = "description";
        public static final String PROPERTY_DURING = "during";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PractitionerRoleNotAvailable(final JsonObject data) {
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
         * The reason that can be presented to the user as to why this time is
         * not available.
         */
        public String description() {
            return getString(PROPERTY_DESCRIPTION);
        }

        /**
         * Service is not available (seasonally or for a public holiday) from
         * this date.
         */
        public Period during() {
            return getObject(Period.class, PROPERTY_DURING);
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

            public Builder description(final String description) {
                b.add(PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder during(final Period during) {
                b.add(PROPERTY_DURING, during);
                return this;
            }

            public PractitionerRoleNotAvailable build() {
                return new PractitionerRoleNotAvailable(b.build());
            }
        }
    }
}
