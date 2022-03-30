
package Datos;

/**
 * @author HP RYZEN 5
 */
public class Municipio {
    
    private int idMunicipio;
    private String nombre;
    private float latitud;
    private float longitud;
    private int poblacion;
    private int idProvincia;

    public Municipio() {
    }
    
    public Municipio(int idMunicipio, String nombre, float latitud, float longitud, int poblacion, int idProvincia) {
        this.idMunicipio = idMunicipio;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.poblacion = poblacion;
        this.idProvincia = idProvincia;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    
    
    
}
