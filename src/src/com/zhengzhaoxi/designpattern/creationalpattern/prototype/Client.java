package com.zhengzhaoxi.designpattern.creationalpattern.prototype;

/***
 *  意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 
 * 适用性：
 * 1、当要实例化的类是在运行时刻指定时，例如，通过动态装载；或者 
 * 2、为了避免创建一个与产品类层次平行的工厂类层次时；或者 
 * 3、当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型
 *    并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。 
 *    
 * 协作：客户请求一个原型克隆自身。
 * @author donghx
 *
 */
public class Client {
	
	private Prototype mInstance;
	
	public Client(Prototype instance) {
		mInstance = instance;
	}

	public static void main(String[] args) {
		Client client1 = new Client(new ConcretePrototype1());
		Client client2 = new Client(new ConcretePrototype2());
		client1.operation();
		client2.operation();

	}
	
	public void operation() {
		mInstance.doSomething();
	}

}
