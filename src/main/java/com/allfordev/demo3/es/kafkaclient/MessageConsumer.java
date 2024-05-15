package com.allfordev.demo3.es.kafkaclient;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(id = "myGroup", topics = "order-topic")
    public void listen(String in) {
        //Logic to consume/process message goes here
        System.out.println(in);
    }
}