package com.dianbridge;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-3-16-148410-0", "1943", true);
        Libro libro2 = new Libro("1984", "George Orwell", "978-0-452-28423-4", "1949", true);
        

        // Crear usuarios
        Usuario usuario1 = new Usuario(1, "Juan Perez", "juan@example.com");
        Usuario usuario2 = new Usuario(2, "Maria Lopez", "maria@example.com");

        // Registrar libros y usuarios en la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Realizar préstamos
        biblioteca.realizarPrestamo(libro1, usuario1, "2023-10-01", "2023-10-15");
        biblioteca.realizarPrestamo(libro2, usuario2, "2023-10-02", "2023-10-16");

        // Generar informe
        biblioteca.generarInforme();

        // Registrar devolución
        Prestamo prestamo = biblioteca.consultarPrestamosUsuario(usuario1).get(0);
        biblioteca.registrarDevolucion(prestamo);

        // Generar informe después de la devolución
        biblioteca.generarInforme();
    }
}