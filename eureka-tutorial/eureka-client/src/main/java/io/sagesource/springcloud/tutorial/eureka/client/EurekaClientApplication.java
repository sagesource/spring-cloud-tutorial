package io.sagesource.springcloud.tutorial.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>Eureka Client Main</p>
 * <pre>
 *     author      XueQi
 *     date        2019-03-21
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@SpringBootApplication
@EnableDiscoveryClient
// @EnableDiscoveryClient和@EnableEurekaClient共同点就是：都是能够让注册中心能够发现，扫描到改服务。
// 不同点：@EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}
