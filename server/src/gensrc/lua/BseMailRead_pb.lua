-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseMailRead_pb', package.seeall)


local BSEMAILREAD = protobuf.Descriptor();
local BSEMAILREAD_SUCCEED_FIELD = protobuf.FieldDescriptor();

BSEMAILREAD_SUCCEED_FIELD.name = "succeed"
BSEMAILREAD_SUCCEED_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseMailRead.succeed"
BSEMAILREAD_SUCCEED_FIELD.number = 1
BSEMAILREAD_SUCCEED_FIELD.index = 0
BSEMAILREAD_SUCCEED_FIELD.label = 1
BSEMAILREAD_SUCCEED_FIELD.has_default_value = true
BSEMAILREAD_SUCCEED_FIELD.default_value = true
BSEMAILREAD_SUCCEED_FIELD.type = 8
BSEMAILREAD_SUCCEED_FIELD.cpp_type = 7

BSEMAILREAD.name = "BseMailRead"
BSEMAILREAD.full_name = ".com.xinqihd.sns.gameserver.proto.BseMailRead"
BSEMAILREAD.nested_types = {}
BSEMAILREAD.enum_types = {}
BSEMAILREAD.fields = {BSEMAILREAD_SUCCEED_FIELD}
BSEMAILREAD.is_extendable = false
BSEMAILREAD.extensions = {}

BseMailRead = protobuf.Message(BSEMAILREAD)
_G.BSEMAILREAD_PB_BSEMAILREAD = BSEMAILREAD

