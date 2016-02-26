package builder;
/**
 * 苹果电脑
 * @author lidong
 * @具体的Computer
 */
public class Macbook extends  Computer{

	protected Macbook() {
		super();
		
	}

	@Override
	public void setOS() {
		mOS = "Mac OS X 10.00";
		
	}

}
