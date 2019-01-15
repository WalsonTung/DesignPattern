package com.zhengzhaoxi.designpattern.creationalpattern.builder;

/***
 *   意图：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示.
 * 适用性：
 * 1、当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。 
 * 2、当构造过程必须允许被构造的对象有不同的表示时。 
 * 协作：
 * 1、客户创建Director对象，并用它所想要的Builder对象进行配置；
 * 2、一旦产品部件被生成，导向器(Director)就会通知生成器(Builder)；
 * 3、生成器处理导向器的请求，并将部件添加到该产品中；
 * 4、客户从生成器中检索产品。
 * @author donghx
 *
 */
public class Client {

	public static void main(String[] args) {
		Director d = new Director();
		Builder builder = new ConcreteBuilder();
		d.construct(builder);
		String[] result = builder.getResult();
		for(String item : result) {
			System.out.println(item);
		}

	}

}
