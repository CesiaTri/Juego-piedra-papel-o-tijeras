import java.io.*;
import java.util.ArrayList;

/**
 * La clase Logro se refiere a un objetivo que podemos conseguir al jugar contra la computadora.
 */
public class Logro
{
    private String nombre;
    private String descripcion;
    private int criterio;
    private boolean estado;
    private String tipo;
    
    /**
     * Constructor por defecto para la clase Logro.
     */
    public Logro(){
    }
    
    /**
     * Constructor que inicializa un nuevo logro con un nombre, descripción, criterio y tipo.
     * 
     * @param nombre      El nombre del logro.
     * @param descripcion La descripción del logro.
     * @param criterio    El número que se requeriere para alcanzar el logro.
     * @param tipo        El tipo de logr(Partida o racha).
     */
    public Logro(String nombre,String descripcion,int criterio,String tipo){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.criterio=criterio;
        this.estado=false;
        this.tipo=tipo;
    }
    /**
     * Obtiene el nombre del logro.
     * 
     * @return El nombre del logro.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la descripción del logro.
     * 
     * @return La descripción del logro.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
    * Devuelve el estado del logro, indicando si ha sido completado o no.
    * 
    * @return true si el logro ha sido alcanzado; false en caso contrario.
    */
    public boolean getEstado() {
        return estado;
    }

    /**
     * Obtiene el requerimiento necesario para alcanzar el logro.
     * 
     * @return El criterio del logro.
     */
    public int getRequerimiento() {
        return criterio;
    }

    /**
     * Obtiene el tipo de logro.
     * 
     * @return tipo de logro.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el nombre del logro.
     * 
     * @param nombre El nuevo nombre del logro.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la descripción del logro.
     * 
     * @param descripcion La nueva descripción del logro.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Establece el estado del logro basandose en la racha o número de partidas.
     * 
     * @param racha   La racha actual del jugador.
     * @param partida El número de partidas jugadas por el jugador.
     */
    public void setEstado(int racha, int partida) {
        if (tipo.equals("Partida") && criterio == partida) {
            estado = true;
        } else if (criterio == racha) {
            estado = true;
        }
    }

    /**
     * Establece el requerimiento necesario para alcanzar el logro.
     * 
     * @param criterio El nuevo criterio del logro.
     */
    public void setRequerimiento(int criterio) {
        this.criterio = criterio;
    }

    /**
     * Establece el tipo de logro.
     * 
     * @param tipo El nuevo tipo del logro.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Cambia el estado del logro.
     * 
     * @param estado El nuevo estado del logro.
     */
    public void cambiar_estado(boolean estado) {
        this.estado = estado;
    }
    
    /**
     * Guarda la lista de logros en un archivo.
     * 
     * @param logros     La lista de logros que se guardaran.
     * @param direc_logros La dirección del archivo donde se guardarán los logros.
     */
    public void guardarLogros(ArrayList<Logro> logros,String direc_logros) {
        File archivoLogros=new File(direc_logros
        );
        try (BufferedWriter escritorLogros = new BufferedWriter(new FileWriter(archivoLogros))) {
            for (Logro l : logros) {
                escritorLogros.write(l.getNombre() + "|" + l.getEstado() + "|" + l.getDescripcion());
                escritorLogros.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Crea la lista de logros predeterminados.
     * 
     * @return lista de logros.
     */
    public ArrayList<Logro> lista_logros() {
        ArrayList<Logro> logros = new ArrayList<>();
        Logro act = new Logro("Primeros pasos", "Jugar 3 partidas", 3, "Partida");
        logros.add(act);
        Logro act1 = new Logro("Estas ardiendo", "Tener una racha de 3", 3, "Racha");
        logros.add(act1);
        Logro act2 = new Logro("Puedes hacerlo mejor", "Tener una racha de 0", 0, "Racha");
        logros.add(act2);
        Logro act3 = new Logro("Estas mejorando", "Jugar 6 partidas", 6, "Partida");
        logros.add(act3);
        Logro act4 = new Logro("Toma un descanso", "Jugar 12 partidas", 12, "Partida");
        logros.add(act4);
        return logros;
    }
    
    /**
     * Separa el contenido de la String contenido para devolver como un logro
     * 
     * @param contenido El contenido del logro en formato de texto.
     * @param act      El logro que se está cargando.
     * @return El logro que contenia la String
     */
    public Logro cargar_estado(String contenido,Logro act){
        int aux=0;
        int aux2=0;
        int cont=0;
        int n=0;
        for(char c: contenido.toCharArray()){
            if(c=='|' && cont==0 ){
                aux=n+1;
                cont++;
            }
            if(c=='|' && cont==1)
                aux2=n;
            n++;
        }
        String estado=contenido.substring(aux,aux2);
        if(estado.equals("true"))
            act.cambiar_estado(true);
        return act;
    }
    
    /**
     * Carga los logros contenidos en el archivo de la dirección especificada.
     * 
     * @param direc_logros La dirección del archivo que contiene los logros.
     * @return Una lista de logros.
     */
    public ArrayList<Logro> cargar_Logros(String direc_logros) {
        File archivo=new File(direc_logros);
        String contenido;
        ArrayList<Logro> lista = new ArrayList<>();
        lista=lista_logros();
        int aux=0;
        try (BufferedReader lectura = new BufferedReader(new FileReader(archivo))) {
            contenido = lectura.readLine();
            while (contenido != null) {
                lista.set(aux,cargar_estado(contenido,lista.get(aux)));
                contenido = lectura.readLine();
                aux++;
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace();
        }
        return lista;
    }
}
