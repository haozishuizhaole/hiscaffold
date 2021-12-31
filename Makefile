.DEFAULT: all

all: build

# 编译
build: clean
	mvn compile

# 运行
run: build
	mvn -pl hiscaffold-bootstrap spring-boot:run

# 清除编译或打包产物
clean:
	mvn clean

# 打包(跳过测试)
package: clean
	mvn package -DskipTests=true

# 安装(跳过测试)
install: clean
	mvn install -DskipTests=true

# 发布
deploy: clean
	mvn deploy -DskipTests=true

# 执行 Mybatis Generator
mbg:
	sh mbg.sh