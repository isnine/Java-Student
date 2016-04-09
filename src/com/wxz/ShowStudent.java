package com.wxz;

/**
 * Created by Nine on 2016/4/9.
 */
public class ShowStudent extends Student{

    public void Show(){

        SQL A=new SQL();
        int classnum=A.getclassnum();
        A.ShowStudent(classnum);
    }
}
