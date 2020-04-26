package jardinlosprogramadores.Modelo;

/**
 * Clase Pariente extiende de persona
 *
 * @author Valeria Granada Rodas
 */
public class Pariente extends Persona implements Cloneable {

    private String telefono;
    private String celular;
    private String correo;
    private Ninno ninno;
    private String parentezco;

     @Override
    public Object clone() throws CloneNotSupportedException {
        Pariente par = null;
        try {
            par = (Pariente) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(" no se puede duplicar");
        }
        return par;
    }
    
    /**
     * Metodo constructor de la clase Persona
     *
     * @param String id
     * @param String tDocumento
     * @param String nombre
     * @param String apellidos
     * @param String telefono
     * @param String celular
     * @param String correo
     * @param String parentezco
     * @param Ninno ninno
     */
    public Pariente(String id, String tDocumento, String nombre, String apellidos, String telefono, String celular, String correo, String parentezco, Ninno ninno) {
        super(id, tDocumento, nombre, apellidos);
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.parentezco = parentezco;
        this.ninno = ninno;
    }

    /**
     * Generación de GETTERS AND SETTERS
     */
    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Ninno getNinno() {
        return ninno;
    }

    public void setNinno(Ninno ninno) {
        this.ninno = ninno;
    }
}
