-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseChat_pb', package.seeall)


local BSECHAT = protobuf.Descriptor();
local BSECHAT_MSGTYPE_FIELD = protobuf.FieldDescriptor();
local BSECHAT_MSGCONTENT_FIELD = protobuf.FieldDescriptor();
local BSECHAT_USRID_FIELD = protobuf.FieldDescriptor();
local BSECHAT_USRNICKNAME_FIELD = protobuf.FieldDescriptor();

BSECHAT_MSGTYPE_FIELD.name = "msgType"
BSECHAT_MSGTYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseChat.msgType"
BSECHAT_MSGTYPE_FIELD.number = 1
BSECHAT_MSGTYPE_FIELD.index = 0
BSECHAT_MSGTYPE_FIELD.label = 2
BSECHAT_MSGTYPE_FIELD.has_default_value = false
BSECHAT_MSGTYPE_FIELD.default_value = 0
BSECHAT_MSGTYPE_FIELD.type = 5
BSECHAT_MSGTYPE_FIELD.cpp_type = 1

BSECHAT_MSGCONTENT_FIELD.name = "msgContent"
BSECHAT_MSGCONTENT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseChat.msgContent"
BSECHAT_MSGCONTENT_FIELD.number = 2
BSECHAT_MSGCONTENT_FIELD.index = 1
BSECHAT_MSGCONTENT_FIELD.label = 2
BSECHAT_MSGCONTENT_FIELD.has_default_value = false
BSECHAT_MSGCONTENT_FIELD.default_value = ""
BSECHAT_MSGCONTENT_FIELD.type = 9
BSECHAT_MSGCONTENT_FIELD.cpp_type = 9

BSECHAT_USRID_FIELD.name = "usrId"
BSECHAT_USRID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseChat.usrId"
BSECHAT_USRID_FIELD.number = 3
BSECHAT_USRID_FIELD.index = 2
BSECHAT_USRID_FIELD.label = 1
BSECHAT_USRID_FIELD.has_default_value = false
BSECHAT_USRID_FIELD.default_value = ""
BSECHAT_USRID_FIELD.type = 9
BSECHAT_USRID_FIELD.cpp_type = 9

BSECHAT_USRNICKNAME_FIELD.name = "usrNickname"
BSECHAT_USRNICKNAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseChat.usrNickname"
BSECHAT_USRNICKNAME_FIELD.number = 4
BSECHAT_USRNICKNAME_FIELD.index = 3
BSECHAT_USRNICKNAME_FIELD.label = 1
BSECHAT_USRNICKNAME_FIELD.has_default_value = false
BSECHAT_USRNICKNAME_FIELD.default_value = ""
BSECHAT_USRNICKNAME_FIELD.type = 9
BSECHAT_USRNICKNAME_FIELD.cpp_type = 9

BSECHAT.name = "BseChat"
BSECHAT.full_name = ".com.xinqihd.sns.gameserver.proto.BseChat"
BSECHAT.nested_types = {}
BSECHAT.enum_types = {}
BSECHAT.fields = {BSECHAT_MSGTYPE_FIELD, BSECHAT_MSGCONTENT_FIELD, BSECHAT_USRID_FIELD, BSECHAT_USRNICKNAME_FIELD}
BSECHAT.is_extendable = false
BSECHAT.extensions = {}

BseChat = protobuf.Message(BSECHAT)
_G.BSECHAT_PB_BSECHAT = BSECHAT

