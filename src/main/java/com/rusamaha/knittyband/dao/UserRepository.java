package com.rusamaha.knittyband.dao;

import com.rusamaha.knittyband.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rusamaha on 4/7/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
}
