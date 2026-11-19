package com.example.springBootDemo.service;

import com.example.springBootDemo.model.Laptop;
import com.example.springBootDemo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGoodOrBad(Laptop lap) {
        return true;
    }
}
