// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceDeleteRole.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceDeleteRole {
  private XinqiBceDeleteRole() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceDeleteRoleOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string userid = 1;
    boolean hasUserid();
    String getUserid();
    
    // optional string serverid = 2;
    boolean hasServerid();
    String getServerid();
  }
  public static final class BceDeleteRole extends
      com.google.protobuf.GeneratedMessage
      implements BceDeleteRoleOrBuilder {
    // Use BceDeleteRole.newBuilder() to construct.
    private BceDeleteRole(Builder builder) {
      super(builder);
    }
    private BceDeleteRole(boolean noInit) {}
    
    private static final BceDeleteRole defaultInstance;
    public static BceDeleteRole getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceDeleteRole getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.internal_static_com_xinqihd_sns_gameserver_proto_BceDeleteRole_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.internal_static_com_xinqihd_sns_gameserver_proto_BceDeleteRole_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string userid = 1;
    public static final int USERID_FIELD_NUMBER = 1;
    private java.lang.Object userid_;
    public boolean hasUserid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getUserid() {
      java.lang.Object ref = userid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          userid_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUseridBytes() {
      java.lang.Object ref = userid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        userid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string serverid = 2;
    public static final int SERVERID_FIELD_NUMBER = 2;
    private java.lang.Object serverid_;
    public boolean hasServerid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
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
    
    private void initFields() {
      userid_ = "";
      serverid_ = "";
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
        output.writeBytes(1, getUseridBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getServeridBytes());
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
          .computeBytesSize(1, getUseridBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getServeridBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRoleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.internal_static_com_xinqihd_sns_gameserver_proto_BceDeleteRole_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.internal_static_com_xinqihd_sns_gameserver_proto_BceDeleteRole_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole.newBuilder()
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
        userid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        serverid_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole result = new com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userid_ = userid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverid_ = serverid_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole.getDefaultInstance()) return this;
        if (other.hasUserid()) {
          setUserid(other.getUserid());
        }
        if (other.hasServerid()) {
          setServerid(other.getServerid());
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
              userid_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              serverid_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string userid = 1;
      private java.lang.Object userid_ = "";
      public boolean hasUserid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getUserid() {
        java.lang.Object ref = userid_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          userid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUserid(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        userid_ = value;
        onChanged();
        return this;
      }
      public Builder clearUserid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userid_ = getDefaultInstance().getUserid();
        onChanged();
        return this;
      }
      void setUserid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        userid_ = value;
        onChanged();
      }
      
      // optional string serverid = 2;
      private java.lang.Object serverid_ = "";
      public boolean hasServerid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
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
  bitField0_ |= 0x00000002;
        serverid_ = value;
        onChanged();
        return this;
      }
      public Builder clearServerid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverid_ = getDefaultInstance().getServerid();
        onChanged();
        return this;
      }
      void setServerid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        serverid_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceDeleteRole)
    }
    
    static {
      defaultInstance = new BceDeleteRole(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceDeleteRole)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceDeleteRole_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceDeleteRole_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BceDeleteRole.proto\022 com.xinqihd.sns.g" +
      "ameserver.proto\"1\n\rBceDeleteRole\022\016\n\006user" +
      "id\030\001 \001(\t\022\020\n\010serverid\030\002 \001(\tB\024B\022XinqiBceDe" +
      "leteRole"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceDeleteRole_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceDeleteRole_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceDeleteRole_descriptor,
              new java.lang.String[] { "Userid", "Serverid", },
              com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceDeleteRole.BceDeleteRole.Builder.class);
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
