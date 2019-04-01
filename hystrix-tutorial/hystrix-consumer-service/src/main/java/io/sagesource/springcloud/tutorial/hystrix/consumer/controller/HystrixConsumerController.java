package io.sagesource.springcloud.tutorial.hystrix.consumer.controller;

import io.sagesource.springcloud.tutorial.hystrix.consumer.service.HystrixConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-04-01
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@RestController
public class HystrixConsumerController {

	@Autowired
	private HystrixConsumerService hystrixConsumerService;

	/**
	 * 模拟调用方法异常降级的场景
	 *
	 * @param username
	 * @return
	 */
	@GetMapping("/getUser")
	public String getUser(@RequestParam String username) {
		return hystrixConsumerService.getUser(username);
	}
}
