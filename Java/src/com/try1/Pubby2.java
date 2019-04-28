package com.try1;

public class Pubby2 {
 int page;
 public Pubby2(String name)
 {
	 System.out.println("花园的名字："+name);
 }
	
 public void setAge(int ages)
 {
	 page=ages;
 }
 
 public int getAge()
 {
	 System.out.println("花朵的年龄为："+page);
	 return page;
 }
public static void main(String[] args) {
		
		Pubby2 p=new Pubby2("花朵");//创建一个对象
		p.setAge(2);
		p.getAge();
		
		
	}


}
