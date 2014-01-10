-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseExpireEquipments_pb', package.seeall)


local EXPIREINFO = protobuf.Descriptor();
local EXPIREINFO_PEW_FIELD = protobuf.FieldDescriptor();
local EXPIREINFO_GOLDTYPE_FIELD = protobuf.FieldDescriptor();
local EXPIREINFO_SHOPID_FIELD = protobuf.FieldDescriptor();
local EXPIREINFO_PRICE_FIELD = protobuf.FieldDescriptor();
local EXPIREINFO_INDATE_FIELD = protobuf.FieldDescriptor();
local BSEEXPIREEQUIPMENTS = protobuf.Descriptor();
local BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD = protobuf.FieldDescriptor();

EXPIREINFO_PEW_FIELD.name = "pew"
EXPIREINFO_PEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ExpireInfo.pew"
EXPIREINFO_PEW_FIELD.number = 1
EXPIREINFO_PEW_FIELD.index = 0
EXPIREINFO_PEW_FIELD.label = 2
EXPIREINFO_PEW_FIELD.has_default_value = false
EXPIREINFO_PEW_FIELD.default_value = 0
EXPIREINFO_PEW_FIELD.type = 5
EXPIREINFO_PEW_FIELD.cpp_type = 1

EXPIREINFO_GOLDTYPE_FIELD.name = "goldtype"
EXPIREINFO_GOLDTYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ExpireInfo.goldtype"
EXPIREINFO_GOLDTYPE_FIELD.number = 2
EXPIREINFO_GOLDTYPE_FIELD.index = 1
EXPIREINFO_GOLDTYPE_FIELD.label = 2
EXPIREINFO_GOLDTYPE_FIELD.has_default_value = false
EXPIREINFO_GOLDTYPE_FIELD.default_value = 0
EXPIREINFO_GOLDTYPE_FIELD.type = 5
EXPIREINFO_GOLDTYPE_FIELD.cpp_type = 1

EXPIREINFO_SHOPID_FIELD.name = "shopid"
EXPIREINFO_SHOPID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ExpireInfo.shopid"
EXPIREINFO_SHOPID_FIELD.number = 3
EXPIREINFO_SHOPID_FIELD.index = 2
EXPIREINFO_SHOPID_FIELD.label = 2
EXPIREINFO_SHOPID_FIELD.has_default_value = false
EXPIREINFO_SHOPID_FIELD.default_value = 0
EXPIREINFO_SHOPID_FIELD.type = 5
EXPIREINFO_SHOPID_FIELD.cpp_type = 1

EXPIREINFO_PRICE_FIELD.name = "price"
EXPIREINFO_PRICE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ExpireInfo.price"
EXPIREINFO_PRICE_FIELD.number = 4
EXPIREINFO_PRICE_FIELD.index = 3
EXPIREINFO_PRICE_FIELD.label = 3
EXPIREINFO_PRICE_FIELD.has_default_value = false
EXPIREINFO_PRICE_FIELD.default_value = {}
EXPIREINFO_PRICE_FIELD.type = 5
EXPIREINFO_PRICE_FIELD.cpp_type = 1

EXPIREINFO_INDATE_FIELD.name = "indate"
EXPIREINFO_INDATE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ExpireInfo.indate"
EXPIREINFO_INDATE_FIELD.number = 5
EXPIREINFO_INDATE_FIELD.index = 4
EXPIREINFO_INDATE_FIELD.label = 3
EXPIREINFO_INDATE_FIELD.has_default_value = false
EXPIREINFO_INDATE_FIELD.default_value = {}
EXPIREINFO_INDATE_FIELD.type = 5
EXPIREINFO_INDATE_FIELD.cpp_type = 1

EXPIREINFO.name = "ExpireInfo"
EXPIREINFO.full_name = ".com.xinqihd.sns.gameserver.proto.ExpireInfo"
EXPIREINFO.nested_types = {}
EXPIREINFO.enum_types = {}
EXPIREINFO.fields = {EXPIREINFO_PEW_FIELD, EXPIREINFO_GOLDTYPE_FIELD, EXPIREINFO_SHOPID_FIELD, EXPIREINFO_PRICE_FIELD, EXPIREINFO_INDATE_FIELD}
EXPIREINFO.is_extendable = false
EXPIREINFO.extensions = {}
BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD.name = "expireInfos"
BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseExpireEquipments.expireInfos"
BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD.number = 1
BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD.index = 0
BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD.label = 3
BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD.has_default_value = false
BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD.default_value = {}
BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD.message_type = EXPIREINFO
BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD.type = 11
BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD.cpp_type = 10

BSEEXPIREEQUIPMENTS.name = "BseExpireEquipments"
BSEEXPIREEQUIPMENTS.full_name = ".com.xinqihd.sns.gameserver.proto.BseExpireEquipments"
BSEEXPIREEQUIPMENTS.nested_types = {}
BSEEXPIREEQUIPMENTS.enum_types = {}
BSEEXPIREEQUIPMENTS.fields = {BSEEXPIREEQUIPMENTS_EXPIREINFOS_FIELD}
BSEEXPIREEQUIPMENTS.is_extendable = false
BSEEXPIREEQUIPMENTS.extensions = {}

BseExpireEquipments = protobuf.Message(BSEEXPIREEQUIPMENTS)
ExpireInfo = protobuf.Message(EXPIREINFO)
_G.BSEEXPIREEQUIPMENTS_PB_BSEEXPIREEQUIPMENTS = BSEEXPIREEQUIPMENTS
_G.EXPIREINFO_PB_EXPIREINFO = EXPIREINFO

