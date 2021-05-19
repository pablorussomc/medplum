/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Demographics and other administrative information about an individual
 * or animal receiving care or other health-related services.
 */
public class Patient extends DomainResource {
    public static final String RESOURCE_TYPE = "Patient";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Patient(final JsonObject data) {
        super(data);
    }

    /**
     * An identifier for this patient.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * Whether this patient record is in active use.
     * Many systems use this property to mark as non-current patients, such
     * as those that have not been seen for a period of time based on an
     * organization's business rules.
     *
     * It is often used to filter patient lists to exclude inactive patients
     *
     * Deceased patients may also be marked as inactive for the same reasons,
     * but may be active for some time after death.
     */
    public Boolean active() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_ACTIVE);
    }

    /**
     * A name associated with the individual.
     */
    public java.util.List<HumanName> name() {
        return getList(HumanName.class, FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * A contact detail (e.g. a telephone number or an email address) by
     * which the individual may be contacted.
     */
    public java.util.List<ContactPoint> telecom() {
        return getList(ContactPoint.class, FhirPropertyNames.PROPERTY_TELECOM);
    }

    /**
     * Administrative Gender - the gender that the patient is considered to
     * have for administration and record keeping purposes.
     */
    public String gender() {
        return getString(FhirPropertyNames.PROPERTY_GENDER);
    }

    /**
     * The date of birth for the individual.
     */
    public java.time.LocalDate birthDate() {
        return getLocalDate(FhirPropertyNames.PROPERTY_BIRTH_DATE);
    }

    /**
     * Indicates if the individual is deceased or not.
     */
    public Boolean deceasedBoolean() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_DECEASED_BOOLEAN);
    }

    /**
     * Indicates if the individual is deceased or not.
     */
    public String deceasedDateTime() {
        return getString(FhirPropertyNames.PROPERTY_DECEASED_DATE_TIME);
    }

    /**
     * An address for the individual.
     */
    public java.util.List<Address> address() {
        return getList(Address.class, FhirPropertyNames.PROPERTY_ADDRESS);
    }

    /**
     * This field contains a patient's most recent marital (civil) status.
     */
    public CodeableConcept maritalStatus() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_MARITAL_STATUS);
    }

    /**
     * Indicates whether the patient is part of a multiple (boolean) or
     * indicates the actual birth order (integer).
     */
    public Boolean multipleBirthBoolean() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_MULTIPLE_BIRTH_BOOLEAN);
    }

    /**
     * Indicates whether the patient is part of a multiple (boolean) or
     * indicates the actual birth order (integer).
     */
    public Integer multipleBirthInteger() {
        return data.getInt(FhirPropertyNames.PROPERTY_MULTIPLE_BIRTH_INTEGER);
    }

    /**
     * Image of the patient.
     */
    public java.util.List<Attachment> photo() {
        return getList(Attachment.class, FhirPropertyNames.PROPERTY_PHOTO);
    }

    /**
     * A contact party (e.g. guardian, partner, friend) for the patient.
     */
    public java.util.List<PatientContact> contact() {
        return getList(PatientContact.class, FhirPropertyNames.PROPERTY_CONTACT);
    }

    /**
     * A language which may be used to communicate with the patient about his
     * or her health.
     */
    public java.util.List<PatientCommunication> communication() {
        return getList(PatientCommunication.class, FhirPropertyNames.PROPERTY_COMMUNICATION);
    }

    /**
     * Patient's nominated care provider.
     */
    public java.util.List<Reference> generalPractitioner() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_GENERAL_PRACTITIONER);
    }

    /**
     * Organization that is the custodian of the patient record.
     */
    public Reference managingOrganization() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_MANAGING_ORGANIZATION);
    }

    /**
     * Link to another patient resource that concerns the same actual
     * patient.
     */
    public java.util.List<PatientLink> link() {
        return getList(PatientLink.class, FhirPropertyNames.PROPERTY_LINK);
    }

    public static final class Builder extends DomainResource.Builder<Patient, Patient.Builder> {

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

        public Builder active(final Boolean active) {
            b.add(FhirPropertyNames.PROPERTY_ACTIVE, active);
            return this;
        }

        public Builder name(final java.util.List<HumanName> name) {
            b.add(FhirPropertyNames.PROPERTY_NAME, FhirObject.toArray(name));
            return this;
        }

        public Builder telecom(final java.util.List<ContactPoint> telecom) {
            b.add(FhirPropertyNames.PROPERTY_TELECOM, FhirObject.toArray(telecom));
            return this;
        }

        public Builder gender(final String gender) {
            b.add(FhirPropertyNames.PROPERTY_GENDER, gender);
            return this;
        }

        public Builder birthDate(final java.time.LocalDate birthDate) {
            b.add(FhirPropertyNames.PROPERTY_BIRTH_DATE, birthDate.toString());
            return this;
        }

        public Builder deceasedBoolean(final Boolean deceasedBoolean) {
            b.add(FhirPropertyNames.PROPERTY_DECEASED_BOOLEAN, deceasedBoolean);
            return this;
        }

        public Builder deceasedDateTime(final String deceasedDateTime) {
            b.add(FhirPropertyNames.PROPERTY_DECEASED_DATE_TIME, deceasedDateTime);
            return this;
        }

        public Builder address(final java.util.List<Address> address) {
            b.add(FhirPropertyNames.PROPERTY_ADDRESS, FhirObject.toArray(address));
            return this;
        }

        public Builder maritalStatus(final CodeableConcept maritalStatus) {
            b.add(FhirPropertyNames.PROPERTY_MARITAL_STATUS, maritalStatus);
            return this;
        }

        public Builder multipleBirthBoolean(final Boolean multipleBirthBoolean) {
            b.add(FhirPropertyNames.PROPERTY_MULTIPLE_BIRTH_BOOLEAN, multipleBirthBoolean);
            return this;
        }

        public Builder multipleBirthInteger(final Integer multipleBirthInteger) {
            b.add(FhirPropertyNames.PROPERTY_MULTIPLE_BIRTH_INTEGER, multipleBirthInteger);
            return this;
        }

        public Builder photo(final java.util.List<Attachment> photo) {
            b.add(FhirPropertyNames.PROPERTY_PHOTO, FhirObject.toArray(photo));
            return this;
        }

        public Builder contact(final java.util.List<PatientContact> contact) {
            b.add(FhirPropertyNames.PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder communication(final java.util.List<PatientCommunication> communication) {
            b.add(FhirPropertyNames.PROPERTY_COMMUNICATION, FhirObject.toArray(communication));
            return this;
        }

        public Builder generalPractitioner(final java.util.List<Reference> generalPractitioner) {
            b.add(FhirPropertyNames.PROPERTY_GENERAL_PRACTITIONER, FhirObject.toArray(generalPractitioner));
            return this;
        }

        public Builder managingOrganization(final Reference managingOrganization) {
            b.add(FhirPropertyNames.PROPERTY_MANAGING_ORGANIZATION, managingOrganization);
            return this;
        }

        public Builder link(final java.util.List<PatientLink> link) {
            b.add(FhirPropertyNames.PROPERTY_LINK, FhirObject.toArray(link));
            return this;
        }

        public Patient build() {
            return new Patient(b.build());
        }
    }

    /**
     * Demographics and other administrative information about an individual
     * or animal receiving care or other health-related services.
     */
    public static class PatientCommunication extends FhirObject {
        public static final String RESOURCE_TYPE = "PatientCommunication";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PatientCommunication(final JsonObject data) {
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
         * The ISO-639-1 alpha 2 code in lower case for the language, optionally
         * followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in
         * upper case; e.g. &quot;en&quot; for English, or &quot;en-US&quot; for American English
         * versus &quot;en-EN&quot; for England English.
         */
        public CodeableConcept language() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_LANGUAGE);
        }

        /**
         * Indicates whether or not the patient prefers this language (over other
         * languages he masters up a certain level).
         */
        public Boolean preferred() {
            return data.getBoolean(FhirPropertyNames.PROPERTY_PREFERRED);
        }

        public static final class Builder extends FhirObject.Builder<PatientCommunication, PatientCommunication.Builder> {

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

            public Builder language(final CodeableConcept language) {
                b.add(FhirPropertyNames.PROPERTY_LANGUAGE, language);
                return this;
            }

            public Builder preferred(final Boolean preferred) {
                b.add(FhirPropertyNames.PROPERTY_PREFERRED, preferred);
                return this;
            }

            public PatientCommunication build() {
                return new PatientCommunication(b.build());
            }
        }
    }

    /**
     * Demographics and other administrative information about an individual
     * or animal receiving care or other health-related services.
     */
    public static class PatientContact extends FhirObject {
        public static final String RESOURCE_TYPE = "PatientContact";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PatientContact(final JsonObject data) {
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
         * The nature of the relationship between the patient and the contact
         * person.
         */
        public java.util.List<CodeableConcept> relationship() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_RELATIONSHIP);
        }

        /**
         * A name associated with the contact person.
         */
        public HumanName name() {
            return getObject(HumanName.class, FhirPropertyNames.PROPERTY_NAME);
        }

        /**
         * A contact detail for the person, e.g. a telephone number or an email
         * address.
         */
        public java.util.List<ContactPoint> telecom() {
            return getList(ContactPoint.class, FhirPropertyNames.PROPERTY_TELECOM);
        }

        /**
         * Address for the contact person.
         */
        public Address address() {
            return getObject(Address.class, FhirPropertyNames.PROPERTY_ADDRESS);
        }

        /**
         * Administrative Gender - the gender that the contact person is
         * considered to have for administration and record keeping purposes.
         */
        public String gender() {
            return getString(FhirPropertyNames.PROPERTY_GENDER);
        }

        /**
         * Organization on behalf of which the contact is acting or for which the
         * contact is working.
         */
        public Reference organization() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ORGANIZATION);
        }

        /**
         * The period during which this contact person or organization is valid
         * to be contacted relating to this patient.
         */
        public Period period() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
        }

        public static final class Builder extends FhirObject.Builder<PatientContact, PatientContact.Builder> {

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

            public Builder relationship(final java.util.List<CodeableConcept> relationship) {
                b.add(FhirPropertyNames.PROPERTY_RELATIONSHIP, FhirObject.toArray(relationship));
                return this;
            }

            public Builder name(final HumanName name) {
                b.add(FhirPropertyNames.PROPERTY_NAME, name);
                return this;
            }

            public Builder telecom(final java.util.List<ContactPoint> telecom) {
                b.add(FhirPropertyNames.PROPERTY_TELECOM, FhirObject.toArray(telecom));
                return this;
            }

            public Builder address(final Address address) {
                b.add(FhirPropertyNames.PROPERTY_ADDRESS, address);
                return this;
            }

            public Builder gender(final String gender) {
                b.add(FhirPropertyNames.PROPERTY_GENDER, gender);
                return this;
            }

            public Builder organization(final Reference organization) {
                b.add(FhirPropertyNames.PROPERTY_ORGANIZATION, organization);
                return this;
            }

            public Builder period(final Period period) {
                b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
                return this;
            }

            public PatientContact build() {
                return new PatientContact(b.build());
            }
        }
    }

    /**
     * Demographics and other administrative information about an individual
     * or animal receiving care or other health-related services.
     */
    public static class PatientLink extends FhirObject {
        public static final String RESOURCE_TYPE = "PatientLink";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PatientLink(final JsonObject data) {
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
         * The other patient resource that the link refers to.
         */
        public Reference other() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_OTHER);
        }

        /**
         * The type of link between this patient resource and another patient
         * resource.
         */
        public String type() {
            return getString(FhirPropertyNames.PROPERTY_TYPE);
        }

        public static final class Builder extends FhirObject.Builder<PatientLink, PatientLink.Builder> {

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

            public Builder other(final Reference other) {
                b.add(FhirPropertyNames.PROPERTY_OTHER, other);
                return this;
            }

            public Builder type(final String type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public PatientLink build() {
                return new PatientLink(b.build());
            }
        }
    }
}
