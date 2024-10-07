import java.io.*;

/**
 * La clase Crear_nuevo_usuario es una ventana permite a los usuarios 
 * crear una nueva cuenta en el juego.
 */
public class Crear_nuevo_usuario extends javax.swing.JFrame {
    
    /**
     * Modo de juego(PC o Torneo).
     */
    public String modo = "PC";
    
    /**
     * Nombre del jugador 1.
     */
    public String usuario1 = " "; 
    
    /**
     * Constructor de la clase, inicializa la ventana.
     */
    public Crear_nuevo_usuario() {
        initComponents();
    }
    
    /**
     * Establece el modo de juego.
     * 
     * @param modo El modo de juego ("PC" o "Torneo").
     */
    public void setModo(String modo){
        this.modo=modo;
    }
    
    /**
     * Establece el nombre del primer usuario en el modo Torneo.
     * 
     * @param nombre El nombre del primer usuario.
     */
    public void setUsuario1(String nombre) {
        this.usuario1 = nombre;
    }

    /**
     * Inicializa los componentes de la interfaz gráfica.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        TF_Usuario = new javax.swing.JTextField();
        lbl_contrasena = new javax.swing.JLabel();
        PF_Contrasena = new javax.swing.JPasswordField();
        BT_Crear_Usuario = new javax.swing.JButton();
        BT_Iniciar_Sesion = new javax.swing.JButton();
        lbl_linea = new javax.swing.JLabel();
        lbl_aviso = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_logo.setFont(new java.awt.Font("Imprint MT Shadow", 0, 48)); // NOI18N
        lbl_logo.setText("NIMBOR");

        lbl_usuario.setText("Usuario:");
        lbl_usuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        TF_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_UsuarioActionPerformed(evt);
            }
        });

        lbl_contrasena.setText("Contraseña:");

        BT_Crear_Usuario.setText("Crear Usuario");
        BT_Crear_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Crear_UsuarioActionPerformed(evt);
            }
        });

        BT_Iniciar_Sesion.setText("Iniciar Sesion");
        BT_Iniciar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Iniciar_SesionActionPerformed(evt);
            }
        });

        lbl_linea.setText("__________________________________");

        lbl_aviso.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lbl_aviso.setForeground(new java.awt.Color(153, 0, 0));
        lbl_aviso.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lbl_linea))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(BT_Crear_Usuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_contrasena)
                                .addGap(18, 18, 18)
                                .addComponent(PF_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_usuario)
                                .addGap(18, 18, 18)
                                .addComponent(TF_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_logo)
                        .addGap(93, 93, 93))))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(lbl_aviso)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(BT_Iniciar_Sesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_aviso)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PF_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_contrasena))
                .addGap(26, 26, 26)
                .addComponent(BT_Crear_Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_linea, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BT_Iniciar_Sesion)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_UsuarioActionPerformed

    }//GEN-LAST:event_TF_UsuarioActionPerformed

    /**
     * Maneja la acción abrir la ventana de iniciar_sesión.
     */
    private void BT_Iniciar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Iniciar_SesionActionPerformed
        Iniciar_Sesion newframe=new Iniciar_Sesion();
        newframe.setUsuario1(usuario1);
        newframe.setModo(modo);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_Iniciar_SesionActionPerformed

    /**
     * Maneja la acción de crear un nuevo usuario.
     */
    private void BT_Crear_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Crear_UsuarioActionPerformed
        File direcUsuario=new File("C:\\Users\\Cesia\\Desktop\\archivo\\Usuarios.txt");
        String Direccion_Principal="C:\\Users\\Cesia\\Desktop\\archivo\\";
        String nombre=TF_Usuario.getText(); 
        String contrasena=PF_Contrasena.getText();
        Usuario us1=new Usuario(nombre,contrasena);
        if(!nombre.equals("") && !contrasena.equals("")){
            if(!us1.Usuario_Existe(direcUsuario,nombre)){
                us1.Registrar_Usuario(direcUsuario,nombre,contrasena,Direccion_Principal);

                if(modo.equals("PC")){
                    Menu newframe=new Menu();
                    newframe.setDirec_Historial(Direccion_Principal+nombre+"\\historial.txt");
                    newframe.setDirec_Logros(Direccion_Principal+nombre+"\\logros.txt");
                    newframe.setUsuario(nombre);
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
                    newframe.cargar_datos();
                    newframe.setVisible(true);
                    this.dispose();
                }
            }
            lbl_aviso.setText("<html>El nombre de usuario ya esta ocupado<p>Ingrese un nuevo nombre<html>");
        }
        if(nombre.equals("") && contrasena.equals(""))
            lbl_aviso.setText("<html>Rellene el registro por favor<html>");
    }//GEN-LAST:event_BT_Crear_UsuarioActionPerformed

    /**
     * Método principal que inicia la aplicación.
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_nuevo_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Crear_Usuario;
    private javax.swing.JButton BT_Iniciar_Sesion;
    private javax.swing.JPasswordField PF_Contrasena;
    private javax.swing.JTextField TF_Usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_aviso;
    private javax.swing.JLabel lbl_contrasena;
    private javax.swing.JLabel lbl_linea;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables
}
