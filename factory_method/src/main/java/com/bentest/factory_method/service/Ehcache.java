package com.bentest.factory_method.service;

public class Ehcache implements ICache {

	public boolean add(String key, String value) {
		System.out.println("ehcache缓存，key="+key+",value="+value);
		return true;
	}

}
