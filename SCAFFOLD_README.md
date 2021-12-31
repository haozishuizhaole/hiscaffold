# Hi-Scaffold

基于领域驱动设计（DDD）思想的 Maven Archetype

## 1、项目依赖

- hi-framework：[click enter](https://github.com/haozishuizhaole/hi-framework)
- Springboot

## 2、目录和文件结构

[PROJECT_STRUCT.md](PROJECT_STRUCT.md)

## 3、使用方式

Mybatis Archetype Plugin：[click enter](https://maven.apache.org/archetype/maven-archetype-plugin/index.html)

#### 第一步：生成Archetype

在项目根目录执行 `archetypeGenerate.sh`

```shell
sh archetypeGenerate.sh
```

看到根目录下生成`target`目录，表示执行成功

#### 第二步：安装Archetype

在项目根目录执行`archetypeInstall.sh`

```shell
sh archetypeInstall.sh
```

若出现`BUILD SUCCESS`字样表示安装成功

#### 第四步：使用Archetype生成新工程

切换至要生成新工程目录的父目录（eg：/data/projects ）执行以下命令，使用本地archetype

```shell
mvn archetype:generate -DarchetypeCatalog=local -DarchetypeGroupId=com.jacksonchenzhihao -DarchetypeArtifactId=hiscaffold-archetype -DarchetypeVersion=2.0-RELEASE
```

执行该命令后，会显示本地已经安装的archetype列表

```shell
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] >>> maven-archetype-plugin:3.2.0:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO] 
[INFO] <<< maven-archetype-plugin:3.2.0:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO] 
[INFO] 
[INFO] --- maven-archetype-plugin:3.2.0:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Interactive mode
[INFO] No archetype defined. Using maven-archetype-quickstart (org.apache.maven.archetypes:maven-archetype-quickstart:1.0)
Choose archetype:
1: local -> cc.chenzhihao:hiscaffold-archetype (hi-scaffold-archetype)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): :
```

maven查找到本地archetype列表，需要开发者输入编号选择使用的archetype，并按提示填写或使用默认构建信息：

```shell
Choose archetype:
1: local -> cc.chenzhihao:hiscaffold-archetype (hi-scaffold-archetype)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 1
Define value for property 'groupId': com.foo
Define value for property 'artifactId': bar
Define value for property 'version' 1.0-RELEASE: : 1.0
Define value for property 'package' com.foo: : com.foo.bar
Confirm properties configuration:
groupId: com.foo
artifactId: bar
version: 1.0
package: com.foo.bar
 Y: : Y
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: hiscaffold-archetype:1.0-RELEASE
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: com.foo
[INFO] Parameter: artifactId, Value: bar
[INFO] Parameter: version, Value: 1.0
[INFO] Parameter: package, Value: com.foo.bar
[INFO] Parameter: packageInPathFormat, Value: com/foo/bar
[INFO] Parameter: package, Value: com.foo.bar
[INFO] Parameter: version, Value: 1.0
[INFO] Parameter: groupId, Value: com.foo
[INFO] Parameter: artifactId, Value: bar
[INFO] Parent element not overwritten in /Users/chenzhihao/Documents/development/java/own/hiscaffold-demo/bar/bar-domain/pom.xml
[INFO] Parent element not overwritten in /Users/chenzhihao/Documents/development/java/own/hiscaffold-demo/bar/bar-interface/pom.xml
[INFO] Parent element not overwritten in /Users/chenzhihao/Documents/development/java/own/hiscaffold-demo/bar/bar-common/pom.xml
[INFO] Parent element not overwritten in /Users/chenzhihao/Documents/development/java/own/hiscaffold-demo/bar/bar-bootstrap/pom.xml
[INFO] Parent element not overwritten in /Users/chenzhihao/Documents/development/java/own/hiscaffold-demo/bar/bar-face/pom.xml
[INFO] Parent element not overwritten in /Users/chenzhihao/Documents/development/java/own/hiscaffold-demo/bar/bar-service/pom.xml
[INFO] Parent element not overwritten in /Users/chenzhihao/Documents/development/java/own/hiscaffold-demo/bar/bar-infrastructure/pom.xml
[INFO] Project created from Archetype in dir: /Users/chenzhihao/Documents/development/java/own/hiscaffold-demo/bar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  04:53 min
[INFO] Finished at: 2021-11-16T19:49:35+08:00
[INFO] ------------------------------------------------------------------------

```

新工程生成成功，此时可以通过IDEA或Eclipse导入项目，进行后续开发。下面是使用`tree`命令得到的项目目录结构

```shell
.
└── bar
    ├── SCAFFOLD_README.md
    ├── bar-bootstrap
    │   ├── pom.xml
    │   └── src
    │       ├── main
    │       │   ├── java
    │       │   │   └── com
    │       │   │       └── foo
    │       │   │           └── bar
    │       │   │               └── bootstrap
    │       │   │                   ├── AppApplication.java
    │       │   │                   ├── component
    │       │   │                   │   ├── DefaultSystemMonitor.java
    │       │   │                   │   └── MybatisConfiguration.java
    │       │   │                   └── package-info.java
    │       │   └── resources
    │       │       └── config
    │       │           └── application.yml
    │       └── test
    │           └── java
    │               └── com
    │                   └── foo
    │                       └── bar
    │                           └── AppApplicationTests.java
    ├── bar-common
    │   ├── pom.xml
    │   └── src
    │       └── main
    │           └── java
    │               └── com
    │                   └── foo
    │                       └── bar
    │                           └── common
    │                               └── package-info.java
    ├── bar-domain
    │   ├── pom.xml
    │   └── src
    │       └── main
    │           └── java
    │               └── com
    │                   └── foo
    │                       └── bar
    │                           └── domain
    │                               └── base
    │                                   ├── aggregation
    │                                   │   ├── SystemInfoAgg.java
    │                                   │   └── package-info.java
    │                                   ├── entity
    │                                   │   ├── OperateSystemInfo.java
    │                                   │   ├── ProjectInfo.java
    │                                   │   └── package-info.java
    │                                   ├── factory
    │                                   │   └── package-info.java
    │                                   ├── infrastructure
    │                                   │   ├── SystemRepository.java
    │                                   │   └── package-info.java
    │                                   ├── service
    │                                   │   └── package-info.java
    │                                   └── vo
    │                                       └── package-info.java
    ├── bar-face
    │   ├── pom.xml
    │   └── src
    │       └── main
    │           └── java
    │               └── com
    │                   └── foo
    │                       └── bar
    │                           └── face
    │                               ├── http
    │                               │   └── SystemController.java
    │                               └── package-info.java
    ├── bar-infrastructure
    │   ├── libs
    │   │   └── mbg
    │   │       ├── generatorConfig.xml
    │   │       └── mysql-connector-java-8.0.27.jar
    │   ├── pom.xml
    │   └── src
    │       └── main
    │           ├── java
    │           │   └── com
    │           │       └── foo
    │           │           └── bar
    │           │               └── infrastructure
    │           │                   ├── acl
    │           │                   │   └── package-info.java
    │           │                   ├── package-info.java
    │           │                   ├── persistent
    │           │                   │   ├── mapper
    │           │                   │   │   └── package-info.java
    │           │                   │   ├── package-info.java
    │           │                   │   └── po
    │           │                   │       └── package-info.java
    │           │                   └── infrastructure
    │           │                       ├── package-info.java
    │           │                       └── system
    │           │                           ├── SystemMonitor.java
    │           │                           └── SystemRepositoryImpl.java
    │           └── resources
    │               └── mybatis
    │                   └── mapper
    ├── bar-interface
    │   ├── pom.xml
    │   └── src
    │       └── main
    │           └── java
    │               └── com
    │                   └── foo
    │                       └── bar
    │                           └── interfaces
    │                               └── package-info.java
    ├── bar-service
    │   ├── pom.xml
    │   └── src
    │       └── main
    │           └── java
    │               └── com
    │                   └── foo
    │                       └── bar
    │                           └── service
    │                               ├── package-info.java
    │                               └── system
    │                                   ├── SystemService.java
    │                                   ├── convertor
    │                                   │   └── SystemAssembler.java
    │                                   └── dto
    │                                       ├── OperateSystemInfoDTO.java
    │                                       ├── ProjectInfoDTO.java
    │                                       └── SystemInfoDTO.java
    ├── mbg.sh
    └── pom.xml

87 directories, 46 files

```