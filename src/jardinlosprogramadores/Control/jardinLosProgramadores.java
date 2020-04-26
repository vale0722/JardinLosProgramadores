package jardinlosprogramadores.Control;

import java.util.ArrayList;
import jardinlosprogramadores.Modelo.Grupo;
import jardinlosprogramadores.Modelo.Logro;
import jardinlosprogramadores.Modelo.Ninno;
import jardinlosprogramadores.Modelo.Profesor;
import jardinlosprogramadores.Modelo.Pariente;
import jardinlosprogramadores.Modelo.Director;
import jardinlosprogramadores.Modelo.LogroNinno;

/**
 * El jardín “Los programadores”, es una institución donde los niños tienen el
 * acompañamiento de estudiantes de los primeros 5 semestres de ingeniería de
 * sistemas como profesores, intentando desarrollar habilidades de pensamiento
 * lógico desde edades tempranas.
 *
 * Este Programa permite la matricula, asignación y seguimiento de los logros
 * obtentenidos, además de la descarga de reportes de los niños matriculados en
 * la institución.
 *
 * @author Valeria Granada Rodas
 */
public class jardinLosProgramadores {

    private static String nit;
    private static String nombre;
    private static String telefono;
    private static String direccion;
    private static Director director;
    private static ArrayList<Grupo> grupos = new ArrayList<Grupo>();
    private static ArrayList<Ninno> ninnos = new ArrayList<Ninno>();
    private static ArrayList<Pariente> parientes = new ArrayList<Pariente>();
    private static ArrayList<Profesor> profesores = new ArrayList<Profesor>();

    /**
     * Metodo Contructor de la clase jardinLosProgramadores Crea datos de prueba
     * en la aplicación
     */
    public jardinLosProgramadores() {

        jardinLosProgramadores.nombre = "Jardin Infantil 'Los Programadores'";
        jardinLosProgramadores.nit = "10,234,567-8";
        jardinLosProgramadores.telefono = "5123456";
        jardinLosProgramadores.direccion = "Carrera 12 # 34 - 56";
        jardinLosProgramadores.director = new Director("1234567890", "cc", "Pepita", "Perez", "Dirección escolar", "pepita@jardinlosprogramdores.com", "12345678Dir");

        String[][] listaProfesores = {
            {"1234567891", "cc", "Marta", "Lopez", "Educación preescolar", "Marta@jardinlosprogramdores.com", "12345678Prof1"},
            {"1234567892", "cc", "Pepito", "Gomez", "Educación preescolar", "Pepito@jardinlosprogramdores.com", "12345678Prof2"},
            {"1234567893", "cc", "Luis", "Gonzalez", "Educación preescolar", "Luis@jardinlosprogramdores.com", "12345678Prof3"}
        };
        String[][] listaLogros = {
            {"Academico", "Tiene habitos de investigación a modo de satisfacer sus interrogantes sobre la base del descubrimiento"},
            {"Motriz", "Realiza los movimientos pertinentes y/o esperados para su edad"},
            {"Social", "Expresa respeto hacia sí mismo y hacia los demás, generando así un espacio de convivencia."},
            {"Actitudinal", "Expresa sus sentimientos de forma respetuosa, cuida el ambiente y a las personas que lo rodean."},
            {"Artistico", "Desarrolla su creatividad de una forma satisfactoria para su edad"},
            {"Deportivo", "Desarrolla las actividades deportivas y recreativas planteadas en grupo de manera satisfactoria"},};

        int nGrupo = 0;
        for (int i = 0; i < listaProfesores.length; i++) {
            nGrupo = i + 1;
            Profesor profesor = new Profesor(
                    listaProfesores[i][0],
                    listaProfesores[i][1],
                    listaProfesores[i][2],
                    listaProfesores[i][3],
                    listaProfesores[i][4],
                    listaProfesores[i][5],
                    listaProfesores[i][6],
                    nGrupo);
            this.profesores.add(profesor);
            Grupo grupo = new Grupo(nGrupo, profesor);
            if (nGrupo == 1) {
                for (int j = 1; j <= 3; j++) {
                    Logro logro = gestionarLogro(grupo, listaLogros[j][0], listaLogros[j][1]);
                }
            } else {
                for (String[] listaLogro : listaLogros) {
                    Logro logro = gestionarLogro(grupo, listaLogro[0], listaLogro[1]);
                }
            }
            profesor.setGrupo(grupo);
            this.grupos.add(grupo);
        }
        generarEstudiantesAleatorios();
    }

