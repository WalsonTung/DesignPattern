package com.zhengzhaoxi.designpattern.creationalpattern.factorymethod;

public class ConcreteCreator extends Creator {

	/***
	 * 重定义工厂方法以返回一个ConcreteProduct实例。
	 */
	@Override
	public Product factoryMethod() {
		
		return new ConcreteProduct();
	}

}
