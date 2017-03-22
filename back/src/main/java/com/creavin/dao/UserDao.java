/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creavin.dao;

import com.creavin.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TomCreavin <tommycreavin@gmail.com>
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {
	List<User> findAll();
	
	User findByUserName(String userName);
	
	User findByUserId(Long userId);
	
	User save(User user);
}
