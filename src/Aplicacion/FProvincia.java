
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
public class FProvincia {
    
    private DBConexion objBaseDatos = new DBConexion();
    private Connection cn = objBaseDatos.getConection();
    private String SQL = "";
    public int totalRegistros;
    
    /**
     * Método que retorna todos los registros de la tabla Provincias en un modelo DefaultTabkeModel
     * @return modelo
     */
    public DefaultTableModel mostrar(){
        DefaultTableModel modelo;
        String [] titulos ={"CODIGO","NOMBRE","DEPARTAMENTO"};
        String [] registro = new String[3];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        SQL = "SELECT provincia.idProvincia, provincia.nombre, departamento.nombre as 'departamento'"
                + "FROM departamento inner join provincia "
                + "ON departamento.idDepartamento = provincia.idDepartamento";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                registro[0]=rs.getString("idProvincia");
                registro[1]=rs.getString("nombre");
                registro[2]=rs.getString("depto");
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
