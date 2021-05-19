/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A type of a manufactured item that is used in the provision of
 * healthcare without being substantially changed through that activity.
 * The device may be a medical or non-medical device.
 */
public class Device extends DomainResource {
    public static final String RESOURCE_TYPE = "Device";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Device(final JsonObject data) {
        super(data);
    }

    /**
     * Unique instance identifiers assigned to a device by manufacturers
     * other organizations or owners.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The reference to the definition for the device.
     */
    public Reference definition() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_DEFINITION);
    }

    /**
     * Unique device identifier (UDI) assigned to device label or package.
     * Note that the Device may include multiple udiCarriers as it either may
     * include just the udiCarrier for the jurisdiction it is sold, or for
     * multiple jurisdictions it could have been sold.
     */
    public java.util.List<DeviceUdiCarrier> udiCarrier() {
        return getList(DeviceUdiCarrier.class, FhirPropertyNames.PROPERTY_UDI_CARRIER);
    }

    /**
     * Status of the Device availability.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Reason for the dtatus of the Device availability.
     */
    public java.util.List<CodeableConcept> statusReason() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_STATUS_REASON);
    }

    /**
     * The distinct identification string as required by regulation for a
     * human cell, tissue, or cellular and tissue-based product.
     */
    public String distinctIdentifier() {
        return getString(FhirPropertyNames.PROPERTY_DISTINCT_IDENTIFIER);
    }

    /**
     * A name of the manufacturer.
     */
    public String manufacturer() {
        return getString(FhirPropertyNames.PROPERTY_MANUFACTURER);
    }

    /**
     * The date and time when the device was manufactured.
     */
    public java.time.Instant manufactureDate() {
        return getInstant(FhirPropertyNames.PROPERTY_MANUFACTURE_DATE);
    }

    /**
     * The date and time beyond which this device is no longer valid or
     * should not be used (if applicable).
     */
    public java.time.Instant expirationDate() {
        return getInstant(FhirPropertyNames.PROPERTY_EXPIRATION_DATE);
    }

    /**
     * Lot number assigned by the manufacturer.
     */
    public String lotNumber() {
        return getString(FhirPropertyNames.PROPERTY_LOT_NUMBER);
    }

    /**
     * The serial number assigned by the organization when the device was
     * manufactured.
     */
    public String serialNumber() {
        return getString(FhirPropertyNames.PROPERTY_SERIAL_NUMBER);
    }

    /**
     * This represents the manufacturer's name of the device as provided by
     * the device, from a UDI label, or by a person describing the Device.
     * This typically would be used when a person provides the name(s) or
     * when the device represents one of the names available from
     * DeviceDefinition.
     */
    public java.util.List<DeviceDeviceName> deviceName() {
        return getList(DeviceDeviceName.class, FhirPropertyNames.PROPERTY_DEVICE_NAME);
    }

    /**
     * The model number for the device.
     */
    public String modelNumber() {
        return getString(FhirPropertyNames.PROPERTY_MODEL_NUMBER);
    }

    /**
     * The part number of the device.
     */
    public String partNumber() {
        return getString(FhirPropertyNames.PROPERTY_PART_NUMBER);
    }

    /**
     * The kind or type of device.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * The capabilities supported on a  device, the standards to which the
     * device conforms for a particular purpose, and used for the
     * communication.
     */
    public java.util.List<DeviceSpecialization> specialization() {
        return getList(DeviceSpecialization.class, FhirPropertyNames.PROPERTY_SPECIALIZATION);
    }

    /**
     * The actual design of the device or software version running on the
     * device.
     */
    public java.util.List<DeviceVersion> version() {
        return getList(DeviceVersion.class, FhirPropertyNames.PROPERTY_VERSION);
    }

    /**
     * The actual configuration settings of a device as it actually operates,
     * e.g., regulation status, time properties.
     */
    public java.util.List<DeviceProperty> property() {
        return getList(DeviceProperty.class, FhirPropertyNames.PROPERTY_PROPERTY);
    }

    /**
     * Patient information, If the device is affixed to a person.
     */
    public Reference patient() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PATIENT);
    }

    /**
     * An organization that is responsible for the provision and ongoing
     * maintenance of the device.
     */
    public Reference owner() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_OWNER);
    }

    /**
     * Contact details for an organization or a particular human that is
     * responsible for the device.
     */
    public java.util.List<ContactPoint> contact() {
        return getList(ContactPoint.class, FhirPropertyNames.PROPERTY_CONTACT);
    }

    /**
     * The place where the device can be found.
     */
    public Reference location() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_LOCATION);
    }

    /**
     * A network address on which the device may be contacted directly.
     */
    public java.net.URI url() {
        return getUri(FhirPropertyNames.PROPERTY_URL);
    }

    /**
     * Descriptive information, usage information or implantation information
     * that is not captured in an existing element.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
    }

    /**
     * Provides additional safety characteristics about a medical device.
     * For example devices containing latex.
     */
    public java.util.List<CodeableConcept> safety() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_SAFETY);
    }

    /**
     * The parent device.
     */
    public Reference parent() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PARENT);
    }

    public static final class Builder extends DomainResource.Builder<Device, Device.Builder> {

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

        public Builder definition(final Reference definition) {
            b.add(FhirPropertyNames.PROPERTY_DEFINITION, definition);
            return this;
        }

        public Builder udiCarrier(final java.util.List<DeviceUdiCarrier> udiCarrier) {
            b.add(FhirPropertyNames.PROPERTY_UDI_CARRIER, FhirObject.toArray(udiCarrier));
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder statusReason(final java.util.List<CodeableConcept> statusReason) {
            b.add(FhirPropertyNames.PROPERTY_STATUS_REASON, FhirObject.toArray(statusReason));
            return this;
        }

        public Builder distinctIdentifier(final String distinctIdentifier) {
            b.add(FhirPropertyNames.PROPERTY_DISTINCT_IDENTIFIER, distinctIdentifier);
            return this;
        }

        public Builder manufacturer(final String manufacturer) {
            b.add(FhirPropertyNames.PROPERTY_MANUFACTURER, manufacturer);
            return this;
        }

        public Builder manufactureDate(final java.time.Instant manufactureDate) {
            b.add(FhirPropertyNames.PROPERTY_MANUFACTURE_DATE, manufactureDate.toString());
            return this;
        }

        public Builder expirationDate(final java.time.Instant expirationDate) {
            b.add(FhirPropertyNames.PROPERTY_EXPIRATION_DATE, expirationDate.toString());
            return this;
        }

        public Builder lotNumber(final String lotNumber) {
            b.add(FhirPropertyNames.PROPERTY_LOT_NUMBER, lotNumber);
            return this;
        }

        public Builder serialNumber(final String serialNumber) {
            b.add(FhirPropertyNames.PROPERTY_SERIAL_NUMBER, serialNumber);
            return this;
        }

        public Builder deviceName(final java.util.List<DeviceDeviceName> deviceName) {
            b.add(FhirPropertyNames.PROPERTY_DEVICE_NAME, FhirObject.toArray(deviceName));
            return this;
        }

        public Builder modelNumber(final String modelNumber) {
            b.add(FhirPropertyNames.PROPERTY_MODEL_NUMBER, modelNumber);
            return this;
        }

        public Builder partNumber(final String partNumber) {
            b.add(FhirPropertyNames.PROPERTY_PART_NUMBER, partNumber);
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder specialization(final java.util.List<DeviceSpecialization> specialization) {
            b.add(FhirPropertyNames.PROPERTY_SPECIALIZATION, FhirObject.toArray(specialization));
            return this;
        }

        public Builder version(final java.util.List<DeviceVersion> version) {
            b.add(FhirPropertyNames.PROPERTY_VERSION, FhirObject.toArray(version));
            return this;
        }

        public Builder property(final java.util.List<DeviceProperty> property) {
            b.add(FhirPropertyNames.PROPERTY_PROPERTY, FhirObject.toArray(property));
            return this;
        }

        public Builder patient(final Reference patient) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder owner(final Reference owner) {
            b.add(FhirPropertyNames.PROPERTY_OWNER, owner);
            return this;
        }

        public Builder contact(final java.util.List<ContactPoint> contact) {
            b.add(FhirPropertyNames.PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder location(final Reference location) {
            b.add(FhirPropertyNames.PROPERTY_LOCATION, location);
            return this;
        }

        public Builder url(final java.net.URI url) {
            b.add(FhirPropertyNames.PROPERTY_URL, url.toString());
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder safety(final java.util.List<CodeableConcept> safety) {
            b.add(FhirPropertyNames.PROPERTY_SAFETY, FhirObject.toArray(safety));
            return this;
        }

        public Builder parent(final Reference parent) {
            b.add(FhirPropertyNames.PROPERTY_PARENT, parent);
            return this;
        }

        public Device build() {
            return new Device(b.build());
        }
    }

    /**
     * A type of a manufactured item that is used in the provision of
     * healthcare without being substantially changed through that activity.
     * The device may be a medical or non-medical device.
     */
    public static class DeviceDeviceName extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceDeviceName";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceDeviceName(final JsonObject data) {
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
         * The name of the device.
         */
        public String name() {
            return getString(FhirPropertyNames.PROPERTY_NAME);
        }

        /**
         * The type of deviceName.
         * UDILabelName | UserFriendlyName | PatientReportedName |
         * ManufactureDeviceName | ModelName.
         */
        public String type() {
            return getString(FhirPropertyNames.PROPERTY_TYPE);
        }

        public static final class Builder extends FhirObject.Builder<DeviceDeviceName, DeviceDeviceName.Builder> {

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

            public Builder name(final String name) {
                b.add(FhirPropertyNames.PROPERTY_NAME, name);
                return this;
            }

            public Builder type(final String type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public DeviceDeviceName build() {
                return new DeviceDeviceName(b.build());
            }
        }
    }

    /**
     * A type of a manufactured item that is used in the provision of
     * healthcare without being substantially changed through that activity.
     * The device may be a medical or non-medical device.
     */
    public static class DeviceProperty extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceProperty";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceProperty(final JsonObject data) {
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
         * Code that specifies the property DeviceDefinitionPropetyCode
         * (Extensible).
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * Property value as a quantity.
         */
        public java.util.List<Quantity> valueQuantity() {
            return getList(Quantity.class, FhirPropertyNames.PROPERTY_VALUE_QUANTITY);
        }

        /**
         * Property value as a code, e.g., NTP4 (synced to NTP).
         */
        public java.util.List<CodeableConcept> valueCode() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_VALUE_CODE);
        }

        public static final class Builder extends FhirObject.Builder<DeviceProperty, DeviceProperty.Builder> {

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

            public Builder valueQuantity(final java.util.List<Quantity> valueQuantity) {
                b.add(FhirPropertyNames.PROPERTY_VALUE_QUANTITY, FhirObject.toArray(valueQuantity));
                return this;
            }

            public Builder valueCode(final java.util.List<CodeableConcept> valueCode) {
                b.add(FhirPropertyNames.PROPERTY_VALUE_CODE, FhirObject.toArray(valueCode));
                return this;
            }

            public DeviceProperty build() {
                return new DeviceProperty(b.build());
            }
        }
    }

    /**
     * A type of a manufactured item that is used in the provision of
     * healthcare without being substantially changed through that activity.
     * The device may be a medical or non-medical device.
     */
    public static class DeviceSpecialization extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceSpecialization";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceSpecialization(final JsonObject data) {
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
         * The standard that is used to operate and communicate.
         */
        public CodeableConcept systemType() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SYSTEM_TYPE);
        }

        /**
         * The version of the standard that is used to operate and communicate.
         */
        public String version() {
            return getString(FhirPropertyNames.PROPERTY_VERSION);
        }

        public static final class Builder extends FhirObject.Builder<DeviceSpecialization, DeviceSpecialization.Builder> {

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

            public Builder systemType(final CodeableConcept systemType) {
                b.add(FhirPropertyNames.PROPERTY_SYSTEM_TYPE, systemType);
                return this;
            }

            public Builder version(final String version) {
                b.add(FhirPropertyNames.PROPERTY_VERSION, version);
                return this;
            }

            public DeviceSpecialization build() {
                return new DeviceSpecialization(b.build());
            }
        }
    }

    /**
     * A type of a manufactured item that is used in the provision of
     * healthcare without being substantially changed through that activity.
     * The device may be a medical or non-medical device.
     */
    public static class DeviceUdiCarrier extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceUdiCarrier";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceUdiCarrier(final JsonObject data) {
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
         * The device identifier (DI) is a mandatory, fixed portion of a UDI that
         * identifies the labeler and the specific version or model of a device.
         */
        public String deviceIdentifier() {
            return getString(FhirPropertyNames.PROPERTY_DEVICE_IDENTIFIER);
        }

        /**
         * Organization that is charged with issuing UDIs for devices.  For
         * example, the US FDA issuers include :
         * 1) GS1:
         * http://hl7.org/fhir/NamingSystem/gs1-di,
         * 2) HIBCC:
         * http://hl7.org/fhir/NamingSystem/hibcc-dI,
         * 3) ICCBBA for blood containers:
         * http://hl7.org/fhir/NamingSystem/iccbba-blood-di,
         * 4) ICCBA for other devices:
         * http://hl7.org/fhir/NamingSystem/iccbba-other-di.
         */
        public java.net.URI issuer() {
            return getUri(FhirPropertyNames.PROPERTY_ISSUER);
        }

        /**
         * The identity of the authoritative source for UDI generation within a
         * jurisdiction.  All UDIs are globally unique within a single namespace
         * with the appropriate repository uri as the system.  For example,  UDIs
         * of devices managed in the U.S. by the FDA, the value is
         * http://hl7.org/fhir/NamingSystem/fda-udi.
         */
        public java.net.URI jurisdiction() {
            return getUri(FhirPropertyNames.PROPERTY_JURISDICTION);
        }

        /**
         * The full UDI carrier of the Automatic Identification and Data Capture
         * (AIDC) technology representation of the barcode string as printed on
         * the packaging of the device - e.g., a barcode or RFID.   Because of
         * limitations on character sets in XML and the need to round-trip JSON
         * data through XML, AIDC Formats *SHALL* be base64 encoded.
         */
        public String carrierAIDC() {
            return getString(FhirPropertyNames.PROPERTY_CARRIER_A_I_D_C);
        }

        /**
         * The full UDI carrier as the human readable form (HRF) representation
         * of the barcode string as printed on the packaging of the device.
         */
        public String carrierHRF() {
            return getString(FhirPropertyNames.PROPERTY_CARRIER_H_R_F);
        }

        /**
         * A coded entry to indicate how the data was entered.
         */
        public String entryType() {
            return getString(FhirPropertyNames.PROPERTY_ENTRY_TYPE);
        }

        public static final class Builder extends FhirObject.Builder<DeviceUdiCarrier, DeviceUdiCarrier.Builder> {

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

            public Builder deviceIdentifier(final String deviceIdentifier) {
                b.add(FhirPropertyNames.PROPERTY_DEVICE_IDENTIFIER, deviceIdentifier);
                return this;
            }

            public Builder issuer(final java.net.URI issuer) {
                b.add(FhirPropertyNames.PROPERTY_ISSUER, issuer.toString());
                return this;
            }

            public Builder jurisdiction(final java.net.URI jurisdiction) {
                b.add(FhirPropertyNames.PROPERTY_JURISDICTION, jurisdiction.toString());
                return this;
            }

            public Builder carrierAIDC(final String carrierAIDC) {
                b.add(FhirPropertyNames.PROPERTY_CARRIER_A_I_D_C, carrierAIDC);
                return this;
            }

            public Builder carrierHRF(final String carrierHRF) {
                b.add(FhirPropertyNames.PROPERTY_CARRIER_H_R_F, carrierHRF);
                return this;
            }

            public Builder entryType(final String entryType) {
                b.add(FhirPropertyNames.PROPERTY_ENTRY_TYPE, entryType);
                return this;
            }

            public DeviceUdiCarrier build() {
                return new DeviceUdiCarrier(b.build());
            }
        }
    }

    /**
     * A type of a manufactured item that is used in the provision of
     * healthcare without being substantially changed through that activity.
     * The device may be a medical or non-medical device.
     */
    public static class DeviceVersion extends FhirObject {
        public static final String RESOURCE_TYPE = "DeviceVersion";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DeviceVersion(final JsonObject data) {
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
         * The type of the device version.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * A single component of the device version.
         */
        public Identifier component() {
            return getObject(Identifier.class, FhirPropertyNames.PROPERTY_COMPONENT);
        }

        /**
         * The version text.
         */
        public String value() {
            return getString(FhirPropertyNames.PROPERTY_VALUE);
        }

        public static final class Builder extends FhirObject.Builder<DeviceVersion, DeviceVersion.Builder> {

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

            public Builder component(final Identifier component) {
                b.add(FhirPropertyNames.PROPERTY_COMPONENT, component);
                return this;
            }

            public Builder value(final String value) {
                b.add(FhirPropertyNames.PROPERTY_VALUE, value);
                return this;
            }

            public DeviceVersion build() {
                return new DeviceVersion(b.build());
            }
        }
    }
}
