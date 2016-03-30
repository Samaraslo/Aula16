package factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory{

   private static Connection conexao;

   public ConnectionFactory(){
      
   }
   
   public static Connection conector()    {
      conexao = null;
      String driver = "com.mysql.jdbc.Driver";
      String url = "jdbc:mysql://localhost/dbcursoslivres";
      String user = "root";
      String password = "mysql";
   
      try{
         Class.forName(driver);
         conexao = DriverManager.getConnection(url,user,password);
         
      }
      catch(Exception e){
         System.out.println(e);
      }
      return conexao;
   
   }
   public static void closeConnection(Connection con) {  
   
      if (conexao != null){  
         try {  
            conexao.close();  
         } 
         catch (Exception e) {  
            e.printStackTrace();  
         }  
      }  
   }  
   
   
}