package com.try1;
//678
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
 public static void main(String[] args) {
	
	 Date d=new Date();
	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");	
	 System.out.println( sdf.format(d));
}
}
