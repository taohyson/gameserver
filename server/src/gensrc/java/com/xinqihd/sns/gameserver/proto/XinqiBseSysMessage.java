// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseSysMessage.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseSysMessage {
  private XinqiBseSysMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseSysMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string message = 1;
    boolean hasMessage();
    String getMessage();
    
    // required .com.xinqihd.sns.gameserver.proto.Action action = 2;
    boolean hasAction();
    com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action getAction();
    
    // optional int32 seconds = 3;
    boolean hasSeconds();
    int getSeconds();
    
    // optional .com.xinqihd.sns.gameserver.proto.Type type = 4 [default = NORMAL];
    boolean hasType();
    com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type getType();
    
    // optional string weibo = 5;
    boolean hasWeibo();
    String getWeibo();
  }
  public static final class BseSysMessage extends
      com.google.protobuf.GeneratedMessage
      implements BseSysMessageOrBuilder {
    // Use BseSysMessage.newBuilder() to construct.
    private BseSysMessage(Builder builder) {
      super(builder);
    }
    private BseSysMessage(boolean noInit) {}
    
    private static final BseSysMessage defaultInstance;
    public static BseSysMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseSysMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.internal_static_com_xinqihd_sns_gameserver_proto_BseSysMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.internal_static_com_xinqihd_sns_gameserver_proto_BseSysMessage_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string message = 1;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private java.lang.Object message_;
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          message_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required .com.xinqihd.sns.gameserver.proto.Action action = 2;
    public static final int ACTION_FIELD_NUMBER = 2;
    private com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action action_;
    public boolean hasAction() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action getAction() {
      return action_;
    }
    
    // optional int32 seconds = 3;
    public static final int SECONDS_FIELD_NUMBER = 3;
    private int seconds_;
    public boolean hasSeconds() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getSeconds() {
      return seconds_;
    }
    
    // optional .com.xinqihd.sns.gameserver.proto.Type type = 4 [default = NORMAL];
    public static final int TYPE_FIELD_NUMBER = 4;
    private com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type getType() {
      return type_;
    }
    
    // optional string weibo = 5;
    public static final int WEIBO_FIELD_NUMBER = 5;
    private java.lang.Object weibo_;
    public boolean hasWeibo() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getWeibo() {
      java.lang.Object ref = weibo_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          weibo_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getWeiboBytes() {
      java.lang.Object ref = weibo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        weibo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      message_ = "";
      action_ = com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action.NOOP;
      seconds_ = 0;
      type_ = com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type.NORMAL;
      weibo_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasMessage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAction()) {
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
        output.writeBytes(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, action_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, seconds_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, type_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getWeiboBytes());
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
          .computeBytesSize(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, action_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, seconds_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, type_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getWeiboBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.internal_static_com_xinqihd_sns_gameserver_proto_BseSysMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.internal_static_com_xinqihd_sns_gameserver_proto_BseSysMessage_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage.newBuilder()
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
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        action_ = com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action.NOOP;
        bitField0_ = (bitField0_ & ~0x00000002);
        seconds_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type.NORMAL;
        bitField0_ = (bitField0_ & ~0x00000008);
        weibo_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage result = new com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.action_ = action_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.seconds_ = seconds_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.weibo_ = weibo_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage.getDefaultInstance()) return this;
        if (other.hasMessage()) {
          setMessage(other.getMessage());
        }
        if (other.hasAction()) {
          setAction(other.getAction());
        }
        if (other.hasSeconds()) {
          setSeconds(other.getSeconds());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasWeibo()) {
          setWeibo(other.getWeibo());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasMessage()) {
          
          return false;
        }
        if (!hasAction()) {
          
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
              message_ = input.readBytes();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action value = com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                action_ = value;
              }
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              seconds_ = input.readInt32();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type value = com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                type_ = value;
              }
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              weibo_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string message = 1;
      private java.lang.Object message_ = "";
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMessage(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
        return this;
      }
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      void setMessage(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
      }
      
      // required .com.xinqihd.sns.gameserver.proto.Action action = 2;
      private com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action action_ = com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action.NOOP;
      public boolean hasAction() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action getAction() {
        return action_;
      }
      public Builder setAction(com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        action_ = value;
        onChanged();
        return this;
      }
      public Builder clearAction() {
        bitField0_ = (bitField0_ & ~0x00000002);
        action_ = com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Action.NOOP;
        onChanged();
        return this;
      }
      
      // optional int32 seconds = 3;
      private int seconds_ ;
      public boolean hasSeconds() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getSeconds() {
        return seconds_;
      }
      public Builder setSeconds(int value) {
        bitField0_ |= 0x00000004;
        seconds_ = value;
        onChanged();
        return this;
      }
      public Builder clearSeconds() {
        bitField0_ = (bitField0_ & ~0x00000004);
        seconds_ = 0;
        onChanged();
        return this;
      }
      
      // optional .com.xinqihd.sns.gameserver.proto.Type type = 4 [default = NORMAL];
      private com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type type_ = com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type.NORMAL;
      public boolean hasType() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type getType() {
        return type_;
      }
      public Builder setType(com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        type_ = com.xinqihd.sns.gameserver.proto.XinqiSysMessage.Type.NORMAL;
        onChanged();
        return this;
      }
      
      // optional string weibo = 5;
      private java.lang.Object weibo_ = "";
      public boolean hasWeibo() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getWeibo() {
        java.lang.Object ref = weibo_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          weibo_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setWeibo(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        weibo_ = value;
        onChanged();
        return this;
      }
      public Builder clearWeibo() {
        bitField0_ = (bitField0_ & ~0x00000010);
        weibo_ = getDefaultInstance().getWeibo();
        onChanged();
        return this;
      }
      void setWeibo(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        weibo_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseSysMessage)
    }
    
    static {
      defaultInstance = new BseSysMessage(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseSysMessage)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseSysMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseSysMessage_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BseSysMessage.proto\022 com.xinqihd.sns.g" +
      "ameserver.proto\032\020SysMessage.proto\"\270\001\n\rBs" +
      "eSysMessage\022\017\n\007message\030\001 \002(\t\0228\n\006action\030\002" +
      " \002(\0162(.com.xinqihd.sns.gameserver.proto." +
      "Action\022\017\n\007seconds\030\003 \001(\005\022<\n\004type\030\004 \001(\0162&." +
      "com.xinqihd.sns.gameserver.proto.Type:\006N" +
      "ORMAL\022\r\n\005weibo\030\005 \001(\tB\024B\022XinqiBseSysMessa" +
      "ge"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseSysMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseSysMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseSysMessage_descriptor,
              new java.lang.String[] { "Message", "Action", "Seconds", "Type", "Weibo", },
              com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseSysMessage.BseSysMessage.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiSysMessage.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
