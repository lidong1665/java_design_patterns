package singleton;
/**
 * 饿汉式单例
 * @author lidong
 * @预先加载方式
 */
public class Singleton2 {

	
	private static Singleton2 instance = new Singleton2();

	private Singleton2() {
	}
	
	public static  Singleton2 getInstance(){
		return instance;
		
	}
	
	
}
