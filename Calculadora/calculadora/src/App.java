import java.util.ArrayList;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner escaner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        int opciones = 0;
        do {
            menu();
            opciones = escaner.nextInt();
            // Si justo despues de leer un INT leemos una linea o un String , tenemos que
            // limpiar el buffer para que no haya problemas
            // escaner.nextLine(); Antes de cada nueva asignacion de Elementos.
            switch (opciones) {
                case 1 -> añadirElementos(nombres);
                case 2 -> eliminarElemento(nombres);
                case 3 -> comprobarElemento(nombres);
                case 4 -> recorrerArray(nombres);
                case 5 -> duplicadosArray(nombres);
                case 6 -> System.out.println(nombres.reversed());
                case 7 -> remplazoArray(nombres);
                case 8 -> intercambioArray(nombres);
                case 9 -> System.out.println("Saliendo....");
                default -> System.out.println("Elije una opcion valida");
            }

        } while (opciones != 9);

    }

    public static void menu() {
        System.out.println("_____________");
        System.out.println("1.Meter elementos al ArrayList");
        System.out.println("2.Eliminar elemento si existe");
        System.out.println("3.Comprombamos  si el elemento esta en la lista");
        System.out.println("4.Mostramos el array");
        System.out.println("5.Comprobar si hay duplicados"); // HACERLO
        System.out.println("6.Invertir orden lista");
        System.out.println("7.Reemplazo de un elemento");
        System.out.println("8.Intercambio de elementos");
        System.out.println("9.Salir");
    }

    public static void añadirElementos(ArrayList<String> lista) {
        Scanner escaner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Que palabra nombre quieres añadir a la lista");
            String nombre = escaner.nextLine();
            if (lista.contains(nombre)) {
                System.out.println("El elemento ya esta introducido");
            } else {
                lista.add(nombre);
            }
        }
    }

    public static void recorrerArray(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void recorrerArrayForeach(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void eliminarElemento(ArrayList<String> lista) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Los elementos de la lista son: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("Que elemento de la lista quieres eleminar");
        String nombre = escaner.nextLine();
        if (lista.remove(nombre)) {
            System.out.println("El elemento ha sido eliminado correcamente");
        } else {
            System.out.println("El elemento no se encuentra en esta lista");
        }

    }

    public static void comprobarElemento(ArrayList<String> lista) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Que elemento de la lista quieres comprobar si esta en la lista");
        String nombre = escaner.nextLine();
        if (lista.contains(nombre)) {
            System.out.println("El elemento se encuentra en la lista");
        } else {
            System.out.println("El elemento no se encuentra en la lista");
        }

    }

    public static void duplicadosArray(ArrayList<String> lista) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Que elemento quieres añadir a la lista");
        String nombre = escaner.nextLine();
        if (lista.contains(nombre)) {
            System.out.println("El elemento ya esta en la lista");
        } else {
            lista.add(nombre);
        }
    }

    public static void invertirArray(ArrayList<String> lista) {

        // Metodo para mostrarla inversa con bucle
        /*
         * for (int i lista.size(); i>=0; i--) {
         * System.out.println(lista.get(i));
         * }
         */
        // Metodo ArrayList
        lista.reversed();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

   

    public static void intercambioArray(ArrayList<String> lista) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Que nombre del arraylist quieres remplazar?");
        String nombre1 = escaner.nextLine();
        String temp = nombre1;
        System.out.println("Porque nombre quieres intercambiarlo");
        String nombre2 = escaner.nextLine();

        int posi = lista.indexOf(nombre1);
        int posi2 = lista.indexOf(nombre2);
        lista.set(posi, nombre2);
        lista.set(posi2, temp);

    }
    }

