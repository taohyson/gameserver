-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BsePropDataQuery_pb', package.seeall)


local BSEPROPDATAQUERY = protobuf.Descriptor();
local BSEPROPDATAQUERY_PROPDATA_FIELD = protobuf.FieldDescriptor();
local BSEPROPDATAQUERY_MYPROPDATA_FIELD = protobuf.FieldDescriptor();

BSEPROPDATAQUERY_PROPDATA_FIELD.name = "propData"
BSEPROPDATAQUERY_PROPDATA_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BsePropDataQuery.propData"
BSEPROPDATAQUERY_PROPDATA_FIELD.number = 1
BSEPROPDATAQUERY_PROPDATA_FIELD.index = 0
BSEPROPDATAQUERY_PROPDATA_FIELD.label = 1
BSEPROPDATAQUERY_PROPDATA_FIELD.has_default_value = false
BSEPROPDATAQUERY_PROPDATA_FIELD.default_value = nil
BSEPROPDATAQUERY_PROPDATA_FIELD.message_type = PROPDATADESC_PB_PROPDATADESC
BSEPROPDATAQUERY_PROPDATA_FIELD.type = 11
BSEPROPDATAQUERY_PROPDATA_FIELD.cpp_type = 10

BSEPROPDATAQUERY_MYPROPDATA_FIELD.name = "myPropData"
BSEPROPDATAQUERY_MYPROPDATA_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BsePropDataQuery.myPropData"
BSEPROPDATAQUERY_MYPROPDATA_FIELD.number = 2
BSEPROPDATAQUERY_MYPROPDATA_FIELD.index = 1
BSEPROPDATAQUERY_MYPROPDATA_FIELD.label = 1
BSEPROPDATAQUERY_MYPROPDATA_FIELD.has_default_value = false
BSEPROPDATAQUERY_MYPROPDATA_FIELD.default_value = nil
BSEPROPDATAQUERY_MYPROPDATA_FIELD.message_type = PROPDATADESC_PB_PROPDATADESC
BSEPROPDATAQUERY_MYPROPDATA_FIELD.type = 11
BSEPROPDATAQUERY_MYPROPDATA_FIELD.cpp_type = 10

BSEPROPDATAQUERY.name = "BsePropDataQuery"
BSEPROPDATAQUERY.full_name = ".com.xinqihd.sns.gameserver.proto.BsePropDataQuery"
BSEPROPDATAQUERY.nested_types = {}
BSEPROPDATAQUERY.enum_types = {}
BSEPROPDATAQUERY.fields = {BSEPROPDATAQUERY_PROPDATA_FIELD, BSEPROPDATAQUERY_MYPROPDATA_FIELD}
BSEPROPDATAQUERY.is_extendable = false
BSEPROPDATAQUERY.extensions = {}

BsePropDataQuery = protobuf.Message(BSEPROPDATAQUERY)
_G.BSEPROPDATAQUERY_PB_BSEPROPDATAQUERY = BSEPROPDATAQUERY

