-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseRoleUseTool_pb', package.seeall)


local BSEROLEUSETOOL = protobuf.Descriptor();
local BSEROLEUSETOOL_SESSIONID_FIELD = protobuf.FieldDescriptor();
local BSEROLEUSETOOL_SLOT_FIELD = protobuf.FieldDescriptor();
local BSEROLEUSETOOL_LAUNCHUSERID_FIELD = protobuf.FieldDescriptor();
local BSEROLEUSETOOL_BUFFID_FIELD = protobuf.FieldDescriptor();
local BSEROLEUSETOOL_TYPE_FIELD = protobuf.FieldDescriptor();

BSEROLEUSETOOL_SESSIONID_FIELD.name = "sessionId"
BSEROLEUSETOOL_SESSIONID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleUseTool.sessionId"
BSEROLEUSETOOL_SESSIONID_FIELD.number = 1
BSEROLEUSETOOL_SESSIONID_FIELD.index = 0
BSEROLEUSETOOL_SESSIONID_FIELD.label = 2
BSEROLEUSETOOL_SESSIONID_FIELD.has_default_value = false
BSEROLEUSETOOL_SESSIONID_FIELD.default_value = ""
BSEROLEUSETOOL_SESSIONID_FIELD.type = 9
BSEROLEUSETOOL_SESSIONID_FIELD.cpp_type = 9

BSEROLEUSETOOL_SLOT_FIELD.name = "slot"
BSEROLEUSETOOL_SLOT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleUseTool.slot"
BSEROLEUSETOOL_SLOT_FIELD.number = 2
BSEROLEUSETOOL_SLOT_FIELD.index = 1
BSEROLEUSETOOL_SLOT_FIELD.label = 2
BSEROLEUSETOOL_SLOT_FIELD.has_default_value = false
BSEROLEUSETOOL_SLOT_FIELD.default_value = 0
BSEROLEUSETOOL_SLOT_FIELD.type = 5
BSEROLEUSETOOL_SLOT_FIELD.cpp_type = 1

BSEROLEUSETOOL_LAUNCHUSERID_FIELD.name = "launchUserId"
BSEROLEUSETOOL_LAUNCHUSERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleUseTool.launchUserId"
BSEROLEUSETOOL_LAUNCHUSERID_FIELD.number = 3
BSEROLEUSETOOL_LAUNCHUSERID_FIELD.index = 2
BSEROLEUSETOOL_LAUNCHUSERID_FIELD.label = 2
BSEROLEUSETOOL_LAUNCHUSERID_FIELD.has_default_value = false
BSEROLEUSETOOL_LAUNCHUSERID_FIELD.default_value = ""
BSEROLEUSETOOL_LAUNCHUSERID_FIELD.type = 9
BSEROLEUSETOOL_LAUNCHUSERID_FIELD.cpp_type = 9

BSEROLEUSETOOL_BUFFID_FIELD.name = "buffID"
BSEROLEUSETOOL_BUFFID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleUseTool.buffID"
BSEROLEUSETOOL_BUFFID_FIELD.number = 4
BSEROLEUSETOOL_BUFFID_FIELD.index = 3
BSEROLEUSETOOL_BUFFID_FIELD.label = 2
BSEROLEUSETOOL_BUFFID_FIELD.has_default_value = false
BSEROLEUSETOOL_BUFFID_FIELD.default_value = 0
BSEROLEUSETOOL_BUFFID_FIELD.type = 5
BSEROLEUSETOOL_BUFFID_FIELD.cpp_type = 1

BSEROLEUSETOOL_TYPE_FIELD.name = "type"
BSEROLEUSETOOL_TYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleUseTool.type"
BSEROLEUSETOOL_TYPE_FIELD.number = 5
BSEROLEUSETOOL_TYPE_FIELD.index = 4
BSEROLEUSETOOL_TYPE_FIELD.label = 2
BSEROLEUSETOOL_TYPE_FIELD.has_default_value = false
BSEROLEUSETOOL_TYPE_FIELD.default_value = 0
BSEROLEUSETOOL_TYPE_FIELD.type = 5
BSEROLEUSETOOL_TYPE_FIELD.cpp_type = 1

BSEROLEUSETOOL.name = "BseRoleUseTool"
BSEROLEUSETOOL.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleUseTool"
BSEROLEUSETOOL.nested_types = {}
BSEROLEUSETOOL.enum_types = {}
BSEROLEUSETOOL.fields = {BSEROLEUSETOOL_SESSIONID_FIELD, BSEROLEUSETOOL_SLOT_FIELD, BSEROLEUSETOOL_LAUNCHUSERID_FIELD, BSEROLEUSETOOL_BUFFID_FIELD, BSEROLEUSETOOL_TYPE_FIELD}
BSEROLEUSETOOL.is_extendable = false
BSEROLEUSETOOL.extensions = {}

BseRoleUseTool = protobuf.Message(BSEROLEUSETOOL)
_G.BSEROLEUSETOOL_PB_BSEROLEUSETOOL = BSEROLEUSETOOL

