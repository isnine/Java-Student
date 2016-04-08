package com.wxz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Write {













	public void write(){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO user VALUES(?,?)");
			for(int i=0;i<num;i++)        //定义个100次的循环，往表里插入一百条信息。
			{
				Statement.setString(1,"chongshi"+i);
				Statement.setString(2,"bo"+i);
				Statement.executeUpdate();
			}

			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}


}
