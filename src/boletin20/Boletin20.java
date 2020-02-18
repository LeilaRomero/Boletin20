package boletin20;

import metodos.Libros;
import metodos.Metodos;
import java.util.*;
import javax.swing.JOptionPane;
import validar.pedirDato;

/**
 *
 * @author Leila
 */
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int Opcion;
        metodos.Metodos obj= new metodos.Metodos();
        ArrayList<metodos.Libros>listaLibros=new ArrayList<>();
         
        
        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***"
                    + "\n 1 -- Añadir libros"
                    + "\n 2 -- Mostrat los libros existentes en la tienda"
                    + "\n 3 -- Libros vendidos"
                    + "\n 4 -- Dar de baja"
                    + "\n 5 -- Buscar libro"
                    + "\n 6 -- Salir"));
            switch (Opcion) {
                case 1:
                    obj.añadirLibros(listaLibros);
                    break;
                case 2:
                    obj.mostrar(listaLibros);
                    break;
                case 3:
                    obj.vender(listaLibros, pedirDato.pedirString("ISBN"));
                    break;
                case 4:
                    obj.darDeBaja(listaLibros);
                    break;
                case 5:
                    obj.buscarLibro(listaLibros);
                    break;
                case 6:
                    obj.salir();
                    break;
            }
        } while (Opcion < 6);

    }
}
