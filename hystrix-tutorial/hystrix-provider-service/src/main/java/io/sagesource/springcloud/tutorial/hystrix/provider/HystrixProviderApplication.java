package io.sagesource.springcloud.tutorial.hystrix.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-04-01
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HystrixProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixProviderApplication.class, args);
	}

}
