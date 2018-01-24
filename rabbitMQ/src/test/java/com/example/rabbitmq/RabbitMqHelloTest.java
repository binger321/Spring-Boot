package com.example.rabbitmq;

import com.example.rabbitmq.receive.HelloReceiver;
import com.example.rabbitmq.send.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {

    @Autowired
    private HelloSender helloSender;
//    @Autowired
//    private HelloReceiver helloReceiver;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }

//    @Test
//    public void sayHello() throws Exception{
//        helloReceiver.process("hello1");
//    }

}