// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseFriendList.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseFriendList {
  private XinqiBseFriendList() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseFriendListOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 type = 1;
    boolean hasType();
    int getType();
    
    // repeated .com.xinqihd.sns.gameserver.proto.FriendInfoLite friendList = 2;
    java.util.List<com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite> 
        getFriendListList();
    com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite getFriendList(int index);
    int getFriendListCount();
    java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLiteOrBuilder> 
        getFriendListOrBuilderList();
    com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLiteOrBuilder getFriendListOrBuilder(
        int index);
  }
  public static final class BseFriendList extends
      com.google.protobuf.GeneratedMessage
      implements BseFriendListOrBuilder {
    // Use BseFriendList.newBuilder() to construct.
    private BseFriendList(Builder builder) {
      super(builder);
    }
    private BseFriendList(boolean noInit) {}
    
    private static final BseFriendList defaultInstance;
    public static BseFriendList getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseFriendList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.internal_static_com_xinqihd_sns_gameserver_proto_BseFriendList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.internal_static_com_xinqihd_sns_gameserver_proto_BseFriendList_fieldAccessorTable;
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
    
    // repeated .com.xinqihd.sns.gameserver.proto.FriendInfoLite friendList = 2;
    public static final int FRIENDLIST_FIELD_NUMBER = 2;
    private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite> friendList_;
    public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite> getFriendListList() {
      return friendList_;
    }
    public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLiteOrBuilder> 
        getFriendListOrBuilderList() {
      return friendList_;
    }
    public int getFriendListCount() {
      return friendList_.size();
    }
    public com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite getFriendList(int index) {
      return friendList_.get(index);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLiteOrBuilder getFriendListOrBuilder(
        int index) {
      return friendList_.get(index);
    }
    
    private void initFields() {
      type_ = 0;
      friendList_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getFriendListCount(); i++) {
        if (!getFriendList(i).isInitialized()) {
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
      for (int i = 0; i < friendList_.size(); i++) {
        output.writeMessage(2, friendList_.get(i));
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
      for (int i = 0; i < friendList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, friendList_.get(i));
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.internal_static_com_xinqihd_sns_gameserver_proto_BseFriendList_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.internal_static_com_xinqihd_sns_gameserver_proto_BseFriendList_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getFriendListFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (friendListBuilder_ == null) {
          friendList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          friendListBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList result = new com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (friendListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            friendList_ = java.util.Collections.unmodifiableList(friendList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.friendList_ = friendList_;
        } else {
          result.friendList_ = friendListBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (friendListBuilder_ == null) {
          if (!other.friendList_.isEmpty()) {
            if (friendList_.isEmpty()) {
              friendList_ = other.friendList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureFriendListIsMutable();
              friendList_.addAll(other.friendList_);
            }
            onChanged();
          }
        } else {
          if (!other.friendList_.isEmpty()) {
            if (friendListBuilder_.isEmpty()) {
              friendListBuilder_.dispose();
              friendListBuilder_ = null;
              friendList_ = other.friendList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              friendListBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getFriendListFieldBuilder() : null;
            } else {
              friendListBuilder_.addAllMessages(other.friendList_);
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
        for (int i = 0; i < getFriendListCount(); i++) {
          if (!getFriendList(i).isInitialized()) {
            
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
            case 18: {
              com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addFriendList(subBuilder.buildPartial());
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
      
      // repeated .com.xinqihd.sns.gameserver.proto.FriendInfoLite friendList = 2;
      private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite> friendList_ =
        java.util.Collections.emptyList();
      private void ensureFriendListIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          friendList_ = new java.util.ArrayList<com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite>(friendList_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite, com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.Builder, com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLiteOrBuilder> friendListBuilder_;
      
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite> getFriendListList() {
        if (friendListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(friendList_);
        } else {
          return friendListBuilder_.getMessageList();
        }
      }
      public int getFriendListCount() {
        if (friendListBuilder_ == null) {
          return friendList_.size();
        } else {
          return friendListBuilder_.getCount();
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite getFriendList(int index) {
        if (friendListBuilder_ == null) {
          return friendList_.get(index);
        } else {
          return friendListBuilder_.getMessage(index);
        }
      }
      public Builder setFriendList(
          int index, com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite value) {
        if (friendListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFriendListIsMutable();
          friendList_.set(index, value);
          onChanged();
        } else {
          friendListBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setFriendList(
          int index, com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.Builder builderForValue) {
        if (friendListBuilder_ == null) {
          ensureFriendListIsMutable();
          friendList_.set(index, builderForValue.build());
          onChanged();
        } else {
          friendListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addFriendList(com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite value) {
        if (friendListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFriendListIsMutable();
          friendList_.add(value);
          onChanged();
        } else {
          friendListBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addFriendList(
          int index, com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite value) {
        if (friendListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFriendListIsMutable();
          friendList_.add(index, value);
          onChanged();
        } else {
          friendListBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addFriendList(
          com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.Builder builderForValue) {
        if (friendListBuilder_ == null) {
          ensureFriendListIsMutable();
          friendList_.add(builderForValue.build());
          onChanged();
        } else {
          friendListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addFriendList(
          int index, com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.Builder builderForValue) {
        if (friendListBuilder_ == null) {
          ensureFriendListIsMutable();
          friendList_.add(index, builderForValue.build());
          onChanged();
        } else {
          friendListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllFriendList(
          java.lang.Iterable<? extends com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite> values) {
        if (friendListBuilder_ == null) {
          ensureFriendListIsMutable();
          super.addAll(values, friendList_);
          onChanged();
        } else {
          friendListBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearFriendList() {
        if (friendListBuilder_ == null) {
          friendList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          friendListBuilder_.clear();
        }
        return this;
      }
      public Builder removeFriendList(int index) {
        if (friendListBuilder_ == null) {
          ensureFriendListIsMutable();
          friendList_.remove(index);
          onChanged();
        } else {
          friendListBuilder_.remove(index);
        }
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.Builder getFriendListBuilder(
          int index) {
        return getFriendListFieldBuilder().getBuilder(index);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLiteOrBuilder getFriendListOrBuilder(
          int index) {
        if (friendListBuilder_ == null) {
          return friendList_.get(index);  } else {
          return friendListBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLiteOrBuilder> 
           getFriendListOrBuilderList() {
        if (friendListBuilder_ != null) {
          return friendListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(friendList_);
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.Builder addFriendListBuilder() {
        return getFriendListFieldBuilder().addBuilder(
            com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.getDefaultInstance());
      }
      public com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.Builder addFriendListBuilder(
          int index) {
        return getFriendListFieldBuilder().addBuilder(
            index, com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.getDefaultInstance());
      }
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.Builder> 
           getFriendListBuilderList() {
        return getFriendListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite, com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.Builder, com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLiteOrBuilder> 
          getFriendListFieldBuilder() {
        if (friendListBuilder_ == null) {
          friendListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite, com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLite.Builder, com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.FriendInfoLiteOrBuilder>(
                  friendList_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          friendList_ = null;
        }
        return friendListBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseFriendList)
    }
    
    static {
      defaultInstance = new BseFriendList(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseFriendList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseFriendList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseFriendList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BseFriendList.proto\022 com.xinqihd.sns.g" +
      "ameserver.proto\032\024FriendInfoLite.proto\"c\n" +
      "\rBseFriendList\022\014\n\004type\030\001 \002(\005\022D\n\nfriendLi" +
      "st\030\002 \003(\01320.com.xinqihd.sns.gameserver.pr" +
      "oto.FriendInfoLiteB\024B\022XinqiBseFriendList"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseFriendList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseFriendList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseFriendList_descriptor,
              new java.lang.String[] { "Type", "FriendList", },
              com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseFriendList.BseFriendList.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiFriendInfoLite.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
