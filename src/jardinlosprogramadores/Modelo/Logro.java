/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardinlosprogramadores.Modelo;

/**
 *
 * @author Valeria Granada Rodas
 */
public class Logro {

    private String titulo;
    private String descripcion;

    /**
     *
     * @param titulo
     * @param descripcion
     */
    public Logro(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    /**
     * Generación de GETTERS AND SETTERS
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
