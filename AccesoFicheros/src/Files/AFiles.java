package Files;

import java.io.File;

public class AFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File ruta = new File("C:\\Users\\alumno\\Documents\\Clase\\IDE\\NetBeans\\Archivos");
        
        System.out.println(ruta.getAbsolutePath());
        
        String[] nombres_archivos = ruta.list();
        for(int i=0; i<nombres_archivos.length;i++){
            System.out.println(nombres_archivos[i]);
            File f = new File(ruta.getAbsolutePath()/* ==ruta */, nombres_archivos[i]);
            if(f.isDirectory()){
                String[] subcarpeta = f.list();
                for(String e: subcarpeta)
                    System.out.println(e);
            }
        }
        
        
        
        
        
    }
    
}
