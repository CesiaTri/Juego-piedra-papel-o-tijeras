
import java.util.ArrayList;

/**
 * Clase Resultado_PC que representa la ventana de resultados después de una partida
 * contra la computadora. Muestra las jugadas realizadas, el resultado de la partida
 * y permite al usuario volver a jugar o terminar el juego y volver al menu.
 */
public class Resultado_PC extends javax.swing.JFrame {

    /**
     * Racha de victorias del jugador
     */
    int racha = 0; 
    
    /**
     * Número de la partida actual
     */
    int num_partida = 0; 
    
    /**
     * Nombre del usuario
     */
    String usuario = ""; 
    
    /**
     * Jugada realizada por la computadora
     */
    int jugada_pc = 0; 
    
    /**
     * Jugada realizada por el usuario
     */
    int jugada_usuario = 0; 
    
    /**
     * Resultado final de la partida
     */
    String final_partida = ""; 
    
    /**
     * Dirección del archivo de logros
     */
    String direc_logros = ""; 
    
    /**
     * Dirección del archivo de historial
     */
    String direc_historial = "";

    /**
     * Constructor que inicializa la ventana de resultados.
     */
    public Resultado_PC() {
        initComponents();
    }

    /**
     * Establece la racha de victorias.
     * 
     * @param racha la racha a establecer.
     */
    public void setRacha(int racha) {
        this.racha = racha;
    }

    /**
     * Establece el número de la partida actual.
     * 
     * @param num_partida el número de partida a establecer.
     */
    public void setNum_partida(int num_partida) {
        this.num_partida = num_partida;
    }

    /**
     * Establece la jugada realizada por la computadora.
     * 
     * @param jugada la jugada a establecer.
     */
    public void setJugada_PC(int jugada) {
        jugada_pc = jugada;
    }

    /**
     * Establece la jugada realizada por el usuario.
     * 
     * @param jugada la jugada a establecer.
     */
    public void setJugada_Usuario(int jugada) {
        jugada_usuario = jugada;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param usuario el nombre del usuario a establecer.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Establece el resultado final de la partida.
     * 
     * @param final_partida el resultado a establecer.
     */
    public void setFinal_Partida(String final_partida) {
        this.final_partida = final_partida;
    }

    /**
     * Establece la dirección del archivo de logros.
     * 
     * @param direc_logros la dirección a establecer.
     */
    public void setDirec_Logros(String direc_logros) {
        this.direc_logros = direc_logros;
    }

    /**
     * Establece la dirección del archivo de historial.
     * 
     * @param direc_historial la dirección a establecer.
     */
    public void setDirec_Historial(String direc_historial) {
        this.direc_historial = direc_historial;
    }

    /**
     * Carga los datos de la partida en la interfaz gráfica.
     */
    public void cargar_datos() {
        lbl_usuario.setText(usuario + ": " + Nom_Jugada(jugada_usuario));
        lbl_pc.setText("Computadora: " + Nom_Jugada(jugada_pc));
        lbl_resultado.setText(final_partida);
    }

    /**
     * Método que inicializa los componentes de la interfaz gráfica.
     */    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_logro_aviso = new javax.swing.JLabel();
        lbl_logro_obtenido = new javax.swing.JLabel();
        lbl_resultado = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_pc = new javax.swing.JLabel();
        BT_volver_a_jugar = new javax.swing.JButton();
        BT_Terminar_juego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_logro_aviso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_logro_aviso.setText(" ");

        lbl_logro_obtenido.setText(" ");

        lbl_resultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_resultado.setText("Resultado");

        lbl_usuario.setText("usuario");

        lbl_pc.setText("pc");

        BT_volver_a_jugar.setText("Volver a jugar");
        BT_volver_a_jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_volver_a_jugarActionPerformed(evt);
            }
        });

        BT_Terminar_juego.setText("Terminar Juego");
        BT_Terminar_juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Terminar_juegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BT_volver_a_jugar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_pc)
                        .addComponent(lbl_usuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(BT_Terminar_juego)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_logro_aviso)
                            .addComponent(lbl_logro_obtenido)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lbl_resultado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_logro_aviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_logro_obtenido)
                .addGap(35, 35, 35)
                .addComponent(lbl_resultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_pc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_volver_a_jugar)
                    .addComponent(BT_Terminar_juego))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que redirige al usuario al menú.
     */
    private void BT_Terminar_juegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Terminar_juegoActionPerformed
        Menu newframe=new Menu();
        newframe.setDirec_Historial(direc_historial);
        newframe.setDirec_Logros(direc_logros);
        newframe.setUsuario(usuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_Terminar_juegoActionPerformed

    /**
     * Método que redirige al usuario a la ventana de juego contra la PC.
     */
    private void BT_volver_a_jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_volver_a_jugarActionPerformed
        Juego_PC newframe=new Juego_PC();
        newframe.setUsuario(usuario);
        newframe.setDirec_Historial(direc_historial);
        newframe.setDirec_Logros(direc_logros);
        newframe.setNum_partida(num_partida);
        newframe.setRacha(racha);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_volver_a_jugarActionPerformed

    /**
     * Método principal que inicia la aplicación y muestra la ventana de resultados.
     * 
     * @param args argumentos de línea de comandos.
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado_PC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Terminar_juego;
    private javax.swing.JButton BT_volver_a_jugar;
    private javax.swing.JLabel lbl_logro_aviso;
    private javax.swing.JLabel lbl_logro_obtenido;
    private static javax.swing.JLabel lbl_pc;
    private static javax.swing.JLabel lbl_resultado;
    private static javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Devuelve el nombre de la jugada correspondiente a un número dado.
     * 
     * @param jugada el número de la jugada (1: Piedra, 2: Papel, 3: Tijeras).
     * @return el nombre de la jugada.
     */
    private String Nom_Jugada(int jugada) {
        if(jugada==1)
            return "Piedra";
        if(jugada==2)
            return "Papel";

        return "Tijeras";
    }

    /**
     * Obtiene y muestra los logros obtenidos basados en la racha de victorias
     * y la partida actual.
     * 
     * @param lista lista de logros.
     * @param racha la racha actual del jugador.
     * @param partida el número de la partida.
     */
    public void obtener_logro(ArrayList<Logro> lista, int racha, int partida) {
        String logros_obtenidos=" ";
        Logro act=new Logro();
        for (int aux = 0; aux < lista.size(); aux++) {
            act = lista.get(aux);
            if (!act.getEstado()) {
                act.setEstado(racha, partida);
                if (act.getEstado()) {
                    lbl_logro_aviso.setText("¡LOGRO OBTENIDO!");
                    if(logros_obtenidos.equals(" ")){
                        logros_obtenidos="-"+act.getNombre();
                    }else{
                        logros_obtenidos=logros_obtenidos+"<p>-"+act.getNombre();
                    }
                    lista.set(aux, act);
                }
            }
        }
        lbl_logro_obtenido.setText("<html>"+logros_obtenidos+"<html>");
        act.guardarLogros(lista, direc_logros);
    }
}
