package com.dianbridge;

public class Prestamo {

// Atributos 


 private Libro libro;
 private Usuario usuario;
 private String fechaPrestamo;
 private String fechaDevolucion;


// Constructor 

 public Prestamo (String libro, String usuario, String fechaPrestamo, String fechaDevolucion) {


    this.Libro = libro;
    this.usuario = usuario;
    this.fechaPrestamo = fechaPrestamo;
    this.fechaDevolucion = fechaDevolucion;
 }

 // Metodos getter y setter

 public String getlibro() {
    return libro;
 }

public void setlibro(String libro) {
    this.libro = libro;
}

 public String getusuario() {
    return usuario;
}

public void setusuario(String usuario) {
    this.usuario = usuario;
}



public String getfechaPrestamo() {
    return fechaPrestamo;

}

public void setfechaPrestamo(String fechaPrestamo){
    this.fechaPrestamo = fechaPrestamo;
}


public String getfechaDevolucion() {
    return fechaDevolucion;
}

public void setfechaDevolucion(String fechaDevolucion){
    this.fechaDevolucion= fechaDevolucion;
}

// Metodo para calcular dias de retraso  

public void calcularRetraso()   {
 


}




}
