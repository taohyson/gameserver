-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseUserSync_pb', package.seeall)


local BSEUSERSYNC = protobuf.Descriptor();
local BSEUSERSYNC_RESULT_FIELD = protobuf.FieldDescriptor();

BSEUSERSYNC_RESULT_FIELD.name = "result"
BSEUSERSYNC_RESULT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseUserSync.result"
BSEUSERSYNC_RESULT_FIELD.number = 1
BSEUSERSYNC_RESULT_FIELD.index = 0
BSEUSERSYNC_RESULT_FIELD.label = 1
BSEUSERSYNC_RESULT_FIELD.has_default_value = true
BSEUSERSYNC_RESULT_FIELD.default_value = true
BSEUSERSYNC_RESULT_FIELD.type = 8
BSEUSERSYNC_RESULT_FIELD.cpp_type = 7

BSEUSERSYNC.name = "BseUserSync"
BSEUSERSYNC.full_name = ".com.xinqihd.sns.gameserver.proto.BseUserSync"
BSEUSERSYNC.nested_types = {}
BSEUSERSYNC.enum_types = {}
BSEUSERSYNC.fields = {BSEUSERSYNC_RESULT_FIELD}
BSEUSERSYNC.is_extendable = false
BSEUSERSYNC.extensions = {}

BseUserSync = protobuf.Message(BSEUSERSYNC)
_G.BSEUSERSYNC_PB_BSEUSERSYNC = BSEUSERSYNC

