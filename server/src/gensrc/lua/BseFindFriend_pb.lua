-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseFindFriend_pb', package.seeall)


local BSEFINDFRIEND = protobuf.Descriptor();
local BSEFINDFRIEND_RESULT_FIELD = protobuf.FieldDescriptor();
local BSEFINDFRIEND_MESSAGE_FIELD = protobuf.FieldDescriptor();
local BSEFINDFRIEND_USERID_FIELD = protobuf.FieldDescriptor();
local BSEFINDFRIEND_ROLENAME_FIELD = protobuf.FieldDescriptor();
local BSEFINDFRIEND_LEVEL_FIELD = protobuf.FieldDescriptor();

BSEFINDFRIEND_RESULT_FIELD.name = "result"
BSEFINDFRIEND_RESULT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFindFriend.result"
BSEFINDFRIEND_RESULT_FIELD.number = 1
BSEFINDFRIEND_RESULT_FIELD.index = 0
BSEFINDFRIEND_RESULT_FIELD.label = 2
BSEFINDFRIEND_RESULT_FIELD.has_default_value = false
BSEFINDFRIEND_RESULT_FIELD.default_value = 0
BSEFINDFRIEND_RESULT_FIELD.type = 5
BSEFINDFRIEND_RESULT_FIELD.cpp_type = 1

BSEFINDFRIEND_MESSAGE_FIELD.name = "message"
BSEFINDFRIEND_MESSAGE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFindFriend.message"
BSEFINDFRIEND_MESSAGE_FIELD.number = 2
BSEFINDFRIEND_MESSAGE_FIELD.index = 1
BSEFINDFRIEND_MESSAGE_FIELD.label = 2
BSEFINDFRIEND_MESSAGE_FIELD.has_default_value = false
BSEFINDFRIEND_MESSAGE_FIELD.default_value = ""
BSEFINDFRIEND_MESSAGE_FIELD.type = 9
BSEFINDFRIEND_MESSAGE_FIELD.cpp_type = 9

BSEFINDFRIEND_USERID_FIELD.name = "userid"
BSEFINDFRIEND_USERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFindFriend.userid"
BSEFINDFRIEND_USERID_FIELD.number = 3
BSEFINDFRIEND_USERID_FIELD.index = 2
BSEFINDFRIEND_USERID_FIELD.label = 3
BSEFINDFRIEND_USERID_FIELD.has_default_value = false
BSEFINDFRIEND_USERID_FIELD.default_value = {}
BSEFINDFRIEND_USERID_FIELD.type = 9
BSEFINDFRIEND_USERID_FIELD.cpp_type = 9

BSEFINDFRIEND_ROLENAME_FIELD.name = "rolename"
BSEFINDFRIEND_ROLENAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFindFriend.rolename"
BSEFINDFRIEND_ROLENAME_FIELD.number = 4
BSEFINDFRIEND_ROLENAME_FIELD.index = 3
BSEFINDFRIEND_ROLENAME_FIELD.label = 3
BSEFINDFRIEND_ROLENAME_FIELD.has_default_value = false
BSEFINDFRIEND_ROLENAME_FIELD.default_value = {}
BSEFINDFRIEND_ROLENAME_FIELD.type = 9
BSEFINDFRIEND_ROLENAME_FIELD.cpp_type = 9

BSEFINDFRIEND_LEVEL_FIELD.name = "level"
BSEFINDFRIEND_LEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFindFriend.level"
BSEFINDFRIEND_LEVEL_FIELD.number = 5
BSEFINDFRIEND_LEVEL_FIELD.index = 4
BSEFINDFRIEND_LEVEL_FIELD.label = 3
BSEFINDFRIEND_LEVEL_FIELD.has_default_value = false
BSEFINDFRIEND_LEVEL_FIELD.default_value = {}
BSEFINDFRIEND_LEVEL_FIELD.type = 5
BSEFINDFRIEND_LEVEL_FIELD.cpp_type = 1

BSEFINDFRIEND.name = "BseFindFriend"
BSEFINDFRIEND.full_name = ".com.xinqihd.sns.gameserver.proto.BseFindFriend"
BSEFINDFRIEND.nested_types = {}
BSEFINDFRIEND.enum_types = {}
BSEFINDFRIEND.fields = {BSEFINDFRIEND_RESULT_FIELD, BSEFINDFRIEND_MESSAGE_FIELD, BSEFINDFRIEND_USERID_FIELD, BSEFINDFRIEND_ROLENAME_FIELD, BSEFINDFRIEND_LEVEL_FIELD}
BSEFINDFRIEND.is_extendable = false
BSEFINDFRIEND.extensions = {}

BseFindFriend = protobuf.Message(BSEFINDFRIEND)
_G.BSEFINDFRIEND_PB_BSEFINDFRIEND = BSEFINDFRIEND

