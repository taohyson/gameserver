-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseJoinGuild_pb', package.seeall)


local BSEJOINGUILD = protobuf.Descriptor();
local BSEJOINGUILD_GUILDID_FIELD = protobuf.FieldDescriptor();
local BSEJOINGUILD_GUILDNAME_FIELD = protobuf.FieldDescriptor();
local BSEJOINGUILD_RESULT_FIELD = protobuf.FieldDescriptor();
local BSEJOINGUILD_GUILDINFO_FIELD = protobuf.FieldDescriptor();

BSEJOINGUILD_GUILDID_FIELD.name = "guildID"
BSEJOINGUILD_GUILDID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseJoinGuild.guildID"
BSEJOINGUILD_GUILDID_FIELD.number = 1
BSEJOINGUILD_GUILDID_FIELD.index = 0
BSEJOINGUILD_GUILDID_FIELD.label = 1
BSEJOINGUILD_GUILDID_FIELD.has_default_value = false
BSEJOINGUILD_GUILDID_FIELD.default_value = 0
BSEJOINGUILD_GUILDID_FIELD.type = 5
BSEJOINGUILD_GUILDID_FIELD.cpp_type = 1

BSEJOINGUILD_GUILDNAME_FIELD.name = "guildName"
BSEJOINGUILD_GUILDNAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseJoinGuild.guildName"
BSEJOINGUILD_GUILDNAME_FIELD.number = 2
BSEJOINGUILD_GUILDNAME_FIELD.index = 1
BSEJOINGUILD_GUILDNAME_FIELD.label = 1
BSEJOINGUILD_GUILDNAME_FIELD.has_default_value = false
BSEJOINGUILD_GUILDNAME_FIELD.default_value = ""
BSEJOINGUILD_GUILDNAME_FIELD.type = 9
BSEJOINGUILD_GUILDNAME_FIELD.cpp_type = 9

BSEJOINGUILD_RESULT_FIELD.name = "result"
BSEJOINGUILD_RESULT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseJoinGuild.result"
BSEJOINGUILD_RESULT_FIELD.number = 3
BSEJOINGUILD_RESULT_FIELD.index = 2
BSEJOINGUILD_RESULT_FIELD.label = 1
BSEJOINGUILD_RESULT_FIELD.has_default_value = false
BSEJOINGUILD_RESULT_FIELD.default_value = 0
BSEJOINGUILD_RESULT_FIELD.type = 5
BSEJOINGUILD_RESULT_FIELD.cpp_type = 1

BSEJOINGUILD_GUILDINFO_FIELD.name = "guildInfo"
BSEJOINGUILD_GUILDINFO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseJoinGuild.guildInfo"
BSEJOINGUILD_GUILDINFO_FIELD.number = 4
BSEJOINGUILD_GUILDINFO_FIELD.index = 3
BSEJOINGUILD_GUILDINFO_FIELD.label = 1
BSEJOINGUILD_GUILDINFO_FIELD.has_default_value = false
BSEJOINGUILD_GUILDINFO_FIELD.default_value = nil
BSEJOINGUILD_GUILDINFO_FIELD.message_type = GUILDINFO_PB_GUILDINFO
BSEJOINGUILD_GUILDINFO_FIELD.type = 11
BSEJOINGUILD_GUILDINFO_FIELD.cpp_type = 10

BSEJOINGUILD.name = "BseJoinGuild"
BSEJOINGUILD.full_name = ".com.xinqihd.sns.gameserver.proto.BseJoinGuild"
BSEJOINGUILD.nested_types = {}
BSEJOINGUILD.enum_types = {}
BSEJOINGUILD.fields = {BSEJOINGUILD_GUILDID_FIELD, BSEJOINGUILD_GUILDNAME_FIELD, BSEJOINGUILD_RESULT_FIELD, BSEJOINGUILD_GUILDINFO_FIELD}
BSEJOINGUILD.is_extendable = false
BSEJOINGUILD.extensions = {}

BseJoinGuild = protobuf.Message(BSEJOINGUILD)
_G.BSEJOINGUILD_PB_BSEJOINGUILD = BSEJOINGUILD

