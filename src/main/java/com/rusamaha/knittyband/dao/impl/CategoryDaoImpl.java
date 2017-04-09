package com.rusamaha.knittyband.dao.impl;

import com.rusamaha.knittyband.dao.CategoryDao;
import com.rusamaha.knittyband.model.Category;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by rusamaha on 4/10/17.
 */
@Repository
public class CategoryDaoImpl implements CategoryDao {
    @Autowired
    private SessionFactory sessionFactory;

    public CategoryDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<Category> getCategories() {
        Session session = sessionFactory.getCurrentSession();

        Criteria criteria = session.createCriteria(Category.class);

        return criteria.list();
    }
}
