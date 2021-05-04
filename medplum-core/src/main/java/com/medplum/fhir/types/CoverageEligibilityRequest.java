/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class CoverageEligibilityRequest extends FhirResource {
    public static final String RESOURCE_TYPE = "CoverageEligibilityRequest";
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
    public static final String PROPERTY_PRIORITY = "priority";
    public static final String PROPERTY_PURPOSE = "purpose";
    public static final String PROPERTY_PATIENT = "patient";
    public static final String PROPERTY_SERVICED_DATE = "servicedDate";
    public static final String PROPERTY_SERVICED_PERIOD = "servicedPeriod";
    public static final String PROPERTY_CREATED = "created";
    public static final String PROPERTY_ENTERER = "enterer";
    public static final String PROPERTY_PROVIDER = "provider";
    public static final String PROPERTY_INSURER = "insurer";
    public static final String PROPERTY_FACILITY = "facility";
    public static final String PROPERTY_SUPPORTING_INFO = "supportingInfo";
    public static final String PROPERTY_INSURANCE = "insurance";
    public static final String PROPERTY_ITEM = "item";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public CoverageEligibilityRequest(final JsonObject data) {
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
     * A unique identifier assigned to this coverage eligiblity request.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The status of the resource instance.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * When the requestor expects the processor to complete processing.
     */
    public CodeableConcept priority() {
        return getObject(CodeableConcept.class, PROPERTY_PRIORITY);
    }

    /**
     * Code to specify whether requesting: prior authorization requirements
     * for some service categories or billing codes; benefits for coverages
     * specified or discovered; discovery and return of coverages for the
     * patient; and/or validation that the specified coverage is in-force at
     * the date/period specified or 'now' if not specified.
     */
    public java.util.List<String> purpose() {
        return getList(String.class, PROPERTY_PURPOSE);
    }

    /**
     * The party who is the beneficiary of the supplied coverage and for whom
     * eligibility is sought.
     */
    public Reference patient() {
        return getObject(Reference.class, PROPERTY_PATIENT);
    }

    /**
     * The date or dates when the enclosed suite of services were performed
     * or completed.
     */
    public String servicedDate() {
        return getString(PROPERTY_SERVICED_DATE);
    }

    /**
     * The date or dates when the enclosed suite of services were performed
     * or completed.
     */
    public Period servicedPeriod() {
        return getObject(Period.class, PROPERTY_SERVICED_PERIOD);
    }

    /**
     * The date when this resource was created.
     */
    public java.time.Instant created() {
        return getInstant(PROPERTY_CREATED);
    }

    /**
     * Person who created the request.
     */
    public Reference enterer() {
        return getObject(Reference.class, PROPERTY_ENTERER);
    }

    /**
     * The provider which is responsible for the request.
     */
    public Reference provider() {
        return getObject(Reference.class, PROPERTY_PROVIDER);
    }

    /**
     * The Insurer who issued the coverage in question and is the recipient
     * of the request.
     */
    public Reference insurer() {
        return getObject(Reference.class, PROPERTY_INSURER);
    }

    /**
     * Facility where the services are intended to be provided.
     */
    public Reference facility() {
        return getObject(Reference.class, PROPERTY_FACILITY);
    }

    /**
     * Additional information codes regarding exceptions, special
     * considerations, the condition, situation, prior or concurrent issues.
     */
    public java.util.List<CoverageEligibilityRequestSupportingInfo> supportingInfo() {
        return getList(CoverageEligibilityRequestSupportingInfo.class, PROPERTY_SUPPORTING_INFO);
    }

    /**
     * Financial instruments for reimbursement for the health care products
     * and services.
     */
    public java.util.List<CoverageEligibilityRequestInsurance> insurance() {
        return getList(CoverageEligibilityRequestInsurance.class, PROPERTY_INSURANCE);
    }

    /**
     * Service categories or billable services for which benefit details
     * and/or an authorization prior to service delivery may be required by
     * the payor.
     */
    public java.util.List<CoverageEligibilityRequestItem> item() {
        return getList(CoverageEligibilityRequestItem.class, PROPERTY_ITEM);
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

        public Builder priority(final CodeableConcept priority) {
            b.add(PROPERTY_PRIORITY, priority);
            return this;
        }

        public Builder purpose(final java.util.List<String> purpose) {
            b.add(PROPERTY_PURPOSE, FhirObject.toStringArray(purpose));
            return this;
        }

        public Builder patient(final Reference patient) {
            b.add(PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder servicedDate(final String servicedDate) {
            b.add(PROPERTY_SERVICED_DATE, servicedDate);
            return this;
        }

        public Builder servicedPeriod(final Period servicedPeriod) {
            b.add(PROPERTY_SERVICED_PERIOD, servicedPeriod);
            return this;
        }

        public Builder created(final java.time.Instant created) {
            b.add(PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder enterer(final Reference enterer) {
            b.add(PROPERTY_ENTERER, enterer);
            return this;
        }

        public Builder provider(final Reference provider) {
            b.add(PROPERTY_PROVIDER, provider);
            return this;
        }

        public Builder insurer(final Reference insurer) {
            b.add(PROPERTY_INSURER, insurer);
            return this;
        }

        public Builder facility(final Reference facility) {
            b.add(PROPERTY_FACILITY, facility);
            return this;
        }

        public Builder supportingInfo(final java.util.List<CoverageEligibilityRequestSupportingInfo> supportingInfo) {
            b.add(PROPERTY_SUPPORTING_INFO, FhirObject.toArray(supportingInfo));
            return this;
        }

        public Builder insurance(final java.util.List<CoverageEligibilityRequestInsurance> insurance) {
            b.add(PROPERTY_INSURANCE, FhirObject.toArray(insurance));
            return this;
        }

        public Builder item(final java.util.List<CoverageEligibilityRequestItem> item) {
            b.add(PROPERTY_ITEM, FhirObject.toArray(item));
            return this;
        }

        public CoverageEligibilityRequest build() {
            return new CoverageEligibilityRequest(b.build());
        }
    }

    public static class CoverageEligibilityRequestDiagnosis extends FhirObject {
        public static final String RESOURCE_TYPE = "CoverageEligibilityRequestDiagnosis";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_DIAGNOSIS_CODEABLE_CONCEPT = "diagnosisCodeableConcept";
        public static final String PROPERTY_DIAGNOSIS_REFERENCE = "diagnosisReference";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CoverageEligibilityRequestDiagnosis(final JsonObject data) {
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
         * The nature of illness or problem in a coded form or as a reference to
         * an external defined Condition.
         */
        public CodeableConcept diagnosisCodeableConcept() {
            return getObject(CodeableConcept.class, PROPERTY_DIAGNOSIS_CODEABLE_CONCEPT);
        }

        /**
         * The nature of illness or problem in a coded form or as a reference to
         * an external defined Condition.
         */
        public Reference diagnosisReference() {
            return getObject(Reference.class, PROPERTY_DIAGNOSIS_REFERENCE);
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

            public Builder diagnosisCodeableConcept(final CodeableConcept diagnosisCodeableConcept) {
                b.add(PROPERTY_DIAGNOSIS_CODEABLE_CONCEPT, diagnosisCodeableConcept);
                return this;
            }

            public Builder diagnosisReference(final Reference diagnosisReference) {
                b.add(PROPERTY_DIAGNOSIS_REFERENCE, diagnosisReference);
                return this;
            }

            public CoverageEligibilityRequestDiagnosis build() {
                return new CoverageEligibilityRequestDiagnosis(b.build());
            }
        }
    }

    public static class CoverageEligibilityRequestInsurance extends FhirObject {
        public static final String RESOURCE_TYPE = "CoverageEligibilityRequestInsurance";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_FOCAL = "focal";
        public static final String PROPERTY_COVERAGE = "coverage";
        public static final String PROPERTY_BUSINESS_ARRANGEMENT = "businessArrangement";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CoverageEligibilityRequestInsurance(final JsonObject data) {
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
         * A flag to indicate that this Coverage is to be used for evaluation of
         * this request when set to true.
         */
        public Boolean focal() {
            return data.getBoolean(PROPERTY_FOCAL);
        }

        /**
         * Reference to the insurance card level information contained in the
         * Coverage resource. The coverage issuing insurer will use these details
         * to locate the patient's actual coverage within the insurer's
         * information system.
         */
        public Reference coverage() {
            return getObject(Reference.class, PROPERTY_COVERAGE);
        }

        /**
         * A business agreement number established between the provider and the
         * insurer for special business processing purposes.
         */
        public String businessArrangement() {
            return getString(PROPERTY_BUSINESS_ARRANGEMENT);
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

            public Builder focal(final Boolean focal) {
                b.add(PROPERTY_FOCAL, focal);
                return this;
            }

            public Builder coverage(final Reference coverage) {
                b.add(PROPERTY_COVERAGE, coverage);
                return this;
            }

            public Builder businessArrangement(final String businessArrangement) {
                b.add(PROPERTY_BUSINESS_ARRANGEMENT, businessArrangement);
                return this;
            }

            public CoverageEligibilityRequestInsurance build() {
                return new CoverageEligibilityRequestInsurance(b.build());
            }
        }
    }

    public static class CoverageEligibilityRequestItem extends FhirObject {
        public static final String RESOURCE_TYPE = "CoverageEligibilityRequestItem";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_SUPPORTING_INFO_SEQUENCE = "supportingInfoSequence";
        public static final String PROPERTY_CATEGORY = "category";
        public static final String PROPERTY_PRODUCT_OR_SERVICE = "productOrService";
        public static final String PROPERTY_MODIFIER = "modifier";
        public static final String PROPERTY_PROVIDER = "provider";
        public static final String PROPERTY_QUANTITY = "quantity";
        public static final String PROPERTY_UNIT_PRICE = "unitPrice";
        public static final String PROPERTY_FACILITY = "facility";
        public static final String PROPERTY_DIAGNOSIS = "diagnosis";
        public static final String PROPERTY_DETAIL = "detail";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CoverageEligibilityRequestItem(final JsonObject data) {
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
         * Exceptions, special conditions and supporting information applicable
         * for this service or product line.
         */
        public java.util.List<Integer> supportingInfoSequence() {
            return getList(Integer.class, PROPERTY_SUPPORTING_INFO_SEQUENCE);
        }

        /**
         * Code to identify the general type of benefits under which products and
         * services are provided.
         */
        public CodeableConcept category() {
            return getObject(CodeableConcept.class, PROPERTY_CATEGORY);
        }

        /**
         * This contains the product, service, drug or other billing code for the
         * item.
         */
        public CodeableConcept productOrService() {
            return getObject(CodeableConcept.class, PROPERTY_PRODUCT_OR_SERVICE);
        }

        /**
         * Item typification or modifiers codes to convey additional context for
         * the product or service.
         */
        public java.util.List<CodeableConcept> modifier() {
            return getList(CodeableConcept.class, PROPERTY_MODIFIER);
        }

        /**
         * The practitioner who is responsible for the product or service to be
         * rendered to the patient.
         */
        public Reference provider() {
            return getObject(Reference.class, PROPERTY_PROVIDER);
        }

        /**
         * The number of repetitions of a service or product.
         */
        public Quantity quantity() {
            return getObject(Quantity.class, PROPERTY_QUANTITY);
        }

        /**
         * The amount charged to the patient by the provider for a single unit.
         */
        public Money unitPrice() {
            return getObject(Money.class, PROPERTY_UNIT_PRICE);
        }

        /**
         * Facility where the services will be provided.
         */
        public Reference facility() {
            return getObject(Reference.class, PROPERTY_FACILITY);
        }

        /**
         * Patient diagnosis for which care is sought.
         */
        public java.util.List<CoverageEligibilityRequestDiagnosis> diagnosis() {
            return getList(CoverageEligibilityRequestDiagnosis.class, PROPERTY_DIAGNOSIS);
        }

        /**
         * The plan/proposal/order describing the proposed service in detail.
         */
        public java.util.List<Reference> detail() {
            return getList(Reference.class, PROPERTY_DETAIL);
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

            public Builder supportingInfoSequence(final java.util.List<Integer> supportingInfoSequence) {
                b.add(PROPERTY_SUPPORTING_INFO_SEQUENCE, FhirObject.toIntegerArray(supportingInfoSequence));
                return this;
            }

            public Builder category(final CodeableConcept category) {
                b.add(PROPERTY_CATEGORY, category);
                return this;
            }

            public Builder productOrService(final CodeableConcept productOrService) {
                b.add(PROPERTY_PRODUCT_OR_SERVICE, productOrService);
                return this;
            }

            public Builder modifier(final java.util.List<CodeableConcept> modifier) {
                b.add(PROPERTY_MODIFIER, FhirObject.toArray(modifier));
                return this;
            }

            public Builder provider(final Reference provider) {
                b.add(PROPERTY_PROVIDER, provider);
                return this;
            }

            public Builder quantity(final Quantity quantity) {
                b.add(PROPERTY_QUANTITY, quantity);
                return this;
            }

            public Builder unitPrice(final Money unitPrice) {
                b.add(PROPERTY_UNIT_PRICE, unitPrice);
                return this;
            }

            public Builder facility(final Reference facility) {
                b.add(PROPERTY_FACILITY, facility);
                return this;
            }

            public Builder diagnosis(final java.util.List<CoverageEligibilityRequestDiagnosis> diagnosis) {
                b.add(PROPERTY_DIAGNOSIS, FhirObject.toArray(diagnosis));
                return this;
            }

            public Builder detail(final java.util.List<Reference> detail) {
                b.add(PROPERTY_DETAIL, FhirObject.toArray(detail));
                return this;
            }

            public CoverageEligibilityRequestItem build() {
                return new CoverageEligibilityRequestItem(b.build());
            }
        }
    }

    public static class CoverageEligibilityRequestSupportingInfo extends FhirObject {
        public static final String RESOURCE_TYPE = "CoverageEligibilityRequestSupportingInfo";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_SEQUENCE = "sequence";
        public static final String PROPERTY_INFORMATION = "information";
        public static final String PROPERTY_APPLIES_TO_ALL = "appliesToAll";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CoverageEligibilityRequestSupportingInfo(final JsonObject data) {
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
         * A number to uniquely identify supporting information entries.
         */
        public Integer sequence() {
            return data.getInt(PROPERTY_SEQUENCE);
        }

        /**
         * Additional data or information such as resources, documents, images
         * etc. including references to the data or the actual inclusion of the
         * data.
         */
        public Reference information() {
            return getObject(Reference.class, PROPERTY_INFORMATION);
        }

        /**
         * The supporting materials are applicable for all detail items,
         * product/servce categories and specific billing codes.
         */
        public Boolean appliesToAll() {
            return data.getBoolean(PROPERTY_APPLIES_TO_ALL);
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

            public Builder sequence(final Integer sequence) {
                b.add(PROPERTY_SEQUENCE, sequence);
                return this;
            }

            public Builder information(final Reference information) {
                b.add(PROPERTY_INFORMATION, information);
                return this;
            }

            public Builder appliesToAll(final Boolean appliesToAll) {
                b.add(PROPERTY_APPLIES_TO_ALL, appliesToAll);
                return this;
            }

            public CoverageEligibilityRequestSupportingInfo build() {
                return new CoverageEligibilityRequestSupportingInfo(b.build());
            }
        }
    }
}
