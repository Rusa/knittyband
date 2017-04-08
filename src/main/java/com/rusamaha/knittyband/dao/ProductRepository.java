package com.rusamaha.knittyband.dao;

import com.rusamaha.knittyband.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rusamaha on 4/7/17.
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
