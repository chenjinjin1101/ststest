package com.try1;

public class Pubby2 {
 int page;
 public Pubby2(String name)
 {
	 System.out.println("��԰�����֣�"+name);
 }
	
 public void setAge(int ages)
 {
	 page=ages;
 }
 
 public int getAge()
 {
	 System.out.println("���������Ϊ��"+page);
	 return page;
 }
public static void main(String[] args) {
		
		Pubby2 p=new Pubby2("����");//����һ������
		p.setAge(2);
		p.getAge();
		
		
	}


}
