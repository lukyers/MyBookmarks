package com.bin.entity;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by richard02.zhang on 2016/8/12.
 */

public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	String uid;

	String name;

	int age;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
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

	@Override
	public String toString() {
		return "User{" +
				"uid='" + uid + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
