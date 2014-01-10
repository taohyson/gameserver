-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseEquipment_pb', package.seeall)


local AVATAR = protobuf.Descriptor();
local AVATAR_ID_FIELD = protobuf.FieldDescriptor();
local AVATAR_LAYER_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA = protobuf.Descriptor();
local WEAPONDATA_ID_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_INDEX_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_QUALITY_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_QUALITYCOLOR_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_SNAME_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_EQUIPTYPE_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_ADDATTACK_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_ADDDEFEND_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_ADDAGILITY_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_ADDLUCK_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_ADDBLOOD_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_ADDBLOODPERCENT_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_ADDTHEW_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_ADDDAMAGE_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_ADDSKIN_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_SEX_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_SIGN_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_LV_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_SPECIALACTION_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_RADIUS_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_SRADIUS_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_POWER_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_BULLET_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_ICON_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_NAME_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_INFO_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_SLOT_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_AVATAR_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_EXPSE_FIELD = protobuf.FieldDescriptor();
local WEAPONDATA_EXPBLEND_FIELD = protobuf.FieldDescriptor();
local BSEEQUIPMENT = protobuf.Descriptor();
local BSEEQUIPMENT_WEAPONS_FIELD = protobuf.FieldDescriptor();

AVATAR_ID_FIELD.name = "id"
AVATAR_ID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Avatar.id"
AVATAR_ID_FIELD.number = 1
AVATAR_ID_FIELD.index = 0
AVATAR_ID_FIELD.label = 1
AVATAR_ID_FIELD.has_default_value = false
AVATAR_ID_FIELD.default_value = ""
AVATAR_ID_FIELD.type = 9
AVATAR_ID_FIELD.cpp_type = 9

AVATAR_LAYER_FIELD.name = "layer"
AVATAR_LAYER_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Avatar.layer"
AVATAR_LAYER_FIELD.number = 2
AVATAR_LAYER_FIELD.index = 1
AVATAR_LAYER_FIELD.label = 1
AVATAR_LAYER_FIELD.has_default_value = false
AVATAR_LAYER_FIELD.default_value = ""
AVATAR_LAYER_FIELD.type = 9
AVATAR_LAYER_FIELD.cpp_type = 9

AVATAR.name = "Avatar"
AVATAR.full_name = ".com.xinqihd.sns.gameserver.proto.Avatar"
AVATAR.nested_types = {}
AVATAR.enum_types = {}
AVATAR.fields = {AVATAR_ID_FIELD, AVATAR_LAYER_FIELD}
AVATAR.is_extendable = false
AVATAR.extensions = {}
WEAPONDATA_ID_FIELD.name = "id"
WEAPONDATA_ID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.id"
WEAPONDATA_ID_FIELD.number = 1
WEAPONDATA_ID_FIELD.index = 0
WEAPONDATA_ID_FIELD.label = 2
WEAPONDATA_ID_FIELD.has_default_value = false
WEAPONDATA_ID_FIELD.default_value = ""
WEAPONDATA_ID_FIELD.type = 9
WEAPONDATA_ID_FIELD.cpp_type = 9

WEAPONDATA_INDEX_FIELD.name = "index"
WEAPONDATA_INDEX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.index"
WEAPONDATA_INDEX_FIELD.number = 2
WEAPONDATA_INDEX_FIELD.index = 1
WEAPONDATA_INDEX_FIELD.label = 1
WEAPONDATA_INDEX_FIELD.has_default_value = false
WEAPONDATA_INDEX_FIELD.default_value = 0
WEAPONDATA_INDEX_FIELD.type = 5
WEAPONDATA_INDEX_FIELD.cpp_type = 1

WEAPONDATA_QUALITY_FIELD.name = "quality"
WEAPONDATA_QUALITY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.quality"
WEAPONDATA_QUALITY_FIELD.number = 3
WEAPONDATA_QUALITY_FIELD.index = 2
WEAPONDATA_QUALITY_FIELD.label = 1
WEAPONDATA_QUALITY_FIELD.has_default_value = false
WEAPONDATA_QUALITY_FIELD.default_value = 0
WEAPONDATA_QUALITY_FIELD.type = 5
WEAPONDATA_QUALITY_FIELD.cpp_type = 1

