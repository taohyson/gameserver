// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceMailSend.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceMailSend {
  private XinqiBceMailSend() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceMailSendOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .com.xinqihd.sns.gameserver.proto.MailData mail = 1;
    boolean hasMail();
    com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData getMail();
    com.xinqihd.sns.gameserver.proto.XinqiMailData.MailDataOrBuilder getMailOrBuilder();
  }
  public static final class BceMailSend extends
      com.google.protobuf.GeneratedMessage
      implements BceMailSendOrBuilder {
    // Use BceMailSend.newBuilder() to construct.
    private BceMailSend(Builder builder) {
      super(builder);
    }
    private BceMailSend(boolean noInit) {}
    
    private static final BceMailSend defaultInstance;
    public static BceMailSend getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceMailSend getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.internal_static_com_xinqihd_sns_gameserver_proto_BceMailSend_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.internal_static_com_xinqihd_sns_gameserver_proto_BceMailSend_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .com.xinqihd.sns.gameserver.proto.MailData mail = 1;
    public static final int MAIL_FIELD_NUMBER = 1;
    private com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData mail_;
    public boolean hasMail() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData getMail() {
      return mail_;
    }
    public com.xinqihd.sns.gameserver.proto.XinqiMailData.MailDataOrBuilder getMailOrBuilder() {
      return mail_;
    }
    
    private void initFields() {
      mail_ = com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasMail()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getMail().isInitialized()) {
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
        output.writeMessage(1, mail_);
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
          .computeMessageSize(1, mail_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSendOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.internal_static_com_xinqihd_sns_gameserver_proto_BceMailSend_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.internal_static_com_xinqihd_sns_gameserver_proto_BceMailSend_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getMailFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (mailBuilder_ == null) {
          mail_ = com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.getDefaultInstance();
        } else {
          mailBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend result = new com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (mailBuilder_ == null) {
          result.mail_ = mail_;
        } else {
          result.mail_ = mailBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend.getDefaultInstance()) return this;
        if (other.hasMail()) {
          mergeMail(other.getMail());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasMail()) {
          
          return false;
        }
        if (!getMail().isInitialized()) {
          
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
              com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.newBuilder();
              if (hasMail()) {
                subBuilder.mergeFrom(getMail());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setMail(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .com.xinqihd.sns.gameserver.proto.MailData mail = 1;
      private com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData mail_ = com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData, com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.Builder, com.xinqihd.sns.gameserver.proto.XinqiMailData.MailDataOrBuilder> mailBuilder_;
      public boolean hasMail() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData getMail() {
        if (mailBuilder_ == null) {
          return mail_;
        } else {
          return mailBuilder_.getMessage();
        }
      }
      public Builder setMail(com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData value) {
        if (mailBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mail_ = value;
          onChanged();
        } else {
          mailBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setMail(
          com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.Builder builderForValue) {
        if (mailBuilder_ == null) {
          mail_ = builderForValue.build();
          onChanged();
        } else {
          mailBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergeMail(com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData value) {
        if (mailBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              mail_ != com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.getDefaultInstance()) {
            mail_ =
              com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.newBuilder(mail_).mergeFrom(value).buildPartial();
          } else {
            mail_ = value;
          }
          onChanged();
        } else {
          mailBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearMail() {
        if (mailBuilder_ == null) {
          mail_ = com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.getDefaultInstance();
          onChanged();
        } else {
          mailBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.Builder getMailBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMailFieldBuilder().getBuilder();
      }
      public com.xinqihd.sns.gameserver.proto.XinqiMailData.MailDataOrBuilder getMailOrBuilder() {
        if (mailBuilder_ != null) {
          return mailBuilder_.getMessageOrBuilder();
        } else {
          return mail_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData, com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.Builder, com.xinqihd.sns.gameserver.proto.XinqiMailData.MailDataOrBuilder> 
          getMailFieldBuilder() {
        if (mailBuilder_ == null) {
          mailBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData, com.xinqihd.sns.gameserver.proto.XinqiMailData.MailData.Builder, com.xinqihd.sns.gameserver.proto.XinqiMailData.MailDataOrBuilder>(
                  mail_,
                  getParentForChildren(),
                  isClean());
          mail_ = null;
        }
        return mailBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceMailSend)
    }
    
    static {
      defaultInstance = new BceMailSend(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceMailSend)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceMailSend_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceMailSend_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BceMailSend.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\032\016MailData.proto\"G\n\013BceMail" +
      "Send\0228\n\004mail\030\001 \002(\0132*.com.xinqihd.sns.gam" +
      "eserver.proto.MailDataB\022B\020XinqiBceMailSe" +
      "nd"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceMailSend_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceMailSend_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceMailSend_descriptor,
              new java.lang.String[] { "Mail", },
              com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceMailSend.BceMailSend.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiMailData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
