## Spring Boot 
#### Run Application
./gradlew build && java -jar build/libs/spring-boot-work-profiles.jar

#### Prod
java -jar -Dspring.profiles.active=prod build/libs/spring-boot-work-profiles.jar
