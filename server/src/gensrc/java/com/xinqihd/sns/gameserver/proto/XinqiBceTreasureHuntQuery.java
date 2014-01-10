// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceTreasureHuntQuery.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceTreasureHuntQuery {
  private XinqiBceTreasureHuntQuery() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceTreasureHuntQueryOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional bool refresh = 1 [default = false];
    boolean hasRefresh();
    boolean getRefresh();
  }
  public static final class BceTreasureHuntQuery extends
      com.google.protobuf.GeneratedMessage
      implements BceTreasureHuntQueryOrBuilder {
    // Use BceTreasureHuntQuery.newBuilder() to construct.
    private BceTreasureHuntQuery(Builder builder) {
      super(builder);
    }
    private BceTreasureHuntQuery(boolean noInit) {}
    
    private static final BceTreasureHuntQuery defaultInstance;
    public static BceTreasureHuntQuery getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceTreasureHuntQuery getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.internal_static_com_xinqihd_sns_gameserver_proto_BceTreasureHuntQuery_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.internal_static_com_xinqihd_sns_gameserver_proto_BceTreasureHuntQuery_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional bool refresh = 1 [default = false];
    public static final int REFRESH_FIELD_NUMBER = 1;
    private boolean refresh_;
    public boolean hasRefresh() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getRefresh() {
      return refresh_;
    }
    
    private void initFields() {
      refresh_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, refresh_);
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
          .computeBoolSize(1, refresh_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQueryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.internal_static_com_xinqihd_sns_gameserver_proto_BceTreasureHuntQuery_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.internal_static_com_xinqihd_sns_gameserver_proto_BceTreasureHuntQuery_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery.newBuilder()
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
        refresh_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery result = new com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.refresh_ = refresh_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery.getDefaultInstance()) return this;
        if (other.hasRefresh()) {
          setRefresh(other.getRefresh());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
              refresh_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional bool refresh = 1 [default = false];
      private boolean refresh_ ;
      public boolean hasRefresh() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getRefresh() {
        return refresh_;
      }
      public Builder setRefresh(boolean value) {
        bitField0_ |= 0x00000001;
        refresh_ = value;
        onChanged();
        return this;
      }
      public Builder clearRefresh() {
        bitField0_ = (bitField0_ & ~0x00000001);
        refresh_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceTreasureHuntQuery)
    }
    
    static {
      defaultInstance = new BceTreasureHuntQuery(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceTreasureHuntQuery)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceTreasureHuntQuery_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceTreasureHuntQuery_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032BceTreasureHuntQuery.proto\022 com.xinqih" +
      "d.sns.gameserver.proto\".\n\024BceTreasureHun" +
      "tQuery\022\026\n\007refresh\030\001 \001(\010:\005falseB\033B\031XinqiB" +
      "ceTreasureHuntQuery"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceTreasureHuntQuery_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceTreasureHuntQuery_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceTreasureHuntQuery_descriptor,
              new java.lang.String[] { "Refresh", },
              com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceTreasureHuntQuery.BceTreasureHuntQuery.Builder.class);
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
