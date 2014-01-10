-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('RpcRoomManager_pb', package.seeall)


local USERSESSIONKEY = protobuf.Descriptor();
local USERSESSIONKEY_USERSESSIONKEY_FIELD = protobuf.FieldDescriptor();
local ROOMSESSIONKEY = protobuf.Descriptor();
local ROOMSESSIONKEY_ROOMSESSIONKEY_FIELD = protobuf.FieldDescriptor();
local ROOMANDUSERSESSIONKEY = protobuf.Descriptor();
local ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD = protobuf.FieldDescriptor();
local ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD = protobuf.FieldDescriptor();
local READYSTART = protobuf.Descriptor();
local READYSTART_USERSESSIONKEY_FIELD = protobuf.FieldDescriptor();
local READYSTART_ISREADY_FIELD = protobuf.FieldDescriptor();
local ROOMMAP = protobuf.Descriptor();
local ROOMMAP_USERSESSIONKEY_FIELD = protobuf.FieldDescriptor();
local ROOMMAP_MAPID_FIELD = protobuf.FieldDescriptor();
local EDITSEAT = protobuf.Descriptor();
local EDITSEAT_USERSESSIONKEY_FIELD = protobuf.FieldDescriptor();
local EDITSEAT_INDEX_FIELD = protobuf.FieldDescriptor();
local EDITSEAT_ISOPEN_FIELD = protobuf.FieldDescriptor();

USERSESSIONKEY_USERSESSIONKEY_FIELD.name = "userSessionKey"
USERSESSIONKEY_USERSESSIONKEY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.UserSessionKey.userSessionKey"
USERSESSIONKEY_USERSESSIONKEY_FIELD.number = 1
USERSESSIONKEY_USERSESSIONKEY_FIELD.index = 0
USERSESSIONKEY_USERSESSIONKEY_FIELD.label = 1
USERSESSIONKEY_USERSESSIONKEY_FIELD.has_default_value = false
USERSESSIONKEY_USERSESSIONKEY_FIELD.default_value = ""
USERSESSIONKEY_USERSESSIONKEY_FIELD.type = 12
USERSESSIONKEY_USERSESSIONKEY_FIELD.cpp_type = 9

USERSESSIONKEY.name = "UserSessionKey"
USERSESSIONKEY.full_name = ".com.xinqihd.sns.gameserver.proto.UserSessionKey"
USERSESSIONKEY.nested_types = {}
USERSESSIONKEY.enum_types = {}
USERSESSIONKEY.fields = {USERSESSIONKEY_USERSESSIONKEY_FIELD}
USERSESSIONKEY.is_extendable = false
USERSESSIONKEY.extensions = {}
ROOMSESSIONKEY_ROOMSESSIONKEY_FIELD.name = "roomSessionKey"
ROOMSESSIONKEY_ROOMSESSIONKEY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoomSessionKey.roomSessionKey"
ROOMSESSIONKEY_ROOMSESSIONKEY_FIELD.number = 1
ROOMSESSIONKEY_ROOMSESSIONKEY_FIELD.index = 0
ROOMSESSIONKEY_ROOMSESSIONKEY_FIELD.label = 1
ROOMSESSIONKEY_ROOMSESSIONKEY_FIELD.has_default_value = false
ROOMSESSIONKEY_ROOMSESSIONKEY_FIELD.default_value = ""
ROOMSESSIONKEY_ROOMSESSIONKEY_FIELD.type = 12
ROOMSESSIONKEY_ROOMSESSIONKEY_FIELD.cpp_type = 9

ROOMSESSIONKEY.name = "RoomSessionKey"
ROOMSESSIONKEY.full_name = ".com.xinqihd.sns.gameserver.proto.RoomSessionKey"
ROOMSESSIONKEY.nested_types = {}
ROOMSESSIONKEY.enum_types = {}
ROOMSESSIONKEY.fields = {ROOMSESSIONKEY_ROOMSESSIONKEY_FIELD}
ROOMSESSIONKEY.is_extendable = false
ROOMSESSIONKEY.extensions = {}
ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD.name = "roomSessionKey"
ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoomAndUserSessionKey.roomSessionKey"
ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD.number = 1
ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD.index = 0
ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD.label = 1
ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD.has_default_value = false
ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD.default_value = nil
ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD.message_type = ROOMSESSIONKEY
ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD.type = 11
ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD.cpp_type = 10

ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD.name = "userSessionKey"
ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoomAndUserSessionKey.userSessionKey"
ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD.number = 2
ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD.index = 1
ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD.label = 1
ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD.has_default_value = false
ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD.default_value = nil
ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD.message_type = USERSESSIONKEY
ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD.type = 11
ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD.cpp_type = 10

