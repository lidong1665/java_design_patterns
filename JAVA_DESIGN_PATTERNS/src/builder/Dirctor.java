package builder;
/**
 * Director  负责构建Compurter
 * @author lidong
 *
 */
public class Dirctor {
	
	Builder mBuilder = null;

	public Dirctor(Builder mBuilder) {
		super();
		this.mBuilder = mBuilder;
	}
	/**
	 * 构建对象
	 * @param borad
	 * @param display
	 */
	public void construct(String borad,String display) {
      mBuilder.buildBorad(borad);
      mBuilder.buildDisplay(display);
      mBuilder.buildOS();
	}

}
