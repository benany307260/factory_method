package com.bentest.factory_method.factory_method;

import com.bentest.factory_method.service.Ehcache;
import com.bentest.factory_method.service.ICache;

public class EhcacheFactory implements IFactory {

	@Override
	public ICache createCache() {
		return new Ehcache();
	}

}
