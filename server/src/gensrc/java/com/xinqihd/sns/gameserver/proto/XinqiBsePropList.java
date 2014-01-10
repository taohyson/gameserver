// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BsePropList.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBsePropList {
  private XinqiBsePropList() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BsePropListOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .com.xinqihd.sns.gameserver.proto.PropData propInfo = 1;
    java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> 
        getPropInfoList();
    com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData getPropInfo(int index);
    int getPropInfoCount();
    java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> 
        getPropInfoOrBuilderList();
    com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder getPropInfoOrBuilder(
        int index);
  }
  public static final class BsePropList extends
      com.google.protobuf.GeneratedMessage
      implements BsePropListOrBuilder {
    // Use BsePropList.newBuilder() to construct.
    private BsePropList(Builder builder) {
      super(builder);
    }
    private BsePropList(boolean noInit) {}
    
    private static final BsePropList defaultInstance;
    public static BsePropList getDefaultInstance() {
      return defaultInstance;
    }
    
    public BsePropList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBsePropList.internal_static_com_xinqihd_sns_gameserver_proto_BsePropList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBsePropList.internal_static_com_xinqihd_sns_gameserver_proto_BsePropList_fieldAccessorTable;
    }
    
    // repeated .com.xinqihd.sns.gameserver.proto.PropData propInfo = 1;
    public static final int PROPINFO_FIELD_NUMBER = 1;
    private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> propInfo_;
    public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> getPropInfoList() {
      return propInfo_;
    }
    public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> 
        getPropInfoOrBuilderList() {
      return propInfo_;
    }
    public int getPropInfoCount() {
      return propInfo_.size();
    }
    public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData getPropInfo(int index) {
      return propInfo_.get(index);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder getPropInfoOrBuilder(
        int index) {
      return propInfo_.get(index);
    }
    
    private void initFields() {
      propInfo_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      for (int i = 0; i < getPropInfoCount(); i++) {
        if (!getPropInfo(i).isInitialized()) {
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
      for (int i = 0; i < propInfo_.size(); i++) {
        output.writeMessage(1, propInfo_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < propInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, propInfo_.get(i));
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBsePropList.internal_static_com_xinqihd_sns_gameserver_proto_BsePropList_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBsePropList.internal_static_com_xinqihd_sns_gameserver_proto_BsePropList_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPropInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (propInfoBuilder_ == null) {
          propInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          propInfoBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList build() {
        com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList result = new com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList(this);
        int from_bitField0_ = bitField0_;
        if (propInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            propInfo_ = java.util.Collections.unmodifiableList(propInfo_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.propInfo_ = propInfo_;
        } else {
          result.propInfo_ = propInfoBuilder_.build();
        }
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList.getDefaultInstance()) return this;
        if (propInfoBuilder_ == null) {
          if (!other.propInfo_.isEmpty()) {
            if (propInfo_.isEmpty()) {
              propInfo_ = other.propInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePropInfoIsMutable();
              propInfo_.addAll(other.propInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.propInfo_.isEmpty()) {
            if (propInfoBuilder_.isEmpty()) {
              propInfoBuilder_.dispose();
              propInfoBuilder_ = null;
              propInfo_ = other.propInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
              propInfoBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPropInfoFieldBuilder() : null;
            } else {
              propInfoBuilder_.addAllMessages(other.propInfo_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        for (int i = 0; i < getPropInfoCount(); i++) {
          if (!getPropInfo(i).isInitialized()) {
            
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
            case 10: {
              com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addPropInfo(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .com.xinqihd.sns.gameserver.proto.PropData propInfo = 1;
      private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> propInfo_ =
        java.util.Collections.emptyList();
      private void ensurePropInfoIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          propInfo_ = new java.util.ArrayList<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData>(propInfo_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> propInfoBuilder_;
      
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> getPropInfoList() {
        if (propInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(propInfo_);
        } else {
          return propInfoBuilder_.getMessageList();
        }
      }
      public int getPropInfoCount() {
        if (propInfoBuilder_ == null) {
          return propInfo_.size();
        } else {
          return propInfoBuilder_.getCount();
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData getPropInfo(int index) {
        if (propInfoBuilder_ == null) {
          return propInfo_.get(index);
        } else {
          return propInfoBuilder_.getMessage(index);
        }
      }
      public Builder setPropInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData value) {
        if (propInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropInfoIsMutable();
          propInfo_.set(index, value);
          onChanged();
        } else {
          propInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setPropInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder builderForValue) {
        if (propInfoBuilder_ == null) {
          ensurePropInfoIsMutable();
          propInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          propInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addPropInfo(com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData value) {
        if (propInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropInfoIsMutable();
          propInfo_.add(value);
          onChanged();
        } else {
          propInfoBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addPropInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData value) {
        if (propInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropInfoIsMutable();
          propInfo_.add(index, value);
          onChanged();
        } else {
          propInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addPropInfo(
          com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder builderForValue) {
        if (propInfoBuilder_ == null) {
          ensurePropInfoIsMutable();
          propInfo_.add(builderForValue.build());
          onChanged();
        } else {
          propInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addPropInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder builderForValue) {
        if (propInfoBuilder_ == null) {
          ensurePropInfoIsMutable();
          propInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          propInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllPropInfo(
          java.lang.Iterable<? extends com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData> values) {
        if (propInfoBuilder_ == null) {
          ensurePropInfoIsMutable();
          super.addAll(values, propInfo_);
          onChanged();
        } else {
          propInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearPropInfo() {
        if (propInfoBuilder_ == null) {
          propInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          propInfoBuilder_.clear();
        }
        return this;
      }
      public Builder removePropInfo(int index) {
        if (propInfoBuilder_ == null) {
          ensurePropInfoIsMutable();
          propInfo_.remove(index);
          onChanged();
        } else {
          propInfoBuilder_.remove(index);
        }
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder getPropInfoBuilder(
          int index) {
        return getPropInfoFieldBuilder().getBuilder(index);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder getPropInfoOrBuilder(
          int index) {
        if (propInfoBuilder_ == null) {
          return propInfo_.get(index);  } else {
          return propInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> 
           getPropInfoOrBuilderList() {
        if (propInfoBuilder_ != null) {
          return propInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(propInfo_);
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder addPropInfoBuilder() {
        return getPropInfoFieldBuilder().addBuilder(
            com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.getDefaultInstance());
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder addPropInfoBuilder(
          int index) {
        return getPropInfoFieldBuilder().addBuilder(
            index, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.getDefaultInstance());
      }
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder> 
           getPropInfoBuilderList() {
        return getPropInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> 
          getPropInfoFieldBuilder() {
        if (propInfoBuilder_ == null) {
          propInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder>(
                  propInfo_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          propInfo_ = null;
        }
        return propInfoBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BsePropList)
    }
    
    static {
      defaultInstance = new BsePropList(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BsePropList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BsePropList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BsePropList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BsePropList.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\032\016PropData.proto\"K\n\013BseProp" +
      "List\022<\n\010propInfo\030\001 \003(\0132*.com.xinqihd.sns" +
      ".gameserver.proto.PropDataB\022B\020XinqiBsePr" +
      "opList"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BsePropList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BsePropList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BsePropList_descriptor,
              new java.lang.String[] { "PropInfo", },
              com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList.class,
              com.xinqihd.sns.gameserver.proto.XinqiBsePropList.BsePropList.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiPropData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
