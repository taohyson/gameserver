// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseGuildMemberList.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseGuildMemberList {
  private XinqiBseGuildMemberList() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseGuildMemberListOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .com.xinqihd.sns.gameserver.proto.GuildMember members = 1;
    java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember> 
        getMembersList();
    com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember getMembers(int index);
    int getMembersCount();
    java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMemberOrBuilder> 
        getMembersOrBuilderList();
    com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMemberOrBuilder getMembersOrBuilder(
        int index);
  }
  public static final class BseGuildMemberList extends
      com.google.protobuf.GeneratedMessage
      implements BseGuildMemberListOrBuilder {
    // Use BseGuildMemberList.newBuilder() to construct.
    private BseGuildMemberList(Builder builder) {
      super(builder);
    }
    private BseGuildMemberList(boolean noInit) {}
    
    private static final BseGuildMemberList defaultInstance;
    public static BseGuildMemberList getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseGuildMemberList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildMemberList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildMemberList_fieldAccessorTable;
    }
    
    // repeated .com.xinqihd.sns.gameserver.proto.GuildMember members = 1;
    public static final int MEMBERS_FIELD_NUMBER = 1;
    private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember> members_;
    public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember> getMembersList() {
      return members_;
    }
    public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMemberOrBuilder> 
        getMembersOrBuilderList() {
      return members_;
    }
    public int getMembersCount() {
      return members_.size();
    }
    public com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember getMembers(int index) {
      return members_.get(index);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMemberOrBuilder getMembersOrBuilder(
        int index) {
      return members_.get(index);
    }
    
    private void initFields() {
      members_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < members_.size(); i++) {
        output.writeMessage(1, members_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < members_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, members_.get(i));
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildMemberList_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildMemberList_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getMembersFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (membersBuilder_ == null) {
          members_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          membersBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList result = new com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList(this);
        int from_bitField0_ = bitField0_;
        if (membersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            members_ = java.util.Collections.unmodifiableList(members_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.members_ = members_;
        } else {
          result.members_ = membersBuilder_.build();
        }
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList.getDefaultInstance()) return this;
        if (membersBuilder_ == null) {
          if (!other.members_.isEmpty()) {
            if (members_.isEmpty()) {
              members_ = other.members_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMembersIsMutable();
              members_.addAll(other.members_);
            }
            onChanged();
          }
        } else {
          if (!other.members_.isEmpty()) {
            if (membersBuilder_.isEmpty()) {
              membersBuilder_.dispose();
              membersBuilder_ = null;
              members_ = other.members_;
              bitField0_ = (bitField0_ & ~0x00000001);
              membersBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getMembersFieldBuilder() : null;
            } else {
              membersBuilder_.addAllMessages(other.members_);
            }
          }
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
              com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addMembers(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .com.xinqihd.sns.gameserver.proto.GuildMember members = 1;
      private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember> members_ =
        java.util.Collections.emptyList();
      private void ensureMembersIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          members_ = new java.util.ArrayList<com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember>(members_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember, com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder, com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMemberOrBuilder> membersBuilder_;
      
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember> getMembersList() {
        if (membersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(members_);
        } else {
          return membersBuilder_.getMessageList();
        }
      }
      public int getMembersCount() {
        if (membersBuilder_ == null) {
          return members_.size();
        } else {
          return membersBuilder_.getCount();
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember getMembers(int index) {
        if (membersBuilder_ == null) {
          return members_.get(index);
        } else {
          return membersBuilder_.getMessage(index);
        }
      }
      public Builder setMembers(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember value) {
        if (membersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMembersIsMutable();
          members_.set(index, value);
          onChanged();
        } else {
          membersBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setMembers(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder builderForValue) {
        if (membersBuilder_ == null) {
          ensureMembersIsMutable();
          members_.set(index, builderForValue.build());
          onChanged();
        } else {
          membersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addMembers(com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember value) {
        if (membersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMembersIsMutable();
          members_.add(value);
          onChanged();
        } else {
          membersBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addMembers(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember value) {
        if (membersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMembersIsMutable();
          members_.add(index, value);
          onChanged();
        } else {
          membersBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addMembers(
          com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder builderForValue) {
        if (membersBuilder_ == null) {
          ensureMembersIsMutable();
          members_.add(builderForValue.build());
          onChanged();
        } else {
          membersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addMembers(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder builderForValue) {
        if (membersBuilder_ == null) {
          ensureMembersIsMutable();
          members_.add(index, builderForValue.build());
          onChanged();
        } else {
          membersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllMembers(
          java.lang.Iterable<? extends com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember> values) {
        if (membersBuilder_ == null) {
          ensureMembersIsMutable();
          super.addAll(values, members_);
          onChanged();
        } else {
          membersBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearMembers() {
        if (membersBuilder_ == null) {
          members_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          membersBuilder_.clear();
        }
        return this;
      }
      public Builder removeMembers(int index) {
        if (membersBuilder_ == null) {
          ensureMembersIsMutable();
          members_.remove(index);
          onChanged();
        } else {
          membersBuilder_.remove(index);
        }
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder getMembersBuilder(
          int index) {
        return getMembersFieldBuilder().getBuilder(index);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMemberOrBuilder getMembersOrBuilder(
          int index) {
        if (membersBuilder_ == null) {
          return members_.get(index);  } else {
          return membersBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMemberOrBuilder> 
           getMembersOrBuilderList() {
        if (membersBuilder_ != null) {
          return membersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(members_);
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder addMembersBuilder() {
        return getMembersFieldBuilder().addBuilder(
            com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.getDefaultInstance());
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder addMembersBuilder(
          int index) {
        return getMembersFieldBuilder().addBuilder(
            index, com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.getDefaultInstance());
      }
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder> 
           getMembersBuilderList() {
        return getMembersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember, com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder, com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMemberOrBuilder> 
          getMembersFieldBuilder() {
        if (membersBuilder_ == null) {
          membersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember, com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMember.Builder, com.xinqihd.sns.gameserver.proto.XinqiGuildMember.GuildMemberOrBuilder>(
                  members_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          members_ = null;
        }
        return membersBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseGuildMemberList)
    }
    
    static {
      defaultInstance = new BseGuildMemberList(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseGuildMemberList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseGuildMemberList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseGuildMemberList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030BseGuildMemberList.proto\022 com.xinqihd." +
      "sns.gameserver.proto\032\021GuildMember.proto\"" +
      "T\n\022BseGuildMemberList\022>\n\007members\030\001 \003(\0132-" +
      ".com.xinqihd.sns.gameserver.proto.GuildM" +
      "emberB\031B\027XinqiBseGuildMemberList"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseGuildMemberList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseGuildMemberList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseGuildMemberList_descriptor,
              new java.lang.String[] { "Members", },
              com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseGuildMemberList.BseGuildMemberList.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiGuildMember.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
