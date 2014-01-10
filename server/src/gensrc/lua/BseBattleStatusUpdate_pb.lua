-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseBattleStatusUpdate_pb', package.seeall)


local ROLEINFO = protobuf.Descriptor();
local ROLEINFO_ROLENAME_FIELD = protobuf.FieldDescriptor();
local ROLEINFO_SESSIONID_FIELD = protobuf.FieldDescriptor();
local ROLEINFO_WIND_FIELD = protobuf.FieldDescriptor();
local ROLEINFO_BLOOD_FIELD = protobuf.FieldDescriptor();
local ROLEINFO_STRENGTH_FIELD = protobuf.FieldDescriptor();
local ROLEINFO_ENERGY_FIELD = protobuf.FieldDescriptor();
local ROLEINFO_USERMODE_FIELD = protobuf.FieldDescriptor();
local ROLEINFO_CURROUND_FIELD = protobuf.FieldDescriptor();
local ROLEINFO_CAMPID_FIELD = protobuf.FieldDescriptor();
local BSEBATTLESTATUSUPDATE = protobuf.Descriptor();
local BSEBATTLESTATUSUPDATE_SESSIONID_FIELD = protobuf.FieldDescriptor();
local BSEBATTLESTATUSUPDATE_ROLENAME_FIELD = protobuf.FieldDescriptor();
local BSEBATTLESTATUSUPDATE_STATUS_FIELD = protobuf.FieldDescriptor();
local BSEBATTLESTATUSUPDATE_SLOT_FIELD = protobuf.FieldDescriptor();
local BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD = protobuf.FieldDescriptor();
local BSEBATTLESTATUSUPDATE_HURTUSER_FIELD = protobuf.FieldDescriptor();
local BSEBATTLESTATUSUPDATE_PICKBOX_FIELD = protobuf.FieldDescriptor();

ROLEINFO_ROLENAME_FIELD.name = "rolename"
ROLEINFO_ROLENAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleInfo.rolename"
ROLEINFO_ROLENAME_FIELD.number = 1
ROLEINFO_ROLENAME_FIELD.index = 0
ROLEINFO_ROLENAME_FIELD.label = 2
ROLEINFO_ROLENAME_FIELD.has_default_value = false
ROLEINFO_ROLENAME_FIELD.default_value = ""
ROLEINFO_ROLENAME_FIELD.type = 9
ROLEINFO_ROLENAME_FIELD.cpp_type = 9

ROLEINFO_SESSIONID_FIELD.name = "sessionid"
ROLEINFO_SESSIONID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleInfo.sessionid"
ROLEINFO_SESSIONID_FIELD.number = 2
ROLEINFO_SESSIONID_FIELD.index = 1
ROLEINFO_SESSIONID_FIELD.label = 3
ROLEINFO_SESSIONID_FIELD.has_default_value = false
ROLEINFO_SESSIONID_FIELD.default_value = {}
ROLEINFO_SESSIONID_FIELD.type = 9
ROLEINFO_SESSIONID_FIELD.cpp_type = 9

ROLEINFO_WIND_FIELD.name = "wind"
ROLEINFO_WIND_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleInfo.wind"
ROLEINFO_WIND_FIELD.number = 3
ROLEINFO_WIND_FIELD.index = 2
ROLEINFO_WIND_FIELD.label = 2
ROLEINFO_WIND_FIELD.has_default_value = false
ROLEINFO_WIND_FIELD.default_value = 0
ROLEINFO_WIND_FIELD.type = 5
ROLEINFO_WIND_FIELD.cpp_type = 1

ROLEINFO_BLOOD_FIELD.name = "blood"
ROLEINFO_BLOOD_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleInfo.blood"
ROLEINFO_BLOOD_FIELD.number = 7
ROLEINFO_BLOOD_FIELD.index = 3
ROLEINFO_BLOOD_FIELD.label = 3
ROLEINFO_BLOOD_FIELD.has_default_value = false
ROLEINFO_BLOOD_FIELD.default_value = {}
ROLEINFO_BLOOD_FIELD.type = 5
ROLEINFO_BLOOD_FIELD.cpp_type = 1

ROLEINFO_STRENGTH_FIELD.name = "strength"
ROLEINFO_STRENGTH_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleInfo.strength"
ROLEINFO_STRENGTH_FIELD.number = 8
ROLEINFO_STRENGTH_FIELD.index = 4
ROLEINFO_STRENGTH_FIELD.label = 3
ROLEINFO_STRENGTH_FIELD.has_default_value = false
ROLEINFO_STRENGTH_FIELD.default_value = {}
ROLEINFO_STRENGTH_FIELD.type = 5
ROLEINFO_STRENGTH_FIELD.cpp_type = 1

