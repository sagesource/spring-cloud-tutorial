package io.sagesource.springcloud.tutorial.feign.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>Feign Client Main</p>
 * <pre>
 *     author      XueQi
 *     date        2019-03-23
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"io.sagesource"})
public class FeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}

}
