package tareasJava;

import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
    }

    // Métodos para establecer y obtener los atributos del libro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public void cambiarEstadoPrestamo(boolean prestado) {
        this.prestado = prestado;
    }
}

class Usuario {
    private String nombre;
    private String numeroIdentificacion;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.librosPrestados = new ArrayList<>();
    }

    // Métodos para establecer y obtener los atributos del usuario
    public String getNombre() {
        return nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void solicitarLibro(Libro libro) {
        if (!libro.estaPrestado()) {
            libro.cambiarEstadoPrestamo(true);
            librosPrestados.add(libro);
            System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido prestado a " + nombre);
        } else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no está disponible en este momento");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.cambiarEstadoPrestamo(false);
            librosPrestados.remove(libro);
            System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido devuelto");
        } else {
            System.out.println("No tienes el libro \"" + libro.getTitulo() + "\" en préstamo");
        }
    }
}

class Biblioteca {
    private List<Libro> librosDisponibles;
    private List<Usuario> usuariosRegistrados;

    public Biblioteca() {
        this.librosDisponibles = new ArrayList<>();
        this.usuariosRegistrados = new ArrayList<>();
    }

    // Métodos para agregar libros y usuarios a la biblioteca
    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido agregado a la biblioteca");
    }

    public void agregarUsuario(Usuario usuario) {
        usuariosRegistrados.add(usuario);
        System.out.println("El usuario \"" + usuario.getNombre() + "\" ha sido registrado");
    }

    // Métodos para buscar libros por título o autor
    public List<Libro> buscarLibrosPorTitulo(String titulo) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public List<Libro> buscarLibrosPorAutor(String autor) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : librosDisponibles) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    // Métodos para permitir a los usuarios solicitar y devolver libros de la biblioteca
    public void solicitarLibro(Usuario usuario, Libro libro) {
        if (librosDisponibles.contains(libro)) {
            usuario.solicitarLibro(libro);
        } else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no está disponible en la biblioteca");
        }
    }

    public void devolverLibro(Usuario usuario, Libro libro) {
        if (librosDisponibles.contains(libro)) {
            usuario.devolverLibro(libro);
        } else {
            System.out.println("No puedes devolver un libro que no pertenece a esta biblioteca");
        }
    }
}

public class BibliotecaVirtual {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("El gran Gatsby", "F. Scott Fitzgerald", 1925);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

        // Crear algunos usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", "123456");
        Usuario usuario2 = new Usuario("María González", "987654");

        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros y usuarios a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        // Ejemplo de búsqueda de libros
        List<Libro> librosEncontrados = biblioteca.buscarLibrosPorAutor("George Orwell");
        System.out.println("Libros de George Orwell encontrados:");
        for (Libro libro : librosEncontrados) {
            System.out.println(libro.getTitulo());
        }

        // Ejemplo de solicitud y devolución de libros
        biblioteca.solicitarLibro(usuario1, libro2);
        biblioteca.solicitarLibro(usuario2, libro2); // Intentar prestar un libro ya prestado
        biblioteca.devolverLibro(usuario1, libro2);
    }
}