ROLEINFO_ENERGY_FIELD.name = "energy"
ROLEINFO_ENERGY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleInfo.energy"
ROLEINFO_ENERGY_FIELD.number = 9
ROLEINFO_ENERGY_FIELD.index = 5
ROLEINFO_ENERGY_FIELD.label = 3
ROLEINFO_ENERGY_FIELD.has_default_value = false
ROLEINFO_ENERGY_FIELD.default_value = {}
ROLEINFO_ENERGY_FIELD.type = 5
ROLEINFO_ENERGY_FIELD.cpp_type = 1

ROLEINFO_USERMODE_FIELD.name = "userMode"
ROLEINFO_USERMODE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleInfo.userMode"
ROLEINFO_USERMODE_FIELD.number = 10
ROLEINFO_USERMODE_FIELD.index = 6
ROLEINFO_USERMODE_FIELD.label = 3
ROLEINFO_USERMODE_FIELD.has_default_value = false
ROLEINFO_USERMODE_FIELD.default_value = {}
ROLEINFO_USERMODE_FIELD.type = 5
ROLEINFO_USERMODE_FIELD.cpp_type = 1

ROLEINFO_CURROUND_FIELD.name = "curRound"
ROLEINFO_CURROUND_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleInfo.curRound"
ROLEINFO_CURROUND_FIELD.number = 19
ROLEINFO_CURROUND_FIELD.index = 7
ROLEINFO_CURROUND_FIELD.label = 2
ROLEINFO_CURROUND_FIELD.has_default_value = false
ROLEINFO_CURROUND_FIELD.default_value = 0
ROLEINFO_CURROUND_FIELD.type = 5
ROLEINFO_CURROUND_FIELD.cpp_type = 1

ROLEINFO_CAMPID_FIELD.name = "campid"
ROLEINFO_CAMPID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.RoleInfo.campid"
ROLEINFO_CAMPID_FIELD.number = 20
ROLEINFO_CAMPID_FIELD.index = 8
ROLEINFO_CAMPID_FIELD.label = 3
ROLEINFO_CAMPID_FIELD.has_default_value = false
ROLEINFO_CAMPID_FIELD.default_value = {}
ROLEINFO_CAMPID_FIELD.type = 5
ROLEINFO_CAMPID_FIELD.cpp_type = 1

ROLEINFO.name = "RoleInfo"
ROLEINFO.full_name = ".com.xinqihd.sns.gameserver.proto.RoleInfo"
ROLEINFO.nested_types = {}
ROLEINFO.enum_types = {}
ROLEINFO.fields = {ROLEINFO_ROLENAME_FIELD, ROLEINFO_SESSIONID_FIELD, ROLEINFO_WIND_FIELD, ROLEINFO_BLOOD_FIELD, ROLEINFO_STRENGTH_FIELD, ROLEINFO_ENERGY_FIELD, ROLEINFO_USERMODE_FIELD, ROLEINFO_CURROUND_FIELD, ROLEINFO_CAMPID_FIELD}
ROLEINFO.is_extendable = false
ROLEINFO.extensions = {}
BSEBATTLESTATUSUPDATE_SESSIONID_FIELD.name = "sessionid"
BSEBATTLESTATUSUPDATE_SESSIONID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleStatusUpdate.sessionid"
BSEBATTLESTATUSUPDATE_SESSIONID_FIELD.number = 1
BSEBATTLESTATUSUPDATE_SESSIONID_FIELD.index = 0
BSEBATTLESTATUSUPDATE_SESSIONID_FIELD.label = 1
BSEBATTLESTATUSUPDATE_SESSIONID_FIELD.has_default_value = false
BSEBATTLESTATUSUPDATE_SESSIONID_FIELD.default_value = ""
BSEBATTLESTATUSUPDATE_SESSIONID_FIELD.type = 9
BSEBATTLESTATUSUPDATE_SESSIONID_FIELD.cpp_type = 9

BSEBATTLESTATUSUPDATE_ROLENAME_FIELD.name = "rolename"
BSEBATTLESTATUSUPDATE_ROLENAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleStatusUpdate.rolename"
BSEBATTLESTATUSUPDATE_ROLENAME_FIELD.number = 2
BSEBATTLESTATUSUPDATE_ROLENAME_FIELD.index = 1
BSEBATTLESTATUSUPDATE_ROLENAME_FIELD.label = 1
BSEBATTLESTATUSUPDATE_ROLENAME_FIELD.has_default_value = false
BSEBATTLESTATUSUPDATE_ROLENAME_FIELD.default_value = ""
BSEBATTLESTATUSUPDATE_ROLENAME_FIELD.type = 9
BSEBATTLESTATUSUPDATE_ROLENAME_FIELD.cpp_type = 9

