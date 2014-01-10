// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseMyRankInfo.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseMyRankInfo {
  private XinqiBseMyRankInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseMyRankInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 myRank = 1;
    boolean hasMyRank();
    int getMyRank();
    
    // required int32 myLevel = 2;
    boolean hasMyLevel();
    int getMyLevel();
    
    // optional int32 myPower = 3;
    boolean hasMyPower();
    int getMyPower();
    
    // optional int32 myWealth = 4;
    boolean hasMyWealth();
    int getMyWealth();
    
    // optional int32 myAchievement = 5;
    boolean hasMyAchievement();
    int getMyAchievement();
    
    // optional int32 myMedal = 6;
    boolean hasMyMedal();
    int getMyMedal();
    
    // optional int32 rankChange = 7;
    boolean hasRankChange();
    int getRankChange();
  }
  public static final class BseMyRankInfo extends
      com.google.protobuf.GeneratedMessage
      implements BseMyRankInfoOrBuilder {
    // Use BseMyRankInfo.newBuilder() to construct.
    private BseMyRankInfo(Builder builder) {
      super(builder);
    }
    private BseMyRankInfo(boolean noInit) {}
    
    private static final BseMyRankInfo defaultInstance;
    public static BseMyRankInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseMyRankInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.internal_static_com_xinqihd_sns_gameserver_proto_BseMyRankInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.internal_static_com_xinqihd_sns_gameserver_proto_BseMyRankInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 myRank = 1;
    public static final int MYRANK_FIELD_NUMBER = 1;
    private int myRank_;
    public boolean hasMyRank() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getMyRank() {
      return myRank_;
    }
    
    // required int32 myLevel = 2;
    public static final int MYLEVEL_FIELD_NUMBER = 2;
    private int myLevel_;
    public boolean hasMyLevel() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getMyLevel() {
      return myLevel_;
    }
    
    // optional int32 myPower = 3;
    public static final int MYPOWER_FIELD_NUMBER = 3;
    private int myPower_;
    public boolean hasMyPower() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getMyPower() {
      return myPower_;
    }
    
    // optional int32 myWealth = 4;
    public static final int MYWEALTH_FIELD_NUMBER = 4;
    private int myWealth_;
    public boolean hasMyWealth() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getMyWealth() {
      return myWealth_;
    }
    
    // optional int32 myAchievement = 5;
    public static final int MYACHIEVEMENT_FIELD_NUMBER = 5;
    private int myAchievement_;
    public boolean hasMyAchievement() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getMyAchievement() {
      return myAchievement_;
    }
    
    // optional int32 myMedal = 6;
    public static final int MYMEDAL_FIELD_NUMBER = 6;
    private int myMedal_;
    public boolean hasMyMedal() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getMyMedal() {
      return myMedal_;
    }
    
    // optional int32 rankChange = 7;
    public static final int RANKCHANGE_FIELD_NUMBER = 7;
    private int rankChange_;
    public boolean hasRankChange() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getRankChange() {
      return rankChange_;
    }
    
    private void initFields() {
      myRank_ = 0;
      myLevel_ = 0;
      myPower_ = 0;
      myWealth_ = 0;
      myAchievement_ = 0;
      myMedal_ = 0;
      rankChange_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasMyRank()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMyLevel()) {
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
        output.writeInt32(1, myRank_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, myLevel_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, myPower_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, myWealth_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, myAchievement_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, myMedal_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, rankChange_);
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
          .computeInt32Size(1, myRank_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, myLevel_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, myPower_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, myWealth_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, myAchievement_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, myMedal_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, rankChange_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.internal_static_com_xinqihd_sns_gameserver_proto_BseMyRankInfo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.internal_static_com_xinqihd_sns_gameserver_proto_BseMyRankInfo_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo.newBuilder()
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
        myRank_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        myLevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        myPower_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        myWealth_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        myAchievement_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        myMedal_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        rankChange_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo result = new com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.myRank_ = myRank_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.myLevel_ = myLevel_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.myPower_ = myPower_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.myWealth_ = myWealth_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.myAchievement_ = myAchievement_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.myMedal_ = myMedal_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.rankChange_ = rankChange_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo.getDefaultInstance()) return this;
        if (other.hasMyRank()) {
          setMyRank(other.getMyRank());
        }
        if (other.hasMyLevel()) {
          setMyLevel(other.getMyLevel());
        }
        if (other.hasMyPower()) {
          setMyPower(other.getMyPower());
        }
        if (other.hasMyWealth()) {
          setMyWealth(other.getMyWealth());
        }
        if (other.hasMyAchievement()) {
          setMyAchievement(other.getMyAchievement());
        }
        if (other.hasMyMedal()) {
          setMyMedal(other.getMyMedal());
        }
        if (other.hasRankChange()) {
          setRankChange(other.getRankChange());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasMyRank()) {
          
          return false;
        }
        if (!hasMyLevel()) {
          
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
              myRank_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              myLevel_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              myPower_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              myWealth_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              myAchievement_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              myMedal_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              rankChange_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 myRank = 1;
      private int myRank_ ;
      public boolean hasMyRank() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getMyRank() {
        return myRank_;
      }
      public Builder setMyRank(int value) {
        bitField0_ |= 0x00000001;
        myRank_ = value;
        onChanged();
        return this;
      }
      public Builder clearMyRank() {
        bitField0_ = (bitField0_ & ~0x00000001);
        myRank_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 myLevel = 2;
      private int myLevel_ ;
      public boolean hasMyLevel() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getMyLevel() {
        return myLevel_;
      }
      public Builder setMyLevel(int value) {
        bitField0_ |= 0x00000002;
        myLevel_ = value;
        onChanged();
        return this;
      }
      public Builder clearMyLevel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        myLevel_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 myPower = 3;
      private int myPower_ ;
      public boolean hasMyPower() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getMyPower() {
        return myPower_;
      }
      public Builder setMyPower(int value) {
        bitField0_ |= 0x00000004;
        myPower_ = value;
        onChanged();
        return this;
      }
      public Builder clearMyPower() {
        bitField0_ = (bitField0_ & ~0x00000004);
        myPower_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 myWealth = 4;
      private int myWealth_ ;
      public boolean hasMyWealth() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getMyWealth() {
        return myWealth_;
      }
      public Builder setMyWealth(int value) {
        bitField0_ |= 0x00000008;
        myWealth_ = value;
        onChanged();
        return this;
      }
      public Builder clearMyWealth() {
        bitField0_ = (bitField0_ & ~0x00000008);
        myWealth_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 myAchievement = 5;
      private int myAchievement_ ;
      public boolean hasMyAchievement() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getMyAchievement() {
        return myAchievement_;
      }
      public Builder setMyAchievement(int value) {
        bitField0_ |= 0x00000010;
        myAchievement_ = value;
        onChanged();
        return this;
      }
      public Builder clearMyAchievement() {
        bitField0_ = (bitField0_ & ~0x00000010);
        myAchievement_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 myMedal = 6;
      private int myMedal_ ;
      public boolean hasMyMedal() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getMyMedal() {
        return myMedal_;
      }
      public Builder setMyMedal(int value) {
        bitField0_ |= 0x00000020;
        myMedal_ = value;
        onChanged();
        return this;
      }
      public Builder clearMyMedal() {
        bitField0_ = (bitField0_ & ~0x00000020);
        myMedal_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 rankChange = 7;
      private int rankChange_ ;
      public boolean hasRankChange() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getRankChange() {
        return rankChange_;
      }
      public Builder setRankChange(int value) {
        bitField0_ |= 0x00000040;
        rankChange_ = value;
        onChanged();
        return this;
      }
      public Builder clearRankChange() {
        bitField0_ = (bitField0_ & ~0x00000040);
        rankChange_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseMyRankInfo)
    }
    
    static {
      defaultInstance = new BseMyRankInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseMyRankInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseMyRankInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseMyRankInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BseMyRankInfo.proto\022 com.xinqihd.sns.g" +
      "ameserver.proto\"\217\001\n\rBseMyRankInfo\022\016\n\006myR" +
      "ank\030\001 \002(\005\022\017\n\007myLevel\030\002 \002(\005\022\017\n\007myPower\030\003 " +
      "\001(\005\022\020\n\010myWealth\030\004 \001(\005\022\025\n\rmyAchievement\030\005" +
      " \001(\005\022\017\n\007myMedal\030\006 \001(\005\022\022\n\nrankChange\030\007 \001(" +
      "\005B\024B\022XinqiBseMyRankInfo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseMyRankInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseMyRankInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseMyRankInfo_descriptor,
              new java.lang.String[] { "MyRank", "MyLevel", "MyPower", "MyWealth", "MyAchievement", "MyMedal", "RankChange", },
              com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseMyRankInfo.BseMyRankInfo.Builder.class);
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
