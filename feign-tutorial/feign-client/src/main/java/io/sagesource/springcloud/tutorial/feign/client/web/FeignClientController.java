package io.sagesource.springcloud.tutorial.feign.client.web;

import io.sagesource.springcloud.tutorial.feign.client.service.GithubFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-03-23
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@RestController
public class FeignClientController {

	@Autowired
	private GithubFeignService githubFeignService;

	// 服务消费者对应提供的服务
	@GetMapping(value = "/search/github")
	public String searchGithubRepoByStr(@RequestParam("str") String queryStr) {
		return githubFeignService.searchRepo(queryStr);
	}

	// 服务消费者对应提供的服务
	@GetMapping(value = "/search/github/gzip")
	public ResponseEntity<byte[]> searchGithubRepoByStrGzip(@RequestParam("str") String queryStr) {
		return githubFeignService.searchRepoByGzip(queryStr);
	}
}
