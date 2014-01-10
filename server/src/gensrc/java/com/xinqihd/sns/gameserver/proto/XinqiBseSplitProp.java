// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseSplitProp.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseSplitProp {
  private XinqiBseSplitProp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseSplitPropOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 srcPew = 1;
    boolean hasSrcPew();
    int getSrcPew();
    
    // required int32 dstPew = 2;
    boolean hasDstPew();
    int getDstPew();
    
    // required int32 dstCount = 3;
    boolean hasDstCount();
    int getDstCount();
  }
  public static final class BseSplitProp extends
      com.google.protobuf.GeneratedMessage
      implements BseSplitPropOrBuilder {
    // Use BseSplitProp.newBuilder() to construct.
    private BseSplitProp(Builder builder) {
      super(builder);
    }
    private BseSplitProp(boolean noInit) {}
    
    private static final BseSplitProp defaultInstance;
    public static BseSplitProp getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseSplitProp getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.internal_static_com_xinqihd_sns_gameserver_proto_BseSplitProp_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.internal_static_com_xinqihd_sns_gameserver_proto_BseSplitProp_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 srcPew = 1;
    public static final int SRCPEW_FIELD_NUMBER = 1;
    private int srcPew_;
    public boolean hasSrcPew() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getSrcPew() {
      return srcPew_;
    }
    
    // required int32 dstPew = 2;
    public static final int DSTPEW_FIELD_NUMBER = 2;
    private int dstPew_;
    public boolean hasDstPew() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getDstPew() {
      return dstPew_;
    }
    
    // required int32 dstCount = 3;
    public static final int DSTCOUNT_FIELD_NUMBER = 3;
    private int dstCount_;
    public boolean hasDstCount() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getDstCount() {
      return dstCount_;
    }
    
    private void initFields() {
      srcPew_ = 0;
      dstPew_ = 0;
      dstCount_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSrcPew()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDstPew()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDstCount()) {
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
        output.writeInt32(1, srcPew_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, dstPew_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, dstCount_);
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
          .computeInt32Size(1, srcPew_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, dstPew_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, dstCount_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitPropOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.internal_static_com_xinqihd_sns_gameserver_proto_BseSplitProp_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.internal_static_com_xinqihd_sns_gameserver_proto_BseSplitProp_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp.newBuilder()
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
        srcPew_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        dstPew_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        dstCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp result = new com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.srcPew_ = srcPew_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.dstPew_ = dstPew_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.dstCount_ = dstCount_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp.getDefaultInstance()) return this;
        if (other.hasSrcPew()) {
          setSrcPew(other.getSrcPew());
        }
        if (other.hasDstPew()) {
          setDstPew(other.getDstPew());
        }
        if (other.hasDstCount()) {
          setDstCount(other.getDstCount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSrcPew()) {
          
          return false;
        }
        if (!hasDstPew()) {
          
          return false;
        }
        if (!hasDstCount()) {
          
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
              srcPew_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              dstPew_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              dstCount_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 srcPew = 1;
      private int srcPew_ ;
      public boolean hasSrcPew() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getSrcPew() {
        return srcPew_;
      }
      public Builder setSrcPew(int value) {
        bitField0_ |= 0x00000001;
        srcPew_ = value;
        onChanged();
        return this;
      }
      public Builder clearSrcPew() {
        bitField0_ = (bitField0_ & ~0x00000001);
        srcPew_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 dstPew = 2;
      private int dstPew_ ;
      public boolean hasDstPew() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getDstPew() {
        return dstPew_;
      }
      public Builder setDstPew(int value) {
        bitField0_ |= 0x00000002;
        dstPew_ = value;
        onChanged();
        return this;
      }
      public Builder clearDstPew() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dstPew_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 dstCount = 3;
      private int dstCount_ ;
      public boolean hasDstCount() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getDstCount() {
        return dstCount_;
      }
      public Builder setDstCount(int value) {
        bitField0_ |= 0x00000004;
        dstCount_ = value;
        onChanged();
        return this;
      }
      public Builder clearDstCount() {
        bitField0_ = (bitField0_ & ~0x00000004);
        dstCount_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseSplitProp)
    }
    
    static {
      defaultInstance = new BseSplitProp(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseSplitProp)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseSplitProp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseSplitProp_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022BseSplitProp.proto\022 com.xinqihd.sns.ga" +
      "meserver.proto\"@\n\014BseSplitProp\022\016\n\006srcPew" +
      "\030\001 \002(\005\022\016\n\006dstPew\030\002 \002(\005\022\020\n\010dstCount\030\003 \002(\005" +
      "B\023B\021XinqiBseSplitProp"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseSplitProp_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseSplitProp_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseSplitProp_descriptor,
              new java.lang.String[] { "SrcPew", "DstPew", "DstCount", },
              com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseSplitProp.BseSplitProp.Builder.class);
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