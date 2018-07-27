package br.com.eng.vvs.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OperatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperatorApplication.class, args);
	}
}
