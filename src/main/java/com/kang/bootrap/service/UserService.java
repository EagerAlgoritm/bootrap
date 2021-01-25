package com.kang.bootrap.service;

import com.kang.bootrap.model.Role;
import com.kang.bootrap.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Set;


public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    List<Role> getAllRoles();

    List<List<String>> getUserRoles(List<Role> allRoles, User user);

    Set<Role> getRoles(String[] ids);

    void insert(User user);

    void update(User user);

    User getUser(Integer id);

    void deleteUser(Integer id);

}




