-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseTransfer_pb', package.seeall)


local BSETRANSFER = protobuf.Descriptor();
local BSETRANSFER_RESULT_FIELD = protobuf.FieldDescriptor();
local BSETRANSFER_SRCEQUIP_FIELD = protobuf.FieldDescriptor();
local BSETRANSFER_TAREQUIP_FIELD = protobuf.FieldDescriptor();

BSETRANSFER_RESULT_FIELD.name = "result"
BSETRANSFER_RESULT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseTransfer.result"
BSETRANSFER_RESULT_FIELD.number = 1
BSETRANSFER_RESULT_FIELD.index = 0
BSETRANSFER_RESULT_FIELD.label = 2
BSETRANSFER_RESULT_FIELD.has_default_value = false
BSETRANSFER_RESULT_FIELD.default_value = 0
BSETRANSFER_RESULT_FIELD.type = 5
BSETRANSFER_RESULT_FIELD.cpp_type = 1

BSETRANSFER_SRCEQUIP_FIELD.name = "srcEquip"
BSETRANSFER_SRCEQUIP_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseTransfer.srcEquip"
BSETRANSFER_SRCEQUIP_FIELD.number = 2
BSETRANSFER_SRCEQUIP_FIELD.index = 1
BSETRANSFER_SRCEQUIP_FIELD.label = 1
BSETRANSFER_SRCEQUIP_FIELD.has_default_value = false
BSETRANSFER_SRCEQUIP_FIELD.default_value = nil
BSETRANSFER_SRCEQUIP_FIELD.message_type = PROPDATA_PB_PROPDATA
BSETRANSFER_SRCEQUIP_FIELD.type = 11
BSETRANSFER_SRCEQUIP_FIELD.cpp_type = 10

BSETRANSFER_TAREQUIP_FIELD.name = "tarEquip"
BSETRANSFER_TAREQUIP_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseTransfer.tarEquip"
BSETRANSFER_TAREQUIP_FIELD.number = 3
BSETRANSFER_TAREQUIP_FIELD.index = 2
BSETRANSFER_TAREQUIP_FIELD.label = 1
BSETRANSFER_TAREQUIP_FIELD.has_default_value = false
BSETRANSFER_TAREQUIP_FIELD.default_value = nil
BSETRANSFER_TAREQUIP_FIELD.message_type = PROPDATA_PB_PROPDATA
BSETRANSFER_TAREQUIP_FIELD.type = 11
BSETRANSFER_TAREQUIP_FIELD.cpp_type = 10

BSETRANSFER.name = "BseTransfer"
BSETRANSFER.full_name = ".com.xinqihd.sns.gameserver.proto.BseTransfer"
BSETRANSFER.nested_types = {}
BSETRANSFER.enum_types = {}
BSETRANSFER.fields = {BSETRANSFER_RESULT_FIELD, BSETRANSFER_SRCEQUIP_FIELD, BSETRANSFER_TAREQUIP_FIELD}
BSETRANSFER.is_extendable = false
BSETRANSFER.extensions = {}

BseTransfer = protobuf.Message(BSETRANSFER)
_G.BSETRANSFER_PB_BSETRANSFER = BSETRANSFER

