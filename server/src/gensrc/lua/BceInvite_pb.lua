-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceInvite_pb', package.seeall)


local BCEINVITE = protobuf.Descriptor();
local BCEINVITE_UID_FIELD = protobuf.FieldDescriptor();
local BCEINVITE_POS_FIELD = protobuf.FieldDescriptor();

BCEINVITE_UID_FIELD.name = "uid"
BCEINVITE_UID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceInvite.uid"
BCEINVITE_UID_FIELD.number = 1
BCEINVITE_UID_FIELD.index = 0
BCEINVITE_UID_FIELD.label = 2
BCEINVITE_UID_FIELD.has_default_value = false
BCEINVITE_UID_FIELD.default_value = ""
BCEINVITE_UID_FIELD.type = 9
BCEINVITE_UID_FIELD.cpp_type = 9

BCEINVITE_POS_FIELD.name = "pos"
BCEINVITE_POS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceInvite.pos"
BCEINVITE_POS_FIELD.number = 2
BCEINVITE_POS_FIELD.index = 1
BCEINVITE_POS_FIELD.label = 2
BCEINVITE_POS_FIELD.has_default_value = false
BCEINVITE_POS_FIELD.default_value = 0
BCEINVITE_POS_FIELD.type = 5
BCEINVITE_POS_FIELD.cpp_type = 1

BCEINVITE.name = "BceInvite"
BCEINVITE.full_name = ".com.xinqihd.sns.gameserver.proto.BceInvite"
BCEINVITE.nested_types = {}
BCEINVITE.enum_types = {}
BCEINVITE.fields = {BCEINVITE_UID_FIELD, BCEINVITE_POS_FIELD}
BCEINVITE.is_extendable = false
BCEINVITE.extensions = {}

BceInvite = protobuf.Message(BCEINVITE)
_G.BCEINVITE_PB_BCEINVITE = BCEINVITE

