package com.wxz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;




public class SQL {


	public void find(){
		try{
			//调用Class.forName()方法加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("成功加载MySQL驱动！");
		}catch(ClassNotFoundException e1){
			System.out.println("找不到MySQL驱动!");
			e1.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");
			//连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
			System.out.println("Success connect Mysql server!");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sets");
			//user 为你表的名称
			while (rs.next()) {
				System.out.println(rs.getString("class1"));
			}
		}
		catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
	}

	public int judge(){
		int b=0;
		try{
			//调用Class.forName()方法加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");

		}catch(ClassNotFoundException e1){
			System.out.println("判断命令找不到MySQL驱动!");
			e1.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");
			//连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sets");
			//user 为你表的名称
			if(rs.next()) {
				b=1;
			}
		}
		catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		return b;
	}

	public int getclassnum(){
		int b=0;
		try{
			//调用Class.forName()方法加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");

		}catch(ClassNotFoundException e1){
			System.out.println("判断命令找不到MySQL驱动!");
			e1.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");
			//连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sets ");
			while (rs.next()) {
				b=rs.getInt("classnum");
				break;
			}
		}
		catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		return b;
	}

	public String getclassname(String number){
		//number="class1";
		String name="NULL";
		try{
			//调用Class.forName()方法加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");

		}catch(ClassNotFoundException e1){
			System.out.println("判断命令找不到MySQL驱动!");
			e1.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");
			//连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sets ");
			while (rs.next()) {
				name=rs.getString(number);
				break;
			}
		}
		catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		return name;
	}

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

	public void writeset(int classnum,String class1){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO sets VALUES(1,1,?,null,null,null,null)");

				Statement.setString(1,class1);
				Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void writeset(int classnum,String class1,String class2){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO sets VALUES(1,2,?,?l,null,null,null)");

			Statement.setString(1,class1);
			Statement.setString(2,class2);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void writeset(int classnum,String class1,String class2,String class3){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO sets VALUES(1,3,?,?,?,null,null)");

			Statement.setString(1,class1);
			Statement.setString(2,class2);
			Statement.setString(3,class3);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void writeset(int classnum,String class1,String class2,String class3,String class4){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO sets VALUES(1,4,?,?,?,?,null)");

			Statement.setString(1,class1);
			Statement.setString(2,class2);
			Statement.setString(3,class3);
			Statement.setString(4,class4);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void writeset(int classnum,String class1,String class2,String class3,String class4,String class5){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO sets VALUES(1,5,?,?,?,?,?)");

			Statement.setString(1,class1);
			Statement.setString(2,class2);
			Statement.setString(3,class3);
			Statement.setString(4,class4);
			Statement.setString(5,class5);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}

	public void mark(String name,int class1){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO data(name,class1,class2,class3,class4,class5) values(?,?,null,null,null,null);");
			Statement.setString(1,name);
			Statement.setInt(2,class1);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void mark(String name,int class1,int class2){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO data(name,class1,class2,class3,class4,class5) values(?,?,?,null,null,null);");

			Statement.setString(1,name);
			Statement.setInt(2,class1);
			Statement.setInt(3,class2);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void mark(String name,int class1,int class2,int class3){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO data(name,class1,class2,class3,class4,class5) values(?,?,?,?,null,null);");

			Statement.setString(1,name);
			Statement.setInt(2,class1);
			Statement.setInt(3,class2);
			Statement.setInt(4,class3);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void mark(String name,int class1,int class2,int class3,int class4){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO data(name,class1,class2,class3,class4,class5) values(?,?,?,?,?,null);");
			Statement.setString(1,name);
			Statement.setInt(2,class1);
			Statement.setInt(3,class2);
			Statement.setInt(4,class3);
			Statement.setInt(5,class4);

			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void mark(String name,int class1,int class2,int class3,int class4,int class5){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO data(name,class1,class2,class3,class4,class5) values(?,?,?,?,?,?);");

			Statement.setString(1,name);
			Statement.setInt(2,class1);
			Statement.setInt(3,class2);
			Statement.setInt(4,class3);
			Statement.setInt(5,class4);
			Statement.setInt(6,class5);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
}