    /**
     * Se Generan 5 estudiantes por cada grupo, con su respectivo acudiente.
     */
    public static void generarEstudiantesAleatorios() {
        String[][] listaNinnos = {
            {"1234567822", "rc", "Jose", "Lopez Lopez", "0.6", "ninguna", "98745612", "cc", "papáJose", "Lopez Lopez", "5123456", "3123456789", "papaJose@gmail.com", "papá"},
            {"1234567821", "rc", "Joaquin", "Gomez Gomez", "0.7", "ninguna", "98745613", "cc", "mamáJoaquin", "Gomez Gomez", "5123456", "3123456789", "mamáJoaquin@gmail.com", "mamá"},
            {"1234567820", "rc", "Pepita", "Gonzalez Gonzalez", "0.9", "ninguna", "98745614", "cc", "abuelaPepita", "Gonzalez Gonzalez", "5123456", "3123456789", "abuelaPepita@gmail.com", "abuela"},
            {"1234567894", "rc", "Clara", "Alvarez Alvarez", "1", "ninguna", "98745615", "cc", "mamaClara", "Alvarez Alvarez", "5123456", "3123456789", "Alvarez@gmail.com", "mamá"},
            {"1234567895", "rc", "Ana", "Dominguez Dominguez", "1.6", "ninguna", "98745616", "cc", "mamaAna", "Dominguez Dominguez", "5123456", "3123456789", "Dominguez@gmail.com", "mamá"},
            {"1234567896", "rc", "Juliana", "Diaz Diaz", "2", "ninguna", "98745617", "cc", "mamaJuliana", "Diaz Diaz", "5123456", "3123456789", "Diaz@gmail.com", "mamá"},
            {"1234567897", "rc", "Manuela", "Restrepo Restrepo", "1.8", "miopia", "98745618", "cc", "mamaManuela", "Restrepo Restrepo", "5123456", "3123456789", "Restrepo@gmail.com", "mamá"},
            {"1234567898", "rc", "Juan", "Zapata Zapata", "2", "asma", "98745619", "cc", "mamaJuan", "Zapata Zapata", "5123456", "3123456789", "Zapata@gmail.com", "mamá"},
            {"1234567899", "rc", "Camilo", "Jaramillo Jaramillo", "3", "ninguna", "98745610", "cc", "mamaCamilo", "Jaramillo Jaramillo", "5123456", "3123456789", "Jaramillo@gmail.com", "mamá"},
            {"1234567810", "rc", "Juan Jose", "Montoya Montoya", "3", "alergias respiratorias", "98745613", "cc", "mamaJJ", "Montoya Montoya", "5123456", "3123456789", "Montoya@gmail.com", "mamá"},
            {"1234567811", "rc", "Sebastian", "Correa Correa", "4", "ninguna", "98745611", "cc", "mamaSebastian", "Correa Correa", "5123456", "3123456789", "Correa@gmail.com", "mamá"},
            {"1234567812", "rc", "Juanita", "Calle Calle", "4", "diabetes", "98745622", "cc", "mamaJuanita", "Calle Calle", "5123456", "3123456789", "Calle@gmail.com", "mamá"},
            {"1234567813", "rc", "Juanito", "Sanchez Sanchez", "5", "ninguna", "98745623", "cc", "mamaJuanito", "Sanchez Sanchez", "5123456", "3123456789", "Sanchez@gmail.com", "mamá"},
            {"1234567814", "rc", "Luisa", "Garcia Garcia", "4", "ninguna", "98745624", "cc", "mamaLuisa", "Garcia Garcia", "5123456", "3123456789", "Garcia@gmail.com", "mamá"},
            {"1234567815", "rc", "Pepe", "Puerta Puerta", "5", "ninguna", "98745625", "cc", "mamaPepe", "Puerta Puerta", "5123456", "3123456789", "Puerta@gmail.com", "mamá"}
        };
        for (String[] listaNinno : listaNinnos) {
            double edad = Double.parseDouble(listaNinno[4]);
            Ninno ninno = gestionarNinno(listaNinno[0], listaNinno[1], listaNinno[2], listaNinno[3], edad, listaNinno[5]);
            Pariente pariente = gestionarPariente(listaNinno[6], listaNinno[7], listaNinno[8], listaNinno[9], listaNinno[10], listaNinno[11], listaNinno[12], listaNinno[13], ninno);
        }
    }

