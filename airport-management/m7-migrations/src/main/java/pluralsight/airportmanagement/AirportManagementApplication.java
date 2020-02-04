package pluralsight.airportmanagement;

import com.github.mongobee.Mongobee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;

/*
Spring application entry point
 */

@SpringBootApplication
public class AirportManagementApplication {
    private final Environment environment;
    private final MongoTemplate mongoTemplate;

    public AirportManagementApplication(Environment environment, MongoTemplate mongoTemplate) {
        this.environment = environment;
        this.mongoTemplate = mongoTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(AirportManagementApplication.class, args);
    }

    @Bean
    public Mongobee mongobee() {
        String mongoUri = environment
                .getProperty("spring.data.mongodb.uri");
        boolean migrationsEnabled = Boolean.parseBoolean(environment
                .getProperty("app.db.migrations.enabled"));

        Mongobee runner = new Mongobee(mongoUri);

        runner.setEnabled(migrationsEnabled);

        runner.setChangeLogsScanPackage("pluralsight.airportmanagement.db.migrations");

        runner.setChangelogCollectionName("migrations");

        runner.setLockCollectionName("migrations_lock");

        runner.setMongoTemplate(this.mongoTemplate);

        return runner;
    }
}
