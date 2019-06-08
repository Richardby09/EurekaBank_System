
package datos;

import java.sql.*;

public class Conexion {

    public static Connection establishConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/eurekabank";
        String user = "root";
        String password = "12345";
        return DriverManager.getConnection(url, user, password);
    }

    public static void main(String[] args){
       try{
       Connection cn =(Connection) Conexion.establishConnection();
            System.out.println("\nConexion establecida");
       }catch(ClassNotFoundException | SQLException ex){
       System.out.println("\nConexion fallida " + ex.toString());
      }
        
    }
}