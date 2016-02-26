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
