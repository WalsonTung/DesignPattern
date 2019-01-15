package com.zhengzhaoxi.designpattern.creationalpattern.singleton;

/***
 * 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。

 * 使用场景：
 *  1、要求生产唯一序列号。 
 *  2、WEB 中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。 3、创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等。
 * @author donghx
 *
 */
public class Client implements Runnable {
	
	private String mData = "";
	
	public Client(String data) {
		mData = data;
	}

	public static void main(String[] args) {
		Client client1 = new Client("data1");
		Client client2 = new Client("data2");
		Thread thread1 = new Thread(client1);
		Thread thread2 = new Thread(client2);
		thread1.start();
		thread2.start();
	}
	
	
	@Override
	public void run() {
		Singleton instance = Singleton.getInstance();
		instance.setData(mData);
		instance.operation();
	}

}
