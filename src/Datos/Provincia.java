
package Datos;

/**
 * @author Ronald Bautista
 */
public class Provincia {
    
    private int idProvincia;
    private String nombre;
    private int idDepartamento;

    public Provincia() {
    }

    public Provincia(int idProvincia, String nombre, int idDepartamento) {
        this.idProvincia = idProvincia;
        this.nombre = nombre;
        this.idDepartamento = idDepartamento;
    }
    
    
    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    
    
}
