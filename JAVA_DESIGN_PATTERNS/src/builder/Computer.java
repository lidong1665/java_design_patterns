package builder;
/**
 * 计算机抽象类
 * Product角色
 * @author Administrator
 *
 */
public abstract class Computer {

	protected String  mBoard;//主板
	protected String  mDisplay;//显示器
	protected String  mOS;//系统
	
	protected Computer() {
		
	}

	public String getmBoard() {
		return mBoard;
	}

	public void setmBoard(String mBoard) {
		this.mBoard = mBoard;
	}

	public String getmDisplay() {
		return mDisplay;
	}

	public void setmDisplay(String mDisplay) {
		this.mDisplay = mDisplay;
	}
	//抽象方法
	public abstract void setOS();

	@Override
	public String toString() {
		return "Computer [mBoard=" + mBoard + ", mDisplay=" + mDisplay
				+ ", mOS=" + mOS + "]";
	}
	
	
	
}
