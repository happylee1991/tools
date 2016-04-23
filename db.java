package cn.happylee.study;
import java.sql.*;
public class Hello {

	/**
	 * @param args
	 */

	private static final String DBURL="jdbc:mysql://localhost/test";
	private static final String DBUSER="root";
	private static final String DBPASSWORD="";
	private static Connection conn=null;
	//private static Statement stm=null;
	private static  PreparedStatement pstm=null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	

try {
	Class.forName("org.gjt.mm.mysql.Driver");
	conn=DriverManager.getConnection(DBURL, DBUSER,DBPASSWORD);
	//stm=conn.createStatement();
	//stm.execute("select * from stu");
	 pstm=conn.prepareStatement("select * from stu", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);//制定可滚动
	pstm.execute();    //或者直接 rs= pstm.executeQuery()
	ResultSet rs=pstm.getResultSet();
	System.out.println("以下是数据库中的内容：++++++++++++++");
	
	 
	//rs.absolute(3);   直接制定行数读取
	//rs.next();
	
	rs.afterLast();//光标调到最后一行的下一行
	rs.previous();
	
	
	System.out.println("编号："+rs.getInt(1)+" 姓名"+rs.getString(2)+"  成绩"+rs.getShort(4)); 
	
	
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		
	}

}
