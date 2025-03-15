package com.dianbridge;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Atributos: lista de libros, lista de usuarios, lista de préstamos
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();

    // Método para agregar un libro al inventario (con sobrecarga)
    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
        System.out.println("Libro agregado al inventario:" + libro.getTitulo);
    }

    public void agregarLibro(String titulo, String autor, String isbn, int anoDePublicacion, boolean disponible) {
        Libro libro = new Libro(titulo, autor, isbn, anoDePublicacion, disponible);
        this.libros.add(libro);
        System.out.println("Libro agregado al inventario:" + libro.getTitulo);
    }

    // Método para registrar un usuario (con sobrecarga)

    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(Usuario);
        System.out.println("Usuario registrado:" + usuario.getNombre());
    }

    // Método para realizar un préstamo

    // Método para registrar una devolución

    // Método para buscar libros (con sobrecarga para diferentes criterios)

    // Método para consultar préstamos de un usuario

    // Método para generar informes

}

