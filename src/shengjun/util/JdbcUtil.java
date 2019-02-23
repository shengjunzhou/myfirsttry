package shengjun.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class JdbcUtil {

	public  static Connection CreateJ() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sell","root","root");
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;	
	
	}

	public static void closeJdbc(ResultSet pre, Connection con, Statement ss) {
		if (pre != null) {
			try {
				pre.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		if (ss != null) {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

	{
		// TODO Auto-generated method stub

	}
}
