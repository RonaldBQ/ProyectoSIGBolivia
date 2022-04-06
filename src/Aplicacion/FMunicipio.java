
package Aplicacion;

import DBUtils.DBConexion;
import Datos.Municipio;
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
public class FMunicipio {
    private DBConexion objBaseDatos = new DBConexion();
    private Connection cn = objBaseDatos.getConection();
    public int totalRegistros;
    
    /**
     * Método que retorna todos los registros de la tabla Municipios en un modelo DefaultTabkeModel
     * @param buscar
     * @return modelo
     */
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulos ={"ID MUNC","NOMBRE","POBLACION","LATITUD","LONGITUD","ID PROV","PROVINCIA"};
        String [] registro = new String[7];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT municipio.idMunicipio,municipio.nombre,municipio.poblacion,municipio.latitud,municipio.longitud,provincia.idProvincia, provincia.nombre AS 'provincia'"
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
                registro[3]=rs.getString("latitud");
                registro[4]=rs.getString("longitud");
                registro[5]=rs.getString("idProvincia");
                registro[6]=rs.getString("provincia");
                totalRegistros++;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public DefaultComboBoxModel cargarProvincia() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        String SQL = "SELECT idProvincia, nombre FROM provincia ORDER BY nombre";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                int id = rs.getInt("idProvincia");
                String nombre = rs.getString("nombre");
                Provincia objProv = new Provincia(id, nombre);
                modelo.addElement(objProv);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertarMunicipio(Municipio dts){
        boolean status = false;
        int result;
        String SQL = "INSERT INTO municipio(nombre,poblacion,latitud,longitud,idProvincia) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(SQL);
            pst.setString(1, dts.getNombre());
            pst.setInt(2, dts.getPoblacion());
            pst.setFloat(3, dts.getLatitud());
            pst.setFloat(4, dts.getLongitud());
            pst.setInt(5, dts.getIdProvincia());
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
    
    public boolean editarMunicipio(Municipio dts){
        boolean status = false;
        int result;
        String SQL = "UPDATE municipio SET nombre=?, poblacion=?, idProvincia=? "
                + "WHERE idMunicipio=?";
        try {
            PreparedStatement pst = cn.prepareStatement(SQL);
            pst.setString(1, dts.getNombre());
            pst.setInt(2, dts.getPoblacion());
            pst.setInt(3, dts.getIdProvincia());
            pst.setInt(4, dts.getIdMunicipio());
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
