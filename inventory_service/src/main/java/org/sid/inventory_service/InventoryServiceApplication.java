package org.sid.inventory_service;

import org.sid.inventory_service.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.sid.inventory_service.repository.ProductRepository;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null,"ordinatieur",7000,12));
            productRepository.save(new Product(null,"portable",800,12));
            productRepository.save(new Product(null,"imprimante",2000,12));
            productRepository.findAll().forEach(p->{
                System.out.println(p.toString());
            });


        };
    }

}
