-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('AI_pb', package.seeall)


local AIMESSAGE = protobuf.Descriptor();
local AIMESSAGE_SESSION_FIELD = protobuf.FieldDescriptor();
local AIMESSAGE_CONTENT_FIELD = protobuf.FieldDescriptor();

AIMESSAGE_SESSION_FIELD.name = "session"
AIMESSAGE_SESSION_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.AIMessage.session"
AIMESSAGE_SESSION_FIELD.number = 1
AIMESSAGE_SESSION_FIELD.index = 0
AIMESSAGE_SESSION_FIELD.label = 1
AIMESSAGE_SESSION_FIELD.has_default_value = false
AIMESSAGE_SESSION_FIELD.default_value = ""
AIMESSAGE_SESSION_FIELD.type = 12
AIMESSAGE_SESSION_FIELD.cpp_type = 9

AIMESSAGE_CONTENT_FIELD.name = "content"
AIMESSAGE_CONTENT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.AIMessage.content"
AIMESSAGE_CONTENT_FIELD.number = 2
AIMESSAGE_CONTENT_FIELD.index = 1
AIMESSAGE_CONTENT_FIELD.label = 1
AIMESSAGE_CONTENT_FIELD.has_default_value = false
AIMESSAGE_CONTENT_FIELD.default_value = ""
AIMESSAGE_CONTENT_FIELD.type = 12
AIMESSAGE_CONTENT_FIELD.cpp_type = 9

AIMESSAGE.name = "AIMessage"
AIMESSAGE.full_name = ".com.xinqihd.sns.gameserver.proto.AIMessage"
AIMESSAGE.nested_types = {}
AIMESSAGE.enum_types = {}
AIMESSAGE.fields = {AIMESSAGE_SESSION_FIELD, AIMESSAGE_CONTENT_FIELD}
AIMESSAGE.is_extendable = false
AIMESSAGE.extensions = {}

AIMessage = protobuf.Message(AIMESSAGE)
_G.AIMESSAGE_PB_AIMESSAGE = AIMESSAGE

