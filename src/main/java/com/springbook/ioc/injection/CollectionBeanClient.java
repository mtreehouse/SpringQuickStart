package com.springbook.ioc.injection;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		Properties addressList = bean.getAddressList();
		for(Object key : addressList.keySet()) {
			System.out.println(key + "___" + addressList.get(key));
		}
		factory.close();
		
	}
}
