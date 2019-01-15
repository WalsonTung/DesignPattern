package com.zhengzhaoxi.designpattern.creationalpattern.abstractfactory;

/***
 *  声明一个创建抽象产品对象的操作接口；
 * @author donghx
 *
 */
public interface AbstractFactory {

	AbstractProductA createProductA();
	
	AbstractProductB createProductB();
}
