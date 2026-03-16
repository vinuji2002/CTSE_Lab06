package com.example.billingservice.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BillingConsumer {

    @KafkaListener(topics = "order-topic", groupId = "billing-group")
    public void consume(String message) {

        System.out.println("Invoice Generated for Order: " + message);

    }
}