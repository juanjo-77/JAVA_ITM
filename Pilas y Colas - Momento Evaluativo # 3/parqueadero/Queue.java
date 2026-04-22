package parqueadero; //Paquete de la clase

//Implementación de una cola utilizando listas

public class Queue<E> { //Clase principal
    
    private List<E> data; //Creación de la lista

    public Queue() { //Constructor vacío
        this.data = new List();    
    }
    
    public int size() { //Contador de los elementos de la lista
        return data.size();
    }
    
    public boolean isEmpty() { //Verificador de lista no vacía
        return this.size() == 0;
    }
    
    public void enqueue(E data) { //Agregar un nuevo elemento a la cola
        this.data.add_last(data);
    }
    
    public E dequeue() { //Método para remover el último elemento de la lista
        if (this.isEmpty()) { //Condicional para verificar si la lista no está vacia
            return null;
        }
        else { //Condicional para eliminar el elemento si la lista no está vacía
            return data.remove_first();
        }
    }
    
    public E first() { //Mostrar el último elemento de la lista
        if (this.isEmpty()) { //Condicional para verificar si la lista no está vacia
            return null;
        }
        else { //Condicional para mostrar el último elemento de la lista si esta no está vacía
            return (E) this.data.first().getData();
        }
    }
}