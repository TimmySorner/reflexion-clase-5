# Proyecto de Biblioteca

Este proyecto es una implementación básica de un sistema de gestión de una biblioteca en Java. Permite gestionar libros, usuarios y préstamos de libros.

## Estructura del Proyecto

El proyecto contiene las siguientes clases principales:

### 1. `Biblioteca`
Esta clase representa la biblioteca y contiene listas de libros y usuarios. Proporciona métodos para agregar y eliminar libros y usuarios.

### 2. `Libro`
Esta clase representa un libro en la biblioteca. Contiene atributos como `id`, `titulo` y `autor`, y métodos getter y setter para estos atributos.

### 3. `Usuario`
Esta clase representa un usuario de la biblioteca. Contiene atributos como `id`, `nombre`, `email` y una lista de préstamos actuales. Proporciona métodos para agregar y eliminar préstamos, así como métodos getter y setter para sus atributos.

### 4. `Prestamo`
Esta clase representa un préstamo de un libro a un usuario. Contiene atributos como `libro`, `usuario` y `fechaPrestamo`, y métodos getter y setter para estos atributos.

### 5. `Main`
Esta clase contiene el método `main` que sirve como punto de entrada del programa. En este método se crean instancias de `Biblioteca`, `Libro`, `Usuario` y `Prestamo`, y se demuestra cómo interactúan entre sí.

## Ejecución del Proyecto

Para ejecutar el proyecto, simplemente compila y ejecuta la clase `Main`. Esto demostrará la funcionalidad básica del sistema de gestión de la biblioteca.

