package com.try1;

public class Employee {
String name;
int age;
String zw;
double salary;

	public Employee(String name)
	{
		this.name=name;
	}
	
	public void emage(int emage)
	{
		age=emage;
	}
	public void emzw(String emzw)
	{
		zw=emzw;
	}
	public void emsalary(double emsalary)
	{
		salary=emsalary;
	}
	
	//��ӡ��Ϣ
	public void printemp()
	{
		System.out.println("���֣�"+name);
		System.out.println("���䣺"+age);
		System.out.println("ְλ:"+zw);
		System.out.println("нˮ��"+salary);
	}
	public static void main(String[] args) {
		  Employee empOne = new Employee("����Ա1");
	      Employee empTwo = new Employee("����Ա2");
	      empOne.emage(18);
	      empOne.emzw("��������Ա");
	      empOne.emsalary(9000);
	      empOne.printemp();
	      
	      System.out.println("******************");
	      empTwo.emage(19);
	      empTwo.emzw("�м�����Ա");
	      empTwo.emsalary(8000);
	      empTwo.printemp();
	 
	}
}
