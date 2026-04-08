public class Main {
    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarFinal(30);
        lista.insertarFinal(10);
        lista.insertarFinal(20);

        System.out.println("Lista original:");
        lista.mostrar();

        System.out.println("Buscar 20: " + lista.buscar(20));

        lista.invertir();
        System.out.println("Lista invertida:");
        lista.mostrar();

        lista.ordenar();
        System.out.println("Lista ordenada:");
        lista.mostrar();

        lista.eliminar(10);
        System.out.println("Después de eliminar 10:");
        lista.mostrar();

        System.out.println("Tamaño: " + lista.size());
    }
}

