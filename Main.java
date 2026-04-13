import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar al inicio: ");
                    int datoInicio = scanner.nextInt();
                    lista.insertarInicio(datoInicio);
                    System.out.println("✓ Elemento insertado al inicio\n");
                    break;

                case 2:
                    System.out.print("Ingrese el valor a insertar al final: ");
                    int datoFinal = scanner.nextInt();
                    lista.insertarFinal(datoFinal);
                    System.out.println("Elemento insertado al final\n");
                    break;

                case 3:
                    System.out.println("Lista actual:");
                    lista.mostrar();
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Ingrese el valor a buscar: ");
                    int datoBuscar = scanner.nextInt();
                    int posicion = lista.buscar(datoBuscar);
                    if (posicion != -1) {
                        System.out.println("Elemento encontrado en posición: " + posicion + "\n");
                    } else {
                        System.out.println("Elemento no encontrado\n");
                    }
                    break;

                case 5:
                    lista.eliminarPrimero();
                    System.out.println("Primer elemento eliminado\n");
                    break;

                case 6:
                    System.out.print("Ingrese el valor a eliminar: ");
                    int datoEliminar = scanner.nextInt();
                    lista.eliminar(datoEliminar);
                    System.out.println("Elemento eliminado\n");
                    break;

                case 7:
                    System.out.println("Tamaño de la lista: " + lista.size() + "\n");
                    break;

                case 8:
                    lista.invertir();
                    System.out.println("Lista invertida");
                    System.out.println("Lista invertida:");
                    lista.mostrar();
                    System.out.println();
                    break;

                case 9:
                    lista.ordenar();
                    System.out.println(" Lista ordenada en orden ascendente");
                    System.out.println("Lista ordenada:");
                    lista.mostrar();
                    System.out.println();
                    break;

                case 10:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println(" Opción no válida. Intente de nuevo.\n");
            }
        } while (opcion != 10);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("   GESTIÓN DE LISTA ENLAZADA SIMPLE    ");
        System.out.println("═══════════════════════════════════════");
        System.out.println("1. Insertar elemento al inicio");
        System.out.println("2. Insertar elemento al final");
        System.out.println("3. Mostrar lista");
        System.out.println("4. Buscar elemento");
        System.out.println("5. Eliminar primer elemento");
        System.out.println("6. Eliminar elemento por valor");
        System.out.println("7. Mostrar tamaño de la lista");
        System.out.println("8. Invertir lista");
        System.out.println("9. Ordenar lista (Bubble Sort)");
        System.out.println("10. Salir");
        System.out.println("═══════════════════════════════════════");
    }
}

