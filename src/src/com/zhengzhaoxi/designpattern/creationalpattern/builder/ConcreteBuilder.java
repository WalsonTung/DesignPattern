package com.zhengzhaoxi.designpattern.creationalpattern.builder;

/***
 *  实现Builder的接口以构造和装配该产品的各个部分;定义并明确他所创建的表示；提供一个检索产品的接口。
 * @author donghx
 *
 */
public class ConcreteBuilder extends Builder {

	@Override
	public void buildPartA() {
		mObjects[0] = "ConcreteBuilder:BuildPartA;";
	}

	@Override
	public void buildPartB() {
		mObjects[1] = "ConcreteBuilder:BuildPartB;";
	}

	@Override
	public void buildPartC() {
		mObjects[2] = "ConcreteBuilder:BuildPartC;";

	}

}
