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
public class UserRequest implements Serializable {
	private static final long serialVersionUID = 5003741632497269656L;

	private Long   id;
	private String name;
	private int    age;

	@Override
	public String toString() {
		return "id:" + id + ", name:" + name + ", age:" + age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
