package com.rusamaha.knittyband.dao.impl;

import com.rusamaha.knittyband.dao.ProductDao;
import com.rusamaha.knittyband.model.Category;
import com.rusamaha.knittyband.model.Product;
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
 * Created by rusamaha on 4/9/17.
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    public ProductDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Product> getProductsByCategory(Category category) {
        Session session = sessionFactory.getCurrentSession();

        Criteria criteria = session.createCriteria(Product.class);
        criteria.add(Restrictions.eq("category", category));
        return criteria.list();

    }
}
