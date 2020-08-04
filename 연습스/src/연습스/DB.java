package ¿¬½À½º;

import java.sql.*;
import java.util.*;

public class DB {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			
			Connection conn = DriverManager.getConnection(url, "hr", "happy");
			
			String sql = "SELECT empno, ename FROM emp";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			System.out.println(rs.getInt(1) + rs.getString(2));
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
