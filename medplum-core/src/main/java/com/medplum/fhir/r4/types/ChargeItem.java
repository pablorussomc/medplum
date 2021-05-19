/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * The resource ChargeItem describes the provision of healthcare provider
 * products for a certain patient, therefore referring not only to the
 * product, but containing in addition details of the provision, like
 * date, time, amounts and participating organizations and persons. Main
 * Usage of the ChargeItem is to enable the billing process and internal
 * cost allocation.
 */
public class ChargeItem extends DomainResource {
    public static final String RESOURCE_TYPE = "ChargeItem";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ChargeItem(final JsonObject data) {
        super(data);
    }

    /**
     * Identifiers assigned to this event performer or other systems.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * References the (external) source of pricing information, rules of
     * application for the code this ChargeItem uses.
     */
    public java.util.List<java.net.URI> definitionUri() {
        return getList(java.net.URI.class, FhirPropertyNames.PROPERTY_DEFINITION_URI);
    }

    /**
     * References the source of pricing information, rules of application for
     * the code this ChargeItem uses.
     */
    public java.util.List<String> definitionCanonical() {
        return getList(String.class, FhirPropertyNames.PROPERTY_DEFINITION_CANONICAL);
    }

    /**
     * The current state of the ChargeItem.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * ChargeItems can be grouped to larger ChargeItems covering the whole
     * set.
     */
    public java.util.List<Reference> partOf() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_PART_OF);
    }

    /**
     * A code that identifies the charge, like a billing code.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
    }

    /**
     * The individual or set of individuals the action is being or was
     * performed on.
     */
    public Reference subject() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * The encounter or episode of care that establishes the context for this
     * event.
     */
    public Reference context() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_CONTEXT);
    }

    /**
     * Date/time(s) or duration when the charged service was applied.
     */
    public String occurrenceDateTime() {
        return getString(FhirPropertyNames.PROPERTY_OCCURRENCE_DATE_TIME);
    }

    /**
     * Date/time(s) or duration when the charged service was applied.
     */
    public Period occurrencePeriod() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_OCCURRENCE_PERIOD);
    }

    /**
     * Date/time(s) or duration when the charged service was applied.
     */
    public Timing occurrenceTiming() {
        return getObject(Timing.class, FhirPropertyNames.PROPERTY_OCCURRENCE_TIMING);
    }

    /**
     * Indicates who or what performed or participated in the charged
     * service.
     */
    public java.util.List<ChargeItemPerformer> performer() {
        return getList(ChargeItemPerformer.class, FhirPropertyNames.PROPERTY_PERFORMER);
    }

    /**
     * The organization requesting the service.
     */
    public Reference performingOrganization() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PERFORMING_ORGANIZATION);
    }

    /**
     * The organization performing the service.
     */
    public Reference requestingOrganization() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_REQUESTING_ORGANIZATION);
    }

    /**
     * The financial cost center permits the tracking of charge attribution.
     */
    public Reference costCenter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_COST_CENTER);
    }

    /**
     * Quantity of which the charge item has been serviced.
     */
    public Quantity quantity() {
        return getObject(Quantity.class, FhirPropertyNames.PROPERTY_QUANTITY);
    }

    /**
     * The anatomical location where the related service has been applied.
     */
    public java.util.List<CodeableConcept> bodysite() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_BODYSITE);
    }

    /**
     * Factor overriding the factor determined by the rules associated with
     * the code.
     */
    public Double factorOverride() {
        return data.getJsonNumber(FhirPropertyNames.PROPERTY_FACTOR_OVERRIDE).doubleValue();
    }

    /**
     * Total price of the charge overriding the list price associated with
     * the code.
     */
    public Money priceOverride() {
        return getObject(Money.class, FhirPropertyNames.PROPERTY_PRICE_OVERRIDE);
    }

    /**
     * If the list price or the rule-based factor associated with the code is
     * overridden, this attribute can capture a text to indicate the  reason
     * for this action.
     */
    public String overrideReason() {
        return getString(FhirPropertyNames.PROPERTY_OVERRIDE_REASON);
    }

    /**
     * The device, practitioner, etc. who entered the charge item.
     */
    public Reference enterer() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENTERER);
    }

    /**
     * Date the charge item was entered.
     */
    public java.time.Instant enteredDate() {
        return getInstant(FhirPropertyNames.PROPERTY_ENTERED_DATE);
    }

    /**
     * Describes why the event occurred in coded or textual form.
     */
    public java.util.List<CodeableConcept> reason() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_REASON);
    }

    /**
     * Indicated the rendered service that caused this charge.
     */
    public java.util.List<Reference> service() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_SERVICE);
    }

    /**
     * Identifies the device, food, drug or other product being charged
     * either by type code or reference to an instance.
     */
    public Reference productReference() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PRODUCT_REFERENCE);
    }

    /**
     * Identifies the device, food, drug or other product being charged
     * either by type code or reference to an instance.
     */
    public CodeableConcept productCodeableConcept() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PRODUCT_CODEABLE_CONCEPT);
    }

    /**
     * Account into which this ChargeItems belongs.
     */
    public java.util.List<Reference> account() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_ACCOUNT);
    }

    /**
     * Comments made about the event by the performer, subject or other
     * participants.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
    }

    /**
     * Further information supporting this charge.
     */
    public java.util.List<Reference> supportingInformation() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_SUPPORTING_INFORMATION);
    }

    public static final class Builder extends DomainResource.Builder<ChargeItem, ChargeItem.Builder> {

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

        public Builder definitionUri(final java.util.List<java.net.URI> definitionUri) {
            b.add(FhirPropertyNames.PROPERTY_DEFINITION_URI, FhirObject.toUriArray(definitionUri));
            return this;
        }

        public Builder definitionCanonical(final java.util.List<String> definitionCanonical) {
            b.add(FhirPropertyNames.PROPERTY_DEFINITION_CANONICAL, FhirObject.toStringArray(definitionCanonical));
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder partOf(final java.util.List<Reference> partOf) {
            b.add(FhirPropertyNames.PROPERTY_PART_OF, FhirObject.toArray(partOf));
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(FhirPropertyNames.PROPERTY_CODE, code);
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder context(final Reference context) {
            b.add(FhirPropertyNames.PROPERTY_CONTEXT, context);
            return this;
        }

        public Builder occurrenceDateTime(final String occurrenceDateTime) {
            b.add(FhirPropertyNames.PROPERTY_OCCURRENCE_DATE_TIME, occurrenceDateTime);
            return this;
        }

        public Builder occurrencePeriod(final Period occurrencePeriod) {
            b.add(FhirPropertyNames.PROPERTY_OCCURRENCE_PERIOD, occurrencePeriod);
            return this;
        }

        public Builder occurrenceTiming(final Timing occurrenceTiming) {
            b.add(FhirPropertyNames.PROPERTY_OCCURRENCE_TIMING, occurrenceTiming);
            return this;
        }

        public Builder performer(final java.util.List<ChargeItemPerformer> performer) {
            b.add(FhirPropertyNames.PROPERTY_PERFORMER, FhirObject.toArray(performer));
            return this;
        }

        public Builder performingOrganization(final Reference performingOrganization) {
            b.add(FhirPropertyNames.PROPERTY_PERFORMING_ORGANIZATION, performingOrganization);
            return this;
        }

        public Builder requestingOrganization(final Reference requestingOrganization) {
            b.add(FhirPropertyNames.PROPERTY_REQUESTING_ORGANIZATION, requestingOrganization);
            return this;
        }

        public Builder costCenter(final Reference costCenter) {
            b.add(FhirPropertyNames.PROPERTY_COST_CENTER, costCenter);
            return this;
        }

        public Builder quantity(final Quantity quantity) {
            b.add(FhirPropertyNames.PROPERTY_QUANTITY, quantity);
            return this;
        }

        public Builder bodysite(final java.util.List<CodeableConcept> bodysite) {
            b.add(FhirPropertyNames.PROPERTY_BODYSITE, FhirObject.toArray(bodysite));
            return this;
        }

        public Builder factorOverride(final Double factorOverride) {
            b.add(FhirPropertyNames.PROPERTY_FACTOR_OVERRIDE, factorOverride);
            return this;
        }

        public Builder priceOverride(final Money priceOverride) {
            b.add(FhirPropertyNames.PROPERTY_PRICE_OVERRIDE, priceOverride);
            return this;
        }

        public Builder overrideReason(final String overrideReason) {
            b.add(FhirPropertyNames.PROPERTY_OVERRIDE_REASON, overrideReason);
            return this;
        }

        public Builder enterer(final Reference enterer) {
            b.add(FhirPropertyNames.PROPERTY_ENTERER, enterer);
            return this;
        }

        public Builder enteredDate(final java.time.Instant enteredDate) {
            b.add(FhirPropertyNames.PROPERTY_ENTERED_DATE, enteredDate.toString());
            return this;
        }

        public Builder reason(final java.util.List<CodeableConcept> reason) {
            b.add(FhirPropertyNames.PROPERTY_REASON, FhirObject.toArray(reason));
            return this;
        }

        public Builder service(final java.util.List<Reference> service) {
            b.add(FhirPropertyNames.PROPERTY_SERVICE, FhirObject.toArray(service));
            return this;
        }

        public Builder productReference(final Reference productReference) {
            b.add(FhirPropertyNames.PROPERTY_PRODUCT_REFERENCE, productReference);
            return this;
        }

        public Builder productCodeableConcept(final CodeableConcept productCodeableConcept) {
            b.add(FhirPropertyNames.PROPERTY_PRODUCT_CODEABLE_CONCEPT, productCodeableConcept);
            return this;
        }

        public Builder account(final java.util.List<Reference> account) {
            b.add(FhirPropertyNames.PROPERTY_ACCOUNT, FhirObject.toArray(account));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder supportingInformation(final java.util.List<Reference> supportingInformation) {
            b.add(FhirPropertyNames.PROPERTY_SUPPORTING_INFORMATION, FhirObject.toArray(supportingInformation));
            return this;
        }

        public ChargeItem build() {
            return new ChargeItem(b.build());
        }
    }

    /**
     * The resource ChargeItem describes the provision of healthcare provider
     * products for a certain patient, therefore referring not only to the
     * product, but containing in addition details of the provision, like
     * date, time, amounts and participating organizations and persons. Main
     * Usage of the ChargeItem is to enable the billing process and internal
     * cost allocation.
     */
    public static class ChargeItemPerformer extends FhirObject {
        public static final String RESOURCE_TYPE = "ChargeItemPerformer";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ChargeItemPerformer(final JsonObject data) {
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
         * Describes the type of performance or participation(e.g. primary
         * surgeon, anesthesiologiest, etc.).
         */
        public CodeableConcept function() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_FUNCTION);
        }

        /**
         * The device, practitioner, etc. who performed or participated in the
         * service.
         */
        public Reference actor() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ACTOR);
        }

        public static final class Builder extends FhirObject.Builder<ChargeItemPerformer, ChargeItemPerformer.Builder> {

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

            public Builder function(final CodeableConcept function) {
                b.add(FhirPropertyNames.PROPERTY_FUNCTION, function);
                return this;
            }

            public Builder actor(final Reference actor) {
                b.add(FhirPropertyNames.PROPERTY_ACTOR, actor);
                return this;
            }

            public ChargeItemPerformer build() {
                return new ChargeItemPerformer(b.build());
            }
        }
    }
}
