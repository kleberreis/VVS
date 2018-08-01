package br.com.eng.vvs.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProvinceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvinceApplication.class, args);
	}
}
