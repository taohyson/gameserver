-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('SysMessage_pb', package.seeall)


local ACTION = protobuf.EnumDescriptor();
local ACTION_NOOP_ENUM = protobuf.EnumValueDescriptor();
local ACTION_EXIT_GAME_ENUM = protobuf.EnumValueDescriptor();
local ACTION_RECONNECT_ENUM = protobuf.EnumValueDescriptor();
local TYPE = protobuf.EnumDescriptor();
local TYPE_NORMAL_ENUM = protobuf.EnumValueDescriptor();
local TYPE_LEVEL_UP_ENUM = protobuf.EnumValueDescriptor();
local TYPE_MAINTAINCE_ENUM = protobuf.EnumValueDescriptor();
local TYPE_PROMOTION_ENUM = protobuf.EnumValueDescriptor();
local TYPE_WEIBO_ENUM = protobuf.EnumValueDescriptor();
local TYPE_CONFIRM_ENUM = protobuf.EnumValueDescriptor();
local TYPE_BULLETIN_ENUM = protobuf.EnumValueDescriptor();

ACTION_NOOP_ENUM.name = "NOOP"
ACTION_NOOP_ENUM.index = 0
ACTION_NOOP_ENUM.number = 1
ACTION_EXIT_GAME_ENUM.name = "EXIT_GAME"
ACTION_EXIT_GAME_ENUM.index = 1
ACTION_EXIT_GAME_ENUM.number = 2
ACTION_RECONNECT_ENUM.name = "RECONNECT"
ACTION_RECONNECT_ENUM.index = 2
ACTION_RECONNECT_ENUM.number = 3
ACTION.name = "Action"
ACTION.full_name = ".com.xinqihd.sns.gameserver.proto.Action"
ACTION.values = {ACTION_NOOP_ENUM,ACTION_EXIT_GAME_ENUM,ACTION_RECONNECT_ENUM}
TYPE_NORMAL_ENUM.name = "NORMAL"
TYPE_NORMAL_ENUM.index = 0
TYPE_NORMAL_ENUM.number = 1
TYPE_LEVEL_UP_ENUM.name = "LEVEL_UP"
TYPE_LEVEL_UP_ENUM.index = 1
TYPE_LEVEL_UP_ENUM.number = 2
TYPE_MAINTAINCE_ENUM.name = "MAINTAINCE"
TYPE_MAINTAINCE_ENUM.index = 2
TYPE_MAINTAINCE_ENUM.number = 3
TYPE_PROMOTION_ENUM.name = "PROMOTION"
TYPE_PROMOTION_ENUM.index = 3
TYPE_PROMOTION_ENUM.number = 4
TYPE_WEIBO_ENUM.name = "WEIBO"
TYPE_WEIBO_ENUM.index = 4
TYPE_WEIBO_ENUM.number = 5
TYPE_CONFIRM_ENUM.name = "CONFIRM"
TYPE_CONFIRM_ENUM.index = 5
TYPE_CONFIRM_ENUM.number = 6
TYPE_BULLETIN_ENUM.name = "BULLETIN"
TYPE_BULLETIN_ENUM.index = 6
TYPE_BULLETIN_ENUM.number = 7
TYPE.name = "Type"
TYPE.full_name = ".com.xinqihd.sns.gameserver.proto.Type"
TYPE.values = {TYPE_NORMAL_ENUM,TYPE_LEVEL_UP_ENUM,TYPE_MAINTAINCE_ENUM,TYPE_PROMOTION_ENUM,TYPE_WEIBO_ENUM,TYPE_CONFIRM_ENUM,TYPE_BULLETIN_ENUM}

BULLETIN = 7
CONFIRM = 6
EXIT_GAME = 2
LEVEL_UP = 2
MAINTAINCE = 3
NOOP = 1
NORMAL = 1
PROMOTION = 4
RECONNECT = 3
WEIBO = 5

