-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceRoleMoveStart_pb', package.seeall)


local BCEROLEMOVESTART = protobuf.Descriptor();
local BCEROLEMOVESTART_FRAME_FIELD = protobuf.FieldDescriptor();
local BCEROLEMOVESTART_DIRECTION_FIELD = protobuf.FieldDescriptor();

BCEROLEMOVESTART_FRAME_FIELD.name = "frame"
BCEROLEMOVESTART_FRAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceRoleMoveStart.frame"
BCEROLEMOVESTART_FRAME_FIELD.number = 1
BCEROLEMOVESTART_FRAME_FIELD.index = 0
BCEROLEMOVESTART_FRAME_FIELD.label = 2
BCEROLEMOVESTART_FRAME_FIELD.has_default_value = false
BCEROLEMOVESTART_FRAME_FIELD.default_value = 0
BCEROLEMOVESTART_FRAME_FIELD.type = 13
BCEROLEMOVESTART_FRAME_FIELD.cpp_type = 3

BCEROLEMOVESTART_DIRECTION_FIELD.name = "direction"
BCEROLEMOVESTART_DIRECTION_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceRoleMoveStart.direction"
BCEROLEMOVESTART_DIRECTION_FIELD.number = 2
BCEROLEMOVESTART_DIRECTION_FIELD.index = 1
BCEROLEMOVESTART_DIRECTION_FIELD.label = 2
BCEROLEMOVESTART_DIRECTION_FIELD.has_default_value = false
BCEROLEMOVESTART_DIRECTION_FIELD.default_value = 0
BCEROLEMOVESTART_DIRECTION_FIELD.type = 13
BCEROLEMOVESTART_DIRECTION_FIELD.cpp_type = 3

BCEROLEMOVESTART.name = "BceRoleMoveStart"
BCEROLEMOVESTART.full_name = ".com.xinqihd.sns.gameserver.proto.BceRoleMoveStart"
BCEROLEMOVESTART.nested_types = {}
BCEROLEMOVESTART.enum_types = {}
BCEROLEMOVESTART.fields = {BCEROLEMOVESTART_FRAME_FIELD, BCEROLEMOVESTART_DIRECTION_FIELD}
BCEROLEMOVESTART.is_extendable = false
BCEROLEMOVESTART.extensions = {}

BceRoleMoveStart = protobuf.Message(BCEROLEMOVESTART)
_G.BCEROLEMOVESTART_PB_BCEROLEMOVESTART = BCEROLEMOVESTART

