package com.bentest.factory_method.service;

/**
 * 缓存接口
 *
 */
public interface ICache {
	boolean add(String key, String value);
}
