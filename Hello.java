package cn.happylee.study;

import java.sql.*;

public class Hello {

	private static final String DBURL="jdbc:mysql://localhost/test";
	private static final String DBUSER="root";
	private static final String DBPASSWORD="";
	private static Connection conn=null;
	private static Statement stm=null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	

try {
	Class.forName("org.gjt.mm.mysql.Driver");
	conn=DriverManager.getConnection(DBURL, DBUSER,DBPASSWORD);
	stm=conn.createStatement();
	stm.execute("select * from javaTest");
	ResultSet rs=stm.getResultSet();
	System.out.println("以下是数据库中的内容：++++++++++++++");
	while(rs.next()){
		
		
		System.out.println("编号："+rs.getInt("id")+" 姓名"+rs.getString("name")+"  年龄"+rs.getShort("age")+"  地址"+rs.getString("address"));
		
		
	}
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		
	}

}
