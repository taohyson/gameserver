-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceGuildLevelUp_pb', package.seeall)


local BCEGUILDLEVELUP = protobuf.Descriptor();
local BCEGUILDLEVELUP_GUILDID_FIELD = protobuf.FieldDescriptor();

BCEGUILDLEVELUP_GUILDID_FIELD.name = "guildID"
BCEGUILDLEVELUP_GUILDID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildLevelUp.guildID"
BCEGUILDLEVELUP_GUILDID_FIELD.number = 1
BCEGUILDLEVELUP_GUILDID_FIELD.index = 0
BCEGUILDLEVELUP_GUILDID_FIELD.label = 2
BCEGUILDLEVELUP_GUILDID_FIELD.has_default_value = false
BCEGUILDLEVELUP_GUILDID_FIELD.default_value = 0
BCEGUILDLEVELUP_GUILDID_FIELD.type = 5
BCEGUILDLEVELUP_GUILDID_FIELD.cpp_type = 1

BCEGUILDLEVELUP.name = "BceGuildLevelUp"
BCEGUILDLEVELUP.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildLevelUp"
BCEGUILDLEVELUP.nested_types = {}
BCEGUILDLEVELUP.enum_types = {}
BCEGUILDLEVELUP.fields = {BCEGUILDLEVELUP_GUILDID_FIELD}
BCEGUILDLEVELUP.is_extendable = false
BCEGUILDLEVELUP.extensions = {}

BceGuildLevelUp = protobuf.Message(BCEGUILDLEVELUP)
_G.BCEGUILDLEVELUP_PB_BCEGUILDLEVELUP = BCEGUILDLEVELUP

