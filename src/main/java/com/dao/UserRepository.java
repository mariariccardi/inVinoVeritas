package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User,Long>{
	User findByUsernameAndPassword(String username, String password);
}
