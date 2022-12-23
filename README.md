# Translator 即时翻译插件

## 介绍:

#### 在玩家聊天时即时生成玩家聊天信息的翻译。

## 指令:

##### 插件只有 **`/unbind`** 一条指令,作用是解绑玩家所绑定的QQ,请注意解绑后玩家将被踢出游戏且在重新绑定QQ前无法再次加入游戏。当玩家具有 **`whitelist.admin.unbind`** 权限时,将会展示高级解绑菜单,在菜单中可以解绑其他玩家的QQ。

## 配置文件:

```yaml
# 插件所展示的名称
Prefix: "Minecraft-DDW"
# 机器人QQ
BotID: 12345678
# 绑定白名单群聊
GroupID: [1235678,123456789]
# 是否自动给予验证群聊中的管理员whitelist.admin.unbind权限
GroupAdminMode: true
```

