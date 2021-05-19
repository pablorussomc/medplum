/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;
import com.medplum.fhir.r4.StandardOutcomes;

/**
 * A collection of error, warning, or information messages that result
 * from a system action.
 */
public class OperationOutcome extends DomainResource {
    public static final String RESOURCE_TYPE = "OperationOutcome";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public OperationOutcome(final JsonObject data) {
        super(data);
    }

    public boolean isOk() {
        final String id = id();
        return id.equals(StandardOutcomes.ALL_OK_ID) || id.equals(StandardOutcomes.CREATED_ID);
    }

    /**
     * An error, warning, or information message that results from a system
     * action.
     */
    public java.util.List<OperationOutcomeIssue> issue() {
        return getList(OperationOutcomeIssue.class, FhirPropertyNames.PROPERTY_ISSUE);
    }

    /**
     * Optional HTTP status code returned by the operation.
     */
    public Integer status() {
        return data.getInt(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Optional Resource created or modified by this operation.
     */
    public FhirResource resource() {
        return getObject(FhirResource.class, FhirPropertyNames.PROPERTY_RESOURCE);
    }

    public <T extends FhirResource> T resource(final Class<T> c) {
        return getObject(c, FhirPropertyNames.PROPERTY_RESOURCE);
    }

    public static final class Builder extends DomainResource.Builder<OperationOutcome, OperationOutcome.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder issue(final java.util.List<OperationOutcomeIssue> issue) {
            b.add(FhirPropertyNames.PROPERTY_ISSUE, FhirObject.toArray(issue));
            return this;
        }

        public Builder status(final Integer status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder resource(final JsonObject resource) {
            b.add(FhirPropertyNames.PROPERTY_RESOURCE, resource);
            return this;
        }

        public OperationOutcome build() {
            return new OperationOutcome(b.build());
        }
    }

    /**
     * A collection of error, warning, or information messages that result
     * from a system action.
     */
    public static class OperationOutcomeIssue extends FhirObject {
        public static final String RESOURCE_TYPE = "OperationOutcomeIssue";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public OperationOutcomeIssue(final JsonObject data) {
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
         * Indicates whether the issue indicates a variation from successful
         * processing.
         */
        public String severity() {
            return getString(FhirPropertyNames.PROPERTY_SEVERITY);
        }

        /**
         * Describes the type of the issue. The system that creates an
         * OperationOutcome SHALL choose the most applicable code from the
         * IssueType value set, and may additional provide its own code for the
         * error in the details element.
         */
        public String code() {
            return getString(FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * Additional details about the error. This may be a text description of
         * the error or a system code that identifies the error.
         */
        public CodeableConcept details() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_DETAILS);
        }

        /**
         * Additional diagnostic information about the issue.
         */
        public String diagnostics() {
            return getString(FhirPropertyNames.PROPERTY_DIAGNOSTICS);
        }

        /**
         * This element is deprecated because it is XML specific. It is replaced
         * by issue.expression, which is format independent, and simpler to
         * parse.
         *
         * For resource issues, this will be a simple XPath limited to element
         * names, repetition indicators and the default child accessor that
         * identifies one of the elements in the resource that caused this issue
         * to be raised.  For HTTP errors, will be &quot;http.&quot; + the parameter name.
         */
        public java.util.List<String> location() {
            return getList(String.class, FhirPropertyNames.PROPERTY_LOCATION);
        }

        /**
         * A [simple subset of FHIRPath](fhirpath.html#simple) limited to element
         * names, repetition indicators and the default child accessor that
         * identifies one of the elements in the resource that caused this issue
         * to be raised.
         */
        public java.util.List<String> expression() {
            return getList(String.class, FhirPropertyNames.PROPERTY_EXPRESSION);
        }

        public static final class Builder extends FhirObject.Builder<OperationOutcomeIssue, OperationOutcomeIssue.Builder> {

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

            public Builder severity(final String severity) {
                b.add(FhirPropertyNames.PROPERTY_SEVERITY, severity);
                return this;
            }

            public Builder code(final String code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, code);
                return this;
            }

            public Builder details(final CodeableConcept details) {
                b.add(FhirPropertyNames.PROPERTY_DETAILS, details);
                return this;
            }

            public Builder diagnostics(final String diagnostics) {
                b.add(FhirPropertyNames.PROPERTY_DIAGNOSTICS, diagnostics);
                return this;
            }

            public Builder location(final java.util.List<String> location) {
                b.add(FhirPropertyNames.PROPERTY_LOCATION, FhirObject.toStringArray(location));
                return this;
            }

            public Builder expression(final java.util.List<String> expression) {
                b.add(FhirPropertyNames.PROPERTY_EXPRESSION, FhirObject.toStringArray(expression));
                return this;
            }

            public OperationOutcomeIssue build() {
                return new OperationOutcomeIssue(b.build());
            }
        }
    }
}