WEAPONDATA_QUALITYCOLOR_FIELD.name = "qualityColor"
WEAPONDATA_QUALITYCOLOR_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.qualityColor"
WEAPONDATA_QUALITYCOLOR_FIELD.number = 4
WEAPONDATA_QUALITYCOLOR_FIELD.index = 3
WEAPONDATA_QUALITYCOLOR_FIELD.label = 1
WEAPONDATA_QUALITYCOLOR_FIELD.has_default_value = false
WEAPONDATA_QUALITYCOLOR_FIELD.default_value = ""
WEAPONDATA_QUALITYCOLOR_FIELD.type = 9
WEAPONDATA_QUALITYCOLOR_FIELD.cpp_type = 9

WEAPONDATA_SNAME_FIELD.name = "sName"
WEAPONDATA_SNAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.sName"
WEAPONDATA_SNAME_FIELD.number = 5
WEAPONDATA_SNAME_FIELD.index = 4
WEAPONDATA_SNAME_FIELD.label = 1
WEAPONDATA_SNAME_FIELD.has_default_value = false
WEAPONDATA_SNAME_FIELD.default_value = ""
WEAPONDATA_SNAME_FIELD.type = 9
WEAPONDATA_SNAME_FIELD.cpp_type = 9

WEAPONDATA_EQUIPTYPE_FIELD.name = "equipType"
WEAPONDATA_EQUIPTYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.equipType"
WEAPONDATA_EQUIPTYPE_FIELD.number = 6
WEAPONDATA_EQUIPTYPE_FIELD.index = 5
WEAPONDATA_EQUIPTYPE_FIELD.label = 1
WEAPONDATA_EQUIPTYPE_FIELD.has_default_value = false
WEAPONDATA_EQUIPTYPE_FIELD.default_value = 0
WEAPONDATA_EQUIPTYPE_FIELD.type = 5
WEAPONDATA_EQUIPTYPE_FIELD.cpp_type = 1

WEAPONDATA_ADDATTACK_FIELD.name = "addAttack"
WEAPONDATA_ADDATTACK_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.addAttack"
WEAPONDATA_ADDATTACK_FIELD.number = 7
WEAPONDATA_ADDATTACK_FIELD.index = 6
WEAPONDATA_ADDATTACK_FIELD.label = 1
WEAPONDATA_ADDATTACK_FIELD.has_default_value = false
WEAPONDATA_ADDATTACK_FIELD.default_value = 0
WEAPONDATA_ADDATTACK_FIELD.type = 5
WEAPONDATA_ADDATTACK_FIELD.cpp_type = 1

WEAPONDATA_ADDDEFEND_FIELD.name = "addDefend"
WEAPONDATA_ADDDEFEND_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.addDefend"
WEAPONDATA_ADDDEFEND_FIELD.number = 8
WEAPONDATA_ADDDEFEND_FIELD.index = 7
WEAPONDATA_ADDDEFEND_FIELD.label = 1
WEAPONDATA_ADDDEFEND_FIELD.has_default_value = false
WEAPONDATA_ADDDEFEND_FIELD.default_value = 0
WEAPONDATA_ADDDEFEND_FIELD.type = 5
WEAPONDATA_ADDDEFEND_FIELD.cpp_type = 1

WEAPONDATA_ADDAGILITY_FIELD.name = "addAgility"
WEAPONDATA_ADDAGILITY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.addAgility"
WEAPONDATA_ADDAGILITY_FIELD.number = 9
WEAPONDATA_ADDAGILITY_FIELD.index = 8
WEAPONDATA_ADDAGILITY_FIELD.label = 1
WEAPONDATA_ADDAGILITY_FIELD.has_default_value = false
WEAPONDATA_ADDAGILITY_FIELD.default_value = 0
WEAPONDATA_ADDAGILITY_FIELD.type = 5
WEAPONDATA_ADDAGILITY_FIELD.cpp_type = 1

