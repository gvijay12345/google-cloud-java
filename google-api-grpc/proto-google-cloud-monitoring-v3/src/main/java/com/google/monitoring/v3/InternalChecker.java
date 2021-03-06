// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * Nimbus InternalCheckers.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.InternalChecker}
 */
public  final class InternalChecker extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.InternalChecker)
    InternalCheckerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InternalChecker.newBuilder() to construct.
  private InternalChecker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InternalChecker() {
    projectId_ = "";
    network_ = "";
    gcpZone_ = "";
    checkerId_ = "";
    displayName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InternalChecker(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            network_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            gcpZone_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            checkerId_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            displayName_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.v3.UptimeProto.internal_static_google_monitoring_v3_InternalChecker_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.UptimeProto.internal_static_google_monitoring_v3_InternalChecker_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.InternalChecker.class, com.google.monitoring.v3.InternalChecker.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The GCP project ID. Not necessarily the same as the project_id for the
   * config.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The GCP project ID. Not necessarily the same as the project_id for the
   * config.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NETWORK_FIELD_NUMBER = 2;
  private volatile java.lang.Object network_;
  /**
   * <pre>
   * The internal network to perform this uptime check on.
   * </pre>
   *
   * <code>string network = 2;</code>
   */
  public java.lang.String getNetwork() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      network_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The internal network to perform this uptime check on.
   * </pre>
   *
   * <code>string network = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNetworkBytes() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      network_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCP_ZONE_FIELD_NUMBER = 3;
  private volatile java.lang.Object gcpZone_;
  /**
   * <pre>
   * The GCP zone the uptime check should egress from. Only respected for
   * internal uptime checks, where internal_network is specified.
   * </pre>
   *
   * <code>string gcp_zone = 3;</code>
   */
  public java.lang.String getGcpZone() {
    java.lang.Object ref = gcpZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcpZone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The GCP zone the uptime check should egress from. Only respected for
   * internal uptime checks, where internal_network is specified.
   * </pre>
   *
   * <code>string gcp_zone = 3;</code>
   */
  public com.google.protobuf.ByteString
      getGcpZoneBytes() {
    java.lang.Object ref = gcpZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gcpZone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHECKER_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object checkerId_;
  /**
   * <pre>
   * The checker ID.
   * </pre>
   *
   * <code>string checker_id = 4;</code>
   */
  public java.lang.String getCheckerId() {
    java.lang.Object ref = checkerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checkerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The checker ID.
   * </pre>
   *
   * <code>string checker_id = 4;</code>
   */
  public com.google.protobuf.ByteString
      getCheckerIdBytes() {
    java.lang.Object ref = checkerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checkerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object displayName_;
  /**
   * <pre>
   * The checker's human-readable name.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   */
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The checker's human-readable name.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   */
  public com.google.protobuf.ByteString
      getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!getNetworkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, network_);
    }
    if (!getGcpZoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, gcpZone_);
    }
    if (!getCheckerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, checkerId_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, displayName_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!getNetworkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, network_);
    }
    if (!getGcpZoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, gcpZone_);
    }
    if (!getCheckerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, checkerId_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, displayName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.InternalChecker)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.InternalChecker other = (com.google.monitoring.v3.InternalChecker) obj;

    boolean result = true;
    result = result && getProjectId()
        .equals(other.getProjectId());
    result = result && getNetwork()
        .equals(other.getNetwork());
    result = result && getGcpZone()
        .equals(other.getGcpZone());
    result = result && getCheckerId()
        .equals(other.getCheckerId());
    result = result && getDisplayName()
        .equals(other.getDisplayName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getNetwork().hashCode();
    hash = (37 * hash) + GCP_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getGcpZone().hashCode();
    hash = (37 * hash) + CHECKER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCheckerId().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.InternalChecker parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.InternalChecker parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.InternalChecker parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.InternalChecker parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.InternalChecker parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.InternalChecker parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.InternalChecker parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.InternalChecker parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.InternalChecker parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.InternalChecker parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.InternalChecker parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.InternalChecker parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.monitoring.v3.InternalChecker prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Nimbus InternalCheckers.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.InternalChecker}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.InternalChecker)
      com.google.monitoring.v3.InternalCheckerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.UptimeProto.internal_static_google_monitoring_v3_InternalChecker_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.UptimeProto.internal_static_google_monitoring_v3_InternalChecker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.InternalChecker.class, com.google.monitoring.v3.InternalChecker.Builder.class);
    }

    // Construct using com.google.monitoring.v3.InternalChecker.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      projectId_ = "";

      network_ = "";

      gcpZone_ = "";

      checkerId_ = "";

      displayName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.UptimeProto.internal_static_google_monitoring_v3_InternalChecker_descriptor;
    }

    public com.google.monitoring.v3.InternalChecker getDefaultInstanceForType() {
      return com.google.monitoring.v3.InternalChecker.getDefaultInstance();
    }

    public com.google.monitoring.v3.InternalChecker build() {
      com.google.monitoring.v3.InternalChecker result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.monitoring.v3.InternalChecker buildPartial() {
      com.google.monitoring.v3.InternalChecker result = new com.google.monitoring.v3.InternalChecker(this);
      result.projectId_ = projectId_;
      result.network_ = network_;
      result.gcpZone_ = gcpZone_;
      result.checkerId_ = checkerId_;
      result.displayName_ = displayName_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.InternalChecker) {
        return mergeFrom((com.google.monitoring.v3.InternalChecker)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.InternalChecker other) {
      if (other == com.google.monitoring.v3.InternalChecker.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getNetwork().isEmpty()) {
        network_ = other.network_;
        onChanged();
      }
      if (!other.getGcpZone().isEmpty()) {
        gcpZone_ = other.gcpZone_;
        onChanged();
      }
      if (!other.getCheckerId().isEmpty()) {
        checkerId_ = other.checkerId_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.monitoring.v3.InternalChecker parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.InternalChecker) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The GCP project ID. Not necessarily the same as the project_id for the
     * config.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The GCP project ID. Not necessarily the same as the project_id for the
     * config.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The GCP project ID. Not necessarily the same as the project_id for the
     * config.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The GCP project ID. Not necessarily the same as the project_id for the
     * config.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The GCP project ID. Not necessarily the same as the project_id for the
     * config.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object network_ = "";
    /**
     * <pre>
     * The internal network to perform this uptime check on.
     * </pre>
     *
     * <code>string network = 2;</code>
     */
    public java.lang.String getNetwork() {
      java.lang.Object ref = network_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        network_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The internal network to perform this uptime check on.
     * </pre>
     *
     * <code>string network = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNetworkBytes() {
      java.lang.Object ref = network_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        network_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The internal network to perform this uptime check on.
     * </pre>
     *
     * <code>string network = 2;</code>
     */
    public Builder setNetwork(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      network_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The internal network to perform this uptime check on.
     * </pre>
     *
     * <code>string network = 2;</code>
     */
    public Builder clearNetwork() {
      
      network_ = getDefaultInstance().getNetwork();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The internal network to perform this uptime check on.
     * </pre>
     *
     * <code>string network = 2;</code>
     */
    public Builder setNetworkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      network_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object gcpZone_ = "";
    /**
     * <pre>
     * The GCP zone the uptime check should egress from. Only respected for
     * internal uptime checks, where internal_network is specified.
     * </pre>
     *
     * <code>string gcp_zone = 3;</code>
     */
    public java.lang.String getGcpZone() {
      java.lang.Object ref = gcpZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcpZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The GCP zone the uptime check should egress from. Only respected for
     * internal uptime checks, where internal_network is specified.
     * </pre>
     *
     * <code>string gcp_zone = 3;</code>
     */
    public com.google.protobuf.ByteString
        getGcpZoneBytes() {
      java.lang.Object ref = gcpZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gcpZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The GCP zone the uptime check should egress from. Only respected for
     * internal uptime checks, where internal_network is specified.
     * </pre>
     *
     * <code>string gcp_zone = 3;</code>
     */
    public Builder setGcpZone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gcpZone_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The GCP zone the uptime check should egress from. Only respected for
     * internal uptime checks, where internal_network is specified.
     * </pre>
     *
     * <code>string gcp_zone = 3;</code>
     */
    public Builder clearGcpZone() {
      
      gcpZone_ = getDefaultInstance().getGcpZone();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The GCP zone the uptime check should egress from. Only respected for
     * internal uptime checks, where internal_network is specified.
     * </pre>
     *
     * <code>string gcp_zone = 3;</code>
     */
    public Builder setGcpZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gcpZone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object checkerId_ = "";
    /**
     * <pre>
     * The checker ID.
     * </pre>
     *
     * <code>string checker_id = 4;</code>
     */
    public java.lang.String getCheckerId() {
      java.lang.Object ref = checkerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checkerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The checker ID.
     * </pre>
     *
     * <code>string checker_id = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCheckerIdBytes() {
      java.lang.Object ref = checkerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checkerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The checker ID.
     * </pre>
     *
     * <code>string checker_id = 4;</code>
     */
    public Builder setCheckerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checkerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The checker ID.
     * </pre>
     *
     * <code>string checker_id = 4;</code>
     */
    public Builder clearCheckerId() {
      
      checkerId_ = getDefaultInstance().getCheckerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The checker ID.
     * </pre>
     *
     * <code>string checker_id = 4;</code>
     */
    public Builder setCheckerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checkerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * The checker's human-readable name.
     * </pre>
     *
     * <code>string display_name = 5;</code>
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The checker's human-readable name.
     * </pre>
     *
     * <code>string display_name = 5;</code>
     */
    public com.google.protobuf.ByteString
        getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The checker's human-readable name.
     * </pre>
     *
     * <code>string display_name = 5;</code>
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The checker's human-readable name.
     * </pre>
     *
     * <code>string display_name = 5;</code>
     */
    public Builder clearDisplayName() {
      
      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The checker's human-readable name.
     * </pre>
     *
     * <code>string display_name = 5;</code>
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      displayName_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.InternalChecker)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.InternalChecker)
  private static final com.google.monitoring.v3.InternalChecker DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.InternalChecker();
  }

  public static com.google.monitoring.v3.InternalChecker getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InternalChecker>
      PARSER = new com.google.protobuf.AbstractParser<InternalChecker>() {
    public InternalChecker parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InternalChecker(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InternalChecker> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InternalChecker> getParserForType() {
    return PARSER;
  }

  public com.google.monitoring.v3.InternalChecker getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

