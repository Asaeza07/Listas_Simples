public class ListaEnlazada {
    Nodo head;
    int size;

    public ListaEnlazada() {
        head = null;
        size = 0;
    }

    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.next = head;
        head = nuevo;
        size++;
    }

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (head == null) {
            head = nuevo;
        } else {
            Nodo temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nuevo;
        }
        size++;
    }

    public void mostrar() {
        Nodo temp = head;

        while (temp != null) {
            System.out.print(temp.dato + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int buscar(int dato) {
        Nodo temp = head;
        int pos = 0;

        while (temp != null) {
            if (temp.dato == dato) {
                return pos;
            }
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    public void eliminarPrimero() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    public void eliminar(int dato) {
        if (head == null) return;

        if (head.dato == dato) {
            head = head.next;
            size--;
            return;
        }

        Nodo temp = head;

        while (temp.next != null) {
            if (temp.next.dato == dato) {
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
        }
    }

    public int size() {
        return size;
    }

    public void invertir() {
        Nodo prev = null;
        Nodo actual = head;

        while (actual != null) {
            Nodo siguiente = actual.next;
            actual.next = prev;
            prev = actual;
            actual = siguiente;
        }

        head = prev;
    }

    public void ordenar() {
        if (head == null || head.next == null) return;

        boolean cambio;

        do {
            cambio = false;
            Nodo actual = head;
            Nodo anterior = null;

            while (actual != null && actual.next != null) {
                if (actual.dato > actual.next.dato) {

                    Nodo siguiente = actual.next;

                    actual.next = siguiente.next;
                    siguiente.next = actual;

                    if (anterior == null) {
                        head = siguiente;
                    } else {
                        anterior.next = siguiente;
                    }

                    cambio = true;
                    anterior = siguiente;

                } else {
                    anterior = actual;
                    actual = actual.next;
                }
            }
        } while (cambio);
    }
}



