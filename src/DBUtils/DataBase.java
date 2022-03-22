
package DBUtils;

/**
 * Esta clase integra todos los atributos de clase necesarios para realizar la conexión de la base de datos
 * @author Ronald Bautista Quispe
 * @version 1.0
 */
public class DataBase {
    //ATRIBUTOS PRINCIPALES
    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
    public static final String URL = "jdbc:sqlserver://localhost:1434;database=BoliviaSIG"; //Si lo requiere, cambiar el puerto SQLServer
    public static final String USER = "Ronald";         //Cambiar su nombre de usuario de su maquina local
    public static final String PASSWORD = "ronald2022"; //Cambiar su contraseña del usuario de su máquina local
    //ATRIBUTOS OPCIONALES (No se están usando)
    public static final String PORT = "";
    public static final String DATABASE = "";
    public static final String LOGIN_TIME_OUT = "";
    
}
