package jdbc.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DateBaseConnection {
   public static final String DRIVER="com.mysql.jdbc.Driver";
   public static final String URL="jdbc:mysql://localhost:3306/mldn";
   public static final String USER="root";
   public static final String PASSWORD="123456";
   
   //�ṩ����
   public Connection getDatebaseConnection()throws Exception{
	   Class.forName(DRIVER);
	   Connection con=DriverManager.getConnection(URL, USER, PASSWORD);
	   
	   return con;
   }
   //�ر�����
   public void CloseDatebaseConnection(Connection con)
   {
	   try{
	   con.close();
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
}
