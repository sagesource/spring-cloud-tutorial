package io.sagesource.springcloud.tutorial.feign.provider.controller;

import io.sagesource.springcloud.tutorial.feign.params.UserRequest;
import io.sagesource.springcloud.tutorial.feign.params.UserResponse;
import io.sagesource.springcloud.tutorial.feign.service.UserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-03-24
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@RestController
public class UserController implements UserService {


	@Override
	public UserResponse addUser(UserRequest request) {
		String str = request.toString();

		UserResponse response = new UserResponse();
		response.setEcho("hello: " + str);

		return response;
	}
}
