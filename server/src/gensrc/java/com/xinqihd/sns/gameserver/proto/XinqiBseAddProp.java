// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseAddProp.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseAddProp {
  private XinqiBseAddProp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseAddPropOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .com.xinqihd.sns.gameserver.proto.PropData addedProp = 1;
    boolean hasAddedProp();
    com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData getAddedProp();
    com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder getAddedPropOrBuilder();
  }
  public static final class BseAddProp extends
      com.google.protobuf.GeneratedMessage
      implements BseAddPropOrBuilder {
    // Use BseAddProp.newBuilder() to construct.
    private BseAddProp(Builder builder) {
      super(builder);
    }
    private BseAddProp(boolean noInit) {}
    
    private static final BseAddProp defaultInstance;
    public static BseAddProp getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseAddProp getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.internal_static_com_xinqihd_sns_gameserver_proto_BseAddProp_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.internal_static_com_xinqihd_sns_gameserver_proto_BseAddProp_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .com.xinqihd.sns.gameserver.proto.PropData addedProp = 1;
    public static final int ADDEDPROP_FIELD_NUMBER = 1;
    private com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData addedProp_;
    public boolean hasAddedProp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData getAddedProp() {
      return addedProp_;
    }
    public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder getAddedPropOrBuilder() {
      return addedProp_;
    }
    
    private void initFields() {
      addedProp_ = com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasAddedProp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getAddedProp().isInitialized()) {
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
        output.writeMessage(1, addedProp_);
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
          .computeMessageSize(1, addedProp_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddPropOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.internal_static_com_xinqihd_sns_gameserver_proto_BseAddProp_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.internal_static_com_xinqihd_sns_gameserver_proto_BseAddProp_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getAddedPropFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (addedPropBuilder_ == null) {
          addedProp_ = com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.getDefaultInstance();
        } else {
          addedPropBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp result = new com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (addedPropBuilder_ == null) {
          result.addedProp_ = addedProp_;
        } else {
          result.addedProp_ = addedPropBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp.getDefaultInstance()) return this;
        if (other.hasAddedProp()) {
          mergeAddedProp(other.getAddedProp());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasAddedProp()) {
          
          return false;
        }
        if (!getAddedProp().isInitialized()) {
          
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
              com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.newBuilder();
              if (hasAddedProp()) {
                subBuilder.mergeFrom(getAddedProp());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setAddedProp(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .com.xinqihd.sns.gameserver.proto.PropData addedProp = 1;
      private com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData addedProp_ = com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> addedPropBuilder_;
      public boolean hasAddedProp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData getAddedProp() {
        if (addedPropBuilder_ == null) {
          return addedProp_;
        } else {
          return addedPropBuilder_.getMessage();
        }
      }
      public Builder setAddedProp(com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData value) {
        if (addedPropBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          addedProp_ = value;
          onChanged();
        } else {
          addedPropBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setAddedProp(
          com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder builderForValue) {
        if (addedPropBuilder_ == null) {
          addedProp_ = builderForValue.build();
          onChanged();
        } else {
          addedPropBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergeAddedProp(com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData value) {
        if (addedPropBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              addedProp_ != com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.getDefaultInstance()) {
            addedProp_ =
              com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.newBuilder(addedProp_).mergeFrom(value).buildPartial();
          } else {
            addedProp_ = value;
          }
          onChanged();
        } else {
          addedPropBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearAddedProp() {
        if (addedPropBuilder_ == null) {
          addedProp_ = com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.getDefaultInstance();
          onChanged();
        } else {
          addedPropBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder getAddedPropBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getAddedPropFieldBuilder().getBuilder();
      }
      public com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder getAddedPropOrBuilder() {
        if (addedPropBuilder_ != null) {
          return addedPropBuilder_.getMessageOrBuilder();
        } else {
          return addedProp_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder> 
          getAddedPropFieldBuilder() {
        if (addedPropBuilder_ == null) {
          addedPropBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropData.Builder, com.xinqihd.sns.gameserver.proto.XinqiPropData.PropDataOrBuilder>(
                  addedProp_,
                  getParentForChildren(),
                  isClean());
          addedProp_ = null;
        }
        return addedPropBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseAddProp)
    }
    
    static {
      defaultInstance = new BseAddProp(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseAddProp)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseAddProp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseAddProp_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020BseAddProp.proto\022 com.xinqihd.sns.game" +
      "server.proto\032\016PropData.proto\"K\n\nBseAddPr" +
      "op\022=\n\taddedProp\030\001 \002(\0132*.com.xinqihd.sns." +
      "gameserver.proto.PropDataB\021B\017XinqiBseAdd" +
      "Prop"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseAddProp_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseAddProp_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseAddProp_descriptor,
              new java.lang.String[] { "AddedProp", },
              com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseAddProp.BseAddProp.Builder.class);
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
