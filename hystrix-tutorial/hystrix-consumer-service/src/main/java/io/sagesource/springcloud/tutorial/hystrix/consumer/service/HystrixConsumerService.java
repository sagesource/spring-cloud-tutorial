package io.sagesource.springcloud.tutorial.hystrix.consumer.service;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-04-01
 *     email       job.xueqi@outlook.com
 * </pre>
 */
public interface HystrixConsumerService {
	/**
	 * 模拟异常调用
	 *
	 * @param username
	 * @return
	 */
	String getUser(String username);

}
