/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardinlosprogramadores.Modelo;

/**
 * Clase Profesor extiende de persona
 * @author Valeria Granada Rodas
 */
public class Profesor extends Persona {

    private String titulo;
    private String correo;
    private int nGrupo;
    private Grupo grupo;
    private String contrasena;
    private String nombreCompleto;

    /**
     * Metodo constructor de la clase Profesor
     *
     * @param String id
     * @param String tDocumento
     * @param String nombre
     * @param String apellido
     * @param String titulo
     * @param String correo
     * @param String contraseña
     * @param int grupo
     */
    public Profesor(String id, String tDocumento, String nombre, String apellido, String titulo, String correo, String contrasena, int grupo) {
        super(id, tDocumento, nombre, apellido);
        this.titulo = titulo;
        this.correo = correo;
        this.nGrupo = grupo;
        this.contrasena = contrasena;
        this.nombreCompleto = nombre + " " + apellido;
    }

    /**
     * Generación de GETTERS AND SETTERS
     *
     *
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public int getnGrupo() {
        return nGrupo;
    }

    public void setnGrupo(int nGrupo) {
        this.nGrupo = nGrupo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
