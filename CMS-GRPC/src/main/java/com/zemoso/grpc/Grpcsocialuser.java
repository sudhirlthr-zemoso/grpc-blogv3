// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cms.proto

package com.zemoso.grpc;

/**
 * Protobuf type {@code Grpcsocialuser}
 */
public  final class Grpcsocialuser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Grpcsocialuser)
    GrpcsocialuserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Grpcsocialuser.newBuilder() to construct.
  private Grpcsocialuser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Grpcsocialuser() {
    userid_ = 0L;
    email_ = "";
    firstName_ = "";
    lastName_ = "";
    token_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Grpcsocialuser(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            userid_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            firstName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            lastName_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            token_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.zemoso.grpc.Cms.internal_static_Grpcsocialuser_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zemoso.grpc.Cms.internal_static_Grpcsocialuser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zemoso.grpc.Grpcsocialuser.class, com.zemoso.grpc.Grpcsocialuser.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private long userid_;
  /**
   * <code>int64 userid = 1;</code>
   */
  public long getUserid() {
    return userid_;
  }

  public static final int EMAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 2;</code>
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIRSTNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object firstName_;
  /**
   * <code>string firstName = 3;</code>
   */
  public java.lang.String getFirstName() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firstName_ = s;
      return s;
    }
  }
  /**
   * <code>string firstName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getFirstNameBytes() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      firstName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LASTNAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object lastName_;
  /**
   * <code>string lastName = 4;</code>
   */
  public java.lang.String getLastName() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastName_ = s;
      return s;
    }
  }
  /**
   * <code>string lastName = 4;</code>
   */
  public com.google.protobuf.ByteString
      getLastNameBytes() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lastName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_FIELD_NUMBER = 5;
  private volatile java.lang.Object token_;
  /**
   * <code>string token = 5;</code>
   */
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <code>string token = 5;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
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
    if (userid_ != 0L) {
      output.writeInt64(1, userid_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, email_);
    }
    if (!getFirstNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, lastName_);
    }
    if (!getTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, token_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, userid_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, email_);
    }
    if (!getFirstNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, lastName_);
    }
    if (!getTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, token_);
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
    if (!(obj instanceof com.zemoso.grpc.Grpcsocialuser)) {
      return super.equals(obj);
    }
    com.zemoso.grpc.Grpcsocialuser other = (com.zemoso.grpc.Grpcsocialuser) obj;

    boolean result = true;
    result = result && (getUserid()
        == other.getUserid());
    result = result && getEmail()
        .equals(other.getEmail());
    result = result && getFirstName()
        .equals(other.getFirstName());
    result = result && getLastName()
        .equals(other.getLastName());
    result = result && getToken()
        .equals(other.getToken());
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
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserid());
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFirstName().hashCode();
    hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLastName().hashCode();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zemoso.grpc.Grpcsocialuser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zemoso.grpc.Grpcsocialuser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zemoso.grpc.Grpcsocialuser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zemoso.grpc.Grpcsocialuser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zemoso.grpc.Grpcsocialuser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zemoso.grpc.Grpcsocialuser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zemoso.grpc.Grpcsocialuser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zemoso.grpc.Grpcsocialuser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zemoso.grpc.Grpcsocialuser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zemoso.grpc.Grpcsocialuser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zemoso.grpc.Grpcsocialuser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zemoso.grpc.Grpcsocialuser parseFrom(
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
  public static Builder newBuilder(com.zemoso.grpc.Grpcsocialuser prototype) {
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
   * Protobuf type {@code Grpcsocialuser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Grpcsocialuser)
      com.zemoso.grpc.GrpcsocialuserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zemoso.grpc.Cms.internal_static_Grpcsocialuser_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zemoso.grpc.Cms.internal_static_Grpcsocialuser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zemoso.grpc.Grpcsocialuser.class, com.zemoso.grpc.Grpcsocialuser.Builder.class);
    }

    // Construct using com.zemoso.grpc.Grpcsocialuser.newBuilder()
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
      userid_ = 0L;

      email_ = "";

      firstName_ = "";

      lastName_ = "";

      token_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zemoso.grpc.Cms.internal_static_Grpcsocialuser_descriptor;
    }

    @java.lang.Override
    public com.zemoso.grpc.Grpcsocialuser getDefaultInstanceForType() {
      return com.zemoso.grpc.Grpcsocialuser.getDefaultInstance();
    }

    @java.lang.Override
    public com.zemoso.grpc.Grpcsocialuser build() {
      com.zemoso.grpc.Grpcsocialuser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zemoso.grpc.Grpcsocialuser buildPartial() {
      com.zemoso.grpc.Grpcsocialuser result = new com.zemoso.grpc.Grpcsocialuser(this);
      result.userid_ = userid_;
      result.email_ = email_;
      result.firstName_ = firstName_;
      result.lastName_ = lastName_;
      result.token_ = token_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.zemoso.grpc.Grpcsocialuser) {
        return mergeFrom((com.zemoso.grpc.Grpcsocialuser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zemoso.grpc.Grpcsocialuser other) {
      if (other == com.zemoso.grpc.Grpcsocialuser.getDefaultInstance()) return this;
      if (other.getUserid() != 0L) {
        setUserid(other.getUserid());
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (!other.getFirstName().isEmpty()) {
        firstName_ = other.firstName_;
        onChanged();
      }
      if (!other.getLastName().isEmpty()) {
        lastName_ = other.lastName_;
        onChanged();
      }
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
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
      com.zemoso.grpc.Grpcsocialuser parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.zemoso.grpc.Grpcsocialuser) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long userid_ ;
    /**
     * <code>int64 userid = 1;</code>
     */
    public long getUserid() {
      return userid_;
    }
    /**
     * <code>int64 userid = 1;</code>
     */
    public Builder setUserid(long value) {
      
      userid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 userid = 1;</code>
     */
    public Builder clearUserid() {
      
      userid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 2;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 2;</code>
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 2;</code>
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 2;</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object firstName_ = "";
    /**
     * <code>string firstName = 3;</code>
     */
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string firstName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string firstName = 3;</code>
     */
    public Builder setFirstName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      firstName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string firstName = 3;</code>
     */
    public Builder clearFirstName() {
      
      firstName_ = getDefaultInstance().getFirstName();
      onChanged();
      return this;
    }
    /**
     * <code>string firstName = 3;</code>
     */
    public Builder setFirstNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      firstName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lastName_ = "";
    /**
     * <code>string lastName = 4;</code>
     */
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lastName = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lastName = 4;</code>
     */
    public Builder setLastName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lastName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lastName = 4;</code>
     */
    public Builder clearLastName() {
      
      lastName_ = getDefaultInstance().getLastName();
      onChanged();
      return this;
    }
    /**
     * <code>string lastName = 4;</code>
     */
    public Builder setLastNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lastName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object token_ = "";
    /**
     * <code>string token = 5;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token = 5;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string token = 5;</code>
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }
    /**
     * <code>string token = 5;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Grpcsocialuser)
  }

  // @@protoc_insertion_point(class_scope:Grpcsocialuser)
  private static final com.zemoso.grpc.Grpcsocialuser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zemoso.grpc.Grpcsocialuser();
  }

  public static com.zemoso.grpc.Grpcsocialuser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Grpcsocialuser>
      PARSER = new com.google.protobuf.AbstractParser<Grpcsocialuser>() {
    @java.lang.Override
    public Grpcsocialuser parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Grpcsocialuser(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Grpcsocialuser> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Grpcsocialuser> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zemoso.grpc.Grpcsocialuser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

