package com.example.springBootDemo.service;

import com.example.springBootDemo.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap) {
        System.out.println("addLaptop method called");
    }

    public boolean isGoodOrBad(Laptop lap) {
        return true;
    }
}
