package com.zhengzhaoxi.designpattern.creationalpattern.factorymethod;

/***
 * 实现Product接口。
 * @author donghx
 *
 */
public class ConcreteProduct implements Product {

	@Override
	public void doSomething() {
		System.out.println("ConcreteProduct");
	}

}
