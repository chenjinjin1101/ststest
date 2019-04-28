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
	
	//打印信息
	public void printemp()
	{
		System.out.println("名字："+name);
		System.out.println("年龄："+age);
		System.out.println("职位:"+zw);
		System.out.println("薪水："+salary);
	}
	public static void main(String[] args) {
		  Employee empOne = new Employee("程序员1");
	      Employee empTwo = new Employee("程序员2");
	      empOne.emage(18);
	      empOne.emzw("初级程序员");
	      empOne.emsalary(9000);
	      empOne.printemp();
	      
	      System.out.println("******************");
	      empTwo.emage(19);
	      empTwo.emzw("中级程序员");
	      empTwo.emsalary(8000);
	      empTwo.printemp();
	 
	}
}
