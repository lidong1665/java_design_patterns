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
