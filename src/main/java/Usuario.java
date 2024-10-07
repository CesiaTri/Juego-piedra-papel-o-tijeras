import java.io.*;

/**
 * La clase Usuario representa a un usuario del juego.
 * Cada usuario tiene un nombre y una contraseña, y se pueden realizar
 * operaciones relacionadas con la verificación y el registro de usuarios.
 */
public class Usuario {
    String nombre;
    String contrasena;
    
    /**
     * Constructor que inicializa un nuevo usuario
     * 
     * @param nombre     El nombre del usuario.
     * @param contrasena La contraseña del usuario.
     */
    public Usuario(String nombre, String contrasena){
        this.nombre=nombre;
        this.contrasena=contrasena;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param nombre El nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la contraseña del usuario.
     * 
     * @param contrasena La nueva contraseña del usuario.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la contraseña del usuario.
     * 
     * @return La contraseña del usuario.
     */
    public String getContrasena() {
        return contrasena;
    }
        
    /**
     * Verifica si un usuario existe.
     * 
     * @param archivo El archivo que contiene los usuarios.
     * @param nombre  El nombre del usuario a verificar.
     * @return true si el usuario existe, false en caso contrario.
     */
    public boolean Usuario_Existe(File archivo,String nombre) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(" ");  // Dividir el nombre y la contraseña
                String nombreAct = datos[0];
                
                // Comprobar si el nombre coincide
                if (nombre.equals(nombreAct)) {
                    return true;  // El usuario existe
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return false;  // El usuario no existe
    }
    
    /**
     * Confirma si la contraseña corresponde al usuario.
     * 
     * @param archivo   El archivo que contiene los usuarios registrados.
     * @param nombre    El nombre del usuario.
     * @param contrasena La contraseña a verificar.
     * @return true si la contraseña es correcta, false en caso contrario.
     */
    public boolean Confirmar_Contrasena(File archivo,String nombre,String contrasena) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(" ");  
                String contrasenaAct = datos[1];
                String nombreAct= datos[0];
                
                if (nombre.equals(nombreAct) && contrasena.equals(contrasenaAct)) {
                    return true; 
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return false;
    }
    
    /**
     * Registra un nuevo usuario y crea sus archivos y carpetas.
     * 
     * @param archivo           El archivo donde se guardará el nuevo usuario.
     * @param nombre            El nombre del nuevo usuario.
     * @param contrasena        La contraseña del nuevo usuario.
     * @param direccionPrincipal La dirección principal donde se crearán los archivos del usuario.
     */
    public void Registrar_Usuario(File archivo,String nombre,String contrasena,String direccionPrincipal) {
        try (FileWriter writer = new FileWriter(archivo, true)) {
            
            writer.write(nombre + " " + contrasena + "\n");
            System.out.println("Usuario registrado correctamente");

            
            File carpeta = new File(direccionPrincipal+nombre);
            
            if (carpeta.mkdir()) {
                System.out.println(".");
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
            
            File historial= new File(direccionPrincipal+nombre+"\\historial.txt");
            try{
                if(historial.createNewFile()){
                    System.out.println(".");
                }else{
                    System.out.println("Error al crear el archivo");
                }
            }catch(IOException exepcion){
                exepcion.printStackTrace(System.out);
            }
            
            File logros=new File (direccionPrincipal+nombre+"\\logros.txt");
            try{
                if(logros.createNewFile()){
                    System.out.println(".");
                }else{
                    System.out.println("Error al crear el archivo");
                }
            }catch(IOException exepcion){
                exepcion.printStackTrace(System.out);
            }
            Logro aux=new Logro();
            aux.guardarLogros(aux.lista_logros(),direccionPrincipal+nombre+"\\logros.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
