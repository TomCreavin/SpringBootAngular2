/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creavin.service;

import com.creavin.model.User;
import java.util.List;

/**
 *
 * @author TomCreavin <tommycreavin@gmail.com>
 */
public interface UserService {
	List<User> findAllUsers();
	
	User findByUserName(String userName);
	
	User save(User user);

}
