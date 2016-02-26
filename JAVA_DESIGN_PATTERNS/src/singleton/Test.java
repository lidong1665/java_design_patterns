package singleton;

public class Test {
	
	public static void main(String[] args) {
		//饿汉式
		Singleton2 s1 = Singleton2.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
		System.out.println(s1.equals(s2));
		
		//懒汉式
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		System.out.println(s3.equals(s4));
		
		//双枷锁模式
		Singleton s5 = Singleton.getInstance();
		Singleton s6 = Singleton.getInstance();
		System.out.println(s5.equals(s6));
	}
	

}
