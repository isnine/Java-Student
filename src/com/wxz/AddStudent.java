package com.wxz;

import java.util.Scanner;

public class AddStudent extends Student{

    public  int classnum;

    public void add()
    {

        int classnum1;
        int classnum2=1;
        String classnametemp;
        SQL A=new SQL();
        classnum=A.getclassnum();
        classnum1=classnum;
        System.out.println("学生姓名：");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        while(classnum1>0){
            classnametemp= A.getclassname("class"+classnum2);
            System.out.println("请输入"+classnametemp+"成绩：");
            sc=new Scanner(System.in);
            switch(classnum2){
                case 1:
                    mark1=sc.nextInt();
                    break;
                case 2:
                    mark2=sc.nextInt();
                    break;
                case 3:
                    mark3=sc.nextInt();
                    break;
                case 4:
                    mark4=sc.nextInt();
                    break;
                case 5:
                    mark5=sc.nextInt();
                    break;
            }
            classnum1--;
            classnum2++;
        }
        switch(classnum)
        {
            case 1:
                A.mark(name,mark1);
                break;
            case 2:
                A.mark(name,mark1,mark2);
                break;
            case 3:
                A.mark(name,mark1,mark2,mark3);
                break;
            case 4:
                A.mark(name,mark1,mark2,mark3,mark4);
                break;
            case 5:
                A.mark(name,mark1,mark2,mark3,mark4,mark5);
                break;

        }

    }


}