WEAPONDATA_ADDLUCK_FIELD.name = "addLuck"
WEAPONDATA_ADDLUCK_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.addLuck"
WEAPONDATA_ADDLUCK_FIELD.number = 10
WEAPONDATA_ADDLUCK_FIELD.index = 9
WEAPONDATA_ADDLUCK_FIELD.label = 1
WEAPONDATA_ADDLUCK_FIELD.has_default_value = false
WEAPONDATA_ADDLUCK_FIELD.default_value = 0
WEAPONDATA_ADDLUCK_FIELD.type = 5
WEAPONDATA_ADDLUCK_FIELD.cpp_type = 1

WEAPONDATA_ADDBLOOD_FIELD.name = "addBlood"
WEAPONDATA_ADDBLOOD_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.addBlood"
WEAPONDATA_ADDBLOOD_FIELD.number = 11
WEAPONDATA_ADDBLOOD_FIELD.index = 10
WEAPONDATA_ADDBLOOD_FIELD.label = 1
WEAPONDATA_ADDBLOOD_FIELD.has_default_value = false
WEAPONDATA_ADDBLOOD_FIELD.default_value = 0
WEAPONDATA_ADDBLOOD_FIELD.type = 5
WEAPONDATA_ADDBLOOD_FIELD.cpp_type = 1

WEAPONDATA_ADDBLOODPERCENT_FIELD.name = "addBloodPercent"
WEAPONDATA_ADDBLOODPERCENT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.addBloodPercent"
WEAPONDATA_ADDBLOODPERCENT_FIELD.number = 12
WEAPONDATA_ADDBLOODPERCENT_FIELD.index = 11
WEAPONDATA_ADDBLOODPERCENT_FIELD.label = 1
WEAPONDATA_ADDBLOODPERCENT_FIELD.has_default_value = false
WEAPONDATA_ADDBLOODPERCENT_FIELD.default_value = 0
WEAPONDATA_ADDBLOODPERCENT_FIELD.type = 5
WEAPONDATA_ADDBLOODPERCENT_FIELD.cpp_type = 1

WEAPONDATA_ADDTHEW_FIELD.name = "addThew"
WEAPONDATA_ADDTHEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.addThew"
WEAPONDATA_ADDTHEW_FIELD.number = 13
WEAPONDATA_ADDTHEW_FIELD.index = 12
WEAPONDATA_ADDTHEW_FIELD.label = 1
WEAPONDATA_ADDTHEW_FIELD.has_default_value = false
WEAPONDATA_ADDTHEW_FIELD.default_value = 0
WEAPONDATA_ADDTHEW_FIELD.type = 5
WEAPONDATA_ADDTHEW_FIELD.cpp_type = 1

WEAPONDATA_ADDDAMAGE_FIELD.name = "addDamage"
WEAPONDATA_ADDDAMAGE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.addDamage"
WEAPONDATA_ADDDAMAGE_FIELD.number = 14
WEAPONDATA_ADDDAMAGE_FIELD.index = 13
WEAPONDATA_ADDDAMAGE_FIELD.label = 1
WEAPONDATA_ADDDAMAGE_FIELD.has_default_value = false
WEAPONDATA_ADDDAMAGE_FIELD.default_value = 0
WEAPONDATA_ADDDAMAGE_FIELD.type = 5
WEAPONDATA_ADDDAMAGE_FIELD.cpp_type = 1

WEAPONDATA_ADDSKIN_FIELD.name = "addSkin"
WEAPONDATA_ADDSKIN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.addSkin"
WEAPONDATA_ADDSKIN_FIELD.number = 15
WEAPONDATA_ADDSKIN_FIELD.index = 14
WEAPONDATA_ADDSKIN_FIELD.label = 1
WEAPONDATA_ADDSKIN_FIELD.has_default_value = false
WEAPONDATA_ADDSKIN_FIELD.default_value = 0
WEAPONDATA_ADDSKIN_FIELD.type = 5
WEAPONDATA_ADDSKIN_FIELD.cpp_type = 1

