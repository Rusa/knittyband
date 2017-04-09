package com.rusamaha.knittyband.services;

import com.rusamaha.knittyband.dao.ProductDao;
import com.rusamaha.knittyband.model.Category;
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
    ProductDao productDao;

    public Iterable<Product> getAll(){
        return null;
    }

    public List<Product> getByCategory(Category category) {
        return productDao.getProductsByCategory(category);
    }
}
