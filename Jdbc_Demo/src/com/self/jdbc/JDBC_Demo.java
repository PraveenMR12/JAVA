package com.self.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_Demo {

	public static void main(String[] args) throws  Exception{
		int id =6;
		String name="Shreeshail";
		int age = 22;
		String email = "shrishailh@gmail.com";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo?autoReconnect=true&useSSL=false", "root","2001");
		PreparedStatement ps= cn.prepareStatement("insert into customer values("+id+",'"+name+"',"+age+", '"+email+"'),(7,'Praveen',22,'praveen@gmail.com')");
		
//		ps.setLong(1, id);
//		ps.setString(2, name);
//		ps.setLong(3, age);
//		ps.setString(4, email);
		
		int done = ps.executeUpdate();
		if(done>0) {
			System.out.println("Successfull "+ done);
		}else {
			System.out.println("Unsuccessfull");
		}
		PreparedStatement psr = cn.prepareStatement("Select * from customer");
	
		ResultSet rs = psr.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("id")+", "+rs.getString("name")+", "+rs.getLong("age")+", "+rs.getString("email"));
		}
		
		
		cn.close();
		
		
		
		

	}

}
