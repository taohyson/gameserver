// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseRoleUseTool.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseRoleUseTool {
  private XinqiBseRoleUseTool() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseRoleUseToolOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string sessionId = 1;
    boolean hasSessionId();
    String getSessionId();
    
    // required int32 slot = 2;
    boolean hasSlot();
    int getSlot();
    
    // required string launchUserId = 3;
    boolean hasLaunchUserId();
    String getLaunchUserId();
    
    // required int32 buffID = 4;
    boolean hasBuffID();
    int getBuffID();
    
    // required int32 type = 5;
    boolean hasType();
    int getType();
  }
  public static final class BseRoleUseTool extends
      com.google.protobuf.GeneratedMessage
      implements BseRoleUseToolOrBuilder {
    // Use BseRoleUseTool.newBuilder() to construct.
    private BseRoleUseTool(Builder builder) {
      super(builder);
    }
    private BseRoleUseTool(boolean noInit) {}
    
    private static final BseRoleUseTool defaultInstance;
    public static BseRoleUseTool getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseRoleUseTool getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.internal_static_com_xinqihd_sns_gameserver_proto_BseRoleUseTool_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.internal_static_com_xinqihd_sns_gameserver_proto_BseRoleUseTool_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string sessionId = 1;
    public static final int SESSIONID_FIELD_NUMBER = 1;
    private java.lang.Object sessionId_;
    public boolean hasSessionId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
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
    
    // required int32 slot = 2;
    public static final int SLOT_FIELD_NUMBER = 2;
    private int slot_;
    public boolean hasSlot() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getSlot() {
      return slot_;
    }
    
    // required string launchUserId = 3;
    public static final int LAUNCHUSERID_FIELD_NUMBER = 3;
    private java.lang.Object launchUserId_;
    public boolean hasLaunchUserId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getLaunchUserId() {
      java.lang.Object ref = launchUserId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          launchUserId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getLaunchUserIdBytes() {
      java.lang.Object ref = launchUserId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        launchUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 buffID = 4;
    public static final int BUFFID_FIELD_NUMBER = 4;
    private int buffID_;
    public boolean hasBuffID() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getBuffID() {
      return buffID_;
    }
    
    // required int32 type = 5;
    public static final int TYPE_FIELD_NUMBER = 5;
    private int type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getType() {
      return type_;
    }
    
    private void initFields() {
      sessionId_ = "";
      slot_ = 0;
      launchUserId_ = "";
      buffID_ = 0;
      type_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSessionId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSlot()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLaunchUserId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBuffID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
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
        output.writeBytes(1, getSessionIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, slot_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getLaunchUserIdBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, buffID_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, type_);
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
          .computeBytesSize(1, getSessionIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, slot_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getLaunchUserIdBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, buffID_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, type_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseToolOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.internal_static_com_xinqihd_sns_gameserver_proto_BseRoleUseTool_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.internal_static_com_xinqihd_sns_gameserver_proto_BseRoleUseTool_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool.newBuilder()
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
        sessionId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        slot_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        launchUserId_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        buffID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool result = new com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sessionId_ = sessionId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.slot_ = slot_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.launchUserId_ = launchUserId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.buffID_ = buffID_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool.getDefaultInstance()) return this;
        if (other.hasSessionId()) {
          setSessionId(other.getSessionId());
        }
        if (other.hasSlot()) {
          setSlot(other.getSlot());
        }
        if (other.hasLaunchUserId()) {
          setLaunchUserId(other.getLaunchUserId());
        }
        if (other.hasBuffID()) {
          setBuffID(other.getBuffID());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSessionId()) {
          
          return false;
        }
        if (!hasSlot()) {
          
          return false;
        }
        if (!hasLaunchUserId()) {
          
          return false;
        }
        if (!hasBuffID()) {
          
          return false;
        }
        if (!hasType()) {
          
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
            case 10: {
              bitField0_ |= 0x00000001;
              sessionId_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              slot_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              launchUserId_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              buffID_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              type_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string sessionId = 1;
      private java.lang.Object sessionId_ = "";
      public boolean hasSessionId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
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
  bitField0_ |= 0x00000001;
        sessionId_ = value;
        onChanged();
        return this;
      }
      public Builder clearSessionId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sessionId_ = getDefaultInstance().getSessionId();
        onChanged();
        return this;
      }
      void setSessionId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        sessionId_ = value;
        onChanged();
      }
      
      // required int32 slot = 2;
      private int slot_ ;
      public boolean hasSlot() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getSlot() {
        return slot_;
      }
      public Builder setSlot(int value) {
        bitField0_ |= 0x00000002;
        slot_ = value;
        onChanged();
        return this;
      }
      public Builder clearSlot() {
        bitField0_ = (bitField0_ & ~0x00000002);
        slot_ = 0;
        onChanged();
        return this;
      }
      
      // required string launchUserId = 3;
      private java.lang.Object launchUserId_ = "";
      public boolean hasLaunchUserId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getLaunchUserId() {
        java.lang.Object ref = launchUserId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          launchUserId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setLaunchUserId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        launchUserId_ = value;
        onChanged();
        return this;
      }
      public Builder clearLaunchUserId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        launchUserId_ = getDefaultInstance().getLaunchUserId();
        onChanged();
        return this;
      }
      void setLaunchUserId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        launchUserId_ = value;
        onChanged();
      }
      
      // required int32 buffID = 4;
      private int buffID_ ;
      public boolean hasBuffID() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getBuffID() {
        return buffID_;
      }
      public Builder setBuffID(int value) {
        bitField0_ |= 0x00000008;
        buffID_ = value;
        onChanged();
        return this;
      }
      public Builder clearBuffID() {
        bitField0_ = (bitField0_ & ~0x00000008);
        buffID_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 type = 5;
      private int type_ ;
      public boolean hasType() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getType() {
        return type_;
      }
      public Builder setType(int value) {
        bitField0_ |= 0x00000010;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        type_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseRoleUseTool)
    }
    
    static {
      defaultInstance = new BseRoleUseTool(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseRoleUseTool)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseRoleUseTool_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseRoleUseTool_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BseRoleUseTool.proto\022 com.xinqihd.sns." +
      "gameserver.proto\"e\n\016BseRoleUseTool\022\021\n\tse" +
      "ssionId\030\001 \002(\t\022\014\n\004slot\030\002 \002(\005\022\024\n\014launchUse" +
      "rId\030\003 \002(\t\022\016\n\006buffID\030\004 \002(\005\022\014\n\004type\030\005 \002(\005B" +
      "\025B\023XinqiBseRoleUseTool"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseRoleUseTool_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseRoleUseTool_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseRoleUseTool_descriptor,
              new java.lang.String[] { "SessionId", "Slot", "LaunchUserId", "BuffID", "Type", },
              com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseRoleUseTool.BseRoleUseTool.Builder.class);
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
