-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGuildPosChange_pb', package.seeall)


local BSEGUILDPOSCHANGE = protobuf.Descriptor();
local BSEGUILDPOSCHANGE_RESULT_FIELD = protobuf.FieldDescriptor();
local BSEGUILDPOSCHANGE_GUILDINFO_FIELD = protobuf.FieldDescriptor();

BSEGUILDPOSCHANGE_RESULT_FIELD.name = "result"
BSEGUILDPOSCHANGE_RESULT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildPosChange.result"
BSEGUILDPOSCHANGE_RESULT_FIELD.number = 1
BSEGUILDPOSCHANGE_RESULT_FIELD.index = 0
BSEGUILDPOSCHANGE_RESULT_FIELD.label = 2
BSEGUILDPOSCHANGE_RESULT_FIELD.has_default_value = false
BSEGUILDPOSCHANGE_RESULT_FIELD.default_value = 0
BSEGUILDPOSCHANGE_RESULT_FIELD.type = 5
BSEGUILDPOSCHANGE_RESULT_FIELD.cpp_type = 1

BSEGUILDPOSCHANGE_GUILDINFO_FIELD.name = "guildInfo"
BSEGUILDPOSCHANGE_GUILDINFO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildPosChange.guildInfo"
BSEGUILDPOSCHANGE_GUILDINFO_FIELD.number = 2
BSEGUILDPOSCHANGE_GUILDINFO_FIELD.index = 1
BSEGUILDPOSCHANGE_GUILDINFO_FIELD.label = 1
BSEGUILDPOSCHANGE_GUILDINFO_FIELD.has_default_value = false
BSEGUILDPOSCHANGE_GUILDINFO_FIELD.default_value = nil
BSEGUILDPOSCHANGE_GUILDINFO_FIELD.message_type = GUILDINFO_PB_GUILDINFO
BSEGUILDPOSCHANGE_GUILDINFO_FIELD.type = 11
BSEGUILDPOSCHANGE_GUILDINFO_FIELD.cpp_type = 10

BSEGUILDPOSCHANGE.name = "BseGuildPosChange"
BSEGUILDPOSCHANGE.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildPosChange"
BSEGUILDPOSCHANGE.nested_types = {}
BSEGUILDPOSCHANGE.enum_types = {}
BSEGUILDPOSCHANGE.fields = {BSEGUILDPOSCHANGE_RESULT_FIELD, BSEGUILDPOSCHANGE_GUILDINFO_FIELD}
BSEGUILDPOSCHANGE.is_extendable = false
BSEGUILDPOSCHANGE.extensions = {}

BseGuildPosChange = protobuf.Message(BSEGUILDPOSCHANGE)
_G.BSEGUILDPOSCHANGE_PB_BSEGUILDPOSCHANGE = BSEGUILDPOSCHANGE

