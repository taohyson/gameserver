-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseFriendEquip_pb', package.seeall)


local BSEFRIENDEQUIP = protobuf.Descriptor();
local BSEFRIENDEQUIP_EQUIPINFO_FIELD = protobuf.FieldDescriptor();

BSEFRIENDEQUIP_EQUIPINFO_FIELD.name = "equipInfo"
BSEFRIENDEQUIP_EQUIPINFO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFriendEquip.equipInfo"
BSEFRIENDEQUIP_EQUIPINFO_FIELD.number = 1
BSEFRIENDEQUIP_EQUIPINFO_FIELD.index = 0
BSEFRIENDEQUIP_EQUIPINFO_FIELD.label = 3
BSEFRIENDEQUIP_EQUIPINFO_FIELD.has_default_value = false
BSEFRIENDEQUIP_EQUIPINFO_FIELD.default_value = {}
BSEFRIENDEQUIP_EQUIPINFO_FIELD.message_type = PROPDATA_PB_PROPDATA
BSEFRIENDEQUIP_EQUIPINFO_FIELD.type = 11
BSEFRIENDEQUIP_EQUIPINFO_FIELD.cpp_type = 10

BSEFRIENDEQUIP.name = "BseFriendEquip"
BSEFRIENDEQUIP.full_name = ".com.xinqihd.sns.gameserver.proto.BseFriendEquip"
BSEFRIENDEQUIP.nested_types = {}
BSEFRIENDEQUIP.enum_types = {}
BSEFRIENDEQUIP.fields = {BSEFRIENDEQUIP_EQUIPINFO_FIELD}
BSEFRIENDEQUIP.is_extendable = false
BSEFRIENDEQUIP.extensions = {}

BseFriendEquip = protobuf.Message(BSEFRIENDEQUIP)
_G.BSEFRIENDEQUIP_PB_BSEFRIENDEQUIP = BSEFRIENDEQUIP

