package parqueadero;

public class Parqueadero {

    private static final int CAPACIDAD = 4;
    private static Stack<String> parqueadero = new Stack<>();
    private static Queue<String> colaEspera = new Queue<>();

    public static void main(String[] args) {

        // --- INGRESOS ---
        ingresar("ABC 123");
        ingresar("DEF 456");
        ingresar("GHI 789");
        ingresar("JKL 012");
        ingresar("MNO 345"); // parqueadero lleno -> va a cola
        ingresar("PQR 678"); // parqueadero lleno -> va a cola

        mostrarEstado();

        // --- RETIROS ---
        retirar("GHI 789"); // está bloqueada, debe mover vehículos
        retirar("XYZ 999"); // no existe

        mostrarEstado();
    }

    static void ingresar(String placa) {
        if (parqueadero.size() < CAPACIDAD) {
            parqueadero.push(placa);
            System.out.println(" Ingresó: " + placa);
        } else {
            colaEspera.enqueue(placa);
            System.out.println(" En espera: " + placa);
        }
    }

    static void retirar(String placa) {
        if (!buscarEnPila(placa)) {
            System.out.println("\n No encontrado: " + placa);
            return;
        }

        Stack<String> temporal = new Stack<>();
        while (!parqueadero.top().equals(placa)) {
            temporal.push(parqueadero.pop());
        }
        parqueadero.pop();
        System.out.println("\n Retirado: " + placa);

        while (!temporal.isEmpty()) parqueadero.push(temporal.pop());

        if (!colaEspera.isEmpty() && parqueadero.size() < CAPACIDAD) {
            String siguiente = colaEspera.dequeue();
            parqueadero.push(siguiente);
            System.out.println(" Ingresó desde espera: " + siguiente);
        }
    }

    static boolean buscarEnPila(String placa) {
        Stack<String> aux = new Stack<>();
        boolean encontrado = false;
        while (!parqueadero.isEmpty()) {
            String v = parqueadero.pop();
            if (v.equals(placa)) encontrado = true;
            aux.push(v);
        }
        while (!aux.isEmpty()) parqueadero.push(aux.pop());
        return encontrado;
    }

    static void mostrarEstado() {
        System.out.println("\n===== ESTADO =====");
        Stack<String> aux = new Stack<>();
        while (!parqueadero.isEmpty()) aux.push(parqueadero.pop());
        int i = 1;
        while (!aux.isEmpty()) {
            String v = aux.pop();
            System.out.println("  " + i++ + ". " + v);
            parqueadero.push(v);
        }
        System.out.println("Cola de espera: " + (colaEspera.isEmpty() ? "(vacía)" : ""));
        Queue<String> auxQ = new Queue<>();
        while (!colaEspera.isEmpty()) {
            String v = colaEspera.dequeue();
            System.out.println("  - " + v);
            auxQ.enqueue(v);
        }
        while (!auxQ.isEmpty()) colaEspera.enqueue(auxQ.dequeue());
        System.out.println("==================\n");
    }
}