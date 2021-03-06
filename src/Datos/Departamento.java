
package Datos;

/**
 * @author Ronald Bautista
 */

public class Departamento {
    private int idDepartamento;
    private String nombre;
    private float superficie;
    private String imagen;
    private String imagenDeptoHidro;

    public Departamento() {
    }

    public Departamento(int idDepartamento, String nombre, float superficie, String imagen, String imagenDeptoHidro) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.superficie = superficie;
        this.imagen = imagen;
        this.imagenDeptoHidro = imagenDeptoHidro;
    }

    public Departamento(int idDepartamento, String nombre) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
    }
    
    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getImagenDeptoHidro() {
        return imagenDeptoHidro;
    }

    public void setImagenDeptoHidro(String imagenDeptoHidro) {
        this.imagenDeptoHidro = imagenDeptoHidro;
    }
    
    
    @Override
    public String toString() {
        return this.nombre;
    }

    
    
    
}
