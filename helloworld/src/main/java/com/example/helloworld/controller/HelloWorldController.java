package com.example.helloworld.controller;

import com.example.helloworld.dao.UserRepository;
import com.example.helloworld.domain.User;
import com.example.helloworld.property.NeoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/11/30 0030
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class HelloWorldController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("/hello")
    public String index(){
        return "Hello World2";
    }

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    @Cacheable(value = "user-key")
    public User getUser(@RequestParam String userName,@RequestParam String passWord){
        User user;
        user=userRepository.findAllByUserNameAndPassWord(userName,passWord).get(0);
////        System.out.println(new NeoProperties().getTitle());
//        ValueOperations<String,User> valueOperations=redisTemplate.opsForValue();
//        valueOperations.set("user-key",user);
        return user;
    }

    @RequestMapping("/getUser1")
    @Cacheable(value="user-key")
    public User getUser1() {
        User user=userRepository.findByUserName("bb2");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }

}