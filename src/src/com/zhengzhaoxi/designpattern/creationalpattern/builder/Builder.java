package com.zhengzhaoxi.designpattern.creationalpattern.builder;

/***
 * 为创建一个Product对象的各个部分指定抽象接口.
 * @author donghx
 *
 */
public abstract class Builder {
	protected String[] mObjects = new String[3];

	public abstract void buildPartA();
	
	public abstract void buildPartB();
	
	public abstract void buildPartC();
	
	public String[] getResult(){
		return mObjects;
	}
}
