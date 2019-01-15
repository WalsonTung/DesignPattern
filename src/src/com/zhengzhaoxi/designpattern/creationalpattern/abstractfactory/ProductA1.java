package com.zhengzhaoxi.designpattern.creationalpattern.abstractfactory;

/***
 * 定义一个将被相应的具体工厂创建的产品对象；
 * @author donghx
 *
 */
public class ProductA1 implements AbstractProductA {

	@Override
	public void operation() {
		System.out.println("ProductA1:Operation;");
	}

}
