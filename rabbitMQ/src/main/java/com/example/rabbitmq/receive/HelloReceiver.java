package com.example.rabbitmq.receive;

import com.example.rabbitmq.domain.Action;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

//    @RabbitHandler
//    public void process(Action hello) {
//        System.out.println("Receiver1  : " + hello);
//    }

}