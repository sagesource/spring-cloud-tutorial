package io.sagesource.springcloud.tutorial.hystrix.consumer.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.sagesource.springcloud.tutorial.hystrix.consumer.service.HystrixConsumerService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-04-01
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@Service
public class HystrixConsumerServiceImpl implements HystrixConsumerService {

	@Override
	@HystrixCommand(fallbackMethod = "getDeaultUser")
	public String getUser(String username) {
		if (StringUtils.equalsIgnoreCase(username, "Springboot")) {
			return "This is real user";
		}
		throw new RuntimeException();
	}

	/**
	 * 降级方法
	 *
	 * @return
	 */
	public String getDeaultUser(String username) {
		return "The user does not exist in this system";
	}
}
