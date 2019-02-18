package com.bentest.factory_method.service;

public class Redis implements ICache {

	public boolean add(String key, String value) {
		System.out.println("redis缓存，key="+key+",value="+value);
		return true;
	}

}
