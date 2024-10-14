package com.devilish.dscommerce.services;

import com.devilish.dscommerce.dto.ProductDTO;
import com.devilish.dscommerce.entities.Product;
import com.devilish.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();
        ProductDTO dto = new ProductDTO(product);
        return dto;
    }
}
