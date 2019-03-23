package io.sagesource.springcloud.tutorial.feign.client.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-03-23
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@Configuration
public class FeignClientServiceConfig {

	/**
	 * Logger.Level 的具体级别如下：
	 * NONE：不记录任何信息
	 * BASIC：仅记录请求方法、URL以及响应状态码和执行时间
	 * HEADERS：除了记录 BASIC级别的信息外，还会记录请求和响应的头信息
	 * FULL：记录所有请求与响应的明细，包括头信息、请求体、元数据
	 *
	 * @return
	 */
	@Bean
	public Logger.Level loggerLevel() {
		return Logger.Level.FULL;
	}

}
