package co.sapphire.multidatabaseconfig.mongoDbResources.repo;

import co.sapphire.multidatabaseconfig.mongoDbResources.enttiy.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, Integer> {
}