ROOMANDUSERSESSIONKEY.name = "RoomAndUserSessionKey"
ROOMANDUSERSESSIONKEY.full_name = ".com.xinqihd.sns.gameserver.proto.RoomAndUserSessionKey"
ROOMANDUSERSESSIONKEY.nested_types = {}
ROOMANDUSERSESSIONKEY.enum_types = {}
ROOMANDUSERSESSIONKEY.fields = {ROOMANDUSERSESSIONKEY_ROOMSESSIONKEY_FIELD, ROOMANDUSERSESSIONKEY_USERSESSIONKEY_FIELD}
ROOMANDUSERSESSIONKEY.is_extendable = false
ROOMANDUSERSESSIONKEY.extensions = {}
READYSTART_USERSESSIONKEY_FIELD.name = "userSessionKey"
READYSTART_USERSESSIONKEY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ReadyStart.userSessionKey"
READYSTART_USERSESSIONKEY_FIELD.number = 1
READYSTART_USERSESSIONKEY_FIELD.index = 0
READYSTART_USERSESSIONKEY_FIELD.label = 1
READYSTART_USERSESSIONKEY_FIELD.has_default_value = false
READYSTART_USERSESSIONKEY_FIELD.default_value = nil
READYSTART_USERSESSIONKEY_FIELD.message_type = USERSESSIONKEY
READYSTART_USERSESSIONKEY_FIELD.type = 11
READYSTART_USERSESSIONKEY_FIELD.cpp_type = 10

READYSTART_ISREADY_FIELD.name = "isReady"
READYSTART_ISREADY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.ReadyStart.isReady"
READYSTART_ISREADY_FIELD.number = 2
READYSTART_ISREADY_FIELD.index = 1
READYSTART_ISREADY_FIELD.label = 1
READYSTART_ISREADY_FIELD.has_default_value = false
READYSTART_ISREADY_FIELD.default_value = false
READYSTART_ISREADY_FIELD.type = 8
READYSTART_ISREADY_FIELD.cpp_type = 7

READYSTART.name = "ReadyStart"
READYSTART.full_name = ".com.xinqihd.sns.gameserver.proto.ReadyStart"
READYSTART.nested_types = {}
READYSTART.enum_types = {}
READYSTART.fields = {READYSTART_USERSESSIONKEY_FIELD, READYSTART_ISREADY_FIELD}
READYSTART.is_extendable = false
READYSTART.extensions = {}
ROOMMAP_USERSESSIONKEY_FIELD.name = "userSessionKey"
ROOMMAP_USERSESSIONKEY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoomMap.userSessionKey"
ROOMMAP_USERSESSIONKEY_FIELD.number = 1
ROOMMAP_USERSESSIONKEY_FIELD.index = 0
ROOMMAP_USERSESSIONKEY_FIELD.label = 1
ROOMMAP_USERSESSIONKEY_FIELD.has_default_value = false
ROOMMAP_USERSESSIONKEY_FIELD.default_value = nil
ROOMMAP_USERSESSIONKEY_FIELD.message_type = USERSESSIONKEY
ROOMMAP_USERSESSIONKEY_FIELD.type = 11
ROOMMAP_USERSESSIONKEY_FIELD.cpp_type = 10

ROOMMAP_MAPID_FIELD.name = "mapid"
ROOMMAP_MAPID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoomMap.mapid"
ROOMMAP_MAPID_FIELD.number = 2
ROOMMAP_MAPID_FIELD.index = 1
ROOMMAP_MAPID_FIELD.label = 1
ROOMMAP_MAPID_FIELD.has_default_value = false
ROOMMAP_MAPID_FIELD.default_value = ""
ROOMMAP_MAPID_FIELD.type = 9
ROOMMAP_MAPID_FIELD.cpp_type = 9

