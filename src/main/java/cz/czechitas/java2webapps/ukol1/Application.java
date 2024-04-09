package cz.czechitas.java2webapps.ukol1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hlavní třída, která spouští celou aplikaci pomocí Spring Boot.
 */
@SpringBootApplication
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        logger.info("Application runs on the address: http://localhost:{}", applicationContext.getEnvironment().getProperty("local.server.port"));
    }

}
