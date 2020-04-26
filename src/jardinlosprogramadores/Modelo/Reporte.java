package jardinlosprogramadores.Modelo;

import static com.itextpdf.io.font.FontConstants.HELVETICA;
import static com.itextpdf.io.font.FontConstants.HELVETICA_BOLD;
import static com.itextpdf.kernel.colors.ColorConstants.RED;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import static com.itextpdf.layout.property.TextAlignment.CENTER;
import static com.itextpdf.layout.property.TextAlignment.RIGHT;
import jardinlosprogramadores.Control.jardinLosProgramadores;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Valeria Granada Rodas
 */
public class Reporte implements Cloneable {

    private Ninno ninno;
    private String ruta;
    private Profesor profesor;
    private double promedio = 0;
    private java.util.Date fecha;
    private String nombreCompletoNinno;
    private ArrayList<LogroNinno> logrosNinno = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException{
        Reporte rep = null;
        try{
            rep=(Reporte)super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        return rep;
    }
    
    /**
     * Metodo constructor de la clase reporte
     *
     * @param Ninno ninno
     * @param Profesor profesor
     * @param String ruta
     * @param String titulo
     */
    public Reporte(Ninno ninno, Profesor profesor, String ruta, String titulo) throws IOException {
        this.ninno = ninno;
        this.profesor = profesor;
        this.fecha = new Date();
        this.nombreCompletoNinno = ninno.getNombre() + " " + ninno.getApellidos();
        this.ruta = ruta + ".pdf";
        this.promedio = ninno.getPromedio();
        for(int i = 0; i < ninno.getLogrosNinno().size() ; i++ ){
            this.logrosNinno.add(new LogroNinno(ninno.getLogrosNinno().get(i).getLogro()));
            this.logrosNinno.get(i).setAlcance(ninno.getLogrosNinno().get(i).getAlcance());
            this.logrosNinno.get(i).setNota(ninno.getLogrosNinno().get(i).getNota());
        }
        crearReporte(this.ruta, titulo);
    }

    /**
     * Generación de un reporte usando ITEXTPDF
     *
     * @param String ruta
     * @param String titulo
     * @throws IOException
     */
    public void crearReporte(String ruta, String titulo) throws IOException {
        PdfWriter writer = new PdfWriter(ruta);
        PdfDocument pdfDoc = new PdfDocument(writer);
        try (Document document = new Document(pdfDoc, PageSize.A4.rotate())) {
            document.setMargins(20, 20, 20, 20);
            PdfFont font = PdfFontFactory.createFont(HELVETICA);
            PdfFont bold = PdfFontFactory.createFont(HELVETICA_BOLD);
            // tabla cabezal
            Table tablaCabeza = new Table(4);
            tablaCabeza.setWidth(800);
            tablaCabeza.addHeaderCell(new Cell(1, 4)
                    .add(new Paragraph(jardinLosProgramadores.getNombre())
                            .setFontColor(RED)
                            .setFont(bold)
                            .setFontSize(12)
                            .setTextAlignment(CENTER))
                    .add(new Paragraph("nit " + jardinLosProgramadores.getNit())
                            .setFont(bold)
                            .setFontSize(10)
                            .setTextAlignment(CENTER))
                    .add(new Paragraph(titulo)
                            .setFont(bold)
                            .setFontSize(10)
                            .setTextAlignment(CENTER))
            );
            tablaCabeza.addHeaderCell(new Cell(2, 2).add(new Paragraph("Nombre")
                    .setFont(font)
                    .setFont(bold)
                    .setFontSize(8)
            ));
            tablaCabeza.addHeaderCell(new Cell(2, 2).add(new Paragraph("Documento")
                    .setFont(font)
                    .setFont(bold)
                    .setFontSize(8)
            ));
            tablaCabeza.addCell(new Cell(2, 2).add(new Paragraph(getNombreCompletoNinno())
                    .setFont(font)
                    .setFontSize(8)
            )).addCell(new Cell(2, 2).add(new Paragraph(getNinno().gettDocumento() + ". " + getNinno().getId())
                    .setFont(font)
                    .setFontSize(8)
            ));
            tablaCabeza.addCell(new Cell(3, 1).add(new Paragraph("Grupo")
                    .setFont(font)
                    .setFont(bold)
                    .setFontSize(8)
            ));
            tablaCabeza.addCell(new Cell(3, 1).add(new Paragraph("Promedio")
                    .setFont(font)
                    .setFont(bold)
                    .setFontSize(8)
            ));
            tablaCabeza.addCell(new Cell(3, 2).add(new Paragraph("Profesor")
                    .setFont(font)
                    .setFont(bold)
                    .setFontSize(8)
            ));
            tablaCabeza.addCell(new Cell(3, 1).add(new Paragraph(String.valueOf(getNinno().getGrupo().getNumeroGrupo()))
                    .setFont(font)
                    .setFontSize(8)
            ));
            tablaCabeza.addCell(new Cell(3, 1).add(new Paragraph(String.valueOf(getPromedio()))
                    .setFont(font)
                    .setFontSize(8)
            ));
            tablaCabeza.addCell(new Cell(3, 2).add(new Paragraph(getProfesor().getNombreCompleto())
                    .setFont(font)
                    .setFontSize(8)
            ));
            document.add(tablaCabeza);
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            //tabla notas
            Table table = new Table(4);
            table.setWidth(800);
            table.addHeaderCell(new Cell(1, 4)
                    .add(new Paragraph("INFORME DE NOTAS")
                            .setFontColor(RED)
                            .setFont(bold)
                            .setFontSize(8)
                            .setTextAlignment(CENTER)));
            table.addHeaderCell(new Cell()
                    .add(new Paragraph("LOGRO")
                            .setFontColor(RED)
                            .setFont(bold)
                            .setFontSize(8)
                            .setTextAlignment(CENTER)));
            table.addHeaderCell(new Cell()
                    .add(new Paragraph("DESCRIPCIÓN")
                            .setFontColor(RED)
                            .setFont(bold)
                            .setFontSize(8)
                            .setTextAlignment(CENTER)));
            table.addHeaderCell(new Cell()
                    .add(new Paragraph("ALCANCE")
                            .setFontColor(RED)
                            .setFont(bold)
                            .setFontSize(8)
                            .setTextAlignment(CENTER)));
            table.addHeaderCell(new Cell()
                    .add(new Paragraph("NOTA")
                            .setFontColor(RED)
                            .setFont(bold)
                            .setFontSize(8)
                            .setTextAlignment(CENTER)));
            for (int i = 0; i < getLogrosNinno().size(); i++) {
                table.addCell(new Cell().add(new Paragraph(getLogrosNinno().get(i).getLogro().getTitulo())
                        .setFont(font)
                        .setFontSize(8)
                ));
                table.addCell(new Cell().add(new Paragraph(getLogrosNinno().get(i).getLogro().getDescripcion())
                        .setFont(font)
                        .setFontSize(8)
                ));
                table.addCell(new Cell().add(new Paragraph(getLogrosNinno().get(i).getAlcance())
                        .setFont(font)
                        .setFontSize(8)
                ));
                table.addCell(new Cell().add(new Paragraph(String.valueOf(getLogrosNinno().get(i).getNota()))
                        .setFont(font)
                        .setFontSize(8)
                ));
            }
            table.addCell(new Cell().add(new Paragraph(" ")));
            table.addCell(new Cell().add(new Paragraph(" ")));
            table.addCell(new Cell().add(new Paragraph(" ")));
            table.addCell(new Cell().add(new Paragraph(String.valueOf(getPromedio()))
                    .setFont(font)
                    .setFontSize(8)
            ));
            document.add(table);
            document.add(new Paragraph(" "));
            document.add(new Paragraph(getProfesor().getNombreCompleto())
                    .setTextAlignment(RIGHT)
                    .setFontSize(7));
            document.add(new Paragraph("___________________________")
                    .setTextAlignment(RIGHT)
                    .setFontSize(7));
            document.add(new Paragraph(getProfesor().gettDocumento() + ". " + getProfesor().getId())
                    .setTextAlignment(RIGHT)
                    .setFontSize(7));
            document.add(new Paragraph(String.valueOf(getFecha()))
                    .setTextAlignment(CENTER)
                    .setFontSize(7));
            document.close();
        }
    }

    /**
     * Generación de GETTERS AND SETTERS
     *
     *
     */
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Ninno getNinno() {
        return ninno;
    }

    public void setNinno(Ninno ninno) {
        this.ninno = ninno;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<LogroNinno> getLogrosNinno() {
        return logrosNinno;
    }

    public void setLogrosNinno(ArrayList<LogroNinno> logrosNinno) {
        this.logrosNinno = logrosNinno;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getNombreCompletoNinno() {
        return nombreCompletoNinno;
    }

    public void setNombreCompletoNinno(String nombreCompletoNinno) {
        this.nombreCompletoNinno = nombreCompletoNinno;
    }
}
