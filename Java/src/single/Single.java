package single;

public class Single {

	private Single() {}//1.�����캯��˽�л�
	private static Single s=new Single();//�����д���һ���������
	public static Single getInstance()//�ṩһ���������Ի�ȡ���ö���
	{
		return s;
	}

}
