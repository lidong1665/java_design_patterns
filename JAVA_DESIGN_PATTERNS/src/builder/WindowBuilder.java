package builder;
/**
 * 具体的builder类，Window电脑
 * @author lidong
 *
 */
public class WindowBuilder extends Builder {
	
	private Computer mComputer = new  WindowPC();

	@Override
	public void buildBorad(String board) {
		mComputer.setmBoard(board);
		
	}

	@Override
	public void buildDisplay(String display) {
		mComputer.setmDisplay(display);
		
	}

	@Override
	public void buildOS() {
		mComputer.setOS();
	}

	@Override
	public Computer create() {
		return mComputer;
	}

}
