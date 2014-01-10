// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseGuildPosChange.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseGuildPosChange {
  private XinqiBseGuildPosChange() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseGuildPosChangeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 result = 1;
    boolean hasResult();
    int getResult();
    
    // optional .com.xinqihd.sns.gameserver.proto.GuildInfo guildInfo = 2;
    boolean hasGuildInfo();
    com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo getGuildInfo();
    com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfoOrBuilder getGuildInfoOrBuilder();
  }
  public static final class BseGuildPosChange extends
      com.google.protobuf.GeneratedMessage
      implements BseGuildPosChangeOrBuilder {
    // Use BseGuildPosChange.newBuilder() to construct.
    private BseGuildPosChange(Builder builder) {
      super(builder);
    }
    private BseGuildPosChange(boolean noInit) {}
    
    private static final BseGuildPosChange defaultInstance;
    public static BseGuildPosChange getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseGuildPosChange getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildPosChange_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildPosChange_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 result = 1;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getResult() {
      return result_;
    }
    
    // optional .com.xinqihd.sns.gameserver.proto.GuildInfo guildInfo = 2;
    public static final int GUILDINFO_FIELD_NUMBER = 2;
    private com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo guildInfo_;
    public boolean hasGuildInfo() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo getGuildInfo() {
      return guildInfo_;
    }
    public com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfoOrBuilder getGuildInfoOrBuilder() {
      return guildInfo_;
    }
    
    private void initFields() {
      result_ = 0;
      guildInfo_ = com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasResult()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasGuildInfo()) {
        if (!getGuildInfo().isInitialized()) {
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
        output.writeInt32(1, result_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, guildInfo_);
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
          .computeInt32Size(1, result_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, guildInfo_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildPosChange_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildPosChange_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getGuildInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        result_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (guildInfoBuilder_ == null) {
          guildInfo_ = com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.getDefaultInstance();
        } else {
          guildInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange result = new com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.result_ = result_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (guildInfoBuilder_ == null) {
          result.guildInfo_ = guildInfo_;
        } else {
          result.guildInfo_ = guildInfoBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange.getDefaultInstance()) return this;
        if (other.hasResult()) {
          setResult(other.getResult());
        }
        if (other.hasGuildInfo()) {
          mergeGuildInfo(other.getGuildInfo());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasResult()) {
          
          return false;
        }
        if (hasGuildInfo()) {
          if (!getGuildInfo().isInitialized()) {
            
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
              result_ = input.readInt32();
              break;
            }
            case 18: {
              com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.newBuilder();
              if (hasGuildInfo()) {
                subBuilder.mergeFrom(getGuildInfo());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setGuildInfo(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 result = 1;
      private int result_ ;
      public boolean hasResult() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getResult() {
        return result_;
      }
      public Builder setResult(int value) {
        bitField0_ |= 0x00000001;
        result_ = value;
        onChanged();
        return this;
      }
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000001);
        result_ = 0;
        onChanged();
        return this;
      }
      
      // optional .com.xinqihd.sns.gameserver.proto.GuildInfo guildInfo = 2;
      private com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo guildInfo_ = com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo, com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfoOrBuilder> guildInfoBuilder_;
      public boolean hasGuildInfo() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo getGuildInfo() {
        if (guildInfoBuilder_ == null) {
          return guildInfo_;
        } else {
          return guildInfoBuilder_.getMessage();
        }
      }
      public Builder setGuildInfo(com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo value) {
        if (guildInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          guildInfo_ = value;
          onChanged();
        } else {
          guildInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder setGuildInfo(
          com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.Builder builderForValue) {
        if (guildInfoBuilder_ == null) {
          guildInfo_ = builderForValue.build();
          onChanged();
        } else {
          guildInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder mergeGuildInfo(com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo value) {
        if (guildInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              guildInfo_ != com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.getDefaultInstance()) {
            guildInfo_ =
              com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.newBuilder(guildInfo_).mergeFrom(value).buildPartial();
          } else {
            guildInfo_ = value;
          }
          onChanged();
        } else {
          guildInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder clearGuildInfo() {
        if (guildInfoBuilder_ == null) {
          guildInfo_ = com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.getDefaultInstance();
          onChanged();
        } else {
          guildInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.Builder getGuildInfoBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getGuildInfoFieldBuilder().getBuilder();
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfoOrBuilder getGuildInfoOrBuilder() {
        if (guildInfoBuilder_ != null) {
          return guildInfoBuilder_.getMessageOrBuilder();
        } else {
          return guildInfo_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo, com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfoOrBuilder> 
          getGuildInfoFieldBuilder() {
        if (guildInfoBuilder_ == null) {
          guildInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo, com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.GuildInfoOrBuilder>(
                  guildInfo_,
                  getParentForChildren(),
                  isClean());
          guildInfo_ = null;
        }
        return guildInfoBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseGuildPosChange)
    }
    
    static {
      defaultInstance = new BseGuildPosChange(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseGuildPosChange)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseGuildPosChange_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseGuildPosChange_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BseGuildPosChange.proto\022 com.xinqihd.s" +
      "ns.gameserver.proto\032\017GuildInfo.proto\"c\n\021" +
      "BseGuildPosChange\022\016\n\006result\030\001 \002(\005\022>\n\tgui" +
      "ldInfo\030\002 \001(\0132+.com.xinqihd.sns.gameserve" +
      "r.proto.GuildInfoB\030B\026XinqiBseGuildPosCha" +
      "nge"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseGuildPosChange_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseGuildPosChange_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseGuildPosChange_descriptor,
              new java.lang.String[] { "Result", "GuildInfo", },
              com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseGuildPosChange.BseGuildPosChange.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
