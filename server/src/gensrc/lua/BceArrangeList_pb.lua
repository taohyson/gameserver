-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceArrangeList_pb', package.seeall)


local BCEARRANGELIST = protobuf.Descriptor();
local BCEARRANGELIST_RANKTYPE_FIELD = protobuf.FieldDescriptor();
local BCEARRANGELIST_ARRANGETYPE_FIELD = protobuf.FieldDescriptor();
local BCEARRANGELIST_FILTERTYPE_FIELD = protobuf.FieldDescriptor();
local BCEARRANGELIST_STARTRANK_FIELD = protobuf.FieldDescriptor();
local BCEARRANGELIST_ENDRANK_FIELD = protobuf.FieldDescriptor();
local BCEARRANGELIST_BOSSID_FIELD = protobuf.FieldDescriptor();

BCEARRANGELIST_RANKTYPE_FIELD.name = "rankType"
BCEARRANGELIST_RANKTYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceArrangeList.rankType"
BCEARRANGELIST_RANKTYPE_FIELD.number = 1
BCEARRANGELIST_RANKTYPE_FIELD.index = 0
BCEARRANGELIST_RANKTYPE_FIELD.label = 1
BCEARRANGELIST_RANKTYPE_FIELD.has_default_value = true
BCEARRANGELIST_RANKTYPE_FIELD.default_value = 0
BCEARRANGELIST_RANKTYPE_FIELD.type = 5
BCEARRANGELIST_RANKTYPE_FIELD.cpp_type = 1

BCEARRANGELIST_ARRANGETYPE_FIELD.name = "arrangeType"
BCEARRANGELIST_ARRANGETYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceArrangeList.arrangeType"
BCEARRANGELIST_ARRANGETYPE_FIELD.number = 2
BCEARRANGELIST_ARRANGETYPE_FIELD.index = 1
BCEARRANGELIST_ARRANGETYPE_FIELD.label = 1
BCEARRANGELIST_ARRANGETYPE_FIELD.has_default_value = true
BCEARRANGELIST_ARRANGETYPE_FIELD.default_value = 0
BCEARRANGELIST_ARRANGETYPE_FIELD.type = 5
BCEARRANGELIST_ARRANGETYPE_FIELD.cpp_type = 1

BCEARRANGELIST_FILTERTYPE_FIELD.name = "filterType"
BCEARRANGELIST_FILTERTYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceArrangeList.filterType"
BCEARRANGELIST_FILTERTYPE_FIELD.number = 3
BCEARRANGELIST_FILTERTYPE_FIELD.index = 2
BCEARRANGELIST_FILTERTYPE_FIELD.label = 1
BCEARRANGELIST_FILTERTYPE_FIELD.has_default_value = true
BCEARRANGELIST_FILTERTYPE_FIELD.default_value = 0
BCEARRANGELIST_FILTERTYPE_FIELD.type = 5
BCEARRANGELIST_FILTERTYPE_FIELD.cpp_type = 1

BCEARRANGELIST_STARTRANK_FIELD.name = "startRank"
BCEARRANGELIST_STARTRANK_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceArrangeList.startRank"
BCEARRANGELIST_STARTRANK_FIELD.number = 4
BCEARRANGELIST_STARTRANK_FIELD.index = 3
BCEARRANGELIST_STARTRANK_FIELD.label = 1
BCEARRANGELIST_STARTRANK_FIELD.has_default_value = true
BCEARRANGELIST_STARTRANK_FIELD.default_value = 1
BCEARRANGELIST_STARTRANK_FIELD.type = 5
BCEARRANGELIST_STARTRANK_FIELD.cpp_type = 1

BCEARRANGELIST_ENDRANK_FIELD.name = "endRank"
BCEARRANGELIST_ENDRANK_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceArrangeList.endRank"
BCEARRANGELIST_ENDRANK_FIELD.number = 5
BCEARRANGELIST_ENDRANK_FIELD.index = 4
BCEARRANGELIST_ENDRANK_FIELD.label = 1
BCEARRANGELIST_ENDRANK_FIELD.has_default_value = true
BCEARRANGELIST_ENDRANK_FIELD.default_value = 10
BCEARRANGELIST_ENDRANK_FIELD.type = 5
BCEARRANGELIST_ENDRANK_FIELD.cpp_type = 1

BCEARRANGELIST_BOSSID_FIELD.name = "bossid"
BCEARRANGELIST_BOSSID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceArrangeList.bossid"
BCEARRANGELIST_BOSSID_FIELD.number = 6
BCEARRANGELIST_BOSSID_FIELD.index = 5
BCEARRANGELIST_BOSSID_FIELD.label = 1
BCEARRANGELIST_BOSSID_FIELD.has_default_value = false
BCEARRANGELIST_BOSSID_FIELD.default_value = ""
BCEARRANGELIST_BOSSID_FIELD.type = 9
BCEARRANGELIST_BOSSID_FIELD.cpp_type = 9

BCEARRANGELIST.name = "BceArrangeList"
BCEARRANGELIST.full_name = ".com.xinqihd.sns.gameserver.proto.BceArrangeList"
BCEARRANGELIST.nested_types = {}
BCEARRANGELIST.enum_types = {}
BCEARRANGELIST.fields = {BCEARRANGELIST_RANKTYPE_FIELD, BCEARRANGELIST_ARRANGETYPE_FIELD, BCEARRANGELIST_FILTERTYPE_FIELD, BCEARRANGELIST_STARTRANK_FIELD, BCEARRANGELIST_ENDRANK_FIELD, BCEARRANGELIST_BOSSID_FIELD}
BCEARRANGELIST.is_extendable = false
BCEARRANGELIST.extensions = {}

BceArrangeList = protobuf.Message(BCEARRANGELIST)
_G.BCEARRANGELIST_PB_BCEARRANGELIST = BCEARRANGELIST

