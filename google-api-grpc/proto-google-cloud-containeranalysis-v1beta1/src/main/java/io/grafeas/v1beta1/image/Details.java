// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/image/image.proto

package io.grafeas.v1beta1.image;

/**
 * <pre>
 * Details of an image occurrence.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.image.Details}
 */
public  final class Details extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.image.Details)
    DetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Details.newBuilder() to construct.
  private Details(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Details() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Details(
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
            io.grafeas.v1beta1.image.Derived.Builder subBuilder = null;
            if (derivedImage_ != null) {
              subBuilder = derivedImage_.toBuilder();
            }
            derivedImage_ = input.readMessage(io.grafeas.v1beta1.image.Derived.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(derivedImage_);
              derivedImage_ = subBuilder.buildPartial();
            }

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
    return io.grafeas.v1beta1.image.Image.internal_static_grafeas_v1beta1_image_Details_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.image.Image.internal_static_grafeas_v1beta1_image_Details_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.image.Details.class, io.grafeas.v1beta1.image.Details.Builder.class);
  }

  public static final int DERIVED_IMAGE_FIELD_NUMBER = 1;
  private io.grafeas.v1beta1.image.Derived derivedImage_;
  /**
   * <pre>
   * The child image derived from the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
   */
  public boolean hasDerivedImage() {
    return derivedImage_ != null;
  }
  /**
   * <pre>
   * The child image derived from the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
   */
  public io.grafeas.v1beta1.image.Derived getDerivedImage() {
    return derivedImage_ == null ? io.grafeas.v1beta1.image.Derived.getDefaultInstance() : derivedImage_;
  }
  /**
   * <pre>
   * The child image derived from the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
   */
  public io.grafeas.v1beta1.image.DerivedOrBuilder getDerivedImageOrBuilder() {
    return getDerivedImage();
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
    if (derivedImage_ != null) {
      output.writeMessage(1, getDerivedImage());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (derivedImage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDerivedImage());
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
    if (!(obj instanceof io.grafeas.v1beta1.image.Details)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.image.Details other = (io.grafeas.v1beta1.image.Details) obj;

    boolean result = true;
    result = result && (hasDerivedImage() == other.hasDerivedImage());
    if (hasDerivedImage()) {
      result = result && getDerivedImage()
          .equals(other.getDerivedImage());
    }
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
    if (hasDerivedImage()) {
      hash = (37 * hash) + DERIVED_IMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getDerivedImage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.image.Details parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.image.Details parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.image.Details parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.image.Details parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.image.Details parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.image.Details parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.image.Details parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.image.Details parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.image.Details parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.image.Details parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.image.Details parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.image.Details parseFrom(
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
  public static Builder newBuilder(io.grafeas.v1beta1.image.Details prototype) {
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
   * Details of an image occurrence.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.image.Details}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.image.Details)
      io.grafeas.v1beta1.image.DetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1beta1.image.Image.internal_static_grafeas_v1beta1_image_Details_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.image.Image.internal_static_grafeas_v1beta1_image_Details_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.image.Details.class, io.grafeas.v1beta1.image.Details.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.image.Details.newBuilder()
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
      if (derivedImageBuilder_ == null) {
        derivedImage_ = null;
      } else {
        derivedImage_ = null;
        derivedImageBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1beta1.image.Image.internal_static_grafeas_v1beta1_image_Details_descriptor;
    }

    public io.grafeas.v1beta1.image.Details getDefaultInstanceForType() {
      return io.grafeas.v1beta1.image.Details.getDefaultInstance();
    }

    public io.grafeas.v1beta1.image.Details build() {
      io.grafeas.v1beta1.image.Details result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grafeas.v1beta1.image.Details buildPartial() {
      io.grafeas.v1beta1.image.Details result = new io.grafeas.v1beta1.image.Details(this);
      if (derivedImageBuilder_ == null) {
        result.derivedImage_ = derivedImage_;
      } else {
        result.derivedImage_ = derivedImageBuilder_.build();
      }
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
      if (other instanceof io.grafeas.v1beta1.image.Details) {
        return mergeFrom((io.grafeas.v1beta1.image.Details)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.image.Details other) {
      if (other == io.grafeas.v1beta1.image.Details.getDefaultInstance()) return this;
      if (other.hasDerivedImage()) {
        mergeDerivedImage(other.getDerivedImage());
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
      io.grafeas.v1beta1.image.Details parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.image.Details) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grafeas.v1beta1.image.Derived derivedImage_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1beta1.image.Derived, io.grafeas.v1beta1.image.Derived.Builder, io.grafeas.v1beta1.image.DerivedOrBuilder> derivedImageBuilder_;
    /**
     * <pre>
     * The child image derived from the base image.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     */
    public boolean hasDerivedImage() {
      return derivedImageBuilder_ != null || derivedImage_ != null;
    }
    /**
     * <pre>
     * The child image derived from the base image.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     */
    public io.grafeas.v1beta1.image.Derived getDerivedImage() {
      if (derivedImageBuilder_ == null) {
        return derivedImage_ == null ? io.grafeas.v1beta1.image.Derived.getDefaultInstance() : derivedImage_;
      } else {
        return derivedImageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The child image derived from the base image.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     */
    public Builder setDerivedImage(io.grafeas.v1beta1.image.Derived value) {
      if (derivedImageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        derivedImage_ = value;
        onChanged();
      } else {
        derivedImageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The child image derived from the base image.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     */
    public Builder setDerivedImage(
        io.grafeas.v1beta1.image.Derived.Builder builderForValue) {
      if (derivedImageBuilder_ == null) {
        derivedImage_ = builderForValue.build();
        onChanged();
      } else {
        derivedImageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The child image derived from the base image.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     */
    public Builder mergeDerivedImage(io.grafeas.v1beta1.image.Derived value) {
      if (derivedImageBuilder_ == null) {
        if (derivedImage_ != null) {
          derivedImage_ =
            io.grafeas.v1beta1.image.Derived.newBuilder(derivedImage_).mergeFrom(value).buildPartial();
        } else {
          derivedImage_ = value;
        }
        onChanged();
      } else {
        derivedImageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The child image derived from the base image.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     */
    public Builder clearDerivedImage() {
      if (derivedImageBuilder_ == null) {
        derivedImage_ = null;
        onChanged();
      } else {
        derivedImage_ = null;
        derivedImageBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The child image derived from the base image.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     */
    public io.grafeas.v1beta1.image.Derived.Builder getDerivedImageBuilder() {
      
      onChanged();
      return getDerivedImageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The child image derived from the base image.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     */
    public io.grafeas.v1beta1.image.DerivedOrBuilder getDerivedImageOrBuilder() {
      if (derivedImageBuilder_ != null) {
        return derivedImageBuilder_.getMessageOrBuilder();
      } else {
        return derivedImage_ == null ?
            io.grafeas.v1beta1.image.Derived.getDefaultInstance() : derivedImage_;
      }
    }
    /**
     * <pre>
     * The child image derived from the base image.
     * </pre>
     *
     * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1beta1.image.Derived, io.grafeas.v1beta1.image.Derived.Builder, io.grafeas.v1beta1.image.DerivedOrBuilder> 
        getDerivedImageFieldBuilder() {
      if (derivedImageBuilder_ == null) {
        derivedImageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.image.Derived, io.grafeas.v1beta1.image.Derived.Builder, io.grafeas.v1beta1.image.DerivedOrBuilder>(
                getDerivedImage(),
                getParentForChildren(),
                isClean());
        derivedImage_ = null;
      }
      return derivedImageBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.image.Details)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.image.Details)
  private static final io.grafeas.v1beta1.image.Details DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.image.Details();
  }

  public static io.grafeas.v1beta1.image.Details getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Details>
      PARSER = new com.google.protobuf.AbstractParser<Details>() {
    public Details parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Details(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Details> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Details> getParserForType() {
    return PARSER;
  }

  public io.grafeas.v1beta1.image.Details getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

