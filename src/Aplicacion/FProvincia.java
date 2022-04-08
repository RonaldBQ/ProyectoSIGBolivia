
package Aplicacion;

import DBUtils.DBConexion;
import Datos.Departamento;
import Datos.Provincia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ronald Bautista
 */
public class FProvincia {
    
    private DBConexion objBaseDatos = new DBConexion();
    private Connection cn = objBaseDatos.getConection();
    public int totalRegistros;
    
    /**
     * Método que retorna todos los registros de la tabla Provincias en un modelo DefaultTabkeModel
     * @param buscar
     * @return modelo
     */
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulos ={"CODIGO","NOMBRE","ID DEPTO","DEPARTAMENTO"};
        String [] registro = new String[4];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT provincia.idProvincia, provincia.nombre, departamento.idDepartamento, departamento.nombre as 'departamento'"
                + "FROM departamento inner join provincia "
                + "ON departamento.idDepartamento = provincia.idDepartamento "
                + "WHERE provincia.nombre LIKE '"+buscar+"%'"
                + "ORDER BY provincia.idProvincia DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                registro[0]=rs.getString("idProvincia");
                registro[1]=rs.getString("nombre");
                registro[2]=rs.getString("idDepartamento");
                registro[3]=rs.getString("departamento");
                totalRegistros++;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public DefaultComboBoxModel cargarDepartamento() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        String SQL = "SELECT idDepartamento, nombre FROM departamento";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                int id = rs.getInt("idDepartamento");
                String nombre = rs.getString("nombre");
                Departamento objDepto = new Departamento(id, nombre);
                modelo.addElement(objDepto);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertarProvincia(Provincia dts){
        boolean status = false;
        int result;
        String SQL = "INSERT INTO provincia(nombre,idDepartamento) VALUES (?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(SQL);
            pst.setString(1, dts.getNombre());
            pst.setInt(2, dts.getIdDepartamento());
            result = pst.executeUpdate();
            if (result != 0) {
                status = true;
                System.out.println("El registro ha sido insertado correctamente");
            } else {
                status = false;
                JOptionPane.showMessageDialog(null, "No se pudo agregar el registro \n Error en sintaxis SQL");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return status;
    }
    
    public boolean editarProvincia(Provincia dts){
        boolean status = false;
        int result;
        String SQL = "UPDATE provincia SET nombre=?,idDepartamento=? "
                + "WHERE idProvincia=?";
        try {
            PreparedStatement pst = cn.prepareStatement(SQL);
            pst.setString(1, dts.getNombre());
            pst.setInt(2, dts.getIdDepartamento());
            pst.setInt(3, dts.getIdProvincia());
            result = pst.executeUpdate();
            if (result != 0) {
                status = true;
                System.out.println("El registro ha sido editado correctamente");
            } else {
                status = false;
                JOptionPane.showMessageDialog(null, "No se pudo editar el registro \n Error en sintaxis SQL");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return status;
    }
}
