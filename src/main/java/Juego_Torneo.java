import java.io.*;

/**
 * Clase Juego_Torneo que representa la ventana del juego de piedra, papel o tijeras para dos jugadores.
 */
public class Juego_Torneo extends javax.swing.JFrame {

    /**
     * Movimiento del jugador 1.
     */
    public int jugada_usuario1 = 0; 
    
    /**
     * Movimiento del jugador 2.
     */
    public int jugada_usuario2 = 0; 
    
    /**
     * Numero de la partida actual.
     */
    public int num_partida = 0; 
    
    /**
     * Numero de racha.
     */
    public int racha=0;
    
    /**
     * Nombre del jugador 1.
     */
    public String usuario1 = ""; 
    
    /**
     * Nombre del jugador 2.
     */
    public String usuario2 = "";
    
    /**
     * Direccion del archivo del historial.
     */
    public String direc_historial = ""; 

    /**
     * Constructor que inicializa la ventana del juego.
     */
    public Juego_Torneo() {
        initComponents();
    }

    /**
     * Establece la dirección del historial del juego.
     * 
     * @param direc_historial la dirección del historial.
     */
    public void setDirec_Historial(String direc_historial) {
        this.direc_historial = direc_historial;
    }

    /**
     * Establece la racha de victorias del jugador.
     * 
     * @param racha la racha a establecer.
     */
    public void setRacha(int racha) {
        this.racha = racha;
    }

    /**
     * Establece el número de la partida.
     * 
     * @param num_partida el número de la partida a establecer.
     */
    public void setNum_partida(int num_partida) {
        this.num_partida = num_partida + 1;
    }

    /**
     * Establece el nombre del jugador 1.
     * 
     * @param usuario el nombre del jugador 1.
     */
    public void setUsuario1(String usuario) {
        this.usuario1 = usuario;
    }

    /**
     * Establece el nombre del jugador 2.
     * 
     * @param usuario2 el nombre del jugador 2.
     */
    public void setUsuario2(String usuario2) {
        this.usuario2 = usuario2;
    }

