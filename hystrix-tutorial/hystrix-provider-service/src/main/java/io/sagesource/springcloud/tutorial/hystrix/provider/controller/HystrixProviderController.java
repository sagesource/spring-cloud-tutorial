package io.sagesource.springcloud.tutorial.hystrix.provider.controller;

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
public class HystrixProviderController {

	@GetMapping("/getProviderUse")
	public String getProviderUser(@RequestParam String username) {
		return "This is real user : " + username;
	}

}
