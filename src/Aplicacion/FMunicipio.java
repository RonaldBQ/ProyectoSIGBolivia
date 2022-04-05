
package Aplicacion;

import DBUtils.DBConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ronald Bautista
 */
public class FMunicipio {
    private DBConexion objBaseDatos = new DBConexion();
    private Connection cn = objBaseDatos.getConection();
    private String SQL = "";
    public int totalRegistros;
    
    /**
     * Método que retorna todos los registros de la tabla Municipios en un modelo DefaultTabkeModel
     * @param buscar
     * @return modelo
     */
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulos ={"ID","NOMBRE","POBLACION","provincia"};
        String [] registro = new String[4];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT municipio.idMunicipio,municipio.nombre,municipio.poblacion,provincia.nombre AS 'provincia'"
                + "FROM provincia inner join municipio "
                + "ON provincia.idProvincia = municipio.idProvincia "
                + "WHERE municipio.nombre LIKE '"+buscar+"%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                registro[0]=rs.getString("idMunicipio");
                registro[1]=rs.getString("nombre");
                registro[2]=rs.getString("poblacion");
                registro[3]=rs.getString("provincia");
                totalRegistros++;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
}
