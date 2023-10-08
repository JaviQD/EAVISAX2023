import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionSQLServer {

    public Connection HacerConexion(){

             Connection conexion = null;

            String nombre = "as" ;
            String contrasena = "Javi-1508" ;
            String bd = "Proyecto";
            String ip = "localhost";
            String Puerto = "1433";

            String cadena = "jdbc:sqlserver://"+ip+":"+Puerto+"/"+bd;

            //String cadena = "jdbc:sqlserver://" + ip + ":" + Puerto + "/" + bd;

            try{
                
                cadena = "jdbc:sqlserver://localhost:"  + Puerto+":"+"databaseName"+bd;
                conexion = DriverManager.getConnection(cadena, nombre, contrasena);
                JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al conectar la base de datos, error: " + e.toString());
            }
            
            return conexion;
        }

    public static void main(String[] args) {
        
    }
}