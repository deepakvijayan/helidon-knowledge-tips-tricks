package io.dv;

import io.helidon.config.Config;
import static io.helidon.config.ConfigSources.classpath;

public class ConfigMain {

    public static void main(String[] args) {

        Config config = Config.create(() -> classpath("/META-INF/microprofile-config.properties").build());
        String greetingProp = config.get("app.greeting").asString().get();
        System.out.println(greetingProp);
    }
}
