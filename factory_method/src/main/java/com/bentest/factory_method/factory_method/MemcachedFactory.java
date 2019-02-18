package com.bentest.factory_method.factory_method;

import com.bentest.factory_method.service.ICache;
import com.bentest.factory_method.service.Memcached;

public class MemcachedFactory implements IFactory {

	@Override
	public ICache createCache() {
		return new Memcached();
	}

}
