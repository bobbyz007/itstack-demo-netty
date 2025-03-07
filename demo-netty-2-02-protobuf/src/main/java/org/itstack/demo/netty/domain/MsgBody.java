// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgInfo.proto

package org.itstack.demo.netty.domain;

/**
 * Protobuf type {@code org.itstack.demo.netty.domain.MsgBody}
 */
public final class MsgBody extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.itstack.demo.netty.domain.MsgBody)
    MsgBodyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgBody.newBuilder() to construct.
  private MsgBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgBody() {
    channelId_ = "";
    msgInfo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgBody();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgBody(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            channelId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            msgInfo_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
    return org.itstack.demo.netty.domain.MsgInfo.internal_static_org_itstack_demo_netty_domain_MsgBody_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.itstack.demo.netty.domain.MsgInfo.internal_static_org_itstack_demo_netty_domain_MsgBody_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.itstack.demo.netty.domain.MsgBody.class, org.itstack.demo.netty.domain.MsgBody.Builder.class);
  }

  public static final int CHANNELID_FIELD_NUMBER = 1;
  private volatile java.lang.Object channelId_;
  /**
   * <code>string channelId = 1;</code>
   * @return The channelId.
   */
  @java.lang.Override
  public java.lang.String getChannelId() {
    java.lang.Object ref = channelId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      channelId_ = s;
      return s;
    }
  }
  /**
   * <code>string channelId = 1;</code>
   * @return The bytes for channelId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChannelIdBytes() {
    java.lang.Object ref = channelId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      channelId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSGINFO_FIELD_NUMBER = 2;
  private volatile java.lang.Object msgInfo_;
  /**
   * <code>string msgInfo = 2;</code>
   * @return The msgInfo.
   */
  @java.lang.Override
  public java.lang.String getMsgInfo() {
    java.lang.Object ref = msgInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msgInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string msgInfo = 2;</code>
   * @return The bytes for msgInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMsgInfoBytes() {
    java.lang.Object ref = msgInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msgInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getChannelIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, channelId_);
    }
    if (!getMsgInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, msgInfo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getChannelIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, channelId_);
    }
    if (!getMsgInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, msgInfo_);
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
    if (!(obj instanceof org.itstack.demo.netty.domain.MsgBody)) {
      return super.equals(obj);
    }
    org.itstack.demo.netty.domain.MsgBody other = (org.itstack.demo.netty.domain.MsgBody) obj;

    if (!getChannelId()
        .equals(other.getChannelId())) return false;
    if (!getMsgInfo()
        .equals(other.getMsgInfo())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CHANNELID_FIELD_NUMBER;
    hash = (53 * hash) + getChannelId().hashCode();
    hash = (37 * hash) + MSGINFO_FIELD_NUMBER;
    hash = (53 * hash) + getMsgInfo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.itstack.demo.netty.domain.MsgBody parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.itstack.demo.netty.domain.MsgBody parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.itstack.demo.netty.domain.MsgBody parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.itstack.demo.netty.domain.MsgBody parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.itstack.demo.netty.domain.MsgBody parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.itstack.demo.netty.domain.MsgBody parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.itstack.demo.netty.domain.MsgBody parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.itstack.demo.netty.domain.MsgBody parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.itstack.demo.netty.domain.MsgBody parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.itstack.demo.netty.domain.MsgBody parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.itstack.demo.netty.domain.MsgBody parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.itstack.demo.netty.domain.MsgBody parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.itstack.demo.netty.domain.MsgBody prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code org.itstack.demo.netty.domain.MsgBody}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.itstack.demo.netty.domain.MsgBody)
      org.itstack.demo.netty.domain.MsgBodyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.itstack.demo.netty.domain.MsgInfo.internal_static_org_itstack_demo_netty_domain_MsgBody_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.itstack.demo.netty.domain.MsgInfo.internal_static_org_itstack_demo_netty_domain_MsgBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.itstack.demo.netty.domain.MsgBody.class, org.itstack.demo.netty.domain.MsgBody.Builder.class);
    }

    // Construct using org.itstack.demo.netty.domain.MsgBody.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      channelId_ = "";

      msgInfo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.itstack.demo.netty.domain.MsgInfo.internal_static_org_itstack_demo_netty_domain_MsgBody_descriptor;
    }

    @java.lang.Override
    public org.itstack.demo.netty.domain.MsgBody getDefaultInstanceForType() {
      return org.itstack.demo.netty.domain.MsgBody.getDefaultInstance();
    }

    @java.lang.Override
    public org.itstack.demo.netty.domain.MsgBody build() {
      org.itstack.demo.netty.domain.MsgBody result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.itstack.demo.netty.domain.MsgBody buildPartial() {
      org.itstack.demo.netty.domain.MsgBody result = new org.itstack.demo.netty.domain.MsgBody(this);
      result.channelId_ = channelId_;
      result.msgInfo_ = msgInfo_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.itstack.demo.netty.domain.MsgBody) {
        return mergeFrom((org.itstack.demo.netty.domain.MsgBody)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.itstack.demo.netty.domain.MsgBody other) {
      if (other == org.itstack.demo.netty.domain.MsgBody.getDefaultInstance()) return this;
      if (!other.getChannelId().isEmpty()) {
        channelId_ = other.channelId_;
        onChanged();
      }
      if (!other.getMsgInfo().isEmpty()) {
        msgInfo_ = other.msgInfo_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.itstack.demo.netty.domain.MsgBody parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.itstack.demo.netty.domain.MsgBody) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object channelId_ = "";
    /**
     * <code>string channelId = 1;</code>
     * @return The channelId.
     */
    public java.lang.String getChannelId() {
      java.lang.Object ref = channelId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channelId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string channelId = 1;</code>
     * @return The bytes for channelId.
     */
    public com.google.protobuf.ByteString
        getChannelIdBytes() {
      java.lang.Object ref = channelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channelId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string channelId = 1;</code>
     * @param value The channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      channelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string channelId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelId() {
      
      channelId_ = getDefaultInstance().getChannelId();
      onChanged();
      return this;
    }
    /**
     * <code>string channelId = 1;</code>
     * @param value The bytes for channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      channelId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msgInfo_ = "";
    /**
     * <code>string msgInfo = 2;</code>
     * @return The msgInfo.
     */
    public java.lang.String getMsgInfo() {
      java.lang.Object ref = msgInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msgInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msgInfo = 2;</code>
     * @return The bytes for msgInfo.
     */
    public com.google.protobuf.ByteString
        getMsgInfoBytes() {
      java.lang.Object ref = msgInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msgInfo = 2;</code>
     * @param value The msgInfo to set.
     * @return This builder for chaining.
     */
    public Builder setMsgInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msgInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msgInfo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgInfo() {
      
      msgInfo_ = getDefaultInstance().getMsgInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string msgInfo = 2;</code>
     * @param value The bytes for msgInfo to set.
     * @return This builder for chaining.
     */
    public Builder setMsgInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msgInfo_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.itstack.demo.netty.domain.MsgBody)
  }

  // @@protoc_insertion_point(class_scope:org.itstack.demo.netty.domain.MsgBody)
  private static final org.itstack.demo.netty.domain.MsgBody DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.itstack.demo.netty.domain.MsgBody();
  }

  public static org.itstack.demo.netty.domain.MsgBody getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgBody>
      PARSER = new com.google.protobuf.AbstractParser<MsgBody>() {
    @java.lang.Override
    public MsgBody parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgBody(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgBody> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgBody> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.itstack.demo.netty.domain.MsgBody getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

