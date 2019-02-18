package com.bentest.factory_method;

import com.bentest.factory_method.factory_method.IFactory;
import com.bentest.factory_method.service.ICache;
import com.bentest.factory_method.simple_factory.SimpleFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// 简单工厂测试
    	App.TestSimpleFactory();
    	
    	//
    	App.TestFactoryMethod();
    }
    
    /**
     * 简单工厂
     */
    public static void TestSimpleFactory() {
    	ICache redisCache = SimpleFactory.createCache("redis");
    	redisCache.add("test", "test");
    	
    	ICache memcached = SimpleFactory.createCache("memcached");
    	memcached.add("test", "test");
    	
    	ICache ehcache = SimpleFactory.createCache("ehcache");
    	ehcache.add("test", "test");
    }
    
    /**
     * 工厂方法
     * @throws ClassNotFoundException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     */
    public static void TestFactoryMethod() {
    	
    	try {
			IFactory redisFactory = (IFactory)Class.forName("com.bentest.factory_method.factory_method.RedisFactory").newInstance();
			ICache redisCache = redisFactory.createCache();
			redisCache.add("test2", "test2");
			
			IFactory memcachedFactory = (IFactory)Class.forName("com.bentest.factory_method.factory_method.MemcachedFactory").newInstance();
			ICache memcached = memcachedFactory.createCache();
			memcached.add("test2", "test2");
			
			IFactory ehcacheFactory = (IFactory)Class.forName("com.bentest.factory_method.factory_method.EhcacheFactory").newInstance();
			ICache ehcache = ehcacheFactory.createCache();
			ehcache.add("test2", "test2");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    
    }
}
