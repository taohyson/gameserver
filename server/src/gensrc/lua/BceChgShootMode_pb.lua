-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceChgShootMode_pb', package.seeall)


local BCECHGSHOOTMODE = protobuf.Descriptor();
local BCECHGSHOOTMODE_SHOOTMODE_FIELD = protobuf.FieldDescriptor();

BCECHGSHOOTMODE_SHOOTMODE_FIELD.name = "shootmode"
BCECHGSHOOTMODE_SHOOTMODE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceChgShootMode.shootmode"
BCECHGSHOOTMODE_SHOOTMODE_FIELD.number = 1
BCECHGSHOOTMODE_SHOOTMODE_FIELD.index = 0
BCECHGSHOOTMODE_SHOOTMODE_FIELD.label = 2
BCECHGSHOOTMODE_SHOOTMODE_FIELD.has_default_value = false
BCECHGSHOOTMODE_SHOOTMODE_FIELD.default_value = 0
BCECHGSHOOTMODE_SHOOTMODE_FIELD.type = 5
BCECHGSHOOTMODE_SHOOTMODE_FIELD.cpp_type = 1

BCECHGSHOOTMODE.name = "BceChgShootMode"
BCECHGSHOOTMODE.full_name = ".com.xinqihd.sns.gameserver.proto.BceChgShootMode"
BCECHGSHOOTMODE.nested_types = {}
BCECHGSHOOTMODE.enum_types = {}
BCECHGSHOOTMODE.fields = {BCECHGSHOOTMODE_SHOOTMODE_FIELD}
BCECHGSHOOTMODE.is_extendable = false
BCECHGSHOOTMODE.extensions = {}

BceChgShootMode = protobuf.Message(BCECHGSHOOTMODE)
_G.BCECHGSHOOTMODE_PB_BCECHGSHOOTMODE = BCECHGSHOOTMODE

