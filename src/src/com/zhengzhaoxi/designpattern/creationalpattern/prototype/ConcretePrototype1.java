package com.zhengzhaoxi.designpattern.creationalpattern.prototype;

/***
 * 实现一个克隆自身的操作。
 * @author donghx
 *
 */
public class ConcretePrototype1 implements Prototype {

	@Override
	public Prototype clone() {
		
		return new ConcretePrototype1();
	}

	@Override
	public void doSomething() {
		System.out.println("ConcretePrototype1:DoSomething;");

	}

}
