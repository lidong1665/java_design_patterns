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
