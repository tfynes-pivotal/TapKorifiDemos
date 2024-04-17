package com.example.RabbitMQRestProducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class RabbitMQConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);

    // @Autowired
    // private RabbitMQConsumer(RabbitTemplate rabbitTemplate) {
    //     this.rabbitTemplate = rabbitTemplate;
    // }

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void consume(String message){ 
        LOGGER.info(String.format("Received message  -> %s", message ));
    }

}
