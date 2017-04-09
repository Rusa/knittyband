package com.rusamaha.knittyband.dao;

import com.rusamaha.knittyband.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rusamaha on 4/9/17.
 */
public interface CategoryDao {
    List<Category> getCategories();
}
