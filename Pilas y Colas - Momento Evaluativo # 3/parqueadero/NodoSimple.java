package parqueadero;

/**
 * Implementación de clase NodoSimple Simple
 */

public class NodoSimple<E>{
    
    private E data;
    private NodoSimple<E> next;
    
    
    public NodoSimple(E data)
    {
        this.data = data;
        this.next = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public NodoSimple<E> getNext() {
        return next;
    }

    public void setNext(NodoSimple<E> next) {
        this.next = next;
    }
    
}