// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseShopping.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseShopping {
  private XinqiBseShopping() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseShoppingOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 type = 1;
    boolean hasType();
    int getType();
    
    // required int32 gender = 2;
    boolean hasGender();
    int getGender();
    
    // repeated .com.xinqihd.sns.gameserver.proto.GoodsInfo goodsInfo = 3;
    java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo> 
        getGoodsInfoList();
    com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo getGoodsInfo(int index);
    int getGoodsInfoCount();
    java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfoOrBuilder> 
        getGoodsInfoOrBuilderList();
    com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfoOrBuilder getGoodsInfoOrBuilder(
        int index);
  }
  public static final class BseShopping extends
      com.google.protobuf.GeneratedMessage
      implements BseShoppingOrBuilder {
    // Use BseShopping.newBuilder() to construct.
    private BseShopping(Builder builder) {
      super(builder);
    }
    private BseShopping(boolean noInit) {}
    
    private static final BseShopping defaultInstance;
    public static BseShopping getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseShopping getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseShopping.internal_static_com_xinqihd_sns_gameserver_proto_BseShopping_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseShopping.internal_static_com_xinqihd_sns_gameserver_proto_BseShopping_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getType() {
      return type_;
    }
    
    // required int32 gender = 2;
    public static final int GENDER_FIELD_NUMBER = 2;
    private int gender_;
    public boolean hasGender() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getGender() {
      return gender_;
    }
    
    // repeated .com.xinqihd.sns.gameserver.proto.GoodsInfo goodsInfo = 3;
    public static final int GOODSINFO_FIELD_NUMBER = 3;
    private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo> goodsInfo_;
    public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo> getGoodsInfoList() {
      return goodsInfo_;
    }
    public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfoOrBuilder> 
        getGoodsInfoOrBuilderList() {
      return goodsInfo_;
    }
    public int getGoodsInfoCount() {
      return goodsInfo_.size();
    }
    public com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo getGoodsInfo(int index) {
      return goodsInfo_.get(index);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfoOrBuilder getGoodsInfoOrBuilder(
        int index) {
      return goodsInfo_.get(index);
    }
    
    private void initFields() {
      type_ = 0;
      gender_ = 0;
      goodsInfo_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGender()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getGoodsInfoCount(); i++) {
        if (!getGoodsInfo(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, gender_);
      }
      for (int i = 0; i < goodsInfo_.size(); i++) {
        output.writeMessage(3, goodsInfo_.get(i));
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
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, gender_);
      }
      for (int i = 0; i < goodsInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, goodsInfo_.get(i));
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShoppingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseShopping.internal_static_com_xinqihd_sns_gameserver_proto_BseShopping_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseShopping.internal_static_com_xinqihd_sns_gameserver_proto_BseShopping_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getGoodsInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        gender_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (goodsInfoBuilder_ == null) {
          goodsInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          goodsInfoBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping result = new com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.gender_ = gender_;
        if (goodsInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            goodsInfo_ = java.util.Collections.unmodifiableList(goodsInfo_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.goodsInfo_ = goodsInfo_;
        } else {
          result.goodsInfo_ = goodsInfoBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasGender()) {
          setGender(other.getGender());
        }
        if (goodsInfoBuilder_ == null) {
          if (!other.goodsInfo_.isEmpty()) {
            if (goodsInfo_.isEmpty()) {
              goodsInfo_ = other.goodsInfo_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureGoodsInfoIsMutable();
              goodsInfo_.addAll(other.goodsInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.goodsInfo_.isEmpty()) {
            if (goodsInfoBuilder_.isEmpty()) {
              goodsInfoBuilder_.dispose();
              goodsInfoBuilder_ = null;
              goodsInfo_ = other.goodsInfo_;
              bitField0_ = (bitField0_ & ~0x00000004);
              goodsInfoBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getGoodsInfoFieldBuilder() : null;
            } else {
              goodsInfoBuilder_.addAllMessages(other.goodsInfo_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!hasGender()) {
          
          return false;
        }
        for (int i = 0; i < getGoodsInfoCount(); i++) {
          if (!getGoodsInfo(i).isInitialized()) {
            
            return false;
          }
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
              type_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              gender_ = input.readInt32();
              break;
            }
            case 26: {
              com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addGoodsInfo(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 type = 1;
      private int type_ ;
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getType() {
        return type_;
      }
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 gender = 2;
      private int gender_ ;
      public boolean hasGender() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getGender() {
        return gender_;
      }
      public Builder setGender(int value) {
        bitField0_ |= 0x00000002;
        gender_ = value;
        onChanged();
        return this;
      }
      public Builder clearGender() {
        bitField0_ = (bitField0_ & ~0x00000002);
        gender_ = 0;
        onChanged();
        return this;
      }
      
      // repeated .com.xinqihd.sns.gameserver.proto.GoodsInfo goodsInfo = 3;
      private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo> goodsInfo_ =
        java.util.Collections.emptyList();
      private void ensureGoodsInfoIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          goodsInfo_ = new java.util.ArrayList<com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo>(goodsInfo_);
          bitField0_ |= 0x00000004;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo, com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfoOrBuilder> goodsInfoBuilder_;
      
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo> getGoodsInfoList() {
        if (goodsInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(goodsInfo_);
        } else {
          return goodsInfoBuilder_.getMessageList();
        }
      }
      public int getGoodsInfoCount() {
        if (goodsInfoBuilder_ == null) {
          return goodsInfo_.size();
        } else {
          return goodsInfoBuilder_.getCount();
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo getGoodsInfo(int index) {
        if (goodsInfoBuilder_ == null) {
          return goodsInfo_.get(index);
        } else {
          return goodsInfoBuilder_.getMessage(index);
        }
      }
      public Builder setGoodsInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo value) {
        if (goodsInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGoodsInfoIsMutable();
          goodsInfo_.set(index, value);
          onChanged();
        } else {
          goodsInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setGoodsInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.Builder builderForValue) {
        if (goodsInfoBuilder_ == null) {
          ensureGoodsInfoIsMutable();
          goodsInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          goodsInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addGoodsInfo(com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo value) {
        if (goodsInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGoodsInfoIsMutable();
          goodsInfo_.add(value);
          onChanged();
        } else {
          goodsInfoBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addGoodsInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo value) {
        if (goodsInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGoodsInfoIsMutable();
          goodsInfo_.add(index, value);
          onChanged();
        } else {
          goodsInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addGoodsInfo(
          com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.Builder builderForValue) {
        if (goodsInfoBuilder_ == null) {
          ensureGoodsInfoIsMutable();
          goodsInfo_.add(builderForValue.build());
          onChanged();
        } else {
          goodsInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addGoodsInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.Builder builderForValue) {
        if (goodsInfoBuilder_ == null) {
          ensureGoodsInfoIsMutable();
          goodsInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          goodsInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllGoodsInfo(
          java.lang.Iterable<? extends com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo> values) {
        if (goodsInfoBuilder_ == null) {
          ensureGoodsInfoIsMutable();
          super.addAll(values, goodsInfo_);
          onChanged();
        } else {
          goodsInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearGoodsInfo() {
        if (goodsInfoBuilder_ == null) {
          goodsInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          goodsInfoBuilder_.clear();
        }
        return this;
      }
      public Builder removeGoodsInfo(int index) {
        if (goodsInfoBuilder_ == null) {
          ensureGoodsInfoIsMutable();
          goodsInfo_.remove(index);
          onChanged();
        } else {
          goodsInfoBuilder_.remove(index);
        }
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.Builder getGoodsInfoBuilder(
          int index) {
        return getGoodsInfoFieldBuilder().getBuilder(index);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfoOrBuilder getGoodsInfoOrBuilder(
          int index) {
        if (goodsInfoBuilder_ == null) {
          return goodsInfo_.get(index);  } else {
          return goodsInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfoOrBuilder> 
           getGoodsInfoOrBuilderList() {
        if (goodsInfoBuilder_ != null) {
          return goodsInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(goodsInfo_);
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.Builder addGoodsInfoBuilder() {
        return getGoodsInfoFieldBuilder().addBuilder(
            com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.getDefaultInstance());
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.Builder addGoodsInfoBuilder(
          int index) {
        return getGoodsInfoFieldBuilder().addBuilder(
            index, com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.getDefaultInstance());
      }
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.Builder> 
           getGoodsInfoBuilderList() {
        return getGoodsInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo, com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfoOrBuilder> 
          getGoodsInfoFieldBuilder() {
        if (goodsInfoBuilder_ == null) {
          goodsInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo, com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.GoodsInfoOrBuilder>(
                  goodsInfo_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          goodsInfo_ = null;
        }
        return goodsInfoBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseShopping)
    }
    
    static {
      defaultInstance = new BseShopping(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseShopping)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseShopping_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseShopping_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BseShopping.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\032\017GoodsInfo.proto\"k\n\013BseSho" +
      "pping\022\014\n\004type\030\001 \002(\005\022\016\n\006gender\030\002 \002(\005\022>\n\tg" +
      "oodsInfo\030\003 \003(\0132+.com.xinqihd.sns.gameser" +
      "ver.proto.GoodsInfoB\022B\020XinqiBseShopping"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseShopping_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseShopping_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseShopping_descriptor,
              new java.lang.String[] { "Type", "Gender", "GoodsInfo", },
              com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseShopping.BseShopping.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiGoodsInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
