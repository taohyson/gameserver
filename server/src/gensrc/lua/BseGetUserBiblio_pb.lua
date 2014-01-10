-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGetUserBiblio_pb', package.seeall)


local USERBIBLIO = protobuf.Descriptor();
local USERBIBLIO_INDEX_FIELD = protobuf.FieldDescriptor();
local USERBIBLIO_WEAPONID_FIELD = protobuf.FieldDescriptor();
local BSEGETUSERBIBLIO = protobuf.Descriptor();
local BSEGETUSERBIBLIO_SORTTYPE_FIELD = protobuf.FieldDescriptor();
local BSEGETUSERBIBLIO_TOTAL_FIELD = protobuf.FieldDescriptor();
local BSEGETUSERBIBLIO_DESC_FIELD = protobuf.FieldDescriptor();
local BSEGETUSERBIBLIO_PERCENT_FIELD = protobuf.FieldDescriptor();
local BSEGETUSERBIBLIO_REWARDENABLE_FIELD = protobuf.FieldDescriptor();
local BSEGETUSERBIBLIO_REWARDDESC_FIELD = protobuf.FieldDescriptor();
local BSEGETUSERBIBLIO_BIBLIO_FIELD = protobuf.FieldDescriptor();

USERBIBLIO_INDEX_FIELD.name = "index"
USERBIBLIO_INDEX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.UserBiblio.index"
USERBIBLIO_INDEX_FIELD.number = 1
USERBIBLIO_INDEX_FIELD.index = 0
USERBIBLIO_INDEX_FIELD.label = 1
USERBIBLIO_INDEX_FIELD.has_default_value = false
USERBIBLIO_INDEX_FIELD.default_value = 0
USERBIBLIO_INDEX_FIELD.type = 5
USERBIBLIO_INDEX_FIELD.cpp_type = 1

USERBIBLIO_WEAPONID_FIELD.name = "weaponId"
USERBIBLIO_WEAPONID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.UserBiblio.weaponId"
USERBIBLIO_WEAPONID_FIELD.number = 2
USERBIBLIO_WEAPONID_FIELD.index = 1
USERBIBLIO_WEAPONID_FIELD.label = 1
USERBIBLIO_WEAPONID_FIELD.has_default_value = false
USERBIBLIO_WEAPONID_FIELD.default_value = ""
USERBIBLIO_WEAPONID_FIELD.type = 9
USERBIBLIO_WEAPONID_FIELD.cpp_type = 9

USERBIBLIO.name = "UserBiblio"
USERBIBLIO.full_name = ".com.xinqihd.sns.gameserver.proto.UserBiblio"
USERBIBLIO.nested_types = {}
USERBIBLIO.enum_types = {}
USERBIBLIO.fields = {USERBIBLIO_INDEX_FIELD, USERBIBLIO_WEAPONID_FIELD}
USERBIBLIO.is_extendable = false
USERBIBLIO.extensions = {}
BSEGETUSERBIBLIO_SORTTYPE_FIELD.name = "sorttype"
BSEGETUSERBIBLIO_SORTTYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGetUserBiblio.sorttype"
BSEGETUSERBIBLIO_SORTTYPE_FIELD.number = 1
BSEGETUSERBIBLIO_SORTTYPE_FIELD.index = 0
BSEGETUSERBIBLIO_SORTTYPE_FIELD.label = 1
BSEGETUSERBIBLIO_SORTTYPE_FIELD.has_default_value = true
BSEGETUSERBIBLIO_SORTTYPE_FIELD.default_value = 0
BSEGETUSERBIBLIO_SORTTYPE_FIELD.type = 5
BSEGETUSERBIBLIO_SORTTYPE_FIELD.cpp_type = 1

BSEGETUSERBIBLIO_TOTAL_FIELD.name = "total"
BSEGETUSERBIBLIO_TOTAL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGetUserBiblio.total"
BSEGETUSERBIBLIO_TOTAL_FIELD.number = 2
BSEGETUSERBIBLIO_TOTAL_FIELD.index = 1
BSEGETUSERBIBLIO_TOTAL_FIELD.label = 1
BSEGETUSERBIBLIO_TOTAL_FIELD.has_default_value = true
BSEGETUSERBIBLIO_TOTAL_FIELD.default_value = 0
BSEGETUSERBIBLIO_TOTAL_FIELD.type = 5
BSEGETUSERBIBLIO_TOTAL_FIELD.cpp_type = 1

BSEGETUSERBIBLIO_DESC_FIELD.name = "desc"
BSEGETUSERBIBLIO_DESC_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGetUserBiblio.desc"
BSEGETUSERBIBLIO_DESC_FIELD.number = 3
BSEGETUSERBIBLIO_DESC_FIELD.index = 2
BSEGETUSERBIBLIO_DESC_FIELD.label = 1
BSEGETUSERBIBLIO_DESC_FIELD.has_default_value = false
BSEGETUSERBIBLIO_DESC_FIELD.default_value = ""
BSEGETUSERBIBLIO_DESC_FIELD.type = 9
BSEGETUSERBIBLIO_DESC_FIELD.cpp_type = 9

