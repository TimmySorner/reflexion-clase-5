package com.dianbridge;

public class Libro {

     // Atributos: título, autor, ISBN, año de publicación, disponible (boolean)

     private String titulo;
     private String autor;
     private String isbn;
     private String anoDePublicacion;
     private boolean disponible;

    // Constructor(es)

    public Libro (String titulo, String autor, String ISBN, String anoDePublicacion, boolean disponible){

    this.titulo = titulo;
    this.autor = autor;
    this.ISBN = ISBN;
    this.anoDePublicacion = anoDePublicacion;
    this.disponible = disponible;}

    // Métodos getter y setter

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn (){
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnoDePublicacion () {
        return anoDePublicacion;
    }

    public void setAnoDePublicacion(String anoDePublicacion){
        this.anoDePublicacion;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setAnoDePublicacion(boolean disponible){
        this.Disponible;
    }

    








    // Método para marcar como prestado

    // Método para marcar como disponible

    // Método toString() para mostrar información del libro

}
