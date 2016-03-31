package com.wxz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read {
	 public void Readtxt(File f){
	        FileReader fr;
	        BufferedReader br;	 
	        StringBuffer sb = new StringBuffer();
	        
	        try {
				fr = new FileReader(f);
	            br = new BufferedReader(fr);// 初始化输入字符流
	            sb.append(br.readLine().toString());// 按行读文件
	            System.out.println("文件内容是：" + sb);
	            br.close();
	            fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

	 }
}
