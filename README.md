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
