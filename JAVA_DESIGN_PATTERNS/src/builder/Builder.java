package builder;
/**
 * 抽象deBuilder
 * @author lidong
 *
 */
public abstract class Builder {
    /**
     * 设置主机
     * @param board
     */
	public abstract void buildBorad(String board);
	/**
	 * 设置显示器
	 * @param display
	 */
	public abstract void buildDisplay(String display);
	/**
	 * 设置操作系统
	 */
	public abstract void buildOS();
	/**
	 * 创建机器
	 * @return
	 */
	public abstract Computer create();
	
	
}