BSEBATTLESTATUSUPDATE_STATUS_FIELD.name = "status"
BSEBATTLESTATUSUPDATE_STATUS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleStatusUpdate.status"
BSEBATTLESTATUSUPDATE_STATUS_FIELD.number = 3
BSEBATTLESTATUSUPDATE_STATUS_FIELD.index = 2
BSEBATTLESTATUSUPDATE_STATUS_FIELD.label = 1
BSEBATTLESTATUSUPDATE_STATUS_FIELD.has_default_value = false
BSEBATTLESTATUSUPDATE_STATUS_FIELD.default_value = ""
BSEBATTLESTATUSUPDATE_STATUS_FIELD.type = 9
BSEBATTLESTATUSUPDATE_STATUS_FIELD.cpp_type = 9

BSEBATTLESTATUSUPDATE_SLOT_FIELD.name = "slot"
BSEBATTLESTATUSUPDATE_SLOT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleStatusUpdate.slot"
BSEBATTLESTATUSUPDATE_SLOT_FIELD.number = 4
BSEBATTLESTATUSUPDATE_SLOT_FIELD.index = 3
BSEBATTLESTATUSUPDATE_SLOT_FIELD.label = 3
BSEBATTLESTATUSUPDATE_SLOT_FIELD.has_default_value = false
BSEBATTLESTATUSUPDATE_SLOT_FIELD.default_value = {}
BSEBATTLESTATUSUPDATE_SLOT_FIELD.type = 5
BSEBATTLESTATUSUPDATE_SLOT_FIELD.cpp_type = 1

BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD.name = "roleInfo"
BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleStatusUpdate.roleInfo"
BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD.number = 5
BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD.index = 4
BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD.label = 3
BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD.has_default_value = false
BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD.default_value = {}
BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD.message_type = ROLEINFO
BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD.type = 11
BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD.cpp_type = 10

BSEBATTLESTATUSUPDATE_HURTUSER_FIELD.name = "hurtUser"
BSEBATTLESTATUSUPDATE_HURTUSER_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleStatusUpdate.hurtUser"
BSEBATTLESTATUSUPDATE_HURTUSER_FIELD.number = 9
BSEBATTLESTATUSUPDATE_HURTUSER_FIELD.index = 5
BSEBATTLESTATUSUPDATE_HURTUSER_FIELD.label = 3
BSEBATTLESTATUSUPDATE_HURTUSER_FIELD.has_default_value = false
BSEBATTLESTATUSUPDATE_HURTUSER_FIELD.default_value = {}
BSEBATTLESTATUSUPDATE_HURTUSER_FIELD.message_type = HURTUSERINFO_PB_HURTUSERINFO
BSEBATTLESTATUSUPDATE_HURTUSER_FIELD.type = 11
BSEBATTLESTATUSUPDATE_HURTUSER_FIELD.cpp_type = 10

BSEBATTLESTATUSUPDATE_PICKBOX_FIELD.name = "pickBox"
BSEBATTLESTATUSUPDATE_PICKBOX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleStatusUpdate.pickBox"
BSEBATTLESTATUSUPDATE_PICKBOX_FIELD.number = 11
BSEBATTLESTATUSUPDATE_PICKBOX_FIELD.index = 6
BSEBATTLESTATUSUPDATE_PICKBOX_FIELD.label = 3
BSEBATTLESTATUSUPDATE_PICKBOX_FIELD.has_default_value = false
BSEBATTLESTATUSUPDATE_PICKBOX_FIELD.default_value = {}
BSEBATTLESTATUSUPDATE_PICKBOX_FIELD.message_type = PICKBOXINFO_PB_PICKBOXINFO
BSEBATTLESTATUSUPDATE_PICKBOX_FIELD.type = 11
BSEBATTLESTATUSUPDATE_PICKBOX_FIELD.cpp_type = 10

BSEBATTLESTATUSUPDATE.name = "BseBattleStatusUpdate"
BSEBATTLESTATUSUPDATE.full_name = ".com.xinqihd.sns.gameserver.proto.BseBattleStatusUpdate"
BSEBATTLESTATUSUPDATE.nested_types = {}
BSEBATTLESTATUSUPDATE.enum_types = {}
BSEBATTLESTATUSUPDATE.fields = {BSEBATTLESTATUSUPDATE_SESSIONID_FIELD, BSEBATTLESTATUSUPDATE_ROLENAME_FIELD, BSEBATTLESTATUSUPDATE_STATUS_FIELD, BSEBATTLESTATUSUPDATE_SLOT_FIELD, BSEBATTLESTATUSUPDATE_ROLEINFO_FIELD, BSEBATTLESTATUSUPDATE_HURTUSER_FIELD, BSEBATTLESTATUSUPDATE_PICKBOX_FIELD}
BSEBATTLESTATUSUPDATE.is_extendable = false
BSEBATTLESTATUSUPDATE.extensions = {}

BseBattleStatusUpdate = protobuf.Message(BSEBATTLESTATUSUPDATE)
RoleInfo = protobuf.Message(ROLEINFO)
_G.BSEBATTLESTATUSUPDATE_PB_BSEBATTLESTATUSUPDATE = BSEBATTLESTATUSUPDATE
_G.ROLEINFO_PB_ROLEINFO = ROLEINFO

