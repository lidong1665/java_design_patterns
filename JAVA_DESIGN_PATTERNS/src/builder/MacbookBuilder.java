package builder;
/**
 * 具体的builder类，MacbookBuilder
 * @author lidong
 *
 */
public class MacbookBuilder  extends Builder{

	private Computer mCompter = new Macbook();
	
	@Override
	public void buildBorad(String board) {
		mCompter.setmBoard(board);
	}

	@Override
	public void buildDisplay(String display) {
		mCompter.setmDisplay(display);
	}

	@Override
	public void buildOS() {
		mCompter.setOS();
	}

	@Override
	public Computer create() {
		return mCompter;
	}

}
