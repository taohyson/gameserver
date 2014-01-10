// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserExData.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseUserExData {
  private XinqiBseUserExData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseUserExDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 roleExp = 1;
    boolean hasRoleExp();
    int getRoleExp();
    
    // required int32 roleGold = 2;
    boolean hasRoleGold();
    int getRoleGold();
    
    // required int32 roleCoin = 3;
    boolean hasRoleCoin();
    int getRoleCoin();
    
    // required int32 roleArrange = 4;
    boolean hasRoleArrange();
    int getRoleArrange();
    
    // required int32 roleWinOdds = 5;
    boolean hasRoleWinOdds();
    int getRoleWinOdds();
    
    // required int32 roleWins = 6;
    boolean hasRoleWins();
    int getRoleWins();
    
    // required int32 sign = 7;
    boolean hasSign();
    int getSign();
    
    // optional int32 point = 9;
    boolean hasPoint();
    int getPoint();
    
    // optional int32 roleBindCoin = 10;
    boolean hasRoleBindCoin();
    int getRoleBindCoin();
    
    // optional bool isMoneyAdd = 11 [default = false];
    boolean hasIsMoneyAdd();
    boolean getIsMoneyAdd();
    
    // optional int32 shootMode = 12;
    boolean hasShootMode();
    int getShootMode();
  }
  public static final class BseUserExData extends
      com.google.protobuf.GeneratedMessage
      implements BseUserExDataOrBuilder {
    // Use BseUserExData.newBuilder() to construct.
    private BseUserExData(Builder builder) {
      super(builder);
    }
    private BseUserExData(boolean noInit) {}
    
    private static final BseUserExData defaultInstance;
    public static BseUserExData getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseUserExData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.internal_static_com_xinqihd_sns_gameserver_proto_BseUserExData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.internal_static_com_xinqihd_sns_gameserver_proto_BseUserExData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 roleExp = 1;
    public static final int ROLEEXP_FIELD_NUMBER = 1;
    private int roleExp_;
    public boolean hasRoleExp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getRoleExp() {
      return roleExp_;
    }
    
    // required int32 roleGold = 2;
    public static final int ROLEGOLD_FIELD_NUMBER = 2;
    private int roleGold_;
    public boolean hasRoleGold() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getRoleGold() {
      return roleGold_;
    }
    
    // required int32 roleCoin = 3;
    public static final int ROLECOIN_FIELD_NUMBER = 3;
    private int roleCoin_;
    public boolean hasRoleCoin() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getRoleCoin() {
      return roleCoin_;
    }
    
    // required int32 roleArrange = 4;
    public static final int ROLEARRANGE_FIELD_NUMBER = 4;
    private int roleArrange_;
    public boolean hasRoleArrange() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getRoleArrange() {
      return roleArrange_;
    }
    
    // required int32 roleWinOdds = 5;
    public static final int ROLEWINODDS_FIELD_NUMBER = 5;
    private int roleWinOdds_;
    public boolean hasRoleWinOdds() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getRoleWinOdds() {
      return roleWinOdds_;
    }
    
    // required int32 roleWins = 6;
    public static final int ROLEWINS_FIELD_NUMBER = 6;
    private int roleWins_;
    public boolean hasRoleWins() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getRoleWins() {
      return roleWins_;
    }
    
    // required int32 sign = 7;
    public static final int SIGN_FIELD_NUMBER = 7;
    private int sign_;
    public boolean hasSign() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getSign() {
      return sign_;
    }
    
    // optional int32 point = 9;
    public static final int POINT_FIELD_NUMBER = 9;
    private int point_;
    public boolean hasPoint() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public int getPoint() {
      return point_;
    }
    
    // optional int32 roleBindCoin = 10;
    public static final int ROLEBINDCOIN_FIELD_NUMBER = 10;
    private int roleBindCoin_;
    public boolean hasRoleBindCoin() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public int getRoleBindCoin() {
      return roleBindCoin_;
    }
    
    // optional bool isMoneyAdd = 11 [default = false];
    public static final int ISMONEYADD_FIELD_NUMBER = 11;
    private boolean isMoneyAdd_;
    public boolean hasIsMoneyAdd() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public boolean getIsMoneyAdd() {
      return isMoneyAdd_;
    }
    
    // optional int32 shootMode = 12;
    public static final int SHOOTMODE_FIELD_NUMBER = 12;
    private int shootMode_;
    public boolean hasShootMode() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    public int getShootMode() {
      return shootMode_;
    }
    
    private void initFields() {
      roleExp_ = 0;
      roleGold_ = 0;
      roleCoin_ = 0;
      roleArrange_ = 0;
      roleWinOdds_ = 0;
      roleWins_ = 0;
      sign_ = 0;
      point_ = 0;
      roleBindCoin_ = 0;
      isMoneyAdd_ = false;
      shootMode_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasRoleExp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRoleGold()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRoleCoin()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRoleArrange()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRoleWinOdds()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRoleWins()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSign()) {
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
        output.writeInt32(1, roleExp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, roleGold_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, roleCoin_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, roleArrange_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, roleWinOdds_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, roleWins_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, sign_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(9, point_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(10, roleBindCoin_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeBool(11, isMoneyAdd_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeInt32(12, shootMode_);
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
          .computeInt32Size(1, roleExp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, roleGold_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, roleCoin_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, roleArrange_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, roleWinOdds_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, roleWins_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, sign_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, point_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, roleBindCoin_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isMoneyAdd_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, shootMode_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.internal_static_com_xinqihd_sns_gameserver_proto_BseUserExData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.internal_static_com_xinqihd_sns_gameserver_proto_BseUserExData_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData.newBuilder()
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
        roleExp_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        roleGold_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        roleCoin_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        roleArrange_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        roleWinOdds_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        roleWins_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        sign_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        point_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        roleBindCoin_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        isMoneyAdd_ = false;
        bitField0_ = (bitField0_ & ~0x00000200);
        shootMode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000400);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData result = new com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.roleExp_ = roleExp_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.roleGold_ = roleGold_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.roleCoin_ = roleCoin_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.roleArrange_ = roleArrange_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.roleWinOdds_ = roleWinOdds_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.roleWins_ = roleWins_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.sign_ = sign_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.point_ = point_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.roleBindCoin_ = roleBindCoin_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.isMoneyAdd_ = isMoneyAdd_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.shootMode_ = shootMode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData.getDefaultInstance()) return this;
        if (other.hasRoleExp()) {
          setRoleExp(other.getRoleExp());
        }
        if (other.hasRoleGold()) {
          setRoleGold(other.getRoleGold());
        }
        if (other.hasRoleCoin()) {
          setRoleCoin(other.getRoleCoin());
        }
        if (other.hasRoleArrange()) {
          setRoleArrange(other.getRoleArrange());
        }
        if (other.hasRoleWinOdds()) {
          setRoleWinOdds(other.getRoleWinOdds());
        }
        if (other.hasRoleWins()) {
          setRoleWins(other.getRoleWins());
        }
        if (other.hasSign()) {
          setSign(other.getSign());
        }
        if (other.hasPoint()) {
          setPoint(other.getPoint());
        }
        if (other.hasRoleBindCoin()) {
          setRoleBindCoin(other.getRoleBindCoin());
        }
        if (other.hasIsMoneyAdd()) {
          setIsMoneyAdd(other.getIsMoneyAdd());
        }
        if (other.hasShootMode()) {
          setShootMode(other.getShootMode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasRoleExp()) {
          
          return false;
        }
        if (!hasRoleGold()) {
          
          return false;
        }
        if (!hasRoleCoin()) {
          
          return false;
        }
        if (!hasRoleArrange()) {
          
          return false;
        }
        if (!hasRoleWinOdds()) {
          
          return false;
        }
        if (!hasRoleWins()) {
          
          return false;
        }
        if (!hasSign()) {
          
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
              roleExp_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              roleGold_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              roleCoin_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              roleArrange_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              roleWinOdds_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              roleWins_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              sign_ = input.readInt32();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000080;
              point_ = input.readInt32();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000100;
              roleBindCoin_ = input.readInt32();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000200;
              isMoneyAdd_ = input.readBool();
              break;
            }
            case 96: {
              bitField0_ |= 0x00000400;
              shootMode_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 roleExp = 1;
      private int roleExp_ ;
      public boolean hasRoleExp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getRoleExp() {
        return roleExp_;
      }
      public Builder setRoleExp(int value) {
        bitField0_ |= 0x00000001;
        roleExp_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoleExp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        roleExp_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 roleGold = 2;
      private int roleGold_ ;
      public boolean hasRoleGold() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getRoleGold() {
        return roleGold_;
      }
      public Builder setRoleGold(int value) {
        bitField0_ |= 0x00000002;
        roleGold_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoleGold() {
        bitField0_ = (bitField0_ & ~0x00000002);
        roleGold_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 roleCoin = 3;
      private int roleCoin_ ;
      public boolean hasRoleCoin() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getRoleCoin() {
        return roleCoin_;
      }
      public Builder setRoleCoin(int value) {
        bitField0_ |= 0x00000004;
        roleCoin_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoleCoin() {
        bitField0_ = (bitField0_ & ~0x00000004);
        roleCoin_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 roleArrange = 4;
      private int roleArrange_ ;
      public boolean hasRoleArrange() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getRoleArrange() {
        return roleArrange_;
      }
      public Builder setRoleArrange(int value) {
        bitField0_ |= 0x00000008;
        roleArrange_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoleArrange() {
        bitField0_ = (bitField0_ & ~0x00000008);
        roleArrange_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 roleWinOdds = 5;
      private int roleWinOdds_ ;
      public boolean hasRoleWinOdds() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getRoleWinOdds() {
        return roleWinOdds_;
      }
      public Builder setRoleWinOdds(int value) {
        bitField0_ |= 0x00000010;
        roleWinOdds_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoleWinOdds() {
        bitField0_ = (bitField0_ & ~0x00000010);
        roleWinOdds_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 roleWins = 6;
      private int roleWins_ ;
      public boolean hasRoleWins() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getRoleWins() {
        return roleWins_;
      }
      public Builder setRoleWins(int value) {
        bitField0_ |= 0x00000020;
        roleWins_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoleWins() {
        bitField0_ = (bitField0_ & ~0x00000020);
        roleWins_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 sign = 7;
      private int sign_ ;
      public boolean hasSign() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getSign() {
        return sign_;
      }
      public Builder setSign(int value) {
        bitField0_ |= 0x00000040;
        sign_ = value;
        onChanged();
        return this;
      }
      public Builder clearSign() {
        bitField0_ = (bitField0_ & ~0x00000040);
        sign_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 point = 9;
      private int point_ ;
      public boolean hasPoint() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public int getPoint() {
        return point_;
      }
      public Builder setPoint(int value) {
        bitField0_ |= 0x00000080;
        point_ = value;
        onChanged();
        return this;
      }
      public Builder clearPoint() {
        bitField0_ = (bitField0_ & ~0x00000080);
        point_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 roleBindCoin = 10;
      private int roleBindCoin_ ;
      public boolean hasRoleBindCoin() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public int getRoleBindCoin() {
        return roleBindCoin_;
      }
      public Builder setRoleBindCoin(int value) {
        bitField0_ |= 0x00000100;
        roleBindCoin_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoleBindCoin() {
        bitField0_ = (bitField0_ & ~0x00000100);
        roleBindCoin_ = 0;
        onChanged();
        return this;
      }
      
      // optional bool isMoneyAdd = 11 [default = false];
      private boolean isMoneyAdd_ ;
      public boolean hasIsMoneyAdd() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public boolean getIsMoneyAdd() {
        return isMoneyAdd_;
      }
      public Builder setIsMoneyAdd(boolean value) {
        bitField0_ |= 0x00000200;
        isMoneyAdd_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsMoneyAdd() {
        bitField0_ = (bitField0_ & ~0x00000200);
        isMoneyAdd_ = false;
        onChanged();
        return this;
      }
      
      // optional int32 shootMode = 12;
      private int shootMode_ ;
      public boolean hasShootMode() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      public int getShootMode() {
        return shootMode_;
      }
      public Builder setShootMode(int value) {
        bitField0_ |= 0x00000400;
        shootMode_ = value;
        onChanged();
        return this;
      }
      public Builder clearShootMode() {
        bitField0_ = (bitField0_ & ~0x00000400);
        shootMode_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseUserExData)
    }
    
    static {
      defaultInstance = new BseUserExData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseUserExData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseUserExData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseUserExData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020UserExData.proto\022 com.xinqihd.sns.game" +
      "server.proto\"\341\001\n\rBseUserExData\022\017\n\007roleEx" +
      "p\030\001 \002(\005\022\020\n\010roleGold\030\002 \002(\005\022\020\n\010roleCoin\030\003 " +
      "\002(\005\022\023\n\013roleArrange\030\004 \002(\005\022\023\n\013roleWinOdds\030" +
      "\005 \002(\005\022\020\n\010roleWins\030\006 \002(\005\022\014\n\004sign\030\007 \002(\005\022\r\n" +
      "\005point\030\t \001(\005\022\024\n\014roleBindCoin\030\n \001(\005\022\031\n\nis" +
      "MoneyAdd\030\013 \001(\010:\005false\022\021\n\tshootMode\030\014 \001(\005" +
      "B\024B\022XinqiBseUserExData"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseUserExData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseUserExData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseUserExData_descriptor,
              new java.lang.String[] { "RoleExp", "RoleGold", "RoleCoin", "RoleArrange", "RoleWinOdds", "RoleWins", "Sign", "Point", "RoleBindCoin", "IsMoneyAdd", "ShootMode", },
              com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseUserExData.BseUserExData.Builder.class);
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
