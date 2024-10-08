package co.sapphire.multidatabaseconfig.mongoDbResources.enttiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "PRODUCTS")
public class Product {

    @Id
    private Integer id;
    private String productName;
    private String qty;
}
