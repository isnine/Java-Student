package com.wxz;

import java.io.File;
import java.util.Scanner;

public class Set extends Student{
	public void  Setclass(){
		System.out.println("请输入要设置的课程数目");
		Scanner sc=new Scanner(System.in);
		int classnum=sc.nextInt();
		
		File f=new File("classnum.txt");
		
		Write A=new Write();
		A.Writetxt(f, classnum);
		
		Read B=new Read();
		B.Readtxt(f);
	}
}
