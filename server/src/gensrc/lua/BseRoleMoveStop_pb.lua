-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseRoleMoveStop_pb', package.seeall)


local BSEROLEMOVESTOP = protobuf.Descriptor();
local BSEROLEMOVESTOP_SESSIONID_FIELD = protobuf.FieldDescriptor();
local BSEROLEMOVESTOP_PASSFRAMES_FIELD = protobuf.FieldDescriptor();
local BSEROLEMOVESTOP_ANGLE_FIELD = protobuf.FieldDescriptor();
local BSEROLEMOVESTOP_X_FIELD = protobuf.FieldDescriptor();
local BSEROLEMOVESTOP_Y_FIELD = protobuf.FieldDescriptor();

BSEROLEMOVESTOP_SESSIONID_FIELD.name = "sessionId"
BSEROLEMOVESTOP_SESSIONID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleMoveStop.sessionId"
BSEROLEMOVESTOP_SESSIONID_FIELD.number = 1
BSEROLEMOVESTOP_SESSIONID_FIELD.index = 0
BSEROLEMOVESTOP_SESSIONID_FIELD.label = 2
BSEROLEMOVESTOP_SESSIONID_FIELD.has_default_value = false
BSEROLEMOVESTOP_SESSIONID_FIELD.default_value = ""
BSEROLEMOVESTOP_SESSIONID_FIELD.type = 9
BSEROLEMOVESTOP_SESSIONID_FIELD.cpp_type = 9

BSEROLEMOVESTOP_PASSFRAMES_FIELD.name = "passFrames"
BSEROLEMOVESTOP_PASSFRAMES_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleMoveStop.passFrames"
BSEROLEMOVESTOP_PASSFRAMES_FIELD.number = 2
BSEROLEMOVESTOP_PASSFRAMES_FIELD.index = 1
BSEROLEMOVESTOP_PASSFRAMES_FIELD.label = 2
BSEROLEMOVESTOP_PASSFRAMES_FIELD.has_default_value = false
BSEROLEMOVESTOP_PASSFRAMES_FIELD.default_value = 0
BSEROLEMOVESTOP_PASSFRAMES_FIELD.type = 13
BSEROLEMOVESTOP_PASSFRAMES_FIELD.cpp_type = 3

BSEROLEMOVESTOP_ANGLE_FIELD.name = "angle"
BSEROLEMOVESTOP_ANGLE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleMoveStop.angle"
BSEROLEMOVESTOP_ANGLE_FIELD.number = 3
BSEROLEMOVESTOP_ANGLE_FIELD.index = 2
BSEROLEMOVESTOP_ANGLE_FIELD.label = 2
BSEROLEMOVESTOP_ANGLE_FIELD.has_default_value = false
BSEROLEMOVESTOP_ANGLE_FIELD.default_value = 0
BSEROLEMOVESTOP_ANGLE_FIELD.type = 5
BSEROLEMOVESTOP_ANGLE_FIELD.cpp_type = 1

BSEROLEMOVESTOP_X_FIELD.name = "x"
BSEROLEMOVESTOP_X_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleMoveStop.x"
BSEROLEMOVESTOP_X_FIELD.number = 4
BSEROLEMOVESTOP_X_FIELD.index = 3
BSEROLEMOVESTOP_X_FIELD.label = 2
BSEROLEMOVESTOP_X_FIELD.has_default_value = false
BSEROLEMOVESTOP_X_FIELD.default_value = 0
BSEROLEMOVESTOP_X_FIELD.type = 5
BSEROLEMOVESTOP_X_FIELD.cpp_type = 1

BSEROLEMOVESTOP_Y_FIELD.name = "y"
BSEROLEMOVESTOP_Y_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleMoveStop.y"
BSEROLEMOVESTOP_Y_FIELD.number = 5
BSEROLEMOVESTOP_Y_FIELD.index = 4
BSEROLEMOVESTOP_Y_FIELD.label = 2
BSEROLEMOVESTOP_Y_FIELD.has_default_value = false
BSEROLEMOVESTOP_Y_FIELD.default_value = 0
BSEROLEMOVESTOP_Y_FIELD.type = 5
BSEROLEMOVESTOP_Y_FIELD.cpp_type = 1

BSEROLEMOVESTOP.name = "BseRoleMoveStop"
BSEROLEMOVESTOP.full_name = ".com.xinqihd.sns.gameserver.proto.BseRoleMoveStop"
BSEROLEMOVESTOP.nested_types = {}
BSEROLEMOVESTOP.enum_types = {}
BSEROLEMOVESTOP.fields = {BSEROLEMOVESTOP_SESSIONID_FIELD, BSEROLEMOVESTOP_PASSFRAMES_FIELD, BSEROLEMOVESTOP_ANGLE_FIELD, BSEROLEMOVESTOP_X_FIELD, BSEROLEMOVESTOP_Y_FIELD}
BSEROLEMOVESTOP.is_extendable = false
BSEROLEMOVESTOP.extensions = {}

BseRoleMoveStop = protobuf.Message(BSEROLEMOVESTOP)
_G.BSEROLEMOVESTOP_PB_BSEROLEMOVESTOP = BSEROLEMOVESTOP

