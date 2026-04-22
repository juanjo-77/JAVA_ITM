package parqueadero;

public class List<E> {
    
    private NodoSimple<E> head;
    private NodoSimple<E> tail;
    private int size;

    public List()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;  
    }
    
    public int size()
    {
        return this.size;
    }
    
    public boolean isEmpty ()
    {
        return this.size == 0;
    }
    
    public void  set_size(int s)
    {
        this.size = s;
    }
    
    public NodoSimple first()
    {
        return this.head;
    }
    
    public NodoSimple last()
    {
        return this.tail;
    }
    
    public void add_first(E data)
    {
        NodoSimple<E> n = new NodoSimple<>(data);
      
        if(this.isEmpty())
        {
            this.head = n;
            this.tail = n;
        }
        else
        {
            n.setNext(this.head);
            this.head = n;
        }
        
        this.size +=1;
    }
    
    public void add_last(E data)
    {
        NodoSimple<E> n = new NodoSimple(data);
        
        if(this.isEmpty())
        {
            this.head = n;
            this.tail = n;
            
        }
        else
        {
            this.tail.setNext(n);
            this.tail = n;
        }
        
        this.size +=1;    
    }
    
    public E remove_first()
    {
        if(!this.isEmpty())
        {
            NodoSimple<E> temp = this.head;
            this.head = temp.getNext();
            temp.setNext(null);
            this.size -=1;
            
            return temp.getData();
        }
        
        else
        {
            return null;
        }
    }
    
    public E remove_last()
    {
        if (this.size == 1)
        {
            return this.remove_first();
        }
        
        else if (this.size > 1)
        {
            NodoSimple<E> temp = this.tail;
            NodoSimple<E> anterior = this.head;
            
            while (anterior.getNext() != this.tail)
            {
                anterior = anterior.getNext();
            }
            
            anterior.setNext(null);
            this.tail = anterior;
            this.size -=1;
            
            return temp.getData();
        }
        
        else
        {
            return null;
        }
    }
}