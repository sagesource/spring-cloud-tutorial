package io.sagesource.springcloud.tutorial.feign.client.service;

import io.sagesource.springcloud.tutorial.feign.client.config.FeignClientServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>Feign Client Service</p>
 * <pre>
 *     author      XueQi
 *     date        2019-03-23
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@FeignClient(name = "github-client", url = "https://api.github.com", configuration = FeignClientServiceConfig.class)
public interface GithubFeignService {

	/**
	 * 类似Spring mvc的用法
	 *
	 * @param queryStr
	 * @return
	 */
	@RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
	String searchRepo(@RequestParam("q") String queryStr);

	/**
	 * gzip用法
	 *
	 * @param queryStr
	 * @return
	 */
	@RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
	ResponseEntity<byte[]> searchRepoByGzip(@RequestParam("q") String queryStr);
}
