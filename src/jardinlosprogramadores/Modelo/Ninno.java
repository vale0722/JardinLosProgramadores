package jardinlosprogramadores.Modelo;

import jardinlosprogramadores.vista.GuiNinno;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Clase Ninno extiende de persona
 *
 * @author Valeria Granada Rodas
 */
public class Ninno extends Persona implements Cloneable {

    private double edad;
    private String condEspeciales;
    private Grupo grupo;
    private Pariente pariente;
    private double promedio = 0;
    private ArrayList<Reporte> reporte = new ArrayList<>();
    private Reporte reporteBimestral;
    private ArrayList<LogroNinno> logrosNinno = new ArrayList<>();

     @Override
    public Object clone() throws CloneNotSupportedException {
        Ninno nin = null;
        try {
            nin = (Ninno) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(" no se puede duplicar");
        }
        return nin;
    }
    
    /**
     * Metodo constructor de la clase Persona
     *
     * @param String id
     * @param String tDocumento
     * @param String nombre
     * @param double edad
     * @param String condEspeciales
     * @param Grupo grupo
     */
    public Ninno(String id, String tDocumento, String nombre, String apellido, double edad, String condEspeciales, Grupo grupo) {
        super(id, tDocumento, nombre, apellido);
        this.edad = edad;
        this.condEspeciales = condEspeciales;
        this.grupo = grupo;
    }

    /**
     * INICIA UN NUEVO PROCESO
     */
    public void reiniciarDatos() {
        reporte = new ArrayList<>();
        for (int i = 0; i < this.getLogrosNinno().size(); i++) {
            this.getLogrosNinno().get(i).setNota(0.0);
            this.getLogrosNinno().get(i).setAlcance("Sin definir");
        }
    }

    /**
     * Genera el reporte Bimestral, calculando promedio de los dos meses
     * anteriores y asignandoselos como nuevo promedio al Ninno
     */
    public void reporteBimestral() {
        Reporte reporteMes1 = reporte.get(0);
        Reporte reporteMes2 = reporte.get(1);
        ArrayList<LogroNinno> nuevosLogrosNinno = new ArrayList<>();
        double promBimestral = (reporteMes1.getPromedio() + reporteMes2.getPromedio()) / 2;
        for (int i = 0; i < this.logrosNinno.size(); i++) {
            LogroNinno logro = this.logrosNinno.get(i);
            double notaLogro = (reporteMes1.getLogrosNinno().get(i).getNota() + reporteMes2.getLogrosNinno().get(i).getNota()) / 2;
            logro.setNota(notaLogro);
            if (notaLogro >= 4.5) {
                logro.setAlcance("Excelente");
            } else if (notaLogro >= 4 && notaLogro < 4.5) {
                logro.setAlcance("Sobresaliente");
            } else if (notaLogro >= 3 && notaLogro < 4) {
                logro.setAlcance("Basico");
            } else {
                logro.setAlcance("Hay que trabajar un poco más");
            }
            nuevosLogrosNinno.add(logro);
        }
        this.setLogrosNinno(nuevosLogrosNinno);
        this.setPromedio(promBimestral);
        JFileChooser seleccionar = new JFileChooser();
        int opcion = seleccionar.showSaveDialog(null);
        if (opcion == seleccionar.APPROVE_OPTION) {
            try {
                Reporte reporte = new Reporte(this, this.getGrupo().getProfesor(), seleccionar.getSelectedFile() + "", "REPORTE BIMESTRAL");
                this.getReporte().add(reporte);
                this.reporteBimestral = (Reporte) reporte.clone();
                JOptionPane.showMessageDialog(null, "REPORTE BIMESTRAL GENERADO, PARA VER LOS CAMBIOS VUELVA A ABRIR LA VISTA DEL(LA) NIÑ@");
            } catch (Exception ex) {
                Logger.getLogger(GuiNinno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Generación de GETTERS AND SETTERS
     */
    public Reporte getReporteBimestral() {
        return reporteBimestral;
    }

    public void setReporteBimestral(Reporte reporteBimestral) {
        this.reporteBimestral = reporteBimestral;
    }

    public ArrayList<Reporte> getReporte() {
        return reporte;
    }

    public void setReporte(ArrayList<Reporte> reporte) {
        this.reporte = reporte;
    }

    public double getPromedio() {
        double nota = 0;
        for (int i = 0; i < logrosNinno.size(); i++) {
            nota = nota + logrosNinno.get(i).getNota();
        }
        if (logrosNinno.size() != 0) {
            promedio = nota / logrosNinno.size();
        }
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getEdad() {
        return edad;
    }

    public Pariente getPariente() {
        return pariente;
    }

    public void setPariente(Pariente pariente) {
        this.pariente = pariente;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public String getCondEspeciales() {
        return condEspeciales;
    }

    public void setCondEspeciales(String condEspeciales) {
        this.condEspeciales = condEspeciales;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ArrayList<LogroNinno> getLogrosNinno() {
        return logrosNinno;
    }

    public void setLogrosNinno(ArrayList<LogroNinno> logrosNinno) {
        this.logrosNinno = logrosNinno;
    }

}
