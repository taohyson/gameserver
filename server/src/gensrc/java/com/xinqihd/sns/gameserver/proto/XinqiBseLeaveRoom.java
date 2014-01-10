// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseLeaveRoom.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseLeaveRoom {
  private XinqiBseLeaveRoom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseLeaveRoomOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string roomId = 1;
    boolean hasRoomId();
    String getRoomId();
    
    // optional int32 mode = 2;
    boolean hasMode();
    int getMode();
  }
  public static final class BseLeaveRoom extends
      com.google.protobuf.GeneratedMessage
      implements BseLeaveRoomOrBuilder {
    // Use BseLeaveRoom.newBuilder() to construct.
    private BseLeaveRoom(Builder builder) {
      super(builder);
    }
    private BseLeaveRoom(boolean noInit) {}
    
    private static final BseLeaveRoom defaultInstance;
    public static BseLeaveRoom getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseLeaveRoom getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseLeaveRoom_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseLeaveRoom_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string roomId = 1;
    public static final int ROOMID_FIELD_NUMBER = 1;
    private java.lang.Object roomId_;
    public boolean hasRoomId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getRoomId() {
      java.lang.Object ref = roomId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          roomId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getRoomIdBytes() {
      java.lang.Object ref = roomId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        roomId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 mode = 2;
    public static final int MODE_FIELD_NUMBER = 2;
    private int mode_;
    public boolean hasMode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getMode() {
      return mode_;
    }
    
    private void initFields() {
      roomId_ = "";
      mode_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasRoomId()) {
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
        output.writeBytes(1, getRoomIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, mode_);
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
          .computeBytesSize(1, getRoomIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, mode_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseLeaveRoom_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseLeaveRoom_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom.newBuilder()
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
        roomId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        mode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom result = new com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.roomId_ = roomId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.mode_ = mode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom.getDefaultInstance()) return this;
        if (other.hasRoomId()) {
          setRoomId(other.getRoomId());
        }
        if (other.hasMode()) {
          setMode(other.getMode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasRoomId()) {
          
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
              roomId_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              mode_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string roomId = 1;
      private java.lang.Object roomId_ = "";
      public boolean hasRoomId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getRoomId() {
        java.lang.Object ref = roomId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          roomId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setRoomId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        roomId_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoomId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        roomId_ = getDefaultInstance().getRoomId();
        onChanged();
        return this;
      }
      void setRoomId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        roomId_ = value;
        onChanged();
      }
      
      // optional int32 mode = 2;
      private int mode_ ;
      public boolean hasMode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getMode() {
        return mode_;
      }
      public Builder setMode(int value) {
        bitField0_ |= 0x00000002;
        mode_ = value;
        onChanged();
        return this;
      }
      public Builder clearMode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mode_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseLeaveRoom)
    }
    
    static {
      defaultInstance = new BseLeaveRoom(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseLeaveRoom)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseLeaveRoom_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseLeaveRoom_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022BseLeaveRoom.proto\022 com.xinqihd.sns.ga" +
      "meserver.proto\",\n\014BseLeaveRoom\022\016\n\006roomId" +
      "\030\001 \002(\t\022\014\n\004mode\030\002 \001(\005B\023B\021XinqiBseLeaveRoo" +
      "m"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseLeaveRoom_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseLeaveRoom_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseLeaveRoom_descriptor,
              new java.lang.String[] { "RoomId", "Mode", },
              com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseLeaveRoom.BseLeaveRoom.Builder.class);
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
