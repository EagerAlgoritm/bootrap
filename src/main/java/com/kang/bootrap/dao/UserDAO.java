package com.kang.bootrap.dao;

import com.kang.bootrap.model.Role;
import com.kang.bootrap.model.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Set;


public interface UserDAO {

    List<User> readAll();

    List<Role> readRole();

    Set<Role> getRoles(String[] ids);

    void insert(User user);

    void update(User user);

    void delete(Integer id);

    User read(Integer id);

    UserDetails findByUsername(String username);
}