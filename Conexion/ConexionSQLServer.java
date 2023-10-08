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

        /* 
        // Parámetros de conexión
        String url = "jdbc:sqlserver://JAVI-LAPTOP:1433; databaseName = Proyecto";
        String usuario = "as";
        String contrasena = "Javi-1508";

        try {
            // Establecer la conexión
            Connection conn = DriverManager.getConnection(url, usuario, contrasena);

            // Crear una declaración
            Statement declaracion = conn.createStatement();

            // Realizar una consulta SQL
            String sql = "SELECT * FROM Registro";
            ResultSet rs = declaracion.executeQuery(sql);

            // Procesar los resultados
            while (rs.next()) {
                int campo1 = rs.getInt("nombre");
                String campo2 = rs.getString("apellido");

                System.out.println("Nombre: " + campo1 + ", Apellido: " + campo2);
            }

            // Cerrar la conexión y los recursos
            rs.close();
            declaracion.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
    //}
//}
