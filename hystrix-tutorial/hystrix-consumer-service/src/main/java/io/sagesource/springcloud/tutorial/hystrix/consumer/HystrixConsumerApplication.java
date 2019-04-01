package io.sagesource.springcloud.tutorial.hystrix.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-04-01
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
public class HystrixConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixConsumerApplication.class, args);
	}

}
