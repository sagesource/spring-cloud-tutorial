package io.sagesource.springcloud.tutorial.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>Eureka Server Main</p>
 * <pre>
 *     author      XueQi
 *     date        2019-03-21
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
