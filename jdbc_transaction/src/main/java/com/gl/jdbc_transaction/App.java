package com.gl.jdbc_transaction;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws SQLException
	{
		Savepoint sp1 = null;
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","9953893891ADi");
	
		try {
			Statement stmt = conn.createStatement();
			conn.setAutoCommit(false);
			sp1 = conn.setSavepoint("Savepoint1");
			System.out.println("SP1");
			String sql = "INSERT into book (id, title, author) values(3001, 'the earth', 'jon')";
			stmt.executeUpdate(sql);
			
			sp1 = conn.setSavepoint("Savepoint2");
			System.out.println("SP2");
			String sql1 = "INSERT into book (id, title, author) values(3001, 'the earth', 'jon')";
			stmt.executeUpdate(sql1);
			
			conn.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
