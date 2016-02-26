package singleton;

/**
 * 
 * @author lidong
 * @优点：既能够在需要的时候初始化单例，又能够保证线程安全。 并且单例对象初始化后调用getInstance不进行同步锁。
 * @延迟加载方式
 */
public class Singleton1 {

	private static Singleton1 instance = null;

	private Singleton1() {
	}

	public static Singleton1 getInstance() {

		if (instance == null) {//避免不必要的同步
			synchronized (instance) {
				if (instance == null) {//为null的时候创建实例
					instance = new Singleton1();
				}
			}
		}
		return instance;
	}
}
