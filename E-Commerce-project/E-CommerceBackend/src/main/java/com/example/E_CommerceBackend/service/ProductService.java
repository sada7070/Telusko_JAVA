package com.example.E_CommerceBackend.service;

import com.example.E_CommerceBackend.model.Product;
import com.example.E_CommerceBackend.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(new Product(-1));
    }

    public Product addProduct(Product product, MultipartFile imageFile) {

        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        try {
            product.setImageData(imageFile.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return productRepo.save(product);
    }
}
