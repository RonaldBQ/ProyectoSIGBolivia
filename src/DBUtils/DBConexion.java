package DBUtils;

import java.sql.*;
import javax.swing.JOptionPane;
import static DBUtils.DataBase.*;
/**
 * 
 * @author Ronald Bautista Quispe
 * @version 1.0
 */
public class DBConexion {

    private static Connection conexion;
    
    /**
     * Método estático para conectar la base de datos SQL Server 
     * 
     */
    public static void conectarBD() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            if (conexion != null) {
                System.out.println("Se ha realizado la conexión con exito!! \n" + conexion);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * Método que retorna la cadena de conexión ya realizada
     * @return Devuelve la cadena de conexion de tipo Connection
     */
    public Connection getConection() {
        conectarBD();
        return conexion;
    }
    /**
     * Método que desconecta nuestra base de datos, asignando el valor de NULL 
     * al enlace de conexión establecida anteriormente
     */
    public static void desconectarBD() {
        conexion = null;
        if (conexion == null) {
            System.out.println("Conexion terminada!!");
        }
    }
}
