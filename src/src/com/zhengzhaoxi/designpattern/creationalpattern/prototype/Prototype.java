package com.zhengzhaoxi.designpattern.creationalpattern.prototype;

/***
 * 声明一个克隆自身的接口。
 * @author donghx
 *
 */
public interface Prototype {

	Prototype clone();
	void doSomething();
}
