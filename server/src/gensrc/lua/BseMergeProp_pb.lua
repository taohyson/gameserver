-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseMergeProp_pb', package.seeall)


local BSEMERGEPROP = protobuf.Descriptor();
local BSEMERGEPROP_SRCPEW_FIELD = protobuf.FieldDescriptor();
local BSEMERGEPROP_DSTPEW_FIELD = protobuf.FieldDescriptor();

BSEMERGEPROP_SRCPEW_FIELD.name = "srcPew"
BSEMERGEPROP_SRCPEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseMergeProp.srcPew"
BSEMERGEPROP_SRCPEW_FIELD.number = 1
BSEMERGEPROP_SRCPEW_FIELD.index = 0
BSEMERGEPROP_SRCPEW_FIELD.label = 2
BSEMERGEPROP_SRCPEW_FIELD.has_default_value = false
BSEMERGEPROP_SRCPEW_FIELD.default_value = 0
BSEMERGEPROP_SRCPEW_FIELD.type = 5
BSEMERGEPROP_SRCPEW_FIELD.cpp_type = 1

BSEMERGEPROP_DSTPEW_FIELD.name = "dstPew"
BSEMERGEPROP_DSTPEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseMergeProp.dstPew"
BSEMERGEPROP_DSTPEW_FIELD.number = 2
BSEMERGEPROP_DSTPEW_FIELD.index = 1
BSEMERGEPROP_DSTPEW_FIELD.label = 2
BSEMERGEPROP_DSTPEW_FIELD.has_default_value = false
BSEMERGEPROP_DSTPEW_FIELD.default_value = 0
BSEMERGEPROP_DSTPEW_FIELD.type = 5
BSEMERGEPROP_DSTPEW_FIELD.cpp_type = 1

BSEMERGEPROP.name = "BseMergeProp"
BSEMERGEPROP.full_name = ".com.xinqihd.sns.gameserver.proto.BseMergeProp"
BSEMERGEPROP.nested_types = {}
BSEMERGEPROP.enum_types = {}
BSEMERGEPROP.fields = {BSEMERGEPROP_SRCPEW_FIELD, BSEMERGEPROP_DSTPEW_FIELD}
BSEMERGEPROP.is_extendable = false
BSEMERGEPROP.extensions = {}

BseMergeProp = protobuf.Message(BSEMERGEPROP)
_G.BSEMERGEPROP_PB_BSEMERGEPROP = BSEMERGEPROP