ROOMMAP.name = "RoomMap"
ROOMMAP.full_name = ".com.xinqihd.sns.gameserver.proto.RoomMap"
ROOMMAP.nested_types = {}
ROOMMAP.enum_types = {}
ROOMMAP.fields = {ROOMMAP_USERSESSIONKEY_FIELD, ROOMMAP_MAPID_FIELD}
ROOMMAP.is_extendable = false
ROOMMAP.extensions = {}
EDITSEAT_USERSESSIONKEY_FIELD.name = "userSessionKey"
EDITSEAT_USERSESSIONKEY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.EditSeat.userSessionKey"
EDITSEAT_USERSESSIONKEY_FIELD.number = 1
EDITSEAT_USERSESSIONKEY_FIELD.index = 0
EDITSEAT_USERSESSIONKEY_FIELD.label = 1
EDITSEAT_USERSESSIONKEY_FIELD.has_default_value = false
EDITSEAT_USERSESSIONKEY_FIELD.default_value = nil
EDITSEAT_USERSESSIONKEY_FIELD.message_type = USERSESSIONKEY
EDITSEAT_USERSESSIONKEY_FIELD.type = 11
EDITSEAT_USERSESSIONKEY_FIELD.cpp_type = 10

EDITSEAT_INDEX_FIELD.name = "index"
EDITSEAT_INDEX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.EditSeat.index"
EDITSEAT_INDEX_FIELD.number = 2
EDITSEAT_INDEX_FIELD.index = 1
EDITSEAT_INDEX_FIELD.label = 1
EDITSEAT_INDEX_FIELD.has_default_value = false
EDITSEAT_INDEX_FIELD.default_value = 0
EDITSEAT_INDEX_FIELD.type = 13
EDITSEAT_INDEX_FIELD.cpp_type = 3

EDITSEAT_ISOPEN_FIELD.name = "isOpen"
EDITSEAT_ISOPEN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.EditSeat.isOpen"
EDITSEAT_ISOPEN_FIELD.number = 3
EDITSEAT_ISOPEN_FIELD.index = 2
EDITSEAT_ISOPEN_FIELD.label = 1
EDITSEAT_ISOPEN_FIELD.has_default_value = false
EDITSEAT_ISOPEN_FIELD.default_value = false
EDITSEAT_ISOPEN_FIELD.type = 8
EDITSEAT_ISOPEN_FIELD.cpp_type = 7

EDITSEAT.name = "EditSeat"
EDITSEAT.full_name = ".com.xinqihd.sns.gameserver.proto.EditSeat"
EDITSEAT.nested_types = {}
EDITSEAT.enum_types = {}
EDITSEAT.fields = {EDITSEAT_USERSESSIONKEY_FIELD, EDITSEAT_INDEX_FIELD, EDITSEAT_ISOPEN_FIELD}
EDITSEAT.is_extendable = false
EDITSEAT.extensions = {}

EditSeat = protobuf.Message(EDITSEAT)
ReadyStart = protobuf.Message(READYSTART)
RoomAndUserSessionKey = protobuf.Message(ROOMANDUSERSESSIONKEY)
RoomMap = protobuf.Message(ROOMMAP)
RoomSessionKey = protobuf.Message(ROOMSESSIONKEY)
UserSessionKey = protobuf.Message(USERSESSIONKEY)
_G.EDITSEAT_PB_EDITSEAT = EDITSEAT
_G.READYSTART_PB_READYSTART = READYSTART
_G.ROOMANDUSERSESSIONKEY_PB_ROOMANDUSERSESSIONKEY = ROOMANDUSERSESSIONKEY
_G.ROOMMAP_PB_ROOMMAP = ROOMMAP
_G.ROOMSESSIONKEY_PB_ROOMSESSIONKEY = ROOMSESSIONKEY
_G.USERSESSIONKEY_PB_USERSESSIONKEY = USERSESSIONKEY

