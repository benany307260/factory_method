package com.bentest.factory_method.service;

public class Memcached implements ICache {

	public boolean add(String key, String value) {
		System.out.println("memcached缓存，key="+key+",value="+value);
		return true;
	}

}
