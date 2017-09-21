package Files;

import java.io.File;
import java.io.IOException;

public class AFiles2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        File ruta = new File ("C:\\Users\\alumno\\Documents\\Clase\\IDE\\NetBeans\\Archivos");
        
        File archivo = new File (ruta, "archivo1.txt");
        archivo.createNewFile();
        
        System.out.println("Se ha creado el fichero");
        
       Escribir esc = new Escribir();
       esc.escribir("C:\\Users\\alumno\\Documents\\Clase\\IDE\\NetBeans\\Archivos\\archivo1.txt","Soy una frase");
       
        System.out.println("Se ha escrito en el fichero");
        
    }
    
}
