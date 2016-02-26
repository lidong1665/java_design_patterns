package builder;

public class Test {

	public static void main(String[] args) {
        //构造器
		Builder builder = new MacbookBuilder();
		Dirctor pcDirctor = new  Dirctor(builder);
		pcDirctor.construct("英特尔", "2G显卡");
		System.out.println("Computer  info ="+builder.create().toString());
	
		//构造器
		Builder builder1 = new WindowBuilder();
		Dirctor pcDirctor1 = new  Dirctor(builder1);
		pcDirctor1.construct("英特尔2", "1G显卡");
		System.out.println("Computer  info ="+builder1.create().toString());
	}
	
	
}
