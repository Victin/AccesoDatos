package Files;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir {

    public void escribir(String nombre_archivo, String frase) throws IOException{
        FileWriter fw = new FileWriter(nombre_archivo);
        for(int i=0;i<frase.length();i++)
            fw.write(frase.charAt(i));
        fw.close();
    }
    
}
