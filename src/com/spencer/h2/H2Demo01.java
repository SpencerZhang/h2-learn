package com.spencer.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class H2Demo01 {
	public static void main(String[] a) throws Exception {
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		ResultSet rs = conn.createStatement().executeQuery("select * from test");
		// ResultSet rs = conn.createStatement().executeQuery("select * from
		// TEST");
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			// System.out.println(rs.getInt("ID"));
			// System.out.println(rs.getString("NAME"));
			// System.out.println(rs.getInt("id"));
			// System.out.println(rs.getString("name"));
		}
		rs.close();
		conn.close();
	}
}
