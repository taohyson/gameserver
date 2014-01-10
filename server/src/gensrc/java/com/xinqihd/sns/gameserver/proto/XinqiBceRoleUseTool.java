// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceRoleUseTool.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceRoleUseTool {
  private XinqiBceRoleUseTool() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceRoleUseToolOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 slot = 1;
    boolean hasSlot();
    int getSlot();
    
    // optional string sessionId = 2;
    boolean hasSessionId();
    String getSessionId();
  }
  public static final class BceRoleUseTool extends
      com.google.protobuf.GeneratedMessage
      implements BceRoleUseToolOrBuilder {
    // Use BceRoleUseTool.newBuilder() to construct.
    private BceRoleUseTool(Builder builder) {
      super(builder);
    }
    private BceRoleUseTool(boolean noInit) {}
    
    private static final BceRoleUseTool defaultInstance;
    public static BceRoleUseTool getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceRoleUseTool getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleUseTool_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleUseTool_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 slot = 1;
    public static final int SLOT_FIELD_NUMBER = 1;
    private int slot_;
    public boolean hasSlot() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getSlot() {
      return slot_;
    }
    
    // optional string sessionId = 2;
    public static final int SESSIONID_FIELD_NUMBER = 2;
    private java.lang.Object sessionId_;
    public boolean hasSessionId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          sessionId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      slot_ = 0;
      sessionId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSlot()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, slot_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getSessionIdBytes());
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
          .computeInt32Size(1, slot_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getSessionIdBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseToolOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleUseTool_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleUseTool_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool.newBuilder()
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
        slot_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        sessionId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool result = new com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.slot_ = slot_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.sessionId_ = sessionId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool.getDefaultInstance()) return this;
        if (other.hasSlot()) {
          setSlot(other.getSlot());
        }
        if (other.hasSessionId()) {
          setSessionId(other.getSessionId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSlot()) {
          
          return false;
        }
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
            case 8: {
              bitField0_ |= 0x00000001;
              slot_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              sessionId_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 slot = 1;
      private int slot_ ;
      public boolean hasSlot() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getSlot() {
        return slot_;
      }
      public Builder setSlot(int value) {
        bitField0_ |= 0x00000001;
        slot_ = value;
        onChanged();
        return this;
      }
      public Builder clearSlot() {
        bitField0_ = (bitField0_ & ~0x00000001);
        slot_ = 0;
        onChanged();
        return this;
      }
      
      // optional string sessionId = 2;
      private java.lang.Object sessionId_ = "";
      public boolean hasSessionId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getSessionId() {
        java.lang.Object ref = sessionId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          sessionId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSessionId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        sessionId_ = value;
        onChanged();
        return this;
      }
      public Builder clearSessionId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sessionId_ = getDefaultInstance().getSessionId();
        onChanged();
        return this;
      }
      void setSessionId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        sessionId_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceRoleUseTool)
    }
    
    static {
      defaultInstance = new BceRoleUseTool(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceRoleUseTool)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceRoleUseTool_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceRoleUseTool_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BceRoleUseTool.proto\022 com.xinqihd.sns." +
      "gameserver.proto\"1\n\016BceRoleUseTool\022\014\n\004sl" +
      "ot\030\001 \002(\005\022\021\n\tsessionId\030\002 \001(\tB\025B\023XinqiBceR" +
      "oleUseTool"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceRoleUseTool_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceRoleUseTool_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceRoleUseTool_descriptor,
              new java.lang.String[] { "Slot", "SessionId", },
              com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceRoleUseTool.BceRoleUseTool.Builder.class);
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
