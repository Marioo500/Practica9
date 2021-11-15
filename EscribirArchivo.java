package practica9;
import java.io.*;

public class EscribirArchivo {
    
    public void escribirArchivo(Alumno alumnos[]){
        try{
            ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("Alumnos.bin"));
            for(int i = 0; i<alumnos.length; i++){
                s.writeObject(alumnos[i]);
            }
            s.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Nuevo archivo generado");
    }
}
