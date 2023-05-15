#!/bin/bash

./gradlew localDistro
cp -f modified/brpc-spring-boot-starter-3.0.5.jar build/distribution/local/elasticsearch-8.6.0-SNAPSHOT/lib
cp -f modified/spring-cloud-baidu-thirdparty-commons-2022.2.0.jar build/distribution/local/elasticsearch-8.6.0-SNAPSHOT/lib
cp -f modified/java.policy build/distribution/local/elasticsearch-8.6.0-SNAPSHOT/jdk/conf/security