BSEGETUSERBIBLIO_PERCENT_FIELD.name = "percent"
BSEGETUSERBIBLIO_PERCENT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGetUserBiblio.percent"
BSEGETUSERBIBLIO_PERCENT_FIELD.number = 5
BSEGETUSERBIBLIO_PERCENT_FIELD.index = 3
BSEGETUSERBIBLIO_PERCENT_FIELD.label = 1
BSEGETUSERBIBLIO_PERCENT_FIELD.has_default_value = true
BSEGETUSERBIBLIO_PERCENT_FIELD.default_value = 0
BSEGETUSERBIBLIO_PERCENT_FIELD.type = 5
BSEGETUSERBIBLIO_PERCENT_FIELD.cpp_type = 1

BSEGETUSERBIBLIO_REWARDENABLE_FIELD.name = "rewardenable"
BSEGETUSERBIBLIO_REWARDENABLE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGetUserBiblio.rewardenable"
BSEGETUSERBIBLIO_REWARDENABLE_FIELD.number = 6
BSEGETUSERBIBLIO_REWARDENABLE_FIELD.index = 4
BSEGETUSERBIBLIO_REWARDENABLE_FIELD.label = 1
BSEGETUSERBIBLIO_REWARDENABLE_FIELD.has_default_value = true
BSEGETUSERBIBLIO_REWARDENABLE_FIELD.default_value = false
BSEGETUSERBIBLIO_REWARDENABLE_FIELD.type = 8
BSEGETUSERBIBLIO_REWARDENABLE_FIELD.cpp_type = 7

BSEGETUSERBIBLIO_REWARDDESC_FIELD.name = "rewarddesc"
BSEGETUSERBIBLIO_REWARDDESC_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGetUserBiblio.rewarddesc"
BSEGETUSERBIBLIO_REWARDDESC_FIELD.number = 7
BSEGETUSERBIBLIO_REWARDDESC_FIELD.index = 5
BSEGETUSERBIBLIO_REWARDDESC_FIELD.label = 1
BSEGETUSERBIBLIO_REWARDDESC_FIELD.has_default_value = false
BSEGETUSERBIBLIO_REWARDDESC_FIELD.default_value = ""
BSEGETUSERBIBLIO_REWARDDESC_FIELD.type = 9
BSEGETUSERBIBLIO_REWARDDESC_FIELD.cpp_type = 9

BSEGETUSERBIBLIO_BIBLIO_FIELD.name = "biblio"
BSEGETUSERBIBLIO_BIBLIO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGetUserBiblio.biblio"
BSEGETUSERBIBLIO_BIBLIO_FIELD.number = 10
BSEGETUSERBIBLIO_BIBLIO_FIELD.index = 6
BSEGETUSERBIBLIO_BIBLIO_FIELD.label = 3
BSEGETUSERBIBLIO_BIBLIO_FIELD.has_default_value = false
BSEGETUSERBIBLIO_BIBLIO_FIELD.default_value = {}
BSEGETUSERBIBLIO_BIBLIO_FIELD.message_type = USERBIBLIO
BSEGETUSERBIBLIO_BIBLIO_FIELD.type = 11
BSEGETUSERBIBLIO_BIBLIO_FIELD.cpp_type = 10

BSEGETUSERBIBLIO.name = "BseGetUserBiblio"
BSEGETUSERBIBLIO.full_name = ".com.xinqihd.sns.gameserver.proto.BseGetUserBiblio"
BSEGETUSERBIBLIO.nested_types = {}
BSEGETUSERBIBLIO.enum_types = {}
BSEGETUSERBIBLIO.fields = {BSEGETUSERBIBLIO_SORTTYPE_FIELD, BSEGETUSERBIBLIO_TOTAL_FIELD, BSEGETUSERBIBLIO_DESC_FIELD, BSEGETUSERBIBLIO_PERCENT_FIELD, BSEGETUSERBIBLIO_REWARDENABLE_FIELD, BSEGETUSERBIBLIO_REWARDDESC_FIELD, BSEGETUSERBIBLIO_BIBLIO_FIELD}
BSEGETUSERBIBLIO.is_extendable = false
BSEGETUSERBIBLIO.extensions = {}

BseGetUserBiblio = protobuf.Message(BSEGETUSERBIBLIO)
UserBiblio = protobuf.Message(USERBIBLIO)
_G.BSEGETUSERBIBLIO_PB_BSEGETUSERBIBLIO = BSEGETUSERBIBLIO
_G.USERBIBLIO_PB_USERBIBLIO = USERBIBLIO

