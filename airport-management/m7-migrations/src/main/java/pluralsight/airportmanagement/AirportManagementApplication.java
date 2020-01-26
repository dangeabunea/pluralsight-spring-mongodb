package pluralsight.airportmanagement;

import com.github.mongobee.Mongobee;
import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.EnvironmentAware;
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


}
