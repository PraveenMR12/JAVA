package com.self.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Demo {

	public static void main(String[] args){
		int id1 =1;
		String name1="Shreeshail";
		int age1 = 22;
		String email1 = "shrishailh@gmail.com";
		
		
		int id2 =2;
		String name2="Shreeshail";
		int age2 = 22;
		String email2 = "shrishailh@gmail.com";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root","2001");
			PreparedStatement ps= cn.prepareStatement("insert into customer values("+id2+",'"+name2+"',"+age2+", '"+email2+"'),(3,'Praveen',22,'praveen@gmail.com'), (?,?,?,?);");
//			PreparedStatement ps = cn.prepareStatement("delete from customer");
			ps.setLong(1, id1);
			ps.setString(2, name1);
			ps.setLong(3, age1);
			ps.setString(4, email1);
			
			int done = ps.executeUpdate();
			if(done>0) {
				System.out.println("Successfull "+ done);
			}else {
				System.out.println("Unsuccessfull");
			}
			PreparedStatement ps1 = cn.prepareStatement("Select * from customer");
		
			ResultSet rs = ps1.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("id")+", "+rs.getString("name")+", "+rs.getString("age")+", "+rs.getString("email"));
			}
			
			
			cn.close();
		}catch(ClassNotFoundException ce) {
			System.out.println("class not found");
			ce.printStackTrace();
		}catch(SQLException se) {
			System.out.println("Sql connection error");
			se.printStackTrace();
		}
		
//		
		
		
		
		

	}

}
