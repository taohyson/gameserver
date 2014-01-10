// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseFindRoom.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseFindRoom {
  private XinqiBseFindRoom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseFindRoomOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 roomID = 1 [default = 0];
    boolean hasRoomID();
    int getRoomID();
    
    // required string key = 2;
    boolean hasKey();
    String getKey();
    
    // required int32 error = 3;
    boolean hasError();
    int getError();
  }
  public static final class BseFindRoom extends
      com.google.protobuf.GeneratedMessage
      implements BseFindRoomOrBuilder {
    // Use BseFindRoom.newBuilder() to construct.
    private BseFindRoom(Builder builder) {
      super(builder);
    }
    private BseFindRoom(boolean noInit) {}
    
    private static final BseFindRoom defaultInstance;
    public static BseFindRoom getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseFindRoom getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseFindRoom_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseFindRoom_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 roomID = 1 [default = 0];
    public static final int ROOMID_FIELD_NUMBER = 1;
    private int roomID_;
    public boolean hasRoomID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getRoomID() {
      return roomID_;
    }
    
    // required string key = 2;
    public static final int KEY_FIELD_NUMBER = 2;
    private java.lang.Object key_;
    public boolean hasKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          key_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 error = 3;
    public static final int ERROR_FIELD_NUMBER = 3;
    private int error_;
    public boolean hasError() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getError() {
      return error_;
    }
    
    private void initFields() {
      roomID_ = 0;
      key_ = "";
      error_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasRoomID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasError()) {
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
        output.writeInt32(1, roomID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getKeyBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, error_);
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
          .computeInt32Size(1, roomID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getKeyBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, error_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoomOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseFindRoom_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.internal_static_com_xinqihd_sns_gameserver_proto_BseFindRoom_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom.newBuilder()
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
        roomID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        error_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom result = new com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.roomID_ = roomID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.key_ = key_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.error_ = error_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom.getDefaultInstance()) return this;
        if (other.hasRoomID()) {
          setRoomID(other.getRoomID());
        }
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasError()) {
          setError(other.getError());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasRoomID()) {
          
          return false;
        }
        if (!hasKey()) {
          
          return false;
        }
        if (!hasError()) {
          
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
              roomID_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              key_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              error_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 roomID = 1 [default = 0];
      private int roomID_ ;
      public boolean hasRoomID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getRoomID() {
        return roomID_;
      }
      public Builder setRoomID(int value) {
        bitField0_ |= 0x00000001;
        roomID_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoomID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        roomID_ = 0;
        onChanged();
        return this;
      }
      
      // required string key = 2;
      private java.lang.Object key_ = "";
      public boolean hasKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setKey(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        key_ = value;
        onChanged();
        return this;
      }
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      void setKey(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        key_ = value;
        onChanged();
      }
      
      // required int32 error = 3;
      private int error_ ;
      public boolean hasError() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getError() {
        return error_;
      }
      public Builder setError(int value) {
        bitField0_ |= 0x00000004;
        error_ = value;
        onChanged();
        return this;
      }
      public Builder clearError() {
        bitField0_ = (bitField0_ & ~0x00000004);
        error_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseFindRoom)
    }
    
    static {
      defaultInstance = new BseFindRoom(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseFindRoom)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseFindRoom_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseFindRoom_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BseFindRoom.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\"<\n\013BseFindRoom\022\021\n\006roomID\030\001" +
      " \002(\005:\0010\022\013\n\003key\030\002 \002(\t\022\r\n\005error\030\003 \002(\005B\022B\020X" +
      "inqiBseFindRoom"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseFindRoom_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseFindRoom_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseFindRoom_descriptor,
              new java.lang.String[] { "RoomID", "Key", "Error", },
              com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseFindRoom.BseFindRoom.Builder.class);
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
