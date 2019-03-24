package io.sagesource.springcloud.tutorial.feign.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>Feign Provider Main</p>
 * <pre>
 *     author      XueQi
 *     date        2019-03-24
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FeignProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignProviderApplication.class, args);
	}

}
