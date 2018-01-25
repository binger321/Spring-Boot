package com.example.rabbitmq.send;

import com.example.rabbitmq.domain.Action;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
//        Action action = new Action();
//        action.setDirection("左");
//        action.setSpeed(100);
//        action.setMoveTime(10);
//        System.out.println(action.toString());
        this.rabbitTemplate.convertAndSend("hello", context);
    }

}