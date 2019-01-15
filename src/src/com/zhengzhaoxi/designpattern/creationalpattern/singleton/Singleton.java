package com.zhengzhaoxi.designpattern.creationalpattern.singleton;

/***
 * 定义一个Instance操作，允许客户访问它的唯一实例。Instance是一个类操作。可能复制创建它自己的唯一实例。
 * @author donghx
 *
 */
public final class Singleton {

	private static Singleton mInstance;
	
	private String mData;
	
	private Singleton() {
		mData = "type of Singleton";
	}
	
	public static Singleton getInstance() {
		if(null == mInstance) {
			synchronized (Singleton.class) {
				if(null == mInstance) {
					mInstance = new Singleton();
				}
			}
		}
		
		return mInstance;
	}
	
	public void operation() {
		System.out.println("Singleton:operation;");
		System.out.println(mData);
	}
	
	public void setData(String data) {
		mData = data;
	}
	
	public String getData() {
		return mData;
	}
}
