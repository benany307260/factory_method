package com.bentest.factory_method.factory_method;

import com.bentest.factory_method.service.ICache;

/**
 * 工厂接口
 *
 */
public interface IFactory {
	ICache createCache();
}
