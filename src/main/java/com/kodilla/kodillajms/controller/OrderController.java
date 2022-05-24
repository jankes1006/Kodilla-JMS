package com.kodilla.kodillajms.controller;

import com.kodilla.kodillajms.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping(path = "/send")
    public void processMessage(@RequestBody Order order) {
        System.out.println("=======TRANSMITER=====");
        jmsTemplate.convertAndSend("queue-order", order);
        order.displayOrder();
        System.out.println("======================");
    }

}
