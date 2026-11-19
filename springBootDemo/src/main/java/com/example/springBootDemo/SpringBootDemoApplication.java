package com.example.springBootDemo;

import com.example.springBootDemo.model.Alien;
import com.example.springBootDemo.model.Laptop;
import com.example.springBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);


//		// bean is nothing but object in springboot
//		Alien obj = context.getBean(Alien.class);
//		obj.code();
	}
}
