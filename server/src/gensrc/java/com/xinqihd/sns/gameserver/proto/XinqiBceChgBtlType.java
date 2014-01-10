// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceChgBtlType.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceChgBtlType {
  private XinqiBceChgBtlType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceChgBtlTypeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 btlType = 1;
    boolean hasBtlType();
    int getBtlType();
  }
  public static final class BceChgBtlType extends
      com.google.protobuf.GeneratedMessage
      implements BceChgBtlTypeOrBuilder {
    // Use BceChgBtlType.newBuilder() to construct.
    private BceChgBtlType(Builder builder) {
      super(builder);
    }
    private BceChgBtlType(boolean noInit) {}
    
    private static final BceChgBtlType defaultInstance;
    public static BceChgBtlType getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceChgBtlType getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.internal_static_com_xinqihd_sns_gameserver_proto_BceChgBtlType_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.internal_static_com_xinqihd_sns_gameserver_proto_BceChgBtlType_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 btlType = 1;
    public static final int BTLTYPE_FIELD_NUMBER = 1;
    private int btlType_;
    public boolean hasBtlType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getBtlType() {
      return btlType_;
    }
    
    private void initFields() {
      btlType_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasBtlType()) {
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
        output.writeInt32(1, btlType_);
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
          .computeInt32Size(1, btlType_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlTypeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.internal_static_com_xinqihd_sns_gameserver_proto_BceChgBtlType_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.internal_static_com_xinqihd_sns_gameserver_proto_BceChgBtlType_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType.newBuilder()
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
        btlType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType result = new com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.btlType_ = btlType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType.getDefaultInstance()) return this;
        if (other.hasBtlType()) {
          setBtlType(other.getBtlType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasBtlType()) {
          
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
              btlType_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 btlType = 1;
      private int btlType_ ;
      public boolean hasBtlType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getBtlType() {
        return btlType_;
      }
      public Builder setBtlType(int value) {
        bitField0_ |= 0x00000001;
        btlType_ = value;
        onChanged();
        return this;
      }
      public Builder clearBtlType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        btlType_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceChgBtlType)
    }
    
    static {
      defaultInstance = new BceChgBtlType(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceChgBtlType)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceChgBtlType_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceChgBtlType_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BceChgBtlType.proto\022 com.xinqihd.sns.g" +
      "ameserver.proto\" \n\rBceChgBtlType\022\017\n\007btlT" +
      "ype\030\001 \002(\005B\024B\022XinqiBceChgBtlType"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceChgBtlType_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceChgBtlType_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceChgBtlType_descriptor,
              new java.lang.String[] { "BtlType", },
              com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceChgBtlType.BceChgBtlType.Builder.class);
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
