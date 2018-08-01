package br.com.eng.vvs.province;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ProvinceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvinceApplication.class, args);
	}
	
    @Bean
    public Sampler defaultSampler() {
        return new AlwaysSampler();
    }
	
}