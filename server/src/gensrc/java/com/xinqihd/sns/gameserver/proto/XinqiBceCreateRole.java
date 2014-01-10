// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceCreateRole.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceCreateRole {
  private XinqiBceCreateRole() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceCreateRoleOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string usertoken = 1;
    boolean hasUsertoken();
    String getUsertoken();
    
    // optional string rolename = 2;
    boolean hasRolename();
    String getRolename();
    
    // optional int32 gender = 3;
    boolean hasGender();
    int getGender();
    
    // optional string serverid = 4;
    boolean hasServerid();
    String getServerid();
    
    // optional string reserved1 = 10;
    boolean hasReserved1();
    String getReserved1();
    
    // optional string reserved2 = 11;
    boolean hasReserved2();
    String getReserved2();
    
    // optional string reserved3 = 12;
    boolean hasReserved3();
    String getReserved3();
  }
  public static final class BceCreateRole extends
      com.google.protobuf.GeneratedMessage
      implements BceCreateRoleOrBuilder {
    // Use BceCreateRole.newBuilder() to construct.
    private BceCreateRole(Builder builder) {
      super(builder);
    }
    private BceCreateRole(boolean noInit) {}
    
    private static final BceCreateRole defaultInstance;
    public static BceCreateRole getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceCreateRole getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.internal_static_com_xinqihd_sns_gameserver_proto_BceCreateRole_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.internal_static_com_xinqihd_sns_gameserver_proto_BceCreateRole_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string usertoken = 1;
    public static final int USERTOKEN_FIELD_NUMBER = 1;
    private java.lang.Object usertoken_;
    public boolean hasUsertoken() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getUsertoken() {
      java.lang.Object ref = usertoken_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          usertoken_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUsertokenBytes() {
      java.lang.Object ref = usertoken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        usertoken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string rolename = 2;
    public static final int ROLENAME_FIELD_NUMBER = 2;
    private java.lang.Object rolename_;
    public boolean hasRolename() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getRolename() {
      java.lang.Object ref = rolename_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          rolename_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getRolenameBytes() {
      java.lang.Object ref = rolename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        rolename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 gender = 3;
    public static final int GENDER_FIELD_NUMBER = 3;
    private int gender_;
    public boolean hasGender() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getGender() {
      return gender_;
    }
    
    // optional string serverid = 4;
    public static final int SERVERID_FIELD_NUMBER = 4;
    private java.lang.Object serverid_;
    public boolean hasServerid() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getServerid() {
      java.lang.Object ref = serverid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          serverid_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getServeridBytes() {
      java.lang.Object ref = serverid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        serverid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string reserved1 = 10;
    public static final int RESERVED1_FIELD_NUMBER = 10;
    private java.lang.Object reserved1_;
    public boolean hasReserved1() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getReserved1() {
      java.lang.Object ref = reserved1_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          reserved1_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getReserved1Bytes() {
      java.lang.Object ref = reserved1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        reserved1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string reserved2 = 11;
    public static final int RESERVED2_FIELD_NUMBER = 11;
    private java.lang.Object reserved2_;
    public boolean hasReserved2() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getReserved2() {
      java.lang.Object ref = reserved2_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          reserved2_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getReserved2Bytes() {
      java.lang.Object ref = reserved2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        reserved2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string reserved3 = 12;
    public static final int RESERVED3_FIELD_NUMBER = 12;
    private java.lang.Object reserved3_;
    public boolean hasReserved3() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public String getReserved3() {
      java.lang.Object ref = reserved3_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          reserved3_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getReserved3Bytes() {
      java.lang.Object ref = reserved3_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        reserved3_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      usertoken_ = "";
      rolename_ = "";
      gender_ = 0;
      serverid_ = "";
      reserved1_ = "";
      reserved2_ = "";
      reserved3_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getUsertokenBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getRolenameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, gender_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getServeridBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(10, getReserved1Bytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(11, getReserved2Bytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(12, getReserved3Bytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getUsertokenBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getRolenameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, gender_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getServeridBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(10, getReserved1Bytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(11, getReserved2Bytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(12, getReserved3Bytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRoleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.internal_static_com_xinqihd_sns_gameserver_proto_BceCreateRole_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.internal_static_com_xinqihd_sns_gameserver_proto_BceCreateRole_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        usertoken_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        rolename_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        gender_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        serverid_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        reserved1_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        reserved2_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        reserved3_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole result = new com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.usertoken_ = usertoken_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.rolename_ = rolename_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.gender_ = gender_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.serverid_ = serverid_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.reserved1_ = reserved1_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.reserved2_ = reserved2_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.reserved3_ = reserved3_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole.getDefaultInstance()) return this;
        if (other.hasUsertoken()) {
          setUsertoken(other.getUsertoken());
        }
        if (other.hasRolename()) {
          setRolename(other.getRolename());
        }
        if (other.hasGender()) {
          setGender(other.getGender());
        }
        if (other.hasServerid()) {
          setServerid(other.getServerid());
        }
        if (other.hasReserved1()) {
          setReserved1(other.getReserved1());
        }
        if (other.hasReserved2()) {
          setReserved2(other.getReserved2());
        }
        if (other.hasReserved3()) {
          setReserved3(other.getReserved3());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              usertoken_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              rolename_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              gender_ = input.readInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              serverid_ = input.readBytes();
              break;
            }
            case 82: {
              bitField0_ |= 0x00000010;
              reserved1_ = input.readBytes();
              break;
            }
            case 90: {
              bitField0_ |= 0x00000020;
              reserved2_ = input.readBytes();
              break;
            }
            case 98: {
              bitField0_ |= 0x00000040;
              reserved3_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string usertoken = 1;
      private java.lang.Object usertoken_ = "";
      public boolean hasUsertoken() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getUsertoken() {
        java.lang.Object ref = usertoken_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          usertoken_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUsertoken(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        usertoken_ = value;
        onChanged();
        return this;
      }
      public Builder clearUsertoken() {
        bitField0_ = (bitField0_ & ~0x00000001);
        usertoken_ = getDefaultInstance().getUsertoken();
        onChanged();
        return this;
      }
      void setUsertoken(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        usertoken_ = value;
        onChanged();
      }
      
      // optional string rolename = 2;
      private java.lang.Object rolename_ = "";
      public boolean hasRolename() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getRolename() {
        java.lang.Object ref = rolename_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          rolename_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setRolename(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        rolename_ = value;
        onChanged();
        return this;
      }
      public Builder clearRolename() {
        bitField0_ = (bitField0_ & ~0x00000002);
        rolename_ = getDefaultInstance().getRolename();
        onChanged();
        return this;
      }
      void setRolename(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        rolename_ = value;
        onChanged();
      }
      
      // optional int32 gender = 3;
      private int gender_ ;
      public boolean hasGender() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getGender() {
        return gender_;
      }
      public Builder setGender(int value) {
        bitField0_ |= 0x00000004;
        gender_ = value;
        onChanged();
        return this;
      }
      public Builder clearGender() {
        bitField0_ = (bitField0_ & ~0x00000004);
        gender_ = 0;
        onChanged();
        return this;
      }
      
      // optional string serverid = 4;
      private java.lang.Object serverid_ = "";
      public boolean hasServerid() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getServerid() {
        java.lang.Object ref = serverid_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          serverid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setServerid(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        serverid_ = value;
        onChanged();
        return this;
      }
      public Builder clearServerid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        serverid_ = getDefaultInstance().getServerid();
        onChanged();
        return this;
      }
      void setServerid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        serverid_ = value;
        onChanged();
      }
      
      // optional string reserved1 = 10;
      private java.lang.Object reserved1_ = "";
      public boolean hasReserved1() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getReserved1() {
        java.lang.Object ref = reserved1_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          reserved1_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setReserved1(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        reserved1_ = value;
        onChanged();
        return this;
      }
      public Builder clearReserved1() {
        bitField0_ = (bitField0_ & ~0x00000010);
        reserved1_ = getDefaultInstance().getReserved1();
        onChanged();
        return this;
      }
      void setReserved1(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        reserved1_ = value;
        onChanged();
      }
      
      // optional string reserved2 = 11;
      private java.lang.Object reserved2_ = "";
      public boolean hasReserved2() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public String getReserved2() {
        java.lang.Object ref = reserved2_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          reserved2_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setReserved2(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        reserved2_ = value;
        onChanged();
        return this;
      }
      public Builder clearReserved2() {
        bitField0_ = (bitField0_ & ~0x00000020);
        reserved2_ = getDefaultInstance().getReserved2();
        onChanged();
        return this;
      }
      void setReserved2(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000020;
        reserved2_ = value;
        onChanged();
      }
      
      // optional string reserved3 = 12;
      private java.lang.Object reserved3_ = "";
      public boolean hasReserved3() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public String getReserved3() {
        java.lang.Object ref = reserved3_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          reserved3_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setReserved3(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        reserved3_ = value;
        onChanged();
        return this;
      }
      public Builder clearReserved3() {
        bitField0_ = (bitField0_ & ~0x00000040);
        reserved3_ = getDefaultInstance().getReserved3();
        onChanged();
        return this;
      }
      void setReserved3(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000040;
        reserved3_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceCreateRole)
    }
    
    static {
      defaultInstance = new BceCreateRole(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceCreateRole)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceCreateRole_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceCreateRole_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BceCreateRole.proto\022 com.xinqihd.sns.g" +
      "ameserver.proto\"\217\001\n\rBceCreateRole\022\021\n\tuse" +
      "rtoken\030\001 \001(\t\022\020\n\010rolename\030\002 \001(\t\022\016\n\006gender" +
      "\030\003 \001(\005\022\020\n\010serverid\030\004 \001(\t\022\021\n\treserved1\030\n " +
      "\001(\t\022\021\n\treserved2\030\013 \001(\t\022\021\n\treserved3\030\014 \001(" +
      "\tB\024B\022XinqiBceCreateRole"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceCreateRole_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceCreateRole_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceCreateRole_descriptor,
              new java.lang.String[] { "Usertoken", "Rolename", "Gender", "Serverid", "Reserved1", "Reserved2", "Reserved3", },
              com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceCreateRole.BceCreateRole.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
