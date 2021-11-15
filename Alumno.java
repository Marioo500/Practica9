package practica9;

import java.io.Serializable;

public class Alumno implements Serializable{
    private String nombre;
    private String matricula;
    float calificaciones[] = new float[7];
    float promedio;
    
    public Alumno(){
          setNombre(CaputraEntrada.capturarCadena("Nombre del alumno"));
          setMatricula(CaputraEntrada.capturarCadena("Matricula"));
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setMatricula(String m){
        matricula = m;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void calcularPromedio(){
        promedio = 0;
        for(int i = 0;i<calificaciones.length;i++){
            promedio+=calificaciones[i];
        }
        promedio/=calificaciones.length;
    }
    
    public void printAlumno(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Calificaciones: ");
        for(int i=0;i<calificaciones.length;i++){
            System.out.println(calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
    }
}


