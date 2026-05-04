package practicatema13;

import java.sql.*;

/**
 *
 * @author KevinNS
 */
public class PracticaTema13 {

    // CREAMOS LAS CONSTANTES
    public final static String URL = "jdbc:postgresql://localhost:5433/alumnos";
    public final static String USUARIO = "postgres";
    public final static String PASS = "example";

    public static void main(String[] args) throws SQLException {

        // NOS CONECTAMOS A LA BASE DE DATOS
        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, PASS)) {

            //CONEXIÓN A LA BBDD
            System.out.println("Creando conexión...");
            Statement statement = conexion.createStatement();
            System.out.println("Conexión establecida.");

            //CONSULTAS
            // SELECT
            System.out.println("Leyendo datos de alumnos...");
            ResultSet rs = statement.executeQuery(
                    "SELECT id, nombre, apellido, email "
                    + "FROM alumnos "
                    + "WHERE activo = true "
                    + "ORDER BY apellido, nombre");

            System.out.println("Se ha accedido a los datos correctamente.");
            System.out.println("Mostrando datos...");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - "
                        + rs.getString("nombre") + " "
                        + rs.getString("apellido") + " - "
                        + rs.getString("email"));
            }

            // INSERT
            System.out.println("Insertando nuevo alumno...");

            String sqlInsert = "INSERT INTO alumnos "
                    + "(nombre, apellido, email, fecha_nacimiento, telefono, direccion, ciudad, codigo_postal) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement psInsert = conexion.prepareStatement(sqlInsert);
            psInsert.setString(1, "Lucía");
            psInsert.setString(2, "Morales");
            psInsert.setString(3, "lucia.morales@email.com");
            psInsert.setDate(4, Date.valueOf("2004-03-15"));
            psInsert.setString(5, "611223344");
            psInsert.setString(6, "Calle Nueva 12");
            psInsert.setString(7, "Madrid");
            psInsert.setString(8, "28010");

            int filasInsertadas = psInsert.executeUpdate();
            System.out.println("Filas insertadas: " + filasInsertadas);

            // UPDATE
            System.out.println("Actualizando curso...");

            String sqlUpdate = "UPDATE cursos "
                    + "SET profesor = ?, aula = ? "
                    + "WHERE nombre = ?";

            PreparedStatement psUpdate = conexion.prepareStatement(sqlUpdate);
            psUpdate.setString(1, "Dr. Javier Romero");
            psUpdate.setString(2, "Z999");
            psUpdate.setString(3, "Programación Java");

            int filasActualizadas = psUpdate.executeUpdate();
            System.out.println("Filas actualizadas: " + filasActualizadas);

            // DELETE
            System.out.println("Eliminando curso...");

            String sqlDelete = "DELETE FROM cursos WHERE nombre = ?";

            PreparedStatement psDelete = conexion.prepareStatement(sqlDelete);
            psDelete.setString(1, "Computación en la Nube");

            int filasEliminadas = psDelete.executeUpdate();
            System.out.println("Filas eliminadas: " + filasEliminadas);
            
        }catch(SQLException e){
            System.out.println("Error" + e.getMessage());
        }

    }
    
}  
