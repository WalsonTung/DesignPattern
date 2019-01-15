package com.zhengzhaoxi.designpattern.creationalpattern.factorymethod;

/***
 *   意图： 定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method 使一个类的实例化延迟到其子类。
 *  适用性： 
 * 1、当一个类不知道它所必须创建的对象的类的时候。 
 * 2、当一个类希望由它的子类来指定它所创建的对象的时候。 
 * 3、当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局部化的时候。 
 * 协作：Creator依赖于它的子类来定义工厂方法，所以它返回一个适当的ConcreteProduct实例。
 * @author donghx
 *
 */
public class Client {

	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		creator.operation();

	}

}
