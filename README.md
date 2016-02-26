# JAVA_DESIGN_PATTERNS
Java 设计模式的讲解库，主要适用于学习Java的设计模式
# 1.模板模式的使用方法：
#抽象计算机类：
package template;
/**
 * AbstractComputer
 * @author lidong
 * @2016-02-26
 */
public abstract class AbstractComputer {

	public void powerOn() {
		System.out.println("打开电源");
	}

	public void checkHardware() {
		System.out.println("检查硬件");
	}

	public void loadOS() {
		System.out.println("加入操作系统");
	}

	public void login() {
		System.out.println("小白的计算机无验证，直接进入系统");
	}
	
	public  final void startUp(){
		System.out.println("=====开机==start======");
		powerOn();
		checkHardware();
		loadOS();
		login();
		System.out.println("=====关机==stop======");
	}
}
#实现类
package template;
/**
 * 程序员的计算机
 * @author lidong
 * @2016-02-26
 */
public class CoderComputer extends AbstractComputer {
	
	@Override
	public void login() {
		super.login();
		System.out.println("程序员只需要进行用户和密码的验证就可以了");
	}

}
package template;
/**
 * 航天员的计算机
 * @author lidong
 * @2016-02-26
 */
public class MilitaryComputer  extends AbstractComputer{
    
	@Override
	public void checkHardware() {
		super.checkHardware();
		System.out.println("检查硬件防火墙");
	}
	
	@Override
	public void login() {
		super.login();
		System.out.println("进行指纹识别");
	}
	
}
测试类
package template;

/**
 * 测试方案
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
       AbstractComputer comp = new CoderComputer();
       comp.startUp();
       
       comp = new MilitaryComputer();
       comp.startUp();
	}

}


#2.单例模式的使用场景
确保某一个类中只有一个实例，而且自行实例化并且向整个系统提供一个实例。
singleton包下的Singleton是懒汉式单例，Singleton双检查单例，Singleton2饿汉式单例

#3.Builder设计模式
将一个复杂的对象的构建与他的表示分离，使的同样的构建过程可以构建不同的表示。
builder包下Builder。
