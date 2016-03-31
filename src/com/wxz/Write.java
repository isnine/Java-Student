package com.wxz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public void Writetxt(File f,String txt){
        FileWriter fw;
        BufferedWriter bw;
        
        try {
			fw = new FileWriter(f);// 初始化输出流
			bw = new BufferedWriter(fw);// 初始化输出字符流
			bw.write(txt);
			bw.close();
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
     
    	
    }
    
    public void Writetxt(File f,int txt){
        FileWriter fw;
        BufferedWriter bw;
        
        try {
			fw = new FileWriter(f);// 初始化输出流
			bw = new BufferedWriter(fw);// 初始化输出字符流
			bw.write(txt);
			bw.close();
			fw.close();
			System.out.println("保存完毕");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
     
    	
    }
}
