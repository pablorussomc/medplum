/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.JsonObject;

public class GuidanceResponse extends FhirResource {
    public static final String RESOURCE_TYPE = "GuidanceResponse";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_REQUEST_IDENTIFIER = "requestIdentifier";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_MODULE_URI = "moduleUri";
    public static final String PROPERTY_MODULE_CANONICAL = "moduleCanonical";
    public static final String PROPERTY_MODULE_CODEABLE_CONCEPT = "moduleCodeableConcept";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_ENCOUNTER = "encounter";
    public static final String PROPERTY_OCCURRENCE_DATE_TIME = "occurrenceDateTime";
    public static final String PROPERTY_PERFORMER = "performer";
    public static final String PROPERTY_REASON_CODE = "reasonCode";
    public static final String PROPERTY_REASON_REFERENCE = "reasonReference";
    public static final String PROPERTY_NOTE = "note";
    public static final String PROPERTY_EVALUATION_MESSAGE = "evaluationMessage";
    public static final String PROPERTY_OUTPUT_PARAMETERS = "outputParameters";
    public static final String PROPERTY_RESULT = "result";
    public static final String PROPERTY_DATA_REQUIREMENT = "dataRequirement";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public GuidanceResponse(final JsonObject data) {
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
     * The identifier of the request associated with this response. If an
     * identifier was given as part of the request, it will be reproduced
     * here to enable the requester to more easily identify the response in a
     * multi-request scenario.
     */
    public Identifier requestIdentifier() {
        return getObject(Identifier.class, PROPERTY_REQUEST_IDENTIFIER);
    }

    /**
     * Allows a service to provide  unique, business identifiers for the
     * response.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * An identifier, CodeableConcept or canonical reference to the guidance
     * that was requested.
     */
    public String moduleUri() {
        return getString(PROPERTY_MODULE_URI);
    }

    /**
     * An identifier, CodeableConcept or canonical reference to the guidance
     * that was requested.
     */
    public String moduleCanonical() {
        return getString(PROPERTY_MODULE_CANONICAL);
    }

    /**
     * An identifier, CodeableConcept or canonical reference to the guidance
     * that was requested.
     */
    public CodeableConcept moduleCodeableConcept() {
        return getObject(CodeableConcept.class, PROPERTY_MODULE_CODEABLE_CONCEPT);
    }

    /**
     * The status of the response. If the evaluation is completed
     * successfully, the status will indicate success. However, in order to
     * complete the evaluation, the engine may require more information. In
     * this case, the status will be data-required, and the response will
     * contain a description of the additional required information. If the
     * evaluation completed successfully, but the engine determines that a
     * potentially more accurate response could be provided if more data was
     * available, the status will be data-requested, and the response will
     * contain a description of the additional requested information.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * The patient for which the request was processed.
     */
    public Reference subject() {
        return getObject(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * The encounter during which this response was created or to which the
     * creation of this record is tightly associated.
     */
    public Reference encounter() {
        return getObject(Reference.class, PROPERTY_ENCOUNTER);
    }

    /**
     * Indicates when the guidance response was processed.
     */
    public java.time.Instant occurrenceDateTime() {
        return getInstant(PROPERTY_OCCURRENCE_DATE_TIME);
    }

    /**
     * Provides a reference to the device that performed the guidance.
     */
    public Reference performer() {
        return getObject(Reference.class, PROPERTY_PERFORMER);
    }

    /**
     * Describes the reason for the guidance response in coded or textual
     * form.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, PROPERTY_REASON_CODE);
    }

    /**
     * Indicates the reason the request was initiated. This is typically
     * provided as a parameter to the evaluation and echoed by the service,
     * although for some use cases, such as subscription- or event-based
     * scenarios, it may provide an indication of the cause for the response.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, PROPERTY_REASON_REFERENCE);
    }

    /**
     * Provides a mechanism to communicate additional information about the
     * response.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
    }

    /**
     * Messages resulting from the evaluation of the artifact or artifacts.
     * As part of evaluating the request, the engine may produce
     * informational or warning messages. These messages will be provided by
     * this element.
     */
    public java.util.List<Reference> evaluationMessage() {
        return getList(Reference.class, PROPERTY_EVALUATION_MESSAGE);
    }

    /**
     * The output parameters of the evaluation, if any. Many modules will
     * result in the return of specific resources such as procedure or
     * communication requests that are returned as part of the operation
     * result. However, modules may define specific outputs that would be
     * returned as the result of the evaluation, and these would be returned
     * in this element.
     */
    public Reference outputParameters() {
        return getObject(Reference.class, PROPERTY_OUTPUT_PARAMETERS);
    }

    /**
     * The actions, if any, produced by the evaluation of the artifact.
     */
    public Reference result() {
        return getObject(Reference.class, PROPERTY_RESULT);
    }

    /**
     * If the evaluation could not be completed due to lack of information,
     * or additional information would potentially result in a more accurate
     * response, this element will a description of the data required in
     * order to proceed with the evaluation. A subsequent request to the
     * service should include this data.
     */
    public java.util.List<DataRequirement> dataRequirement() {
        return getList(DataRequirement.class, PROPERTY_DATA_REQUIREMENT);
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

        public Builder requestIdentifier(final Identifier requestIdentifier) {
            b.add(PROPERTY_REQUEST_IDENTIFIER, requestIdentifier);
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder moduleUri(final String moduleUri) {
            b.add(PROPERTY_MODULE_URI, moduleUri);
            return this;
        }

        public Builder moduleCanonical(final String moduleCanonical) {
            b.add(PROPERTY_MODULE_CANONICAL, moduleCanonical);
            return this;
        }

        public Builder moduleCodeableConcept(final CodeableConcept moduleCodeableConcept) {
            b.add(PROPERTY_MODULE_CODEABLE_CONCEPT, moduleCodeableConcept);
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
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

        public Builder occurrenceDateTime(final java.time.Instant occurrenceDateTime) {
            b.add(PROPERTY_OCCURRENCE_DATE_TIME, occurrenceDateTime.toString());
            return this;
        }

        public Builder performer(final Reference performer) {
            b.add(PROPERTY_PERFORMER, performer);
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

        public Builder evaluationMessage(final java.util.List<Reference> evaluationMessage) {
            b.add(PROPERTY_EVALUATION_MESSAGE, FhirObject.toArray(evaluationMessage));
            return this;
        }

        public Builder outputParameters(final Reference outputParameters) {
            b.add(PROPERTY_OUTPUT_PARAMETERS, outputParameters);
            return this;
        }

        public Builder result(final Reference result) {
            b.add(PROPERTY_RESULT, result);
            return this;
        }

        public Builder dataRequirement(final java.util.List<DataRequirement> dataRequirement) {
            b.add(PROPERTY_DATA_REQUIREMENT, FhirObject.toArray(dataRequirement));
            return this;
        }

        public GuidanceResponse build() {
            return new GuidanceResponse(b.build());
        }
    }
}
