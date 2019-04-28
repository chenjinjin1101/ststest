package single;

public class Single {

	private Single() {}//1.将构造函数私有化
	private static Single s=new Single();//在类中创建一个本类对象
	public static Single getInstance()//提供一个方法可以获取到该对象
	{
		return s;
	}

}
