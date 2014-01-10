// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PickBoxInfo.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiPickBoxInfo {
  private XinqiPickBoxInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PickBoxInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 boxindex = 1 [default = 0];
    boolean hasBoxindex();
    int getBoxindex();
    
    // required int32 tool = 2 [default = 0];
    boolean hasTool();
    int getTool();
    
    // required int32 prop = 3 [default = 0];
    boolean hasProp();
    int getProp();
    
    // required int32 toolpos = 4 [default = 0];
    boolean hasToolpos();
    int getToolpos();
    
    // required int32 time = 5 [default = 0];
    boolean hasTime();
    int getTime();
  }
  public static final class PickBoxInfo extends
      com.google.protobuf.GeneratedMessage
      implements PickBoxInfoOrBuilder {
    // Use PickBoxInfo.newBuilder() to construct.
    private PickBoxInfo(Builder builder) {
      super(builder);
    }
    private PickBoxInfo(boolean noInit) {}
    
    private static final PickBoxInfo defaultInstance;
    public static PickBoxInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public PickBoxInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.internal_static_com_xinqihd_sns_gameserver_proto_PickBoxInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.internal_static_com_xinqihd_sns_gameserver_proto_PickBoxInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 boxindex = 1 [default = 0];
    public static final int BOXINDEX_FIELD_NUMBER = 1;
    private int boxindex_;
    public boolean hasBoxindex() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getBoxindex() {
      return boxindex_;
    }
    
    // required int32 tool = 2 [default = 0];
    public static final int TOOL_FIELD_NUMBER = 2;
    private int tool_;
    public boolean hasTool() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getTool() {
      return tool_;
    }
    
    // required int32 prop = 3 [default = 0];
    public static final int PROP_FIELD_NUMBER = 3;
    private int prop_;
    public boolean hasProp() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getProp() {
      return prop_;
    }
    
    // required int32 toolpos = 4 [default = 0];
    public static final int TOOLPOS_FIELD_NUMBER = 4;
    private int toolpos_;
    public boolean hasToolpos() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getToolpos() {
      return toolpos_;
    }
    
    // required int32 time = 5 [default = 0];
    public static final int TIME_FIELD_NUMBER = 5;
    private int time_;
    public boolean hasTime() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getTime() {
      return time_;
    }
    
    private void initFields() {
      boxindex_ = 0;
      tool_ = 0;
      prop_ = 0;
      toolpos_ = 0;
      time_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasBoxindex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTool()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasProp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasToolpos()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTime()) {
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
        output.writeInt32(1, boxindex_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, tool_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, prop_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, toolpos_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, time_);
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
          .computeInt32Size(1, boxindex_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, tool_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, prop_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, toolpos_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, time_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.internal_static_com_xinqihd_sns_gameserver_proto_PickBoxInfo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.internal_static_com_xinqihd_sns_gameserver_proto_PickBoxInfo_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo.newBuilder()
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
        boxindex_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        tool_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        prop_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        toolpos_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        time_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo build() {
        com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo result = new com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.boxindex_ = boxindex_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.tool_ = tool_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.prop_ = prop_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.toolpos_ = toolpos_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.time_ = time_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo.getDefaultInstance()) return this;
        if (other.hasBoxindex()) {
          setBoxindex(other.getBoxindex());
        }
        if (other.hasTool()) {
          setTool(other.getTool());
        }
        if (other.hasProp()) {
          setProp(other.getProp());
        }
        if (other.hasToolpos()) {
          setToolpos(other.getToolpos());
        }
        if (other.hasTime()) {
          setTime(other.getTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasBoxindex()) {
          
          return false;
        }
        if (!hasTool()) {
          
          return false;
        }
        if (!hasProp()) {
          
          return false;
        }
        if (!hasToolpos()) {
          
          return false;
        }
        if (!hasTime()) {
          
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
              boxindex_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              tool_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              prop_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              toolpos_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              time_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 boxindex = 1 [default = 0];
      private int boxindex_ ;
      public boolean hasBoxindex() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getBoxindex() {
        return boxindex_;
      }
      public Builder setBoxindex(int value) {
        bitField0_ |= 0x00000001;
        boxindex_ = value;
        onChanged();
        return this;
      }
      public Builder clearBoxindex() {
        bitField0_ = (bitField0_ & ~0x00000001);
        boxindex_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 tool = 2 [default = 0];
      private int tool_ ;
      public boolean hasTool() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getTool() {
        return tool_;
      }
      public Builder setTool(int value) {
        bitField0_ |= 0x00000002;
        tool_ = value;
        onChanged();
        return this;
      }
      public Builder clearTool() {
        bitField0_ = (bitField0_ & ~0x00000002);
        tool_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 prop = 3 [default = 0];
      private int prop_ ;
      public boolean hasProp() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getProp() {
        return prop_;
      }
      public Builder setProp(int value) {
        bitField0_ |= 0x00000004;
        prop_ = value;
        onChanged();
        return this;
      }
      public Builder clearProp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        prop_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 toolpos = 4 [default = 0];
      private int toolpos_ ;
      public boolean hasToolpos() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getToolpos() {
        return toolpos_;
      }
      public Builder setToolpos(int value) {
        bitField0_ |= 0x00000008;
        toolpos_ = value;
        onChanged();
        return this;
      }
      public Builder clearToolpos() {
        bitField0_ = (bitField0_ & ~0x00000008);
        toolpos_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 time = 5 [default = 0];
      private int time_ ;
      public boolean hasTime() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getTime() {
        return time_;
      }
      public Builder setTime(int value) {
        bitField0_ |= 0x00000010;
        time_ = value;
        onChanged();
        return this;
      }
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        time_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.PickBoxInfo)
    }
    
    static {
      defaultInstance = new PickBoxInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.PickBoxInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_PickBoxInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_PickBoxInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PickBoxInfo.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\"i\n\013PickBoxInfo\022\023\n\010boxindex" +
      "\030\001 \002(\005:\0010\022\017\n\004tool\030\002 \002(\005:\0010\022\017\n\004prop\030\003 \002(\005" +
      ":\0010\022\022\n\007toolpos\030\004 \002(\005:\0010\022\017\n\004time\030\005 \002(\005:\0010" +
      "B\022B\020XinqiPickBoxInfo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_PickBoxInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_PickBoxInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_PickBoxInfo_descriptor,
              new java.lang.String[] { "Boxindex", "Tool", "Prop", "Toolpos", "Time", },
              com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo.class,
              com.xinqihd.sns.gameserver.proto.XinqiPickBoxInfo.PickBoxInfo.Builder.class);
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
