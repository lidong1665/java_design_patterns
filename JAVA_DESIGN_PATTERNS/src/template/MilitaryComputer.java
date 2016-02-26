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
