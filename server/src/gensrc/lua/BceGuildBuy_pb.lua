-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceGuildBuy_pb', package.seeall)


local BCEGUILDBUY = protobuf.Descriptor();
local BCEGUILDBUY_PROPID_FIELD = protobuf.FieldDescriptor();

BCEGUILDBUY_PROPID_FIELD.name = "propID"
BCEGUILDBUY_PROPID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildBuy.propID"
BCEGUILDBUY_PROPID_FIELD.number = 1
BCEGUILDBUY_PROPID_FIELD.index = 0
BCEGUILDBUY_PROPID_FIELD.label = 2
BCEGUILDBUY_PROPID_FIELD.has_default_value = false
BCEGUILDBUY_PROPID_FIELD.default_value = 0
BCEGUILDBUY_PROPID_FIELD.type = 5
BCEGUILDBUY_PROPID_FIELD.cpp_type = 1

BCEGUILDBUY.name = "BceGuildBuy"
BCEGUILDBUY.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildBuy"
BCEGUILDBUY.nested_types = {}
BCEGUILDBUY.enum_types = {}
BCEGUILDBUY.fields = {BCEGUILDBUY_PROPID_FIELD}
BCEGUILDBUY.is_extendable = false
BCEGUILDBUY.extensions = {}

BceGuildBuy = protobuf.Message(BCEGUILDBUY)
_G.BCEGUILDBUY_PB_BCEGUILDBUY = BCEGUILDBUY

