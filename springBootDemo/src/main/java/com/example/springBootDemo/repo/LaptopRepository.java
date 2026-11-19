package com.example.springBootDemo.repo;

import com.example.springBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository         // it is similar to '@Connected' but @Repository is suitable for repo layer
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Database coneected");
    }
}
