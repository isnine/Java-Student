package com.wxz;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{

		Set C=new Set();
		C.ifrun();


		Main B=new Main();
		B.Select();

	}
	public void Select(){
		SQL A=new SQL();
		int classnum;
		while(true) {
			Menu G=new Menu();
			G.Menu1();

			Scanner sc=new Scanner(System.in);
			int select=sc.nextInt();
			switch (select) {
				case 1:
					AddStudent D = new AddStudent();
					D.add();
					break;
				case 2:
					classnum=A.getclassnum();
					A.Showclassname(classnum);
					A.ShowStudent(classnum);
					 break;
				case 3:
					classnum=A.getclassnum();
					A.Showclassname(classnum);
					A.ShowStudent(classnum);
					System.out.println("请输入你要删除的学生ID");
					Scanner scc=new Scanner(System.in);
					String ID=scc.nextLine();
					A.delect(ID);

					break;
				case 4:
					System.out.println("此时4");
					break;
				case 5:
					System.out.println("此时5");
					break;
				case 0:
					System.exit(0);
			}
		}
	}



}
