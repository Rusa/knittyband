package com.rusamaha.knittyband.dao;

import com.rusamaha.knittyband.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rusamaha on 4/9/17.
 */

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