WEAPONDATA_SEX_FIELD.name = "sex"
WEAPONDATA_SEX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.sex"
WEAPONDATA_SEX_FIELD.number = 16
WEAPONDATA_SEX_FIELD.index = 15
WEAPONDATA_SEX_FIELD.label = 1
WEAPONDATA_SEX_FIELD.has_default_value = false
WEAPONDATA_SEX_FIELD.default_value = 0
WEAPONDATA_SEX_FIELD.type = 5
WEAPONDATA_SEX_FIELD.cpp_type = 1

WEAPONDATA_SIGN_FIELD.name = "sign"
WEAPONDATA_SIGN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.sign"
WEAPONDATA_SIGN_FIELD.number = 17
WEAPONDATA_SIGN_FIELD.index = 16
WEAPONDATA_SIGN_FIELD.label = 1
WEAPONDATA_SIGN_FIELD.has_default_value = false
WEAPONDATA_SIGN_FIELD.default_value = 0
WEAPONDATA_SIGN_FIELD.type = 5
WEAPONDATA_SIGN_FIELD.cpp_type = 1

WEAPONDATA_LV_FIELD.name = "lv"
WEAPONDATA_LV_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.lv"
WEAPONDATA_LV_FIELD.number = 18
WEAPONDATA_LV_FIELD.index = 17
WEAPONDATA_LV_FIELD.label = 1
WEAPONDATA_LV_FIELD.has_default_value = false
WEAPONDATA_LV_FIELD.default_value = 0
WEAPONDATA_LV_FIELD.type = 13
WEAPONDATA_LV_FIELD.cpp_type = 3

WEAPONDATA_SPECIALACTION_FIELD.name = "specialAction"
WEAPONDATA_SPECIALACTION_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.specialAction"
WEAPONDATA_SPECIALACTION_FIELD.number = 19
WEAPONDATA_SPECIALACTION_FIELD.index = 18
WEAPONDATA_SPECIALACTION_FIELD.label = 1
WEAPONDATA_SPECIALACTION_FIELD.has_default_value = false
WEAPONDATA_SPECIALACTION_FIELD.default_value = false
WEAPONDATA_SPECIALACTION_FIELD.type = 8
WEAPONDATA_SPECIALACTION_FIELD.cpp_type = 7

WEAPONDATA_RADIUS_FIELD.name = "radius"
WEAPONDATA_RADIUS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.radius"
WEAPONDATA_RADIUS_FIELD.number = 20
WEAPONDATA_RADIUS_FIELD.index = 19
WEAPONDATA_RADIUS_FIELD.label = 1
WEAPONDATA_RADIUS_FIELD.has_default_value = false
WEAPONDATA_RADIUS_FIELD.default_value = 0
WEAPONDATA_RADIUS_FIELD.type = 5
WEAPONDATA_RADIUS_FIELD.cpp_type = 1

WEAPONDATA_SRADIUS_FIELD.name = "sRadius"
WEAPONDATA_SRADIUS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.sRadius"
WEAPONDATA_SRADIUS_FIELD.number = 21
WEAPONDATA_SRADIUS_FIELD.index = 20
WEAPONDATA_SRADIUS_FIELD.label = 1
WEAPONDATA_SRADIUS_FIELD.has_default_value = false
WEAPONDATA_SRADIUS_FIELD.default_value = 0
WEAPONDATA_SRADIUS_FIELD.type = 5
WEAPONDATA_SRADIUS_FIELD.cpp_type = 1

WEAPONDATA_POWER_FIELD.name = "power"
WEAPONDATA_POWER_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.power"
WEAPONDATA_POWER_FIELD.number = 22
WEAPONDATA_POWER_FIELD.index = 21
WEAPONDATA_POWER_FIELD.label = 1
WEAPONDATA_POWER_FIELD.has_default_value = false
WEAPONDATA_POWER_FIELD.default_value = 0
WEAPONDATA_POWER_FIELD.type = 5
WEAPONDATA_POWER_FIELD.cpp_type = 1

