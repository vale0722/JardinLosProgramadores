package jardinlosprogramadores.Modelo;

/**
 *
 * @author Valeria Granada Rodas
 */
public class Persona {
    private String id;
    private String tDocumento;
    private String nombre;
    private String apellidos;

    /**
     * Metodo constructor de la clase Persona
     *
     * @param String id
     * @param String tDocumento
     * @param String nombre
     * @param String apellidos
     */
    public Persona(String id, String tDocumento, String nombre, String apellidos) {
        this.id = id;
        this.tDocumento = tDocumento;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    
    /**
     * Generación de GETTERS AND SETTERS
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String gettDocumento() {
        return tDocumento;
    }

    public void settDocumento(String tDocumento) {
        this.tDocumento = tDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
