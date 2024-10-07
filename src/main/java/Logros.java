import java.util.ArrayList;

/**
 * Clase Logros que representa la ventana donde se muestran los logros 
 * alcanzados y aquellos que aún no han sido conseguidos.
 */
public class Logros extends javax.swing.JFrame {

    /**
     * Nombre del usuario
     */
    String usuario = "";
    
    /**
     * Dirección del archivo de logros
     */
    String direc_logros = ""; 

    /**
     * Constructor que inicializa la ventana de logros.
     */
    public Logros() {
        initComponents();
    }

    /**
     * Establece la dirección del archivo de logros.
     * 
     * @param direc la dirección a establecer.
     */
    public void setDireccion(String direc) {
        this.direc_logros = direc;
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
     * Inicializa los componentes de la interfaz gráfica.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_logros = new javax.swing.JLabel();
        lbl_diseno = new javax.swing.JLabel();
        BT_Atras = new javax.swing.JButton();
        lbl_lista_logros_true = new javax.swing.JLabel();
        lbl_lista_logros_false = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_logros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_logros.setText("Logros");

        lbl_diseno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_diseno.setText("NOMBRE | DESCRIPCION");

        BT_Atras.setText("Atras");
        BT_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AtrasActionPerformed(evt);
            }
        });

        lbl_lista_logros_true.setText(" ");

        lbl_lista_logros_false.setForeground(new java.awt.Color(204, 51, 0));
        lbl_lista_logros_false.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_diseno)
                        .addContainerGap(235, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_lista_logros_true)
                            .addComponent(lbl_lista_logros_false))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BT_Atras)
                    .addComponent(lbl_logros))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_logros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_diseno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_lista_logros_true)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_lista_logros_false)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(BT_Atras)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que redirige a la ventana menu.
     */
    private void BT_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AtrasActionPerformed
        Menu newframe= new Menu();
        newframe.setDirec_Historial("C:\\Users\\Cesia\\Desktop\\archivo\\"+usuario+"\\historial.txt");
        newframe.setDirec_Logros(direc_logros);
        newframe.setUsuario(usuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_AtrasActionPerformed

    /**
     * Método principal que inicia la aplicación y muestra la ventana de logros.
     * 
     * @param args argumentos de línea de comandos.
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Atras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_diseno;
    private static javax.swing.JLabel lbl_lista_logros_false;
    private static javax.swing.JLabel lbl_lista_logros_true;
    private javax.swing.JLabel lbl_logros;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Muestra los logros del usuario en la interfaz.
     * 
     * @param lista lista de logros a mostrar.
     */
    public void mostrar_logros(ArrayList<Logro> lista){
        String logro_false="";
        String logro_true="";
            for(Logro aux: lista){
                if(aux.getEstado()){
                    if(logro_true.equals("")){
                        logro_true=aux.getNombre()+" | "+aux.getDescripcion();
                    }else{
                        logro_true=logro_true+"<p>"+aux.getNombre()+" | "+aux.getDescripcion();
                    }
                }else{
                    if(logro_false.equals("")){
                        logro_false=aux.getNombre()+" | "+aux.getDescripcion();
                    }else{
                        logro_false=logro_false+"<p>"+aux.getNombre()+" | "+aux.getDescripcion();
                    }
                }
            }
        lbl_lista_logros_true.setText("<html>"+logro_true+"<html>");
        lbl_lista_logros_false.setText("<html>"+logro_false+"<html>");
    }
}