WEAPONDATA_BULLET_FIELD.name = "bullet"
WEAPONDATA_BULLET_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.bullet"
WEAPONDATA_BULLET_FIELD.number = 23
WEAPONDATA_BULLET_FIELD.index = 22
WEAPONDATA_BULLET_FIELD.label = 1
WEAPONDATA_BULLET_FIELD.has_default_value = true
WEAPONDATA_BULLET_FIELD.default_value = "bullet_missile"
WEAPONDATA_BULLET_FIELD.type = 9
WEAPONDATA_BULLET_FIELD.cpp_type = 9

WEAPONDATA_ICON_FIELD.name = "icon"
WEAPONDATA_ICON_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.icon"
WEAPONDATA_ICON_FIELD.number = 24
WEAPONDATA_ICON_FIELD.index = 23
WEAPONDATA_ICON_FIELD.label = 1
WEAPONDATA_ICON_FIELD.has_default_value = false
WEAPONDATA_ICON_FIELD.default_value = ""
WEAPONDATA_ICON_FIELD.type = 9
WEAPONDATA_ICON_FIELD.cpp_type = 9

WEAPONDATA_NAME_FIELD.name = "name"
WEAPONDATA_NAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.name"
WEAPONDATA_NAME_FIELD.number = 25
WEAPONDATA_NAME_FIELD.index = 24
WEAPONDATA_NAME_FIELD.label = 1
WEAPONDATA_NAME_FIELD.has_default_value = false
WEAPONDATA_NAME_FIELD.default_value = ""
WEAPONDATA_NAME_FIELD.type = 9
WEAPONDATA_NAME_FIELD.cpp_type = 9

WEAPONDATA_INFO_FIELD.name = "info"
WEAPONDATA_INFO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.info"
WEAPONDATA_INFO_FIELD.number = 26
WEAPONDATA_INFO_FIELD.index = 25
WEAPONDATA_INFO_FIELD.label = 1
WEAPONDATA_INFO_FIELD.has_default_value = false
WEAPONDATA_INFO_FIELD.default_value = ""
WEAPONDATA_INFO_FIELD.type = 9
WEAPONDATA_INFO_FIELD.cpp_type = 9

WEAPONDATA_SLOT_FIELD.name = "slot"
WEAPONDATA_SLOT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.slot"
WEAPONDATA_SLOT_FIELD.number = 27
WEAPONDATA_SLOT_FIELD.index = 26
WEAPONDATA_SLOT_FIELD.label = 1
WEAPONDATA_SLOT_FIELD.has_default_value = false
WEAPONDATA_SLOT_FIELD.default_value = ""
WEAPONDATA_SLOT_FIELD.type = 9
WEAPONDATA_SLOT_FIELD.cpp_type = 9

WEAPONDATA_AVATAR_FIELD.name = "avatar"
WEAPONDATA_AVATAR_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.avatar"
WEAPONDATA_AVATAR_FIELD.number = 28
WEAPONDATA_AVATAR_FIELD.index = 27
WEAPONDATA_AVATAR_FIELD.label = 3
WEAPONDATA_AVATAR_FIELD.has_default_value = false
WEAPONDATA_AVATAR_FIELD.default_value = {}
WEAPONDATA_AVATAR_FIELD.message_type = AVATAR
WEAPONDATA_AVATAR_FIELD.type = 11
WEAPONDATA_AVATAR_FIELD.cpp_type = 10

WEAPONDATA_EXPSE_FIELD.name = "expSe"
WEAPONDATA_EXPSE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.expSe"
WEAPONDATA_EXPSE_FIELD.number = 29
WEAPONDATA_EXPSE_FIELD.index = 28
WEAPONDATA_EXPSE_FIELD.label = 1
WEAPONDATA_EXPSE_FIELD.has_default_value = false
WEAPONDATA_EXPSE_FIELD.default_value = 0
WEAPONDATA_EXPSE_FIELD.type = 5
WEAPONDATA_EXPSE_FIELD.cpp_type = 1

