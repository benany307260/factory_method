package com.bentest.factory_method.simple_factory;

import com.bentest.factory_method.service.Ehcache;
import com.bentest.factory_method.service.ICache;
import com.bentest.factory_method.service.Memcached;
import com.bentest.factory_method.service.Redis;

/**
 * 简单工厂
 * @author soap
 *
 */
public class SimpleFactory {
	
	public static ICache createCache(String name) {
		ICache cache;
		switch(name) {
		case "redis":
			cache = new Redis();
			break;
		case "memcached":
			cache = new Memcached();
			break;
		case "ehcache":
			cache = new Ehcache();
			break;
		default:
			cache = null;
		}
		return cache;
	}
}
