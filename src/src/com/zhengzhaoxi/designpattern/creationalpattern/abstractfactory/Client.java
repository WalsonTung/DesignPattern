package com.zhengzhaoxi.designpattern.creationalpattern.abstractfactory;

/****
 *   意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 
 * 适用性：
 * 1、一个系统要独立于它的产品的创建、组合和表示时。 
 * 2、一个系统要由多个产品系列中的一个来配置时。 
 * 3、当你要强调一系列相关的产品对象的设计以便进行联合使用时。
 * 4、当你提供一个产品类库，而只想显示它们的接口而不是实现时。
 * 
 * 协作：
 * 1、通常在运行时刻创建一个ConcreteFactory类的实例。这一具体的工厂创建具有特定实现的
 *     产品对象，为常见不同的产品对象，客户应使用不同的具体工厂。
 * 2、AbstractFactory将产品对象的创建延迟到它的ConcreteFactory子类。
 * @author donghx
 *
 */
public class Client {

	public static void main(String[] args) {
		//仅使用由AbstractFactory和AbstractProduct类声明的接口
		AbstractFactory factory = new ConcreteFactory1();
		AbstractProductA productA = factory.createProductA();
		AbstractProductB productB = factory.createProductB();
		productA.operation();
		productB.operation();

		factory = new ConcreteFactory2();
		productA = factory.createProductA();
		productB = factory.createProductB();
		productA.operation();
		productB.operation();
	}

}