WEAPONDATA_EXPBLEND_FIELD.name = "expBlend"
WEAPONDATA_EXPBLEND_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData.expBlend"
WEAPONDATA_EXPBLEND_FIELD.number = 30
WEAPONDATA_EXPBLEND_FIELD.index = 29
WEAPONDATA_EXPBLEND_FIELD.label = 1
WEAPONDATA_EXPBLEND_FIELD.has_default_value = false
WEAPONDATA_EXPBLEND_FIELD.default_value = ""
WEAPONDATA_EXPBLEND_FIELD.type = 9
WEAPONDATA_EXPBLEND_FIELD.cpp_type = 9

WEAPONDATA.name = "WeaponData"
WEAPONDATA.full_name = ".com.xinqihd.sns.gameserver.proto.WeaponData"
WEAPONDATA.nested_types = {}
WEAPONDATA.enum_types = {}
WEAPONDATA.fields = {WEAPONDATA_ID_FIELD, WEAPONDATA_INDEX_FIELD, WEAPONDATA_QUALITY_FIELD, WEAPONDATA_QUALITYCOLOR_FIELD, WEAPONDATA_SNAME_FIELD, WEAPONDATA_EQUIPTYPE_FIELD, WEAPONDATA_ADDATTACK_FIELD, WEAPONDATA_ADDDEFEND_FIELD, WEAPONDATA_ADDAGILITY_FIELD, WEAPONDATA_ADDLUCK_FIELD, WEAPONDATA_ADDBLOOD_FIELD, WEAPONDATA_ADDBLOODPERCENT_FIELD, WEAPONDATA_ADDTHEW_FIELD, WEAPONDATA_ADDDAMAGE_FIELD, WEAPONDATA_ADDSKIN_FIELD, WEAPONDATA_SEX_FIELD, WEAPONDATA_SIGN_FIELD, WEAPONDATA_LV_FIELD, WEAPONDATA_SPECIALACTION_FIELD, WEAPONDATA_RADIUS_FIELD, WEAPONDATA_SRADIUS_FIELD, WEAPONDATA_POWER_FIELD, WEAPONDATA_BULLET_FIELD, WEAPONDATA_ICON_FIELD, WEAPONDATA_NAME_FIELD, WEAPONDATA_INFO_FIELD, WEAPONDATA_SLOT_FIELD, WEAPONDATA_AVATAR_FIELD, WEAPONDATA_EXPSE_FIELD, WEAPONDATA_EXPBLEND_FIELD}
WEAPONDATA.is_extendable = false
WEAPONDATA.extensions = {}
BSEEQUIPMENT_WEAPONS_FIELD.name = "weapons"
BSEEQUIPMENT_WEAPONS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseEquipment.weapons"
BSEEQUIPMENT_WEAPONS_FIELD.number = 1
BSEEQUIPMENT_WEAPONS_FIELD.index = 0
BSEEQUIPMENT_WEAPONS_FIELD.label = 3
BSEEQUIPMENT_WEAPONS_FIELD.has_default_value = false
BSEEQUIPMENT_WEAPONS_FIELD.default_value = {}
BSEEQUIPMENT_WEAPONS_FIELD.message_type = WEAPONDATA
BSEEQUIPMENT_WEAPONS_FIELD.type = 11
BSEEQUIPMENT_WEAPONS_FIELD.cpp_type = 10

BSEEQUIPMENT.name = "BseEquipment"
BSEEQUIPMENT.full_name = ".com.xinqihd.sns.gameserver.proto.BseEquipment"
BSEEQUIPMENT.nested_types = {}
BSEEQUIPMENT.enum_types = {}
BSEEQUIPMENT.fields = {BSEEQUIPMENT_WEAPONS_FIELD}
BSEEQUIPMENT.is_extendable = false
BSEEQUIPMENT.extensions = {}

Avatar = protobuf.Message(AVATAR)
BseEquipment = protobuf.Message(BSEEQUIPMENT)
WeaponData = protobuf.Message(WEAPONDATA)
_G.AVATAR_PB_AVATAR = AVATAR
_G.BSEEQUIPMENT_PB_BSEEQUIPMENT = BSEEQUIPMENT
_G.WEAPONDATA_PB_WEAPONDATA = WEAPONDATA

