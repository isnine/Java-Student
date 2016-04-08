/*
package com.wxz;

import java.io.File;

*/
/**
 * Created by Nine on 2016/4/6.
 *//*

public class WriteTxt {



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
			bw.write((new String(String.valueOf(txt).getBytes("utf-8"),"GBK")));
			bw.flush();
			bw.close();
			fw.close();
			System.out.println("保存完毕");
		} catch (IOException e) {

			e.printStackTrace();
		}



    }
    public void Readtxt(File f){
      文本读取方式
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
*/
