# Helidon Mp Config examples

This project contains helidon mp-config module examples

#### What is helidon config module?
1. Helidon Configuration a.k.a Config module helps you to read properties from
 /src/main/resources/META-INF/microprofile-config.properties file.
2. microprofile-config.properties is same as applications.properties files in Spring Boot
3. It also helps you to configure different sources for properties like
    i. Class path files microprofile-config.properties
    ii. java environment variables
    iii. java system properties
    iv. any other files specified as an argument.
    
### Let's take a look at simple code examples
```java

// If you want to get access to the helidon Config object

import io.helidon.config.Config;
import static io.helidon.config.ConfigSources.classpath;

public class ConfigMain {

    public static void main(String[] args) {

        Config config = Config.create(() -> classpath("/META-INF/microprofile-config.properties").build());
        String greetingProp = config.get("app.greeting").asString().get();
        System.out.println(greetingProp);
    }
}

// The above code will print the value of "app.greeting" property defined in /META-INF/microprofile-config.properties 

```
