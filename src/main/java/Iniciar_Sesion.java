import java.io.*;

/**
 * La clase Iniciar_Sesion es una ventana de interfaz gráfica
 * que permite a los usuarios iniciar sesión en la aplicación.
 */
public class Iniciar_Sesion extends javax.swing.JFrame {

    /**
     * Modo de juego (PC o Torneo).
     */
    public String modo = "PC"; 
    
    /**
     * Nombre del jugador 1.
     */
    public String usuario1 = " ";
    
    /**
     * Direccion principal de los archivos.
     */
    private String Direccion_Principal = "C:\\Users\\Cesia\\Desktop\\archivo\\";

    /**
     * Constructor de la clase, inicializa la ventana.
     */
    public Iniciar_Sesion() {
        initComponents();
    }

    /**
     * Inicializa los componentes de la interfaz gráfica.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_logro = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        TFUsuario = new javax.swing.JTextField();
        lbl_contrasena = new javax.swing.JLabel();
        PFContrasena = new javax.swing.JPasswordField();
        BTiniciar_sesion = new javax.swing.JButton();
        lbl_linea = new javax.swing.JLabel();
        BTCrear_usuario = new javax.swing.JButton();
        lbl_aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_logro.setFont(new java.awt.Font("Imprint MT Shadow", 0, 48)); // NOI18N
        lbl_logro.setText("NIMBOR");

        lbl_usuario.setText("Usuario:");

        TFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFUsuarioActionPerformed(evt);
            }
        });

        lbl_contrasena.setText("Contraseña:");

        PFContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFContrasenaActionPerformed(evt);
            }
        });

        BTiniciar_sesion.setText("Iniciar Sesion");
        BTiniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTiniciar_sesionActionPerformed(evt);
            }
        });

        lbl_linea.setText("________________________________________");

        BTCrear_usuario.setText("Crear Usuario");
        BTCrear_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCrear_usuarioActionPerformed(evt);
            }
        });

        lbl_aviso.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lbl_aviso.setForeground(new java.awt.Color(153, 0, 0));
        lbl_aviso.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_usuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_contrasena, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lbl_linea))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_aviso)
                            .addComponent(lbl_logro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(BTCrear_usuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(BTiniciar_sesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbl_logro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_aviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contrasena)
                    .addComponent(PFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BTiniciar_sesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_linea, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTCrear_usuario)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Establece el nombre del primer usuario en el modo torneo.
     * 
     * @param usuario El nombre del usuario.
     */
    public void setUsuario1(String usuario) {
        this.usuario1 = usuario;
    }

    /**
     * Establece el modo de juego.
     * 
     * @param modo El modo de juego.
     */
    public void setModo(String modo) {
        this.modo = modo;
    }

    private void TFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioActionPerformed

    }//GEN-LAST:event_TFUsuarioActionPerformed

    /**
     * Maneja la acción de iniciar sesión.
     */
    private void BTiniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTiniciar_sesionActionPerformed
        File direcUsuarios=new File("C:\\Users\\Cesia\\Desktop\\archivo\\Usuarios.txt");
        String nombre=TFUsuario.getText();
        String contrasena=PFContrasena.getText();
        Usuario us1=new Usuario(nombre,contrasena);
        if(!nombre.equals("") && !contrasena.equals("")){
            if(modo.equals("PC") && us1.Usuario_Existe(direcUsuarios,nombre) && us1.Confirmar_Contrasena(direcUsuarios,nombre,contrasena)){
                Menu newframe=new Menu();
                newframe.setUsuario(nombre);
                newframe.setDirec_Historial(Direccion_Principal+nombre+"\\historial.txt");
                newframe.setDirec_Logros(Direccion_Principal+nombre+"\\logros.txt");
                newframe.setVisible(true);
                this.dispose();
            }else if(modo.equals("Torneo")){
                String direccion=Direccion_Principal+"\\Torneo\\"+usuario1+"_"+nombre+".txt";
                File historial= new File(direccion);
                try{
                    if(historial.createNewFile()){
                        System.out.println(".");
                    }else{
                        System.out.println(".\n.\n.");
                    }
                }catch(IOException exepcion){
                    exepcion.printStackTrace(System.out);
                }
                Juego_Torneo newframe= new Juego_Torneo();
                newframe.setUsuario1(usuario1);
                newframe.setUsuario2(nombre);
                newframe.setDirec_Historial(direccion);
                newframe.setNum_partida(newframe.obtener_num_partida(direccion));
                newframe.setVisible(true);
                newframe.cargar_datos();
                this.dispose();
            }
            lbl_aviso.setText("<html>Usuario/Contraseña incorrecta<p>Intentelo de nuevo<html>");
        }
        if(nombre.equals("") || contrasena.equals(""))
        lbl_aviso.setText("<html>Ingrese sus datos para iniciar sesion<html>");
    }//GEN-LAST:event_BTiniciar_sesionActionPerformed

    /**
     * Maneja la acción de abrir la ventana de Crear_nuevo_usuario.
     */
    private void BTCrear_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCrear_usuarioActionPerformed
        Crear_nuevo_usuario newframe=new Crear_nuevo_usuario();
        newframe.setUsuario1(usuario1);
        newframe.setModo(modo);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTCrear_usuarioActionPerformed

    private void PFContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PFContrasenaActionPerformed

    }//GEN-LAST:event_PFContrasenaActionPerformed

    /**
     * Método principal que inicia la aplicación.
     * 
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCrear_usuario;
    private javax.swing.JButton BTiniciar_sesion;
    private javax.swing.JPasswordField PFContrasena;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JLabel lbl_aviso;
    private javax.swing.JLabel lbl_contrasena;
    private javax.swing.JLabel lbl_linea;
    private javax.swing.JLabel lbl_logro;
    private javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables

}