package com.bn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication /*  é o ponto de entrada da sua aplicação. Ela indica que a classe principal pertence ao Spring Boot
 						e agrupa três anotações essenciais: @Configuration, @EnableAutoConfiguration e @ComponentScan. */
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
