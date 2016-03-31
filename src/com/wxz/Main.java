package com.wxz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
        Menu A=new Menu();
        A.Menu1();
  
        
        Main B=new Main();
        B.Select();
        
        Set C=new Set();
        C.Setclass();
        
		
	}
	
	public void Select(){
		Scanner sc=new Scanner(System.in);
		int select=sc.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.println("此时1");
			break;
		case 2:
			System.out.println("此时2");
			break;
		case 3:
			System.out.println("此时3");
			break;
		case 4:
			System.out.println("此时4");
			break;
		case 5:
			System.out.println("此时5");
			break;
		
		}
		
	}
	


}
