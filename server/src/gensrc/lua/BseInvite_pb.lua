-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseInvite_pb', package.seeall)


local BSEINVITE = protobuf.Descriptor();
local BSEINVITE_UID_FIELD = protobuf.FieldDescriptor();
local BSEINVITE_ROOMID_FIELD = protobuf.FieldDescriptor();
local BSEINVITE_ROOMKEY_FIELD = protobuf.FieldDescriptor();
local BSEINVITE_TYPE_FIELD = protobuf.FieldDescriptor();
local BSEINVITE_NAME_FIELD = protobuf.FieldDescriptor();

BSEINVITE_UID_FIELD.name = "uid"
BSEINVITE_UID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseInvite.uid"
BSEINVITE_UID_FIELD.number = 1
BSEINVITE_UID_FIELD.index = 0
BSEINVITE_UID_FIELD.label = 2
BSEINVITE_UID_FIELD.has_default_value = false
BSEINVITE_UID_FIELD.default_value = ""
BSEINVITE_UID_FIELD.type = 9
BSEINVITE_UID_FIELD.cpp_type = 9

BSEINVITE_ROOMID_FIELD.name = "roomId"
BSEINVITE_ROOMID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseInvite.roomId"
BSEINVITE_ROOMID_FIELD.number = 2
BSEINVITE_ROOMID_FIELD.index = 1
BSEINVITE_ROOMID_FIELD.label = 2
BSEINVITE_ROOMID_FIELD.has_default_value = false
BSEINVITE_ROOMID_FIELD.default_value = ""
BSEINVITE_ROOMID_FIELD.type = 9
BSEINVITE_ROOMID_FIELD.cpp_type = 9

BSEINVITE_ROOMKEY_FIELD.name = "roomKey"
BSEINVITE_ROOMKEY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseInvite.roomKey"
BSEINVITE_ROOMKEY_FIELD.number = 3
BSEINVITE_ROOMKEY_FIELD.index = 2
BSEINVITE_ROOMKEY_FIELD.label = 2
BSEINVITE_ROOMKEY_FIELD.has_default_value = false
BSEINVITE_ROOMKEY_FIELD.default_value = 0
BSEINVITE_ROOMKEY_FIELD.type = 5
BSEINVITE_ROOMKEY_FIELD.cpp_type = 1

BSEINVITE_TYPE_FIELD.name = "type"
BSEINVITE_TYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseInvite.type"
BSEINVITE_TYPE_FIELD.number = 4
BSEINVITE_TYPE_FIELD.index = 3
BSEINVITE_TYPE_FIELD.label = 2
BSEINVITE_TYPE_FIELD.has_default_value = false
BSEINVITE_TYPE_FIELD.default_value = 0
BSEINVITE_TYPE_FIELD.type = 5
BSEINVITE_TYPE_FIELD.cpp_type = 1

BSEINVITE_NAME_FIELD.name = "name"
BSEINVITE_NAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseInvite.name"
BSEINVITE_NAME_FIELD.number = 5
BSEINVITE_NAME_FIELD.index = 4
BSEINVITE_NAME_FIELD.label = 2
BSEINVITE_NAME_FIELD.has_default_value = false
BSEINVITE_NAME_FIELD.default_value = ""
BSEINVITE_NAME_FIELD.type = 9
BSEINVITE_NAME_FIELD.cpp_type = 9

BSEINVITE.name = "BseInvite"
BSEINVITE.full_name = ".com.xinqihd.sns.gameserver.proto.BseInvite"
BSEINVITE.nested_types = {}
BSEINVITE.enum_types = {}
BSEINVITE.fields = {BSEINVITE_UID_FIELD, BSEINVITE_ROOMID_FIELD, BSEINVITE_ROOMKEY_FIELD, BSEINVITE_TYPE_FIELD, BSEINVITE_NAME_FIELD}
BSEINVITE.is_extendable = false
BSEINVITE.extensions = {}

BseInvite = protobuf.Message(BSEINVITE)
_G.BSEINVITE_PB_BSEINVITE = BSEINVITE

