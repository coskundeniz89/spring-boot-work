## Spring Boot + Redis
#### Run Application
./gradlew build && java -jar build/libs/spring-boot-work-redis.jar

##### For set password
redis-cli> config set requirepass 12345

##### For login
redis-cli> auth 12345