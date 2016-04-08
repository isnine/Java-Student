package com.wxz;



import java.io.File;
import java.util.Scanner;

public class Set extends Student{
	public void ifrun(){
		SQL A=new SQL();
       if( A.judge()==0)
	   {
		   System.out.println("请输入要设置的课程数目");
		   Scanner sc=new Scanner(System.in);
		   int classnum=sc.nextInt();

		   switch(classnum){
			   case 1:{
				   System.out.println("请输入第一门课程名称");
				   sc=new Scanner(System.in);
				   class1=sc.nextLine();
				   A.writeset(classnum,class1);
				   break;
			   }
			   case 2:{
				   System.out.println("请输入第一门课程名称");
				   sc=new Scanner(System.in);
				   class1=sc.nextLine();
				   System.out.println("请输入第二门课程名称");
				   sc=new Scanner(System.in);
				   class2=sc.nextLine();
				   A.writeset(classnum,class1,class2);
				   break;
			   }
			   case 3:{
				   System.out.println("请输入第一门课程名称");
				   sc=new Scanner(System.in);
				   class1=sc.nextLine();
				   System.out.println("请输入第二门课程名称");
				   sc=new Scanner(System.in);
				   class2=sc.nextLine();
				   System.out.println("请输入第三门课程名称");
				   sc=new Scanner(System.in);
				   class3=sc.nextLine();
				   A.writeset(classnum,class1,class2,class3);
				   break;
			   }
			   case 4:{
				   System.out.println("请输入第一门课程名称");
				   sc=new Scanner(System.in);
				   class1=sc.nextLine();
				   System.out.println("请输入第二门课程名称");
				   sc=new Scanner(System.in);
				   class2=sc.nextLine();
				   System.out.println("请输入第三门课程名称");
				   sc=new Scanner(System.in);
				   class3=sc.nextLine();
				   System.out.println("请输入第四门课程名称");
				   sc=new Scanner(System.in);
				   class4=sc.nextLine();
				   A.writeset(classnum,class1,class2,class3,class4);
				   break;

			   }
			   case 5:{
				   System.out.println("请输入第一门课程名称");
				   sc=new Scanner(System.in);
				   class1=sc.nextLine();
				   System.out.println("请输入第二门课程名称");
				   sc=new Scanner(System.in);
				   class2=sc.nextLine();
				   System.out.println("请输入第三门课程名称");
				   sc=new Scanner(System.in);
				   class3=sc.nextLine();
				   System.out.println("请输入第四门课程名称");
				   sc=new Scanner(System.in);
				   class4=sc.nextLine();
				   System.out.println("请输入第五门课程名称");
				   sc=new Scanner(System.in);
				   class5=sc.nextLine();
				   A.writeset(classnum,class1,class2,class3,class4,class5);
				   break;
			   }
		   }
	   }

	}


}
