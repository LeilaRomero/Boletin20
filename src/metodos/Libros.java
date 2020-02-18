package metodos;

/**
 *
 * @author Leila
 */
public class Libros implements Comparable {

    String titulo, autor, ISBN;
    int precio, numero;

    public Libros() {
    }

    public Libros(String titulo, String autor, String ISBN, int precio, int numero) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", precio=" + precio + ", numero=" + numero + '}';
    }

    @Override
    public int compareTo(Object o) {
        Libros a = (Libros) o;
        if (this.titulo.compareToIgnoreCase(a.titulo) > 0) {
            return 1;
        } else if (this.titulo.compareToIgnoreCase(a.titulo) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

}
