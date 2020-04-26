/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardinlosprogramadores.Modelo;

/**
 *Clase Director extiende de persona
 * @author Valeria Granada Rodas
 */
public class Director extends Persona {

    private String titulo;
    private String correo;
    private String contrasena;

    /**
     * Metodo constructor de la clase director
     *
     * @param id
     * @param tDocumento
     * @param nombre
     * @param apellido
     * @param titulo
     * @param correo
     * @param contrasena
     */
    public Director(String id, String tDocumento, String nombre, String apellido, String titulo, String correo, String contrasena) {
        super(id, tDocumento, nombre, apellido);
        this.titulo = titulo;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    /**
     * Generación de GETTERS AND SETTERS
     */
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
