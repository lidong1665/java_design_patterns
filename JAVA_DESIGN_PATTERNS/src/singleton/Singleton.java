package singleton;
/**
 * 懒汉式单列模式
 * @author Administrator
 * @优点：单例只有在使用的时候才会初始化化，在一定程度上节约了资源。
 * @缺点：第一次加载时需要及时的进行初始化，反应稍微慢，最大的问题是每次调用getInstance
 * 都是同步，造成了不必要的开销，一般不建议使用。
 */
public class Singleton {

	private static Singleton instance;
	
	private Singleton(){}
	//同步方法
	public static synchronized Singleton getInstance(){
	
		if(instance==null){
			instance = new Singleton();
		}
		return instance;
		
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
	
}
