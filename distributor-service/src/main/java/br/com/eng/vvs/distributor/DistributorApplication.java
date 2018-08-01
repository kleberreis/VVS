package br.com.eng.vvs.distributor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DistributorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributorApplication.class, args);
	}
}