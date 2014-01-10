// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceGuildPrivilegeList.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceGuildPrivilegeList {
  private XinqiBceGuildPrivilegeList() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceGuildPrivilegeListOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string guildID = 1;
    boolean hasGuildID();
    String getGuildID();
  }
  public static final class BceGuildPrivilegeList extends
      com.google.protobuf.GeneratedMessage
      implements BceGuildPrivilegeListOrBuilder {
    // Use BceGuildPrivilegeList.newBuilder() to construct.
    private BceGuildPrivilegeList(Builder builder) {
      super(builder);
    }
    private BceGuildPrivilegeList(boolean noInit) {}
    
    private static final BceGuildPrivilegeList defaultInstance;
    public static BceGuildPrivilegeList getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceGuildPrivilegeList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildPrivilegeList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildPrivilegeList_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string guildID = 1;
    public static final int GUILDID_FIELD_NUMBER = 1;
    private java.lang.Object guildID_;
    public boolean hasGuildID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getGuildID() {
      java.lang.Object ref = guildID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          guildID_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getGuildIDBytes() {
      java.lang.Object ref = guildID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        guildID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      guildID_ = "";
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
        output.writeBytes(1, getGuildIDBytes());
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
          .computeBytesSize(1, getGuildIDBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildPrivilegeList_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildPrivilegeList_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList.newBuilder()
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
        guildID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList result = new com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.guildID_ = guildID_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList.getDefaultInstance()) return this;
        if (other.hasGuildID()) {
          setGuildID(other.getGuildID());
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
            case 10: {
              bitField0_ |= 0x00000001;
              guildID_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string guildID = 1;
      private java.lang.Object guildID_ = "";
      public boolean hasGuildID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getGuildID() {
        java.lang.Object ref = guildID_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          guildID_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setGuildID(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        guildID_ = value;
        onChanged();
        return this;
      }
      public Builder clearGuildID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        guildID_ = getDefaultInstance().getGuildID();
        onChanged();
        return this;
      }
      void setGuildID(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        guildID_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceGuildPrivilegeList)
    }
    
    static {
      defaultInstance = new BceGuildPrivilegeList(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceGuildPrivilegeList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceGuildPrivilegeList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceGuildPrivilegeList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033BceGuildPrivilegeList.proto\022 com.xinqi" +
      "hd.sns.gameserver.proto\"(\n\025BceGuildPrivi" +
      "legeList\022\017\n\007guildID\030\001 \001(\tB\034B\032XinqiBceGui" +
      "ldPrivilegeList"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceGuildPrivilegeList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceGuildPrivilegeList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceGuildPrivilegeList_descriptor,
              new java.lang.String[] { "GuildID", },
              com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceGuildPrivilegeList.BceGuildPrivilegeList.Builder.class);
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
