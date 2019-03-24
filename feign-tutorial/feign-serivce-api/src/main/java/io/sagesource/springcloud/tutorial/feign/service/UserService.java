package io.sagesource.springcloud.tutorial.feign.service;

import io.sagesource.springcloud.tutorial.feign.params.UserRequest;
import io.sagesource.springcloud.tutorial.feign.params.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-03-24
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@FeignClient(name = "feign-provider")
public interface UserService {

	/**
	 * 添加用户
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/user/add")
	UserResponse addUser(@RequestBody UserRequest request);

}
