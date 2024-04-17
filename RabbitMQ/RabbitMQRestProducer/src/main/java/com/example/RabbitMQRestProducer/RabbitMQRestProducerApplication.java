package com.example.RabbitMQRestProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class RabbitMQRestProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMQRestProducerApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		String message = "foo\n";
		System.out.print(message);
		return message;
	}

}
