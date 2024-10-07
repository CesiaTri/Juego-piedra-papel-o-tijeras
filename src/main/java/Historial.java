import java.io.*;

/**
 * La clase Historial es una ventana que permite a los usuarios 
 * ver su historial de partidas.
 */
public class Historial extends javax.swing.JFrame {

    /**
     * Nombre del usuario.
     */
    public String usuario = ""; 
    
    /**
     * Direccion del archivo de historial.
     */
    public String direc_historial = ""; 
    
    /**
     * Constructor de la clase, inicializa la ventana.
     */
    public Historial() {
        initComponents();
    }
    
    /**
     * Establece la dirección del archivo de historial.
     * 
     * @param direc La dirección del archivo de historial.
     */
    public void setDireccion(String direc) {
        this.direc_historial = direc;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param usuario El nombre del usuario.
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
        lbl_historial = new javax.swing.JLabel();
        lbl_diseno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl_resultado = new javax.swing.JLabel();
        BT_menu = new javax.swing.JButton();
        BT_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));

        lbl_historial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_historial.setText("Historial");

        lbl_diseno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_diseno.setText("N°|Resultado ");

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 102));
        jScrollPane1.setForeground(new java.awt.Color(255, 204, 102));
        jScrollPane1.setToolTipText("");

        lbl_resultado.setText(" ");
        jScrollPane1.setViewportView(lbl_resultado);

        BT_menu.setText("Atras");
        BT_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_menuActionPerformed(evt);
            }
        });

        BT_salir.setText("X");
        BT_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lbl_historial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(BT_salir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_diseno)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_menu)))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbl_historial))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BT_salir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_diseno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BT_menu)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja la acción de abrir la ventana menú.
     */
    private void BT_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_menuActionPerformed
        Menu newframe = new Menu();
        newframe.setDirec_Historial(direc_historial);
        newframe.setDirec_Logros("C:\\Users\\Cesia\\Desktop\\archivo\\"+usuario+"\\logros.txt");
        newframe.setUsuario(usuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_menuActionPerformed

    /**
     * Maneja la acción de cerrar la ventana de historial.
     */
    private void BT_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BT_salirActionPerformed

    /**
     * Método principal que inicia la aplicación.
     * 
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_menu;
    private javax.swing.JButton BT_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_diseno;
    private javax.swing.JLabel lbl_historial;
    private static javax.swing.JLabel lbl_resultado;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Hace invisible el botón de menú.
     */
    public void transparencia_BT_menu() {
        BT_menu.setVisible(false);
    }

    /**
     * Hace invisible el botón de salir.
     */
    public void transparencia_BT_salir() {
        BT_salir.setVisible(false);
    }
    
    /**
     * Carga el historial desde el archivo y lo muestra en la interfaz.
     */
    public void cargar_historial(){
        File archivo=new File(direc_historial);
        String contenido="";
        String histo="";
        try (BufferedReader lectura = new BufferedReader(new FileReader(archivo))) {
            while(contenido != null){
                if(histo.equals("")){
                    histo=contenido;
                }else{
                    histo=histo+"<p>"+contenido;
                }
                contenido = lectura.readLine();
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace();
        }
        lbl_resultado.setText("<html>"+histo+"<html>");
    }
}
