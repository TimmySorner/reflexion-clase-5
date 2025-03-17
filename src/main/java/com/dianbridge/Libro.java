package com.dianbridge;

public class Libro {

     // Atributos: título, autor, ISBN, año de publicación, disponible (boolean)

     private String titulo;
     private String autor;
     private String isbn;
     private String anoDePublicacion;
     private boolean disponible;

    // Constructor(es)

    public Libro (String titulo, String autor, String isbn, String anoDePublicacion, boolean disponible){
    this.titulo = titulo;
    this.autor = autor;
    this.isbn = isbn;
    this.anoDePublicacion = anoDePublicacion;
    this.disponible = disponible;}

    // Métodos getter y setter

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAnoDePublicacion() {
        return anoDePublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAnoDePublicacion(String anoDePublicacion) {
        this.anoDePublicacion = anoDePublicacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    // Metodo para marcarlo como disponible
    
    public void devolver() { this.disponible = true; }

    // Metodo para marcarlo como prestado

    public void prestar() { this.disponible = false; }
    
    // Metodo para evaluar si el libro está disponible
    public void disponibilidadLibro () {
        if (disponible == true) {
            System.out.println("El libro está disponible");
        } else {
            System.out.println("El libro no está disponible");
        }
    }	


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anoDePublicacion='" + anoDePublicacion + '\'' +
                ", disponible=" + disponible +
                '}';
    }



}
