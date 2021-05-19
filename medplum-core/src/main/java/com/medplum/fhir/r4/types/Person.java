/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Demographics and administrative information about a person independent
 * of a specific health-related context.
 */
public class Person extends DomainResource {
    public static final String RESOURCE_TYPE = "Person";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Person(final JsonObject data) {
        super(data);
    }

    /**
     * Identifier for a person within a particular scope.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * A name associated with the person.
     */
    public java.util.List<HumanName> name() {
        return getList(HumanName.class, FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * A contact detail for the person, e.g. a telephone number or an email
     * address.
     */
    public java.util.List<ContactPoint> telecom() {
        return getList(ContactPoint.class, FhirPropertyNames.PROPERTY_TELECOM);
    }

    /**
     * Administrative Gender.
     */
    public String gender() {
        return getString(FhirPropertyNames.PROPERTY_GENDER);
    }

    /**
     * The birth date for the person.
     */
    public java.time.LocalDate birthDate() {
        return getLocalDate(FhirPropertyNames.PROPERTY_BIRTH_DATE);
    }

    /**
     * One or more addresses for the person.
     */
    public java.util.List<Address> address() {
        return getList(Address.class, FhirPropertyNames.PROPERTY_ADDRESS);
    }

    /**
     * An image that can be displayed as a thumbnail of the person to enhance
     * the identification of the individual.
     */
    public Attachment photo() {
        return getObject(Attachment.class, FhirPropertyNames.PROPERTY_PHOTO);
    }

    /**
     * The organization that is the custodian of the person record.
     */
    public Reference managingOrganization() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_MANAGING_ORGANIZATION);
    }

    /**
     * Whether this person's record is in active use.
     */
    public Boolean active() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_ACTIVE);
    }

    /**
     * Link to a resource that concerns the same actual person.
     */
    public java.util.List<PersonLink> link() {
        return getList(PersonLink.class, FhirPropertyNames.PROPERTY_LINK);
    }

    public static final class Builder extends DomainResource.Builder<Person, Person.Builder> {

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

        public Builder address(final java.util.List<Address> address) {
            b.add(FhirPropertyNames.PROPERTY_ADDRESS, FhirObject.toArray(address));
            return this;
        }

        public Builder photo(final Attachment photo) {
            b.add(FhirPropertyNames.PROPERTY_PHOTO, photo);
            return this;
        }

        public Builder managingOrganization(final Reference managingOrganization) {
            b.add(FhirPropertyNames.PROPERTY_MANAGING_ORGANIZATION, managingOrganization);
            return this;
        }

        public Builder active(final Boolean active) {
            b.add(FhirPropertyNames.PROPERTY_ACTIVE, active);
            return this;
        }

        public Builder link(final java.util.List<PersonLink> link) {
            b.add(FhirPropertyNames.PROPERTY_LINK, FhirObject.toArray(link));
            return this;
        }

        public Person build() {
            return new Person(b.build());
        }
    }

    /**
     * Demographics and administrative information about a person independent
     * of a specific health-related context.
     */
    public static class PersonLink extends FhirObject {
        public static final String RESOURCE_TYPE = "PersonLink";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PersonLink(final JsonObject data) {
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
         * The resource to which this actual person is associated.
         */
        public Reference target() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_TARGET);
        }

        /**
         * Level of assurance that this link is associated with the target
         * resource.
         */
        public String assurance() {
            return getString(FhirPropertyNames.PROPERTY_ASSURANCE);
        }

        public static final class Builder extends FhirObject.Builder<PersonLink, PersonLink.Builder> {

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

            public Builder target(final Reference target) {
                b.add(FhirPropertyNames.PROPERTY_TARGET, target);
                return this;
            }

            public Builder assurance(final String assurance) {
                b.add(FhirPropertyNames.PROPERTY_ASSURANCE, assurance);
                return this;
            }

            public PersonLink build() {
                return new PersonLink(b.build());
            }
        }
    }
}
