package jardinlosprogramadores.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Valeria Granada Rodas
 */
public class Grupo {
    private int numeroGrupo;
    private ArrayList<Ninno> ninnos = new ArrayList<>();
    private Profesor profesor;
    private ArrayList<Logro> logros = new ArrayList<>();
    private double promedio = 0;

    /**
     * Constructor de la clase Grupo
     * @param nGrupo
     * @param profesor 
     */
    public Grupo(int nGrupo, Profesor profesor) {
        this.numeroGrupo = nGrupo;
        this.profesor = profesor;
    }

    /**
     * Generación de GETTERS AND SETTERS
     */
    public double getPromedio() {
        double nota = 0;
        for (int i = 0; i < ninnos.size(); i++) {
            nota = nota + ninnos.get(i).getPromedio();
        }
        promedio = nota / ninnos.size();
        return promedio;
    }

    public ArrayList<Logro> getLogros() {
        return logros;
    }

    public void setLogros(ArrayList<Logro> logros) {
        this.logros = logros;
    }

    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public ArrayList<Ninno> getNinnos() {
        return ninnos;
    }

    public void setNinnos(ArrayList<Ninno> ninnos) {
        this.ninnos = ninnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
