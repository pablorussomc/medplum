/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A record of an event made for purposes of maintaining a security log.
 * Typical uses include detection of intrusion attempts and monitoring
 * for inappropriate usage.
 */
public class AuditEvent extends DomainResource {
    public static final String RESOURCE_TYPE = "AuditEvent";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public AuditEvent(final JsonObject data) {
        super(data);
    }

    /**
     * Identifier for a family of the event.  For example, a menu item,
     * program, rule, policy, function code, application name or URL. It
     * identifies the performed function.
     */
    public Coding type() {
        return getObject(Coding.class, FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * Identifier for the category of event.
     */
    public java.util.List<Coding> subtype() {
        return getList(Coding.class, FhirPropertyNames.PROPERTY_SUBTYPE);
    }

    /**
     * Indicator for type of action performed during the event that generated
     * the audit.
     */
    public String action() {
        return getString(FhirPropertyNames.PROPERTY_ACTION);
    }

    /**
     * The period during which the activity occurred.
     */
    public Period period() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
    }

    /**
     * The time when the event was recorded.
     */
    public java.time.Instant recorded() {
        return getInstant(FhirPropertyNames.PROPERTY_RECORDED);
    }

    /**
     * Indicates whether the event succeeded or failed.
     */
    public String outcome() {
        return getString(FhirPropertyNames.PROPERTY_OUTCOME);
    }

    /**
     * A free text description of the outcome of the event.
     */
    public String outcomeDesc() {
        return getString(FhirPropertyNames.PROPERTY_OUTCOME_DESC);
    }

    /**
     * The purposeOfUse (reason) that was used during the event being
     * recorded.
     */
    public java.util.List<CodeableConcept> purposeOfEvent() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_PURPOSE_OF_EVENT);
    }

    /**
     * An actor taking an active role in the event or activity that is
     * logged.
     */
    public java.util.List<AuditEventAgent> agent() {
        return getList(AuditEventAgent.class, FhirPropertyNames.PROPERTY_AGENT);
    }

    /**
     * The system that is reporting the event.
     */
    public AuditEventSource source() {
        return getObject(AuditEventSource.class, FhirPropertyNames.PROPERTY_SOURCE);
    }

    /**
     * Specific instances of data or objects that have been accessed.
     */
    public java.util.List<AuditEventEntity> entity() {
        return getList(AuditEventEntity.class, FhirPropertyNames.PROPERTY_ENTITY);
    }

    public static final class Builder extends DomainResource.Builder<AuditEvent, AuditEvent.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder type(final Coding type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder subtype(final java.util.List<Coding> subtype) {
            b.add(FhirPropertyNames.PROPERTY_SUBTYPE, FhirObject.toArray(subtype));
            return this;
        }

        public Builder action(final String action) {
            b.add(FhirPropertyNames.PROPERTY_ACTION, action);
            return this;
        }

        public Builder period(final Period period) {
            b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
            return this;
        }

        public Builder recorded(final java.time.Instant recorded) {
            b.add(FhirPropertyNames.PROPERTY_RECORDED, recorded.toString());
            return this;
        }

        public Builder outcome(final String outcome) {
            b.add(FhirPropertyNames.PROPERTY_OUTCOME, outcome);
            return this;
        }

        public Builder outcomeDesc(final String outcomeDesc) {
            b.add(FhirPropertyNames.PROPERTY_OUTCOME_DESC, outcomeDesc);
            return this;
        }

        public Builder purposeOfEvent(final java.util.List<CodeableConcept> purposeOfEvent) {
            b.add(FhirPropertyNames.PROPERTY_PURPOSE_OF_EVENT, FhirObject.toArray(purposeOfEvent));
            return this;
        }

        public Builder agent(final java.util.List<AuditEventAgent> agent) {
            b.add(FhirPropertyNames.PROPERTY_AGENT, FhirObject.toArray(agent));
            return this;
        }

        public Builder source(final AuditEventSource source) {
            b.add(FhirPropertyNames.PROPERTY_SOURCE, source);
            return this;
        }

        public Builder entity(final java.util.List<AuditEventEntity> entity) {
            b.add(FhirPropertyNames.PROPERTY_ENTITY, FhirObject.toArray(entity));
            return this;
        }

        public AuditEvent build() {
            return new AuditEvent(b.build());
        }
    }

    /**
     * A record of an event made for purposes of maintaining a security log.
     * Typical uses include detection of intrusion attempts and monitoring
     * for inappropriate usage.
     */
    public static class AuditEventAgent extends FhirObject {
        public static final String RESOURCE_TYPE = "AuditEventAgent";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public AuditEventAgent(final JsonObject data) {
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
         * Specification of the participation type the user plays when performing
         * the event.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * The security role that the user was acting under, that come from local
         * codes defined by the access control security system (e.g. RBAC, ABAC)
         * used in the local context.
         */
        public java.util.List<CodeableConcept> role() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_ROLE);
        }

        /**
         * Reference to who this agent is that was involved in the event.
         */
        public Reference who() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_WHO);
        }

        /**
         * Alternative agent Identifier. For a human, this should be a user
         * identifier text string from authentication system. This identifier
         * would be one known to a common authentication system (e.g. single
         * sign-on), if available.
         */
        public String altId() {
            return getString(FhirPropertyNames.PROPERTY_ALT_ID);
        }

        /**
         * Human-meaningful name for the agent.
         */
        public String name() {
            return getString(FhirPropertyNames.PROPERTY_NAME);
        }

        /**
         * Indicator that the user is or is not the requestor, or initiator, for
         * the event being audited.
         */
        public Boolean requestor() {
            return data.getBoolean(FhirPropertyNames.PROPERTY_REQUESTOR);
        }

        /**
         * Where the event occurred.
         */
        public Reference location() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_LOCATION);
        }

        /**
         * The policy or plan that authorized the activity being recorded.
         * Typically, a single activity may have multiple applicable policies,
         * such as patient consent, guarantor funding, etc. The policy would also
         * indicate the security token used.
         */
        public java.util.List<java.net.URI> policy() {
            return getList(java.net.URI.class, FhirPropertyNames.PROPERTY_POLICY);
        }

        /**
         * Type of media involved. Used when the event is about
         * exporting/importing onto media.
         */
        public Coding media() {
            return getObject(Coding.class, FhirPropertyNames.PROPERTY_MEDIA);
        }

        /**
         * Logical network location for application activity, if the activity has
         * a network location.
         */
        public AuditEventNetwork network() {
            return getObject(AuditEventNetwork.class, FhirPropertyNames.PROPERTY_NETWORK);
        }

        /**
         * The reason (purpose of use), specific to this agent, that was used
         * during the event being recorded.
         */
        public java.util.List<CodeableConcept> purposeOfUse() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_PURPOSE_OF_USE);
        }

        public static final class Builder extends FhirObject.Builder<AuditEventAgent, AuditEventAgent.Builder> {

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

            public Builder type(final CodeableConcept type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder role(final java.util.List<CodeableConcept> role) {
                b.add(FhirPropertyNames.PROPERTY_ROLE, FhirObject.toArray(role));
                return this;
            }

            public Builder who(final Reference who) {
                b.add(FhirPropertyNames.PROPERTY_WHO, who);
                return this;
            }

            public Builder altId(final String altId) {
                b.add(FhirPropertyNames.PROPERTY_ALT_ID, altId);
                return this;
            }

            public Builder name(final String name) {
                b.add(FhirPropertyNames.PROPERTY_NAME, name);
                return this;
            }

            public Builder requestor(final Boolean requestor) {
                b.add(FhirPropertyNames.PROPERTY_REQUESTOR, requestor);
                return this;
            }

            public Builder location(final Reference location) {
                b.add(FhirPropertyNames.PROPERTY_LOCATION, location);
                return this;
            }

            public Builder policy(final java.util.List<java.net.URI> policy) {
                b.add(FhirPropertyNames.PROPERTY_POLICY, FhirObject.toUriArray(policy));
                return this;
            }

            public Builder media(final Coding media) {
                b.add(FhirPropertyNames.PROPERTY_MEDIA, media);
                return this;
            }

            public Builder network(final AuditEventNetwork network) {
                b.add(FhirPropertyNames.PROPERTY_NETWORK, network);
                return this;
            }

            public Builder purposeOfUse(final java.util.List<CodeableConcept> purposeOfUse) {
                b.add(FhirPropertyNames.PROPERTY_PURPOSE_OF_USE, FhirObject.toArray(purposeOfUse));
                return this;
            }

            public AuditEventAgent build() {
                return new AuditEventAgent(b.build());
            }
        }
    }

    /**
     * A record of an event made for purposes of maintaining a security log.
     * Typical uses include detection of intrusion attempts and monitoring
     * for inappropriate usage.
     */
    public static class AuditEventDetail extends FhirObject {
        public static final String RESOURCE_TYPE = "AuditEventDetail";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public AuditEventDetail(final JsonObject data) {
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
         * The type of extra detail provided in the value.
         */
        public String type() {
            return getString(FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * The  value of the extra detail.
         */
        public String valueString() {
            return getString(FhirPropertyNames.PROPERTY_VALUE_STRING);
        }

        /**
         * The  value of the extra detail.
         */
        public String valueBase64Binary() {
            return getString(FhirPropertyNames.PROPERTY_VALUE_BASE64_BINARY);
        }

        public static final class Builder extends FhirObject.Builder<AuditEventDetail, AuditEventDetail.Builder> {

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

            public Builder type(final String type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder valueString(final String valueString) {
                b.add(FhirPropertyNames.PROPERTY_VALUE_STRING, valueString);
                return this;
            }

            public Builder valueBase64Binary(final String valueBase64Binary) {
                b.add(FhirPropertyNames.PROPERTY_VALUE_BASE64_BINARY, valueBase64Binary);
                return this;
            }

            public AuditEventDetail build() {
                return new AuditEventDetail(b.build());
            }
        }
    }

    /**
     * A record of an event made for purposes of maintaining a security log.
     * Typical uses include detection of intrusion attempts and monitoring
     * for inappropriate usage.
     */
    public static class AuditEventEntity extends FhirObject {
        public static final String RESOURCE_TYPE = "AuditEventEntity";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public AuditEventEntity(final JsonObject data) {
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
         * Identifies a specific instance of the entity. The reference should be
         * version specific.
         */
        public Reference what() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_WHAT);
        }

        /**
         * The type of the object that was involved in this audit event.
         */
        public Coding type() {
            return getObject(Coding.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * Code representing the role the entity played in the event being
         * audited.
         */
        public Coding role() {
            return getObject(Coding.class, FhirPropertyNames.PROPERTY_ROLE);
        }

        /**
         * Identifier for the data life-cycle stage for the entity.
         */
        public Coding lifecycle() {
            return getObject(Coding.class, FhirPropertyNames.PROPERTY_LIFECYCLE);
        }

        /**
         * Security labels for the identified entity.
         */
        public java.util.List<Coding> securityLabel() {
            return getList(Coding.class, FhirPropertyNames.PROPERTY_SECURITY_LABEL);
        }

        /**
         * A name of the entity in the audit event.
         */
        public String name() {
            return getString(FhirPropertyNames.PROPERTY_NAME);
        }

        /**
         * Text that describes the entity in more detail.
         */
        public String description() {
            return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
        }

        /**
         * The query parameters for a query-type entities.
         */
        public String query() {
            return getString(FhirPropertyNames.PROPERTY_QUERY);
        }

        /**
         * Tagged value pairs for conveying additional information about the
         * entity.
         */
        public java.util.List<AuditEventDetail> detail() {
            return getList(AuditEventDetail.class, FhirPropertyNames.PROPERTY_DETAIL);
        }

        public static final class Builder extends FhirObject.Builder<AuditEventEntity, AuditEventEntity.Builder> {

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

            public Builder what(final Reference what) {
                b.add(FhirPropertyNames.PROPERTY_WHAT, what);
                return this;
            }

            public Builder type(final Coding type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder role(final Coding role) {
                b.add(FhirPropertyNames.PROPERTY_ROLE, role);
                return this;
            }

            public Builder lifecycle(final Coding lifecycle) {
                b.add(FhirPropertyNames.PROPERTY_LIFECYCLE, lifecycle);
                return this;
            }

            public Builder securityLabel(final java.util.List<Coding> securityLabel) {
                b.add(FhirPropertyNames.PROPERTY_SECURITY_LABEL, FhirObject.toArray(securityLabel));
                return this;
            }

            public Builder name(final String name) {
                b.add(FhirPropertyNames.PROPERTY_NAME, name);
                return this;
            }

            public Builder description(final String description) {
                b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder query(final String query) {
                b.add(FhirPropertyNames.PROPERTY_QUERY, query);
                return this;
            }

            public Builder detail(final java.util.List<AuditEventDetail> detail) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL, FhirObject.toArray(detail));
                return this;
            }

            public AuditEventEntity build() {
                return new AuditEventEntity(b.build());
            }
        }
    }

    /**
     * A record of an event made for purposes of maintaining a security log.
     * Typical uses include detection of intrusion attempts and monitoring
     * for inappropriate usage.
     */
    public static class AuditEventNetwork extends FhirObject {
        public static final String RESOURCE_TYPE = "AuditEventNetwork";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public AuditEventNetwork(final JsonObject data) {
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
         * An identifier for the network access point of the user device for the
         * audit event.
         */
        public String address() {
            return getString(FhirPropertyNames.PROPERTY_ADDRESS);
        }

        /**
         * An identifier for the type of network access point that originated the
         * audit event.
         */
        public String type() {
            return getString(FhirPropertyNames.PROPERTY_TYPE);
        }

        public static final class Builder extends FhirObject.Builder<AuditEventNetwork, AuditEventNetwork.Builder> {

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

            public Builder address(final String address) {
                b.add(FhirPropertyNames.PROPERTY_ADDRESS, address);
                return this;
            }

            public Builder type(final String type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public AuditEventNetwork build() {
                return new AuditEventNetwork(b.build());
            }
        }
    }

    /**
     * A record of an event made for purposes of maintaining a security log.
     * Typical uses include detection of intrusion attempts and monitoring
     * for inappropriate usage.
     */
    public static class AuditEventSource extends FhirObject {
        public static final String RESOURCE_TYPE = "AuditEventSource";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public AuditEventSource(final JsonObject data) {
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
         * Logical source location within the healthcare enterprise network.  For
         * example, a hospital or other provider location within a multi-entity
         * provider group.
         */
        public String site() {
            return getString(FhirPropertyNames.PROPERTY_SITE);
        }

        /**
         * Identifier of the source where the event was detected.
         */
        public Reference observer() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_OBSERVER);
        }

        /**
         * Code specifying the type of source where event originated.
         */
        public java.util.List<Coding> type() {
            return getList(Coding.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        public static final class Builder extends FhirObject.Builder<AuditEventSource, AuditEventSource.Builder> {

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

            public Builder site(final String site) {
                b.add(FhirPropertyNames.PROPERTY_SITE, site);
                return this;
            }

            public Builder observer(final Reference observer) {
                b.add(FhirPropertyNames.PROPERTY_OBSERVER, observer);
                return this;
            }

            public Builder type(final java.util.List<Coding> type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, FhirObject.toArray(type));
                return this;
            }

            public AuditEventSource build() {
                return new AuditEventSource(b.build());
            }
        }
    }
}
