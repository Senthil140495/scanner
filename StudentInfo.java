package org.studentinfo;

import java.util.Scanner;

public class StudentInfo {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Enter the student id...");
	short stuid=s.nextShort();
	System.out.println("My id is "+stuid);

	System.out.println("Enter the student name...");
	String stuname=s1.nextLine();
	System.out.println("Student name is "+stuname);
	
	System.out.println("Enter the 1mark.");
	byte mark1=s.nextByte();
	System.out.println(" mark1 is "+mark1);
	
	System.out.println("Enter the 2mark");
	byte mark2=s.nextByte();
	System.out.println(" mark2 is "+mark2);
	
	System.out.println("Enter the 3mark");
	byte mark3=s.nextByte();
	System.out.println("mark3 is "+mark3);
	
	System.out.println("Enter the mark4");
	byte mark4=s.nextByte();
	System.out.println("mark4 is "+mark4);
	
	System.out.println("Enter the mark5");
	byte mark5=s.nextByte();
	System.out.println("mark5 is "+mark5);
	
}
}
