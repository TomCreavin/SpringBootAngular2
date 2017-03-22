/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.controller;

import hello.model.User;
import hello.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tc2602
 */
@RestController
@RequestMapping("/rest")
public class UserResource {

  @Autowired
  private UserService userService;

  @RequestMapping("/user/users")
  public List<User> findAllUsers() {
    return userService.findAllUsers();
  }

  @RequestMapping(value = "/user/userName", method = RequestMethod.POST)
  public User findByUserName(@RequestBody String userName) {
    return userService.findByUserName(userName);
  }

  @RequestMapping(value = "/user/update", method = RequestMethod.POST)
  public User updateUser(@RequestBody User user) {
    return userService.save(user);
  }

}
