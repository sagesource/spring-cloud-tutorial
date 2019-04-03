package io.sagesource.springcloud.tutorial.hystrix.consumer.client;

import io.sagesource.springcloud.tutorial.hystrix.consumer.client.fallback.HystrixProviderClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-04-03
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@FeignClient(name = "hystrix-provider-service", fallback = HystrixProviderClientFallback.class)
public interface HystrixProviderClient {

	@RequestMapping(value = "/getProviderUse", method = RequestMethod.GET)
	String getProviderUser(@RequestParam String username);

}
