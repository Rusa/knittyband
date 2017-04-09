package com.rusamaha.knittyband.services;

import com.rusamaha.knittyband.dao.CategoryDao;
import com.rusamaha.knittyband.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rusamaha on 4/9/17.
 */

@Service
@Transactional
public class CategoryService {

    @Autowired
    CategoryDao categoryDao;

    public List<Category> getAll(){
        return categoryDao.getCategories();
    }
}
