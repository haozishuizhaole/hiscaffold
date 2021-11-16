# 目录和文件结构
```shell
.
├── PROJECT_STRUCT.md
├── README.md
├── archetype.properties // maven archetype 属性文件
├── archetypeGenerate.sh // maven archetype 生成器脚本
├── archetypeInstall.sh // maven archetype 安装脚本
├── hiscaffold-bootstrap // 应用程序启动模块
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── cc
│       │   │       └── chenzhihao
│       │   │           └── hiscaffold
│       │   │               └── bootstrap
│       │   │                   ├── AppApplication.java // SpringBoot启动入口
│       │   │                   ├── component // Spring组件包
│       │   │                   │   ├── DefaultSystemMonitor.java // 默认的系统监视器实现
│       │   │                   │   └── MybatisConfiguration.java // Mybatis配置
│       │   └── resources
│       │       └── config
│       │           └── application.yml // Spring应用程序配置文件
│       └── test
│           └── java
│               └── cc
│                   └── chenzhihao
│                       └── hiscaffold
│                           └── AppApplicationTests.java
├── hiscaffold-common // 通用组件模块
│   ├── hiscaffold-common.iml
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── cc
│                   └── chenzhihao
│                       └── hiscaffold
│                           └── common
│                               └── package-info.java
├── hiscaffold-domain // 领域层模块
│   ├── hiscaffold-domain.iml
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── cc
│                   └── chenzhihao
│                       └── hiscaffold
│                           └── domain
│                               └── base // 通用域，其他领域与该目录平级
│                                   ├── aggregation // 聚合
│                                   │   ├── SystemInfoAgg.java
│                                   │   └── package-info.java
│                                   ├── entity // 实体
│                                   │   ├── OperateSystemInfo.java
│                                   │   ├── ProjectInfo.java
│                                   │   └── package-info.java
│                                   ├── factory // 工厂
│                                   │   └── package-info.java
│                                   ├── repository // 资源库（只提供接口）
│                                   │   ├── SystemRepository.java
│                                   │   └── package-info.java
│                                   ├── service // 领域服务
│                                   │   └── package-info.java
│                                   └── vo // 值对象
│                                       └── package-info.java
├── hiscaffold-face // 门面层(表示层)模块
│   ├── hiscaffold-face.iml
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── cc
│                   └── chenzhihao
│                       └── hiscaffold
│                           └── face
│                               ├── http // HTTP接口表示
│                               │   └── SystemController.java
│                               └── package-info.java
├── hiscaffold-infrastructure // 基础设施层模块
│   ├── hiscaffold-infrastructure.iml
│   ├── libs // 用到的lib
│   │   └── mbg // Mybatis Generator依赖的lib
│   │       ├── generatorConfig.xml // Mybatis Generator 配置文件
│   │       └── mysql-connector-java-8.0.27.jar // Mybatis Generator依赖的mysql数据库connector
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── cc
│           │       └── chenzhihao
│           │           └── hiscaffold
│           │               └── infrastructure
│           │                   ├── acl // 对下游的防腐层
│           │                   │   └── package-info.java
│           │                   ├── package-info.java
│           │                   ├── persistent // 持久化层
│           │                   │   ├── mapper // Mybatis的mapper客户端接口
│           │                   │   │   └── package-info.java
│           │                   │   ├── package-info.java
│           │                   │   └── po // 持久化对象（persistent object）
│           │                   │       └── package-info.java
│           │                   └── repository // 资源库实现
│           │                       ├── package-info.java
│           │                       └── system // 系统资源库
│           │                           ├── SystemMonitor.java
│           │                           └── SystemRepositoryImpl.java
│           └── resources
│               └── mybatis
│                   └── mapper // mybatis xml
├── hiscaffold-interface // 程序对外发布的二方包
│   ├── hiscaffold-interface.iml
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── cc
│                   └── chenzhihao
│                       └── hiscaffold
│                           └── interfaces
│                               └── package-info.java
├── hiscaffold-service // APP Service 层，编排层
│   ├── hiscaffold-service.iml
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── cc
│                   └── chenzhihao
│                       └── hiscaffold
│                           └── service
│                               ├── package-info.java
│                               └── system 
│                                   ├── SystemService.java
│                                   ├── convertor // 转换器
│                                   │   └── SystemAssembler.java // DTO与Entity转换，使用Assembler后缀
│                                   └── dto // DTO 
│                                       ├── OperateSystemInfoDTO.java
│                                       ├── ProjectInfoDTO.java
│                                       └── SystemInfoDTO.java
├── mbg.sh // Mybatis Generator 生成器脚本
├── pom.xm
```