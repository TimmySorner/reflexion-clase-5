package com.dianbridge;
import java.util.ArrayList;

public class Usuario {
    // Atributos: id, nombre, email, lista de préstamos actuales
    int id;
    String nombre;
    String email;
    ArrayList<Prestamo> prestamos;
    // Lista de préstamos actuales

    // Constructor(es)
    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.prestamos = new ArrayList<>();
    }

    // Métodos getter y setter

    // Métodos getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    // Métodos setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    // Método para agregar un préstamo a la lista
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    // Método para eliminar un préstamo de la lista
    public void eliminarPrestamo(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }

    // Método toString() para mostrar información del usuario
    @Override
    public String toString() {
        return "Usuario [id=" + id +
                ", nombre=" + nombre +
                ", email=" + email +
                ", prestamos=" + prestamos
                + "]";
    }

}