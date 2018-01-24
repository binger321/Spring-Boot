package com.example.helloworld.dao;

import com.example.helloworld.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/11/30 0030
 * Time: 20:09
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String userName, String email);
    List<User> findAllByUserNameAndPassWord(String userName, String passWord);
}