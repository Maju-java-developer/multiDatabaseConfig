package co.sapphire.multidatabaseconfig.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = "co.sapphire.multidatabaseconfig.mongoDbResources.repo")
public class MongoDbConfig {
}
