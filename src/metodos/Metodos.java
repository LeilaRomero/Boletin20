package metodos;

import java.util.*;
import javax.swing.JOptionPane;
import validar.pedirDato;

/**
 *
 * @author Leila
 */
public class Metodos {

    public Libros añadirLibros(ArrayList<Libros> listaLibros) {
        Libros li = new Libros(pedirDato.pedirString("Introducir libro"),
                               pedirDato.pedirString("autor"),
                               pedirDato.pedirString("ISBN"),
                               pedirDato.pedirInt("precio"),
                               pedirDato.pedirInt("Numero de unidades"));
        listaLibros.add(li);
        return li;
    }

    public void mostrar(ArrayList<Libros> listaLibros) {
        if (listaLibros.isEmpty()) {
            System.out.println("No hay libros disponibles");
        }
        for (Libros ele : listaLibros) {
            System.out.println(ele);

        }
    }

   public void vender(ArrayList<Libros> listaLibros, String isbn) {
        if (listaLibros.isEmpty()) {
            System.out.println("No existe este libro");
        }
        for (Libros li : listaLibros) {
            if ((li.getISBN().equals(isbn)) && (li.getNumero()> 0)) {
                li.setNumero(li.getNumero() - 1);

            } else {
                System.out.println("No quedan unidades");
            }

            break;
        }
    }

    public void darDeBaja(ArrayList<Libros> listaLibros) {
        Libros libro = new Libros();
        Iterator it = listaLibros.iterator();
        if (listaLibros.isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "No existen libros");
        } else {
            while (it.hasNext()) {
                libro = (Libros) it.next();
                if (libro.getNumero() == 0) {
                    listaLibros.remove(libro);
                    break;
                }
            }
        }
    }

    public void buscarLibro(ArrayList<Libros> listaLibros) {
        String nome = JOptionPane.showInputDialog("Introduce el libro a buscar ");
        for (Libros li : listaLibros) {
            if (nome.equals(li.getTitulo())) {
                System.out.println("Autor: " + li.getAutor() + " el ISBN es: " + li.getISBN() + " y quedan en tienda: " + li.getNumero());
            }
        }
    }

    public void salir() {
        System.exit(0);
    }
}
