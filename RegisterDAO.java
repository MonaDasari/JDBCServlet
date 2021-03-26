package com.mona.servlets;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class RegisterDAO
{
	public int reg(Mem member) throws ClassNotFoundException
	{
		
		String url="jdbc:mysql://localhost/Registerdb";
		Class.forName("com.mysql.jdbc.Driver");
		String query="insert into reg values(?,?,?,?);";
		int result=0;
		try(Connection con=DriverManager.getConnection(url,"root","Mona@123");
				PreparedStatement ps=con.prepareStatement(query))
		{
			ps.setString(1,member.getUname());
			ps.setString(2,member.getPassword());
			ps.setString(3,member.getContact());
			ps.setString(4,member.getEmail());
			System.out.println(ps);
			result=ps.executeUpdate();
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
}

