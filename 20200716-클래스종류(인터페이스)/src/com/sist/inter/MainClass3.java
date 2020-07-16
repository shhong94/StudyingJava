package com.sist.inter;

public class MainClass3 {
	public static void main(String[] args) {
		Container c = new Container();
		Connection conn = c.getBean("oracle");
		conn.connection();
		
		conn = c.getBean("mssql");
		conn.connection();
	}
}
