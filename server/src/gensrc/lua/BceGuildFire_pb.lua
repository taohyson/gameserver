-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceGuildFire_pb', package.seeall)


local BCEGUILDFIRE = protobuf.Descriptor();
local BCEGUILDFIRE_USERID_FIELD = protobuf.FieldDescriptor();

BCEGUILDFIRE_USERID_FIELD.name = "userid"
BCEGUILDFIRE_USERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildFire.userid"
BCEGUILDFIRE_USERID_FIELD.number = 1
BCEGUILDFIRE_USERID_FIELD.index = 0
BCEGUILDFIRE_USERID_FIELD.label = 1
BCEGUILDFIRE_USERID_FIELD.has_default_value = false
BCEGUILDFIRE_USERID_FIELD.default_value = ""
BCEGUILDFIRE_USERID_FIELD.type = 9
BCEGUILDFIRE_USERID_FIELD.cpp_type = 9

BCEGUILDFIRE.name = "BceGuildFire"
BCEGUILDFIRE.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildFire"
BCEGUILDFIRE.nested_types = {}
BCEGUILDFIRE.enum_types = {}
BCEGUILDFIRE.fields = {BCEGUILDFIRE_USERID_FIELD}
BCEGUILDFIRE.is_extendable = false
BCEGUILDFIRE.extensions = {}

BceGuildFire = protobuf.Message(BCEGUILDFIRE)
_G.BCEGUILDFIRE_PB_BCEGUILDFIRE = BCEGUILDFIRE

