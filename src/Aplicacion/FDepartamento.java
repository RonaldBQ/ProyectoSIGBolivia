
package Aplicacion;

import DBUtils.DBConexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ronald Bautista
 */
public class FDepartamento {
    private DBConexion objBaseDatos = new DBConexion();
    private Connection cn = objBaseDatos.getConection();
    private String SQL = "";
    public int totalRegistros;
    
    /**
     * Método que retorna todos los registros de la tabla departamentos en un modelo DefaultTabkeModel
     * @return modelo
     */
    public DefaultTableModel mostrar(){
        DefaultTableModel modelo;
        String [] titulos ={"CODIGO","NOMBRE","SUPERFICIE","IMAGEN"};
        String [] registro = new String[4];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT * FROM departamento";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                registro[0]=rs.getString("idDepartamento");
                registro[1]=rs.getString("nombre");
                registro[2]=rs.getString("superficie");
                registro[3]=rs.getString("imagen");
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
