# 二手商品及任务商城小程序 P-mission
## 1.1. Function
![](https://gitee.com/istarwyh/images/raw/master/1584021618_20200312212547135_7609.png)

**基本样式**

![](https://gitee.com/istarwyh/images/raw/master/1584021619_20200312213538919_11231.png)
## 1.2. Structure
```
.
├── p-mission
│   ├── pages  // 微信小程序前端
|   |    |── index.js //商品主页面
|   └── config // 商品模块后端
|        └── api.js //前端api模块
│── pkukaola // 任务及登录模块后端
└── pkukaola-goods // 商品模块后端
     └── src/main/java/com/test/dbtest //商品主页面
         └── StartApp.java //后端启动入口
```

## 1.3. Architecture
![使用技术栈](https://gitee.com/istarwyh/images/raw/master/1584021617_20200312212458423_16285.png)

![开发架构](https://gitee.com/istarwyh/images/raw/master/1584021619_20200312213015218_11899.png)
## 1.4. Running the Sample

- git clone `git@github.com:istarwyh/P-mission.git`
- import pkukola-goods or pkukaola with maven by IDEA
- import p-mission with 微信开发者工具
- Compile & Run  