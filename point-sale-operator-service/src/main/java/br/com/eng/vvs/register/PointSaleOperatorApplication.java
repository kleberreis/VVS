package br.com.eng.vvs.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PointSaleOperatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PointSaleOperatorApplication.class, args);
	}
}
