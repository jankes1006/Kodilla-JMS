package com.kodilla.kodillajms.receiver;

import com.kodilla.kodillajms.model.Order;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderReceiver {
    @JmsListener(containerFactory = "jmsFactory", destination = "queue-order")
    public void receiveOrder(Order order) {
        System.out.println("=======RECEIVER=======");
        order.displayOrder();
        System.out.println("======================");
    }
}
