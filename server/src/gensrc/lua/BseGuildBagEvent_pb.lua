-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGuildBagEvent_pb', package.seeall)


local GUILDBAGEVENT = protobuf.Descriptor();
local GUILDBAGEVENT_TIME_FIELD = protobuf.FieldDescriptor();
local GUILDBAGEVENT_ROLENAME_FIELD = protobuf.FieldDescriptor();
local GUILDBAGEVENT_ACTION_FIELD = protobuf.FieldDescriptor();
local GUILDBAGEVENT_ITEM_FIELD = protobuf.FieldDescriptor();
local BSEGUILDBAGEVENT = protobuf.Descriptor();
local BSEGUILDBAGEVENT_GUILDID_FIELD = protobuf.FieldDescriptor();
local BSEGUILDBAGEVENT_EVENT_FIELD = protobuf.FieldDescriptor();

GUILDBAGEVENT_TIME_FIELD.name = "time"
GUILDBAGEVENT_TIME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildBagEvent.time"
GUILDBAGEVENT_TIME_FIELD.number = 1
GUILDBAGEVENT_TIME_FIELD.index = 0
GUILDBAGEVENT_TIME_FIELD.label = 1
GUILDBAGEVENT_TIME_FIELD.has_default_value = false
GUILDBAGEVENT_TIME_FIELD.default_value = ""
GUILDBAGEVENT_TIME_FIELD.type = 9
GUILDBAGEVENT_TIME_FIELD.cpp_type = 9

GUILDBAGEVENT_ROLENAME_FIELD.name = "rolename"
GUILDBAGEVENT_ROLENAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildBagEvent.rolename"
GUILDBAGEVENT_ROLENAME_FIELD.number = 3
GUILDBAGEVENT_ROLENAME_FIELD.index = 1
GUILDBAGEVENT_ROLENAME_FIELD.label = 1
GUILDBAGEVENT_ROLENAME_FIELD.has_default_value = false
GUILDBAGEVENT_ROLENAME_FIELD.default_value = ""
GUILDBAGEVENT_ROLENAME_FIELD.type = 9
GUILDBAGEVENT_ROLENAME_FIELD.cpp_type = 9

GUILDBAGEVENT_ACTION_FIELD.name = "action"
GUILDBAGEVENT_ACTION_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildBagEvent.action"
GUILDBAGEVENT_ACTION_FIELD.number = 4
GUILDBAGEVENT_ACTION_FIELD.index = 2
GUILDBAGEVENT_ACTION_FIELD.label = 1
GUILDBAGEVENT_ACTION_FIELD.has_default_value = false
GUILDBAGEVENT_ACTION_FIELD.default_value = ""
GUILDBAGEVENT_ACTION_FIELD.type = 9
GUILDBAGEVENT_ACTION_FIELD.cpp_type = 9

GUILDBAGEVENT_ITEM_FIELD.name = "item"
GUILDBAGEVENT_ITEM_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.GuildBagEvent.item"
GUILDBAGEVENT_ITEM_FIELD.number = 5
GUILDBAGEVENT_ITEM_FIELD.index = 3
GUILDBAGEVENT_ITEM_FIELD.label = 1
GUILDBAGEVENT_ITEM_FIELD.has_default_value = false
GUILDBAGEVENT_ITEM_FIELD.default_value = ""
GUILDBAGEVENT_ITEM_FIELD.type = 9
GUILDBAGEVENT_ITEM_FIELD.cpp_type = 9

GUILDBAGEVENT.name = "GuildBagEvent"
GUILDBAGEVENT.full_name = ".com.xinqihd.sns.gameserver.proto.GuildBagEvent"
GUILDBAGEVENT.nested_types = {}
GUILDBAGEVENT.enum_types = {}
GUILDBAGEVENT.fields = {GUILDBAGEVENT_TIME_FIELD, GUILDBAGEVENT_ROLENAME_FIELD, GUILDBAGEVENT_ACTION_FIELD, GUILDBAGEVENT_ITEM_FIELD}
GUILDBAGEVENT.is_extendable = false
GUILDBAGEVENT.extensions = {}
BSEGUILDBAGEVENT_GUILDID_FIELD.name = "guildID"
BSEGUILDBAGEVENT_GUILDID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildBagEvent.guildID"
BSEGUILDBAGEVENT_GUILDID_FIELD.number = 1
BSEGUILDBAGEVENT_GUILDID_FIELD.index = 0
BSEGUILDBAGEVENT_GUILDID_FIELD.label = 1
BSEGUILDBAGEVENT_GUILDID_FIELD.has_default_value = false
BSEGUILDBAGEVENT_GUILDID_FIELD.default_value = ""
BSEGUILDBAGEVENT_GUILDID_FIELD.type = 9
BSEGUILDBAGEVENT_GUILDID_FIELD.cpp_type = 9

BSEGUILDBAGEVENT_EVENT_FIELD.name = "event"
BSEGUILDBAGEVENT_EVENT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildBagEvent.event"
BSEGUILDBAGEVENT_EVENT_FIELD.number = 2
BSEGUILDBAGEVENT_EVENT_FIELD.index = 1
BSEGUILDBAGEVENT_EVENT_FIELD.label = 3
BSEGUILDBAGEVENT_EVENT_FIELD.has_default_value = false
BSEGUILDBAGEVENT_EVENT_FIELD.default_value = {}
BSEGUILDBAGEVENT_EVENT_FIELD.message_type = GUILDBAGEVENT
BSEGUILDBAGEVENT_EVENT_FIELD.type = 11
BSEGUILDBAGEVENT_EVENT_FIELD.cpp_type = 10

BSEGUILDBAGEVENT.name = "BseGuildBagEvent"
BSEGUILDBAGEVENT.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildBagEvent"
BSEGUILDBAGEVENT.nested_types = {}
BSEGUILDBAGEVENT.enum_types = {}
BSEGUILDBAGEVENT.fields = {BSEGUILDBAGEVENT_GUILDID_FIELD, BSEGUILDBAGEVENT_EVENT_FIELD}
BSEGUILDBAGEVENT.is_extendable = false
BSEGUILDBAGEVENT.extensions = {}

BseGuildBagEvent = protobuf.Message(BSEGUILDBAGEVENT)
GuildBagEvent = protobuf.Message(GUILDBAGEVENT)
_G.BSEGUILDBAGEVENT_PB_BSEGUILDBAGEVENT = BSEGUILDBAGEVENT
_G.GUILDBAGEVENT_PB_GUILDBAGEVENT = GUILDBAGEVENT