    /**
     * Matricula un niño en la aplicación.
     *
     * @param id
     * @param tDocumento
     * @param nombre
     * @param apellido
     * @param edad
     * @param condEspeciales
     * @return Ninno ninno
     */
    public static Ninno gestionarNinno(String id, String tDocumento, String nombre, String apellido, double edad, String condEspeciales) {
        Grupo grupo = null;
        if (edad <= 1.6) {
            grupo = grupos.get(0);
        } else if (edad > 1.6 && edad <= 3) {
            grupo = grupos.get(1);
        } else if (edad > 3 & edad <= 5) {
            grupo = grupos.get(2);
        }
        Ninno ninno = new Ninno(id, tDocumento, nombre, apellido, edad, condEspeciales, grupo);
        return ninno;
    }

    /**
     * Matricula y asigna un Pariente o Acudiente de un niño a la aplicación.
     *
     * @param id
     * @param tDocumento
     * @param nombre
     * @param apellidos
     * @param telefono
     * @param celular
     * @param correo
     * @param parentezco
     * @param ninno
     * @return
     */
    public static Pariente gestionarPariente(String id, String tDocumento, String nombre, String apellidos, String telefono, String celular, String correo, String parentezco, Ninno ninno) {
        Pariente pariente = new Pariente(id, tDocumento, nombre, apellidos, telefono, celular, correo, parentezco, ninno);
        for (int j = 0; j < jardinLosProgramadores.grupos.size(); j++) {
            if (grupos.get(j) == ninno.getGrupo()) {
                grupos.get(j).getNinnos().add(ninno);
            }
        }
        ninno.setPariente(pariente);
        for (int k = 0; k < ninno.getGrupo().getLogros().size(); k++) {
            LogroNinno logroN = gestionarLogroNinno(ninno, ninno.getGrupo().getLogros().get(k));
        }
        ninnos.add(ninno);
        parientes.add(pariente);
        return pariente;
    }

    /**
     * Asigna un nuevo logro a un niño
     *
     * @param ninno
     * @param logro
     * @return LogroNinno logroNinno
     */
    public static LogroNinno gestionarLogroNinno(Ninno ninno, Logro logro) {
        LogroNinno logroNinno = new LogroNinno(logro);
        ninno.getLogrosNinno().add(logroNinno);
        return logroNinno;
    }

    /**
     * Crea un nuevo logro para evaluar a los niños del grupo
     * @param grupo
     * @param titulo
     * @param descripcion
     * @return Logro logro
     */
    public static Logro gestionarLogro(Grupo grupo, String titulo, String descripcion) {
        Logro logro = new Logro(titulo, descripcion);
        grupo.getLogros().add(logro);
        for (int i = 0; i < grupo.getNinnos().size(); i++) {
            grupo.getNinnos().get(i).getLogrosNinno().add(new LogroNinno(logro));
        }
        return logro;
    }

    
    /**
     * Generación de GETTERS AND SETTERS
     */
    public static ArrayList<Pariente> getParientes() {
        return parientes;
    }

    public static void setParientes(ArrayList<Pariente> parientes) {
        jardinLosProgramadores.parientes = parientes;
    }

    public static ArrayList<Ninno> getNinnos() {
        return ninnos;
    }

    public static void setNinnos(ArrayList<Ninno> ninnos) {
        jardinLosProgramadores.ninnos = ninnos;
    }

    public static String getNombre() {
        return nombre;
    }

    public static String getNit() {
        return nit;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static Director getDirector() {
        return director;
    }

    public static ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public static ArrayList<Profesor> getProfesores() {
        return profesores;
    }
}
