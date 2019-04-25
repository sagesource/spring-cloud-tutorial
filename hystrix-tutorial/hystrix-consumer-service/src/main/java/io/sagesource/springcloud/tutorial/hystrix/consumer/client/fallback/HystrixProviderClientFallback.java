package io.sagesource.springcloud.tutorial.hystrix.consumer.client.fallback;

import io.sagesource.springcloud.tutorial.hystrix.consumer.client.HystrixProviderClient;
import org.springframework.stereotype.Component;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-04-03
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@Component("HystrixProviderClientFallback")
public class HystrixProviderClientFallback implements HystrixProviderClient {
	@Override
	public String getProviderUser(String username) {
		return "The user does not exist in this system, please confirm username";
	}
}
