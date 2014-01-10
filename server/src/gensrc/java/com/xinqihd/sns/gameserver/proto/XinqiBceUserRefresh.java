// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceUserRefresh.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceUserRefresh {
  private XinqiBceUserRefresh() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceUserRefreshOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 refreshmode = 1 [default = 1];
    boolean hasRefreshmode();
    int getRefreshmode();
    
    // optional int32 changeflag = 2;
    boolean hasChangeflag();
    int getChangeflag();
    
    // optional string changevalue = 3;
    boolean hasChangevalue();
    String getChangevalue();
  }
  public static final class BceUserRefresh extends
      com.google.protobuf.GeneratedMessage
      implements BceUserRefreshOrBuilder {
    // Use BceUserRefresh.newBuilder() to construct.
    private BceUserRefresh(Builder builder) {
      super(builder);
    }
    private BceUserRefresh(boolean noInit) {}
    
    private static final BceUserRefresh defaultInstance;
    public static BceUserRefresh getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceUserRefresh getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.internal_static_com_xinqihd_sns_gameserver_proto_BceUserRefresh_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.internal_static_com_xinqihd_sns_gameserver_proto_BceUserRefresh_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 refreshmode = 1 [default = 1];
    public static final int REFRESHMODE_FIELD_NUMBER = 1;
    private int refreshmode_;
    public boolean hasRefreshmode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getRefreshmode() {
      return refreshmode_;
    }
    
    // optional int32 changeflag = 2;
    public static final int CHANGEFLAG_FIELD_NUMBER = 2;
    private int changeflag_;
    public boolean hasChangeflag() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getChangeflag() {
      return changeflag_;
    }
    
    // optional string changevalue = 3;
    public static final int CHANGEVALUE_FIELD_NUMBER = 3;
    private java.lang.Object changevalue_;
    public boolean hasChangevalue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getChangevalue() {
      java.lang.Object ref = changevalue_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          changevalue_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getChangevalueBytes() {
      java.lang.Object ref = changevalue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        changevalue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      refreshmode_ = 1;
      changeflag_ = 0;
      changevalue_ = "";
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
        output.writeInt32(1, refreshmode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, changeflag_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getChangevalueBytes());
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
          .computeInt32Size(1, refreshmode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, changeflag_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getChangevalueBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefreshOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.internal_static_com_xinqihd_sns_gameserver_proto_BceUserRefresh_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.internal_static_com_xinqihd_sns_gameserver_proto_BceUserRefresh_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh.newBuilder()
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
        refreshmode_ = 1;
        bitField0_ = (bitField0_ & ~0x00000001);
        changeflag_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        changevalue_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh result = new com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.refreshmode_ = refreshmode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.changeflag_ = changeflag_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.changevalue_ = changevalue_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh.getDefaultInstance()) return this;
        if (other.hasRefreshmode()) {
          setRefreshmode(other.getRefreshmode());
        }
        if (other.hasChangeflag()) {
          setChangeflag(other.getChangeflag());
        }
        if (other.hasChangevalue()) {
          setChangevalue(other.getChangevalue());
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
              refreshmode_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              changeflag_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              changevalue_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 refreshmode = 1 [default = 1];
      private int refreshmode_ = 1;
      public boolean hasRefreshmode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getRefreshmode() {
        return refreshmode_;
      }
      public Builder setRefreshmode(int value) {
        bitField0_ |= 0x00000001;
        refreshmode_ = value;
        onChanged();
        return this;
      }
      public Builder clearRefreshmode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        refreshmode_ = 1;
        onChanged();
        return this;
      }
      
      // optional int32 changeflag = 2;
      private int changeflag_ ;
      public boolean hasChangeflag() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getChangeflag() {
        return changeflag_;
      }
      public Builder setChangeflag(int value) {
        bitField0_ |= 0x00000002;
        changeflag_ = value;
        onChanged();
        return this;
      }
      public Builder clearChangeflag() {
        bitField0_ = (bitField0_ & ~0x00000002);
        changeflag_ = 0;
        onChanged();
        return this;
      }
      
      // optional string changevalue = 3;
      private java.lang.Object changevalue_ = "";
      public boolean hasChangevalue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getChangevalue() {
        java.lang.Object ref = changevalue_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          changevalue_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setChangevalue(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        changevalue_ = value;
        onChanged();
        return this;
      }
      public Builder clearChangevalue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        changevalue_ = getDefaultInstance().getChangevalue();
        onChanged();
        return this;
      }
      void setChangevalue(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        changevalue_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceUserRefresh)
    }
    
    static {
      defaultInstance = new BceUserRefresh(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceUserRefresh)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceUserRefresh_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceUserRefresh_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BceUserRefresh.proto\022 com.xinqihd.sns." +
      "gameserver.proto\"Q\n\016BceUserRefresh\022\026\n\013re" +
      "freshmode\030\001 \001(\005:\0011\022\022\n\nchangeflag\030\002 \001(\005\022\023" +
      "\n\013changevalue\030\003 \001(\tB\025B\023XinqiBceUserRefre" +
      "sh"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceUserRefresh_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceUserRefresh_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceUserRefresh_descriptor,
              new java.lang.String[] { "Refreshmode", "Changeflag", "Changevalue", },
              com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceUserRefresh.BceUserRefresh.Builder.class);
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
