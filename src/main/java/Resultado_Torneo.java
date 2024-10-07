
/**
 * Clase Resultado_Torneo que representa la ventana de resultados de un torneo 
 * entre dos usuarios. Muestra las jugadas realizadas y el resultado de la partida,
 * además de permitir a los usuarios volver a jugar o ver el historial.
 */
public class Resultado_Torneo extends javax.swing.JFrame {

    /**
     * Jugada realizada por el primer usuario
     */
    int jugada_usuario1 = 0; 
    
    /**
     * Jugada realizada por el segundo usuario
     */
    int jugada_usuario2 = 0; 
    
    /**
     * Racha de victorias del jugador
     */
    int racha = 0;
    
    /**
     * Número de la partida actual
     */
    int num_partida = 0; 
    
    /**
     * Nombre del primer usuario
     */
    String usuario1 = ""; 
    
    /**
     * Nombre del segundo usuario
     */
    String usuario2 = ""; 
    
    /**
     * Dirección del archivo de historial
     */
    String direc_historial = "";  
    
    /**
     *  Resultado de la partida
     */
    String resultado;

    /**
     * Constructor que inicializa la ventana de resultados del torneo.
     */
    public Resultado_Torneo() {
        initComponents();
    }

    /**
     * Establece el resultado de la partida.
     * 
     * @param res resultado a establecer.
     */
    public void setResultado(String res) {
        this.resultado = res;
    }

    /**
     * Establece la jugada realizada por el primer usuario.
     * 
     * @param jugada_usuario1 jugada a establecer.
     */
    public void setJugada_Usuario1(int jugada_usuario1) {
        this.jugada_usuario1 = jugada_usuario1;
    }

    /**
     * Establece la jugada realizada por el segundo usuario.
     * 
     * @param jugada_usuario2 jugada a establecer.
     */
    public void setJugada_Usuario2(int jugada_usuario2) {
        this.jugada_usuario2 = jugada_usuario2;
    }

    /**
     * Establece la dirección del archivo de historial.
     * 
     * @param direc_historial dirección a establecer.
     */
    public void setDirec_Historial(String direc_historial) {
        this.direc_historial = direc_historial;
    }

    /**
     * Establece la racha de victorias.
     * 
     * @param racha racha a establecer.
     */
    public void setRacha(int racha) {
        this.racha = racha;
    }

    /**
     * Establece el número de la partida actual.
     * 
     * @param num_partida número de partida a establecer.
     */
    public void setNum_partida(int num_partida) {
        this.num_partida = num_partida++;
    }

    /**
     * Establece el nombre del primer usuario.
     * 
     * @param usuario1 nombre del usuario a establecer.
     */
    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    /**
     * Establece el nombre del segundo usuario.
     * 
     * @param usuario2 nombre del usuario a establecer.
     */
    public void setUsuario2(String usuario2) {
        this.usuario2 = usuario2;
    }

    /**
     * Carga los datos de las jugadas y el resultado en la interfaz gráfica.
     */
    public void cargar_datos() {
        String jugada1 = Nom_Jugada(jugada_usuario1);
        String jugada2 = Nom_Jugada(jugada_usuario2);
        if (!jugada1.equals("Retirado") && !jugada2.equals("Retirado")) {
            lbl_usuario1.setText(usuario1 + ": " + jugada1);
            lbl_usuario2.setText(usuario2 + ": " + jugada2);
        }
        lbl_resultado.setText(resultado);
    }

    /**
     * Método que inicializa los componentes de la interfaz gráfica.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_volver_a_jugar = new javax.swing.JButton();
        BT_historial = new javax.swing.JButton();
        BT_Terminar_juego = new javax.swing.JButton();
        lbl_resultado = new javax.swing.JLabel();
        lbl_usuario1 = new javax.swing.JLabel();
        lbl_usuario2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BT_volver_a_jugar.setText("Volver A Jugar");
        BT_volver_a_jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_volver_a_jugarActionPerformed(evt);
            }
        });

        BT_historial.setText("Historial");
        BT_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_historialActionPerformed(evt);
            }
        });

        BT_Terminar_juego.setText("Terminar Juego");
        BT_Terminar_juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Terminar_juegoActionPerformed(evt);
            }
        });

        lbl_resultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_resultado.setText("Resultado");

        lbl_usuario1.setText(" ");

        lbl_usuario2.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(BT_volver_a_jugar)
                        .addGap(18, 18, 18)
                        .addComponent(BT_historial)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Terminar_juego))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_usuario1)
                            .addComponent(lbl_resultado)
                            .addComponent(lbl_usuario2))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lbl_resultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_usuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_usuario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_volver_a_jugar)
                    .addComponent(BT_historial)
                    .addComponent(BT_Terminar_juego))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que redirige a los usuarios a la ventana de juego del torneo.
     */
    private void BT_volver_a_jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_volver_a_jugarActionPerformed
        Juego_Torneo newframe=new Juego_Torneo();
        newframe.setUsuario2(usuario2);
        newframe.setUsuario1(usuario1);
        newframe.setDirec_Historial(direc_historial);
        newframe.setNum_partida(num_partida);
        newframe.setRacha(racha);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_volver_a_jugarActionPerformed

    /**
     * Método que muestra la ventana del historial de partidas.
     */
    private void BT_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_historialActionPerformed
        Historial newframe = new Historial();
        newframe.setDireccion(direc_historial);
        newframe.cargar_historial();
        newframe.transparencia_BT_menu();
        newframe.setVisible(true);
    }//GEN-LAST:event_BT_historialActionPerformed

    /**
     * Método que cierra la aplicación.
     */
    private void BT_Terminar_juegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Terminar_juegoActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_BT_Terminar_juegoActionPerformed

    /**
     * Método principal que inicia la aplicación y muestra la ventana de resultados del torneo.
     * 
     * @param args argumentos de línea de comandos.
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado_Torneo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Terminar_juego;
    private javax.swing.JButton BT_historial;
    private javax.swing.JButton BT_volver_a_jugar;
    private static javax.swing.JLabel lbl_resultado;
    private static javax.swing.JLabel lbl_usuario1;
    private static javax.swing.JLabel lbl_usuario2;
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
        if(jugada==3)
            return "Tijeras";
        return "Retirado";
    }
}