    /**
     * Carga los datos en la interfaz.
     */
    public void cargar_datos() {
        lbl_usuario.setText(usuario1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_piedra_1 = new javax.swing.JButton();
        BT_papel_1 = new javax.swing.JButton();
        BT_tijeras_1 = new javax.swing.JButton();
        BT_piedra_2 = new javax.swing.JButton();
        BT_papel_2 = new javax.swing.JButton();
        BT_tijeras_2 = new javax.swing.JButton();
        lbl_mensaje = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        BT_rendirse_usuario1 = new javax.swing.JButton();
        BT_rendirse_usuario2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BT_piedra_1.setText("Piedra");
        BT_piedra_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_piedra_1ActionPerformed(evt);
            }
        });

        BT_papel_1.setText("Papel");
        BT_papel_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_papel_1ActionPerformed(evt);
            }
        });

        BT_tijeras_1.setText("Tijeras");
        BT_tijeras_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_tijeras_1ActionPerformed(evt);
            }
        });

        BT_piedra_2.setText("Piedra");
        BT_piedra_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_piedra_2ActionPerformed(evt);
            }
        });

        BT_papel_2.setText("Papel");
        BT_papel_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_papel_2ActionPerformed(evt);
            }
        });

        BT_tijeras_2.setText("Tijeras");
        BT_tijeras_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_tijeras_2ActionPerformed(evt);
            }
        });

        lbl_mensaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_mensaje.setText("Es el turno de:");

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_usuario.setText("________");

        BT_rendirse_usuario1.setText("Rendirse");
        BT_rendirse_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_rendirse_usuario1ActionPerformed(evt);
            }
        });

        BT_rendirse_usuario2.setText("Rendirse");
        BT_rendirse_usuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_rendirse_usuario2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_rendirse_usuario2)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BT_piedra_2)
                            .addComponent(BT_piedra_1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BT_papel_1)
                                    .addComponent(BT_papel_2))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BT_tijeras_2)
                                    .addComponent(BT_tijeras_1)))
                            .addComponent(lbl_mensaje)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(lbl_usuario)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(BT_rendirse_usuario1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_piedra_1)
                    .addComponent(BT_papel_1)
                    .addComponent(BT_tijeras_1))
                .addGap(30, 30, 30)
                .addComponent(BT_rendirse_usuario1)
                .addGap(37, 37, 37)
                .addComponent(lbl_mensaje)
                .addGap(6, 6, 6)
                .addComponent(lbl_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BT_rendirse_usuario2)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_piedra_2)
                    .addComponent(BT_papel_2)
                    .addComponent(BT_tijeras_2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método para manejar la acción del botón de Piedra del jugador 1.
     */
    private void BT_piedra_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_piedra_1ActionPerformed
        this.jugada_usuario1=1;
        lbl_usuario.setText(usuario2);
    }//GEN-LAST:event_BT_piedra_1ActionPerformed

    /**
     * Método para manejar la acción del botón de Papel del jugador 1.
     */
    private void BT_papel_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_papel_1ActionPerformed
        this.jugada_usuario1=2;
        lbl_usuario.setText(usuario2);
    }//GEN-LAST:event_BT_papel_1ActionPerformed

    /**
     * Método para manejar la acción del botón de Tijeras del jugador 1.
     */
    private void BT_tijeras_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_tijeras_1ActionPerformed
        this.jugada_usuario1=3;
        lbl_usuario.setText(usuario2);
    }//GEN-LAST:event_BT_tijeras_1ActionPerformed

    /**
     * Método para manejar la acción de rendirse del jugador 1.
     */
    private void BT_rendirse_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_rendirse_usuario1ActionPerformed
        String final_partida="Gano "+usuario2;
        Partida act=new Partida(num_partida,final_partida);
        act.guardarHistorial(act, direc_historial);
        
        Resultado_Torneo newframe=new Resultado_Torneo();
        newframe.setUsuario1(usuario1);
        newframe.setUsuario2(usuario2);
        newframe.setResultado(final_partida);
        newframe.setDirec_Historial(direc_historial);
        newframe.setNum_partida(num_partida);
        newframe.setJugada_Usuario1(jugada_usuario1);
        newframe.setJugada_Usuario2(jugada_usuario2);
        newframe.cargar_datos();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_rendirse_usuario1ActionPerformed

    /**
     * Método para manejar la acción del botón de Piedra del jugador 2.
     */
    private void BT_piedra_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_piedra_2ActionPerformed
        jugada_usuario2=1;
        juego();
    }//GEN-LAST:event_BT_piedra_2ActionPerformed

    /**
     * Método para manejar la acción del botón de Papel del jugador 2.
     */
    private void BT_papel_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_papel_2ActionPerformed
        jugada_usuario2=2;
        juego();
    }//GEN-LAST:event_BT_papel_2ActionPerformed

    /**
     * Método para manejar la acción del botón de Tijeras del jugador 2.
     */
    private void BT_tijeras_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_tijeras_2ActionPerformed
        jugada_usuario2=3;
        juego();
    }//GEN-LAST:event_BT_tijeras_2ActionPerformed

    /**
     * Método para manejar la acción de rendirse del jugador 2.
     */
    private void BT_rendirse_usuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_rendirse_usuario2ActionPerformed
        String final_partida="Gano "+usuario1;
        Partida act=new Partida(num_partida,final_partida);
        act.guardarHistorial(act, direc_historial);
        
        Resultado_Torneo newframe=new Resultado_Torneo();
        newframe.setUsuario1(usuario1);
        newframe.setUsuario2(usuario2);
        newframe.setResultado(final_partida );
        newframe.setDirec_Historial(direc_historial);
        newframe.setNum_partida(num_partida);
        newframe.setJugada_Usuario1(jugada_usuario1);
        newframe.setJugada_Usuario2(jugada_usuario2);
        newframe.cargar_datos();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_rendirse_usuario2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego_Torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego_Torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego_Torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego_Torneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego_Torneo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_papel_1;
    private javax.swing.JButton BT_papel_2;
    private javax.swing.JButton BT_piedra_1;
    private javax.swing.JButton BT_piedra_2;
    private javax.swing.JButton BT_rendirse_usuario1;
    private javax.swing.JButton BT_rendirse_usuario2;
    private javax.swing.JButton BT_tijeras_1;
    private javax.swing.JButton BT_tijeras_2;
    private static javax.swing.JLabel lbl_mensaje;
    private static javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables

    /**
     * Determina el ganador basado en las jugadas de los dos jugadores.
     * 
     * @param usuario2 jugada del jugador 2.
     * @param usuario1 jugada del jugador 1.
     * @return resultado de la partida ("Ganaste", "Perdiste", "Empate").
     */
    public String ganador(int usuario2, int usuario1) {
        if (usuario1==usuario2)
            return "Empate";
        if ((usuario1 == 1 &&  usuario2== 3)||(usuario1 == 2 && usuario2 == 1)||(usuario1 == 3 && usuario2 == 2))
            return "Ganaste";
        return "Perdiste";
    }
    
    /**
     * Guarda el resultado de la partida y lo carga en la ventana reultado_Torneo,
     * al mismo tiempo que abre la ventana resultado_Torneo
     */
    private void juego(){
        String final_partida=ganador(jugada_usuario2,jugada_usuario1);
        if(final_partida.equals("Ganaste"))
            final_partida="Gano "+usuario1;
        if(final_partida.equals("Perdiste"))
            final_partida="Gano "+usuario2;
        
        Partida act=new Partida(num_partida,final_partida);
        act.guardarHistorial(act, direc_historial);
        
        Resultado_Torneo newframe=new Resultado_Torneo();
        newframe.setUsuario1(usuario1);
        newframe.setUsuario2(usuario2);
        newframe.setResultado(final_partida);
        newframe.setDirec_Historial(direc_historial);
        newframe.setNum_partida(num_partida);
        newframe.setJugada_Usuario1(jugada_usuario1);
        newframe.setJugada_Usuario2(jugada_usuario2);
        newframe.cargar_datos();
        newframe.setVisible(true);
        this.dispose();
    }
    
    /**
     * Obtiene el número de la partida a partir del historial.
     * 
     * @param direc_historial La dirección del archivo de historial.
     * @return El número de la última partida.
     */
    public int obtener_num_partida(String direc_historial) {
        File archivo=new File (direc_historial);
        String contenido="";
        int aux=-1;
        try (BufferedReader lectura = new BufferedReader(new FileReader(archivo))) {
            while(contenido != null){
            contenido = lectura.readLine();
            aux++;
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace();
        }
        return aux;
    }
}
