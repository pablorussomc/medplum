/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.JsonObject;

public class BodyStructure extends FhirResource {
    public static final String RESOURCE_TYPE = "BodyStructure";
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
    public static final String PROPERTY_MORPHOLOGY = "morphology";
    public static final String PROPERTY_LOCATION = "location";
    public static final String PROPERTY_LOCATION_QUALIFIER = "locationQualifier";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_IMAGE = "image";
    public static final String PROPERTY_PATIENT = "patient";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public BodyStructure(final JsonObject data) {
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
     * Identifier for this instance of the anatomical structure.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Whether this body site is in active use.
     */
    public Boolean active() {
        return data.getBoolean(PROPERTY_ACTIVE);
    }

    /**
     * The kind of structure being represented by the body structure at
     * `BodyStructure.location`.  This can define both normal and abnormal
     * morphologies.
     */
    public CodeableConcept morphology() {
        return getObject(CodeableConcept.class, PROPERTY_MORPHOLOGY);
    }

    /**
     * The anatomical location or region of the specimen, lesion, or body
     * structure.
     */
    public CodeableConcept location() {
        return getObject(CodeableConcept.class, PROPERTY_LOCATION);
    }

    /**
     * Qualifier to refine the anatomical location.  These include qualifiers
     * for laterality, relative location, directionality, number, and plane.
     */
    public java.util.List<CodeableConcept> locationQualifier() {
        return getList(CodeableConcept.class, PROPERTY_LOCATION_QUALIFIER);
    }

    /**
     * A summary, characterization or explanation of the body structure.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * Image or images used to identify a location.
     */
    public java.util.List<Attachment> image() {
        return getList(Attachment.class, PROPERTY_IMAGE);
    }

    /**
     * The person to which the body site belongs.
     */
    public Reference patient() {
        return getObject(Reference.class, PROPERTY_PATIENT);
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

        public Builder morphology(final CodeableConcept morphology) {
            b.add(PROPERTY_MORPHOLOGY, morphology);
            return this;
        }

        public Builder location(final CodeableConcept location) {
            b.add(PROPERTY_LOCATION, location);
            return this;
        }

        public Builder locationQualifier(final java.util.List<CodeableConcept> locationQualifier) {
            b.add(PROPERTY_LOCATION_QUALIFIER, FhirObject.toArray(locationQualifier));
            return this;
        }

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder image(final java.util.List<Attachment> image) {
            b.add(PROPERTY_IMAGE, FhirObject.toArray(image));
            return this;
        }

        public Builder patient(final Reference patient) {
            b.add(PROPERTY_PATIENT, patient);
            return this;
        }

        public BodyStructure build() {
            return new BodyStructure(b.build());
        }
    }
}
