-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceCyRegister_pb', package.seeall)


local BCECYREGISTER = protobuf.Descriptor();
local BCECYREGISTER_USERNAME_FIELD = protobuf.FieldDescriptor();
local BCECYREGISTER_PASSWORD_FIELD = protobuf.FieldDescriptor();

BCECYREGISTER_USERNAME_FIELD.name = "username"
BCECYREGISTER_USERNAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceCyRegister.username"
BCECYREGISTER_USERNAME_FIELD.number = 1
BCECYREGISTER_USERNAME_FIELD.index = 0
BCECYREGISTER_USERNAME_FIELD.label = 1
BCECYREGISTER_USERNAME_FIELD.has_default_value = false
BCECYREGISTER_USERNAME_FIELD.default_value = ""
BCECYREGISTER_USERNAME_FIELD.type = 9
BCECYREGISTER_USERNAME_FIELD.cpp_type = 9

BCECYREGISTER_PASSWORD_FIELD.name = "password"
BCECYREGISTER_PASSWORD_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceCyRegister.password"
BCECYREGISTER_PASSWORD_FIELD.number = 2
BCECYREGISTER_PASSWORD_FIELD.index = 1
BCECYREGISTER_PASSWORD_FIELD.label = 1
BCECYREGISTER_PASSWORD_FIELD.has_default_value = false
BCECYREGISTER_PASSWORD_FIELD.default_value = ""
BCECYREGISTER_PASSWORD_FIELD.type = 9
BCECYREGISTER_PASSWORD_FIELD.cpp_type = 9

BCECYREGISTER.name = "BceCyRegister"
BCECYREGISTER.full_name = ".com.xinqihd.sns.gameserver.proto.BceCyRegister"
BCECYREGISTER.nested_types = {}
BCECYREGISTER.enum_types = {}
BCECYREGISTER.fields = {BCECYREGISTER_USERNAME_FIELD, BCECYREGISTER_PASSWORD_FIELD}
BCECYREGISTER.is_extendable = false
BCECYREGISTER.extensions = {}

BceCyRegister = protobuf.Message(BCECYREGISTER)
_G.BCECYREGISTER_PB_BCECYREGISTER = BCECYREGISTER

