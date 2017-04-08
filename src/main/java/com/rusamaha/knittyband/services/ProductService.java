package com.rusamaha.knittyband.services;

import com.rusamaha.knittyband.dao.ProductRepository;
import com.rusamaha.knittyband.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rusamaha on 4/7/17.
 */
@Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Iterable<Product> getAll(){
        return productRepository.findAll();
    }
}
