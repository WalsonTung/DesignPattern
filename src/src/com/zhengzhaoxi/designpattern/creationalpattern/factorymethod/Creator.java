package com.zhengzhaoxi.designpattern.creationalpattern.factorymethod;

/***
 * 声明工厂方法，该方法返回一个Product类型的对象。
 * Creator也可以定义一个工厂方法的缺省实现，
 * 他返回一个缺省的concreteProduct对象。
 * @author donghx
 *
 */
public abstract class Creator {

	public abstract Product factoryMethod();
	public void operation() {
		Product product = factoryMethod();
		product.doSomething();
	}
}
