## Spring Boot 
#### Run Application
./gradlew build && java -jar build/libs/spring-boot-work-type-safe.jar




### Relaxed binding

| Property  | Note  |
|---|---|
| person.firstName  | Standard camel case syntax.  |
| person.first-name | Dashed notation, recommended for use in .properties and .yml files.  |
| person.first_name  | Underscore notation, alternative format for use in .properties and .yml files.  |
| PERSON_FIRST_NAME  | Upper case format. Recommended when using a system environment variables.  |

