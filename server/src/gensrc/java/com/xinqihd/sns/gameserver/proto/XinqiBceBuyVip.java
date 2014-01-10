// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceBuyVip.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceBuyVip {
  private XinqiBceBuyVip() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceBuyVipOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required uint32 month = 1;
    boolean hasMonth();
    int getMonth();
    
    // required int32 payType = 2;
    boolean hasPayType();
    int getPayType();
  }
  public static final class BceBuyVip extends
      com.google.protobuf.GeneratedMessage
      implements BceBuyVipOrBuilder {
    // Use BceBuyVip.newBuilder() to construct.
    private BceBuyVip(Builder builder) {
      super(builder);
    }
    private BceBuyVip(boolean noInit) {}
    
    private static final BceBuyVip defaultInstance;
    public static BceBuyVip getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceBuyVip getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.internal_static_com_xinqihd_sns_gameserver_proto_BceBuyVip_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.internal_static_com_xinqihd_sns_gameserver_proto_BceBuyVip_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required uint32 month = 1;
    public static final int MONTH_FIELD_NUMBER = 1;
    private int month_;
    public boolean hasMonth() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getMonth() {
      return month_;
    }
    
    // required int32 payType = 2;
    public static final int PAYTYPE_FIELD_NUMBER = 2;
    private int payType_;
    public boolean hasPayType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getPayType() {
      return payType_;
    }
    
    private void initFields() {
      month_ = 0;
      payType_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasMonth()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPayType()) {
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
        output.writeUInt32(1, month_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, payType_);
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
          .computeUInt32Size(1, month_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, payType_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVipOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.internal_static_com_xinqihd_sns_gameserver_proto_BceBuyVip_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.internal_static_com_xinqihd_sns_gameserver_proto_BceBuyVip_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip.newBuilder()
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
        month_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        payType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip result = new com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.month_ = month_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.payType_ = payType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip.getDefaultInstance()) return this;
        if (other.hasMonth()) {
          setMonth(other.getMonth());
        }
        if (other.hasPayType()) {
          setPayType(other.getPayType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasMonth()) {
          
          return false;
        }
        if (!hasPayType()) {
          
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
              month_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              payType_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required uint32 month = 1;
      private int month_ ;
      public boolean hasMonth() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getMonth() {
        return month_;
      }
      public Builder setMonth(int value) {
        bitField0_ |= 0x00000001;
        month_ = value;
        onChanged();
        return this;
      }
      public Builder clearMonth() {
        bitField0_ = (bitField0_ & ~0x00000001);
        month_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 payType = 2;
      private int payType_ ;
      public boolean hasPayType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getPayType() {
        return payType_;
      }
      public Builder setPayType(int value) {
        bitField0_ |= 0x00000002;
        payType_ = value;
        onChanged();
        return this;
      }
      public Builder clearPayType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        payType_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceBuyVip)
    }
    
    static {
      defaultInstance = new BceBuyVip(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceBuyVip)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceBuyVip_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceBuyVip_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017BceBuyVip.proto\022 com.xinqihd.sns.games" +
      "erver.proto\"+\n\tBceBuyVip\022\r\n\005month\030\001 \002(\r\022" +
      "\017\n\007payType\030\002 \002(\005B\020B\016XinqiBceBuyVip"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceBuyVip_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceBuyVip_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceBuyVip_descriptor,
              new java.lang.String[] { "Month", "PayType", },
              com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceBuyVip.BceBuyVip.Builder.class);
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
