import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionSQLServer {

    public static void main(String[] args) {
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
    }
}
