package com.rusamaha.knittyband.dao;

import com.rusamaha.knittyband.model.Category;
import com.rusamaha.knittyband.model.Product;

import java.util.List;

/**
 * Created by rusamaha on 4/9/17.
 */
public interface ProductDao {

    List<Product> getProductsByCategory(Category category);

}
