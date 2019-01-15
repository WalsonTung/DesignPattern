package com.zhengzhaoxi.designpattern.creationalpattern.prototype;

public class ConcretePrototype2 implements Prototype {

	@Override
	public Prototype clone() {

		return new ConcretePrototype2();
	}

	@Override
	public void doSomething() {
		System.out.println("ConcretePrototype2:doSomething;");

	}

}
