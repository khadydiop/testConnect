package testConnect;

import java.sql.Connection;
import java.sql.DriverManager;

//CTRL + SHIFT + O pour générer les imports
public class Connect {
public static void main(String[] args) {
	
	//System.out.println("-------- MySQL "+ "JDBC Connection Testing ------------");
	System.out.println("-------- PostgreSQL "+ "JDBC Connection Testing ------------");
	
  try {
	  //Class.forName("com.mysql.jdbc.Driver");
	  Class.forName("org.postgresql.Driver");
    System.out.println("Driver O.K.");

    /*
    String url = "jdbc:mysql://localhost:3306/websystique";
     String user = "root";
    String passwd = "";
    */
    String url = "jdbc:postgresql://localhost:5432/websystique";
    String user = "postgres";
    String passwd = "postgres";

    Connection conn = DriverManager.getConnection(url, user, passwd);
    System.out.println("Connexion effective !"); 
    
    if(conn!=null) 
    	{
    	conn.close();
    	System.out.println("Fermer connexion..."+conn.isClosed()); 
    	}
       
  } catch (Exception e) {
    e.printStackTrace();
  }      
}
}