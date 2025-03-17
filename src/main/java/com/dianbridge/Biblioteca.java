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
    }

    // Método para agregar un libro al inventario (con sobrecarga)
    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
        System.out.println("Libro agregado al inventario:" + libro.getTitulo());
    }

    // Método para registrar un usuario (con sobrecarga)

    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        System.out.println("Usuario registrado:" + usuario.getNombre());
    }

    // Método para realizar un préstamo
    public void realizarPrestamo(Libro libro, Usuario usuario, String fechaPrestamo, String fechaDevolucion) {
        if (libro.isDisponible()) {
            libro.prestar(); // Marcar el libro como no disponible
            Prestamo prestamo = new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucion);
            prestamos.add(prestamo);
            usuario.agregarPrestamo(prestamo); // Agregar el préstamo al usuario
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    // Método para registrar una devolución
    public void registrarDevolucion(Prestamo prestamo) {
        prestamo.getLibro().devolver(); // Marcar el libro como disponible
        prestamo.getUsuario().eliminarPrestamo(prestamo); // Eliminar el préstamo del usuario
        prestamos.remove(prestamo); // Eliminar el préstamo de la lista de préstamos
    }


    // Método para buscar libros 
    public List<Libro> buscarLibrosPorTitulo(String titulo) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }
    
    // Método para consultar préstamos de un usuario

    public List<Prestamo> consultarPrestamosUsuario(Usuario usuario) {
        return usuario.getPrestamos();
    }


    // Método para generar informes
    public void generarInforme() {
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        System.out.println("\nUsuarios registrados:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        System.out.println("\nPréstamos activos:");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }

}

