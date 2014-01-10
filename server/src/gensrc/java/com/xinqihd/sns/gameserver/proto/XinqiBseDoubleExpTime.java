// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseDoubleExpTime.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseDoubleExpTime {
  private XinqiBseDoubleExpTime() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseDoubleExpTimeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 minutes = 1;
    boolean hasMinutes();
    int getMinutes();
  }
  public static final class BseDoubleExpTime extends
      com.google.protobuf.GeneratedMessage
      implements BseDoubleExpTimeOrBuilder {
    // Use BseDoubleExpTime.newBuilder() to construct.
    private BseDoubleExpTime(Builder builder) {
      super(builder);
    }
    private BseDoubleExpTime(boolean noInit) {}
    
    private static final BseDoubleExpTime defaultInstance;
    public static BseDoubleExpTime getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseDoubleExpTime getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.internal_static_com_xinqihd_sns_gameserver_proto_BseDoubleExpTime_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.internal_static_com_xinqihd_sns_gameserver_proto_BseDoubleExpTime_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 minutes = 1;
    public static final int MINUTES_FIELD_NUMBER = 1;
    private int minutes_;
    public boolean hasMinutes() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getMinutes() {
      return minutes_;
    }
    
    private void initFields() {
      minutes_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasMinutes()) {
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
        output.writeInt32(1, minutes_);
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
          .computeInt32Size(1, minutes_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTimeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.internal_static_com_xinqihd_sns_gameserver_proto_BseDoubleExpTime_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.internal_static_com_xinqihd_sns_gameserver_proto_BseDoubleExpTime_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime.newBuilder()
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
        minutes_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime result = new com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.minutes_ = minutes_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime.getDefaultInstance()) return this;
        if (other.hasMinutes()) {
          setMinutes(other.getMinutes());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasMinutes()) {
          
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
              minutes_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 minutes = 1;
      private int minutes_ ;
      public boolean hasMinutes() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getMinutes() {
        return minutes_;
      }
      public Builder setMinutes(int value) {
        bitField0_ |= 0x00000001;
        minutes_ = value;
        onChanged();
        return this;
      }
      public Builder clearMinutes() {
        bitField0_ = (bitField0_ & ~0x00000001);
        minutes_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseDoubleExpTime)
    }
    
    static {
      defaultInstance = new BseDoubleExpTime(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseDoubleExpTime)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseDoubleExpTime_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseDoubleExpTime_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026BseDoubleExpTime.proto\022 com.xinqihd.sn" +
      "s.gameserver.proto\"#\n\020BseDoubleExpTime\022\017" +
      "\n\007minutes\030\001 \002(\005B\027B\025XinqiBseDoubleExpTime"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseDoubleExpTime_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseDoubleExpTime_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseDoubleExpTime_descriptor,
              new java.lang.String[] { "Minutes", },
              com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseDoubleExpTime.BseDoubleExpTime.Builder.class);
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
