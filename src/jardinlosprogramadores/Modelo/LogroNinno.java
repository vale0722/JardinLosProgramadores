package jardinlosprogramadores.Modelo;

/**
 * 
 * @author Valeria Granada Rodas
 */
public class LogroNinno implements Cloneable {

    private Logro logro;
    private String alcance;
    private double nota;

    @Override
    public Object clone() throws CloneNotSupportedException {
        LogroNinno log = null;
        try {
            log = (LogroNinno) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(" no se puede duplicar");
        }
        return log;
    }

    /**
     * Metodo constructor de la clase LogroNinno
     *
     * @param logro
     */
    public LogroNinno(Logro logro) {
        this.logro = logro;
        this.alcance = "No asignado";
        this.nota = 0;
    }

    /**
     * Generación de GETTERS AND SETTERS
     */
    public Logro getLogro() {
        return logro;
    }

    public void setLogro(Logro logro) {
        this.logro = logro;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
