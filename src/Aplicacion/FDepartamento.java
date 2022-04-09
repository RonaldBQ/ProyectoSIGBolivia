package Aplicacion;

import DBUtils.DBConexion;
import Datos.Departamento;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ronald Bautista
 */
public class FDepartamento {

    private DBConexion objBaseDatos = new DBConexion();
    private Connection cn = objBaseDatos.getConection();
    public int totalRegistros;

    /**
     * Método que retorna todos los registros de la tabla departamentos en un
     * modelo DefaultTabkeModel
     *
     * @param buscar
     * @return modelo
     */
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"CODIGO", "NOMBRE", "SUPERFICIE", "IMAGEN"};
        String[] registro = new String[4];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM departamento WHERE nombre LIKE '" + buscar + "%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                registro[0] = rs.getString("idDepartamento");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("superficie");
                registro[3] = rs.getString("imagen");
                totalRegistros++;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }

    public boolean editarDepartamento(Departamento dts) {
        boolean status = false;
        int result;
        String SQL = "UPDATE departamento SET nombre=?,superficie=?,imagen=? "
                + "WHERE idDepartamento=?";
        try {
            PreparedStatement pst = cn.prepareStatement(SQL);
            pst.setString(1, dts.getNombre());
            pst.setFloat(2, dts.getSuperficie());
            pst.setString(3, dts.getImagen());
            pst.setInt(4, dts.getIdDepartamento());
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
    
    public boolean eliminarDepartamento(Departamento dts) {
        boolean status = false;
        int result;
        String SQL = "DELETE FROM departamento WHERE idDepartamento=?";
        try {
            PreparedStatement pst = cn.prepareStatement(SQL);
            pst.setInt(1, dts.getIdDepartamento());
            result = pst.executeUpdate();
            if (result != 0) {
                status = true;
                System.out.println("El registro ha sido eliminado correctamente");
            } else {
                status = false;
                JOptionPane.showMessageDialog(null, "No se pudo eliminae el registro \n Error en sintaxis SQL");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return status;
    }
}
