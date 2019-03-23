package io.sagesource.springcloud.tutorial.feign.client.config;

import feign.Feign;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * <p>feign okhttp config class</p>
 * <pre>
 *     author      XueQi
 *     date        2019-03-23
 *     email       job.xueqi@outlook.com
 * </pre>
 */
@Configuration
@ConditionalOnClass(Feign.class)                    // 类加载器中存在指明的类
@AutoConfigureBefore(FeignAutoConfiguration.class)  // 在指定的配置类初始化前加载
public class FeignOkHttpConfig {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	/**
	 * 创建 OkHttpClient Bean
	 *
	 * @return
	 */
	@Bean
	public OkHttpClient okHttpClient() {
		OkHttpClient client = new OkHttpClient.Builder()
				// 连接超时时间
				.connectTimeout(60, TimeUnit.SECONDS)
				// 读取超时时间
				.readTimeout(60, TimeUnit.SECONDS)
				// 写超时时间
				.writeTimeout(60, TimeUnit.SECONDS)
				// 是否自动重连
				.retryOnConnectionFailure(true)
				// 连接池
				.connectionPool(new ConnectionPool())
				// 构建okhttp对象
				.build();

		LOGGER.info("init okhttp client success");
		return client;
	}

}
