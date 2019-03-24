package io.sagesource.springcloud.tutorial.feign.params;

import java.io.Serializable;

/**
 * <p></p>
 * <pre>
 *     author      XueQi
 *     date        2019-03-24
 *     email       job.xueqi@outlook.com
 * </pre>
 */
public class UserResponse implements Serializable {
	private static final long serialVersionUID = -6562624811427172211L;

	private String echo;

	public String getEcho() {
		return echo;
	}

	public void setEcho(String echo) {
		this.echo = echo;
	}
}
