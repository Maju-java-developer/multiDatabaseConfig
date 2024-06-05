package co.sapphire.multidatabaseconfig.mongoDbResources.controller;

import co.sapphire.multidatabaseconfig.mongoDbResources.enttiy.Product;
import co.sapphire.multidatabaseconfig.mongoDbResources.repo.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
@AllArgsConstructor
public class ProductController {

    private final ProductRepo productRepo;

    @PostMapping("getAll")
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @PostMapping("addProduct")
    public Product addProduct(@RequestBody Product addProduct) {
        return productRepo.save(addProduct);
    }

    @PostMapping("/delete")
    public String deleteProduct(@RequestBody Product delete) {
        productRepo.deleteById(delete.getId());
        return "DELETE Successfully!";
    }

}
