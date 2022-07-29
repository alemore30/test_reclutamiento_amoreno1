
package test_reclutamiento_amoreno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexion {
    
    public static Connection getConexion(){
        
        String url = "jdbc:sqlserver://DESKTOP-PEBRBRJ\\SQLEXPRESS:1433; databaseName=RegostrpDeClientes";
               // + "databaseName=RegostrpDeClientes"
                //+ "user=sa"
                //+ "password=1234";
       // jdbc:sqlserver://DESKTOP-PEBRBRJ\SQLEXPRESS:1433;databaseName=RegostrpDeClientes jdbc:sqlserver://localhost:1433;"
        try {
            
            Connection con = DriverManager.getConnection(url,"sa","1234");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
                
    }
}
