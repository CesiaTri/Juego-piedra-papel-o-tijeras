import java.io.*;

/**
 * La clase Partida representa una partida del juego de piedra, papel o tijeras.
 */
public class Partida
{
    private int num;
    private String finalPartida;
    
    /**
     * Constructor por defecto para la clase Partida.
     */
    public Partida() {
    }

    /**
     * Constructor que inicializa una nueva partida
     * 
     * @param num    El número de la partida.
     * @param estado El resultado de la partida.
     */
    public Partida(int num,String estado){
        this.num=num;
        finalPartida=estado;
    }
    
    /**
     * Establece el resultado final de la partida en función de la jugada de los jugadores.
     * 
     * @param pc      El valor de la jugada de la computadora.
     * @param jugador  El valor de la jugada del jugador.
     */
    public void setFinal_Partida(int pc,int jugador){
        if (jugador == pc)
                 finalPartida= "Empate";
        if ((jugador==1&&pc==3)||(jugador==2&&pc==1)||(jugador==3&&pc==2))
                 finalPartida="Ganaste";
        finalPartida="Perdiste";
    }
    /**
     * Obtiene el estado final de la partida.
     * 
     * @return El resultado de la partida.
     */
    public String getFinal_Partida() {
        return finalPartida;
    }

    /**
     * Establece el número de la partida.
     * 
     * @param num El nuevo número de la partida.
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * Obtiene el número de la partida.
     * 
     * @return El número de la partida.
     */
    public int getNum() {
        return num;
    }

    /**
     * Guarda el historial de la partida en un archivo.
     * 
     * @param act             La Partida que se quiere guardar.
     * @param direc_historial La dirección del archivo donde se guarda el historial.
     */
    public void guardarHistorial(Partida act,String direc_historial) {
        File archivoHistorial=new File(direc_historial);
        FileWriter escribir;
        PrintWriter linea;
        try {
            escribir = new FileWriter(archivoHistorial,true);
            linea = new PrintWriter(escribir);
            if(archivoHistorial.length() == 0)
                escribir.write(act.getNum()+"|"+act.getFinal_Partida());
            else
                escribir.write("\n"+act.getNum()+"|"+act.getFinal_Partida());
            linea.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar la partida en el archivo: " + e.getMessage());
        }
    }
}

