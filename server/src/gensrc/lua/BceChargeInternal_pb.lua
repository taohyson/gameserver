-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceChargeInternal_pb', package.seeall)


local BCECHARGEINTERNAL = protobuf.Descriptor();
local BCECHARGEINTERNAL_USERID_FIELD = protobuf.FieldDescriptor();
local BCECHARGEINTERNAL_CHARGEID_FIELD = protobuf.FieldDescriptor();
local BCECHARGEINTERNAL_FREECHARGE_FIELD = protobuf.FieldDescriptor();
local BCECHARGEINTERNAL_CHARGEMONEY_FIELD = protobuf.FieldDescriptor();
local BCECHARGEINTERNAL_RECEIPT_FIELD = protobuf.FieldDescriptor();
local BCECHARGEINTERNAL_CHANNEL_FIELD = protobuf.FieldDescriptor();
local BCECHARGEINTERNAL_ORDERID_FIELD = protobuf.FieldDescriptor();

BCECHARGEINTERNAL_USERID_FIELD.name = "userid"
BCECHARGEINTERNAL_USERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceChargeInternal.userid"
BCECHARGEINTERNAL_USERID_FIELD.number = 1
BCECHARGEINTERNAL_USERID_FIELD.index = 0
BCECHARGEINTERNAL_USERID_FIELD.label = 1
BCECHARGEINTERNAL_USERID_FIELD.has_default_value = false
BCECHARGEINTERNAL_USERID_FIELD.default_value = ""
BCECHARGEINTERNAL_USERID_FIELD.type = 9
BCECHARGEINTERNAL_USERID_FIELD.cpp_type = 9

BCECHARGEINTERNAL_CHARGEID_FIELD.name = "chargeid"
BCECHARGEINTERNAL_CHARGEID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceChargeInternal.chargeid"
BCECHARGEINTERNAL_CHARGEID_FIELD.number = 2
BCECHARGEINTERNAL_CHARGEID_FIELD.index = 1
BCECHARGEINTERNAL_CHARGEID_FIELD.label = 1
BCECHARGEINTERNAL_CHARGEID_FIELD.has_default_value = false
BCECHARGEINTERNAL_CHARGEID_FIELD.default_value = 0
BCECHARGEINTERNAL_CHARGEID_FIELD.type = 5
BCECHARGEINTERNAL_CHARGEID_FIELD.cpp_type = 1

BCECHARGEINTERNAL_FREECHARGE_FIELD.name = "freecharge"
BCECHARGEINTERNAL_FREECHARGE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceChargeInternal.freecharge"
BCECHARGEINTERNAL_FREECHARGE_FIELD.number = 3
BCECHARGEINTERNAL_FREECHARGE_FIELD.index = 2
BCECHARGEINTERNAL_FREECHARGE_FIELD.label = 1
BCECHARGEINTERNAL_FREECHARGE_FIELD.has_default_value = true
BCECHARGEINTERNAL_FREECHARGE_FIELD.default_value = false
BCECHARGEINTERNAL_FREECHARGE_FIELD.type = 8
BCECHARGEINTERNAL_FREECHARGE_FIELD.cpp_type = 7

BCECHARGEINTERNAL_CHARGEMONEY_FIELD.name = "chargemoney"
BCECHARGEINTERNAL_CHARGEMONEY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceChargeInternal.chargemoney"
BCECHARGEINTERNAL_CHARGEMONEY_FIELD.number = 4
BCECHARGEINTERNAL_CHARGEMONEY_FIELD.index = 3
BCECHARGEINTERNAL_CHARGEMONEY_FIELD.label = 1
BCECHARGEINTERNAL_CHARGEMONEY_FIELD.has_default_value = false
BCECHARGEINTERNAL_CHARGEMONEY_FIELD.default_value = 0
BCECHARGEINTERNAL_CHARGEMONEY_FIELD.type = 5
BCECHARGEINTERNAL_CHARGEMONEY_FIELD.cpp_type = 1

BCECHARGEINTERNAL_RECEIPT_FIELD.name = "receipt"
BCECHARGEINTERNAL_RECEIPT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceChargeInternal.receipt"
BCECHARGEINTERNAL_RECEIPT_FIELD.number = 5
BCECHARGEINTERNAL_RECEIPT_FIELD.index = 4
BCECHARGEINTERNAL_RECEIPT_FIELD.label = 1
BCECHARGEINTERNAL_RECEIPT_FIELD.has_default_value = false
BCECHARGEINTERNAL_RECEIPT_FIELD.default_value = ""
BCECHARGEINTERNAL_RECEIPT_FIELD.type = 9
BCECHARGEINTERNAL_RECEIPT_FIELD.cpp_type = 9

BCECHARGEINTERNAL_CHANNEL_FIELD.name = "channel"
BCECHARGEINTERNAL_CHANNEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceChargeInternal.channel"
BCECHARGEINTERNAL_CHANNEL_FIELD.number = 6
BCECHARGEINTERNAL_CHANNEL_FIELD.index = 5
BCECHARGEINTERNAL_CHANNEL_FIELD.label = 1
BCECHARGEINTERNAL_CHANNEL_FIELD.has_default_value = false
BCECHARGEINTERNAL_CHANNEL_FIELD.default_value = ""
BCECHARGEINTERNAL_CHANNEL_FIELD.type = 9
BCECHARGEINTERNAL_CHANNEL_FIELD.cpp_type = 9

BCECHARGEINTERNAL_ORDERID_FIELD.name = "orderid"
BCECHARGEINTERNAL_ORDERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceChargeInternal.orderid"
BCECHARGEINTERNAL_ORDERID_FIELD.number = 7
BCECHARGEINTERNAL_ORDERID_FIELD.index = 6
BCECHARGEINTERNAL_ORDERID_FIELD.label = 1
BCECHARGEINTERNAL_ORDERID_FIELD.has_default_value = false
BCECHARGEINTERNAL_ORDERID_FIELD.default_value = ""
BCECHARGEINTERNAL_ORDERID_FIELD.type = 9
BCECHARGEINTERNAL_ORDERID_FIELD.cpp_type = 9

BCECHARGEINTERNAL.name = "BceChargeInternal"
BCECHARGEINTERNAL.full_name = ".com.xinqihd.sns.gameserver.proto.BceChargeInternal"
BCECHARGEINTERNAL.nested_types = {}
BCECHARGEINTERNAL.enum_types = {}
BCECHARGEINTERNAL.fields = {BCECHARGEINTERNAL_USERID_FIELD, BCECHARGEINTERNAL_CHARGEID_FIELD, BCECHARGEINTERNAL_FREECHARGE_FIELD, BCECHARGEINTERNAL_CHARGEMONEY_FIELD, BCECHARGEINTERNAL_RECEIPT_FIELD, BCECHARGEINTERNAL_CHANNEL_FIELD, BCECHARGEINTERNAL_ORDERID_FIELD}
BCECHARGEINTERNAL.is_extendable = false
BCECHARGEINTERNAL.extensions = {}

BceChargeInternal = protobuf.Message(BCECHARGEINTERNAL)
_G.BCECHARGEINTERNAL_PB_BCECHARGEINTERNAL = BCECHARGEINTERNAL

