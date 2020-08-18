package edu.escuelaing.arep.LinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import edu.escuelaing.arep.LinkedList.Node;

/**
 * Implementacion de una LinkedList 
 * 
 * @author Diego23p
 */
public class LinkedList<T> implements List<T> {
    
    int size;
    Node head;
    
    /**
     * Constructor de una lista vacia
     */
    public LinkedList(){
        size=0;
        head=null;
    }
    
    /**
     * Adiciona un dato o nodo a la lista
     * @param data dato a insertar en la lista
     * @return True
     */
    public boolean add(T data) {
        if(head == null){
            head=new Node<T>(data,null);
            size+=1;
            return true;
        } 
        else {
           Node<T> tmp = head;
           while(tmp.getNext() != null) {
        	   tmp = tmp.getNext();
           }
           tmp.setNext(new Node<T>(data, null));
           size+=1;
           return true;
        }
    }
    
    /**
     * Quita un nodo dado el indice
     * @param index indice a remover de la lista
     * @return El objeto removido
     */
    public T remove(int index) {
        if (head==null) return null;
        if (index>=size) return null; 
        
        Node<T> tmp = head;
        Node<T> prev = null;
        for (int i=0;i<index;i++){
            prev=tmp;
            tmp=tmp.getNext();
        }
        prev.setNext(tmp.getNext());
        size-=1;
        return tmp.getData();
    }
    
    /**
     * Remueve el objeto dado
     * @param o Objeto a remover de la lista
     * @return True si el objeto fue removido, False si no fue posible eliminarlo
     */
    public boolean removeForObject(Object o) {
        if (head==null) return false;
        
        if (head.getData().equals(o)){
            head=head.getNext();
            return true;
        }
        
        Node<T> tmp = head;
        Node<T> prev = null;
        while (tmp!=null && !tmp.getData().equals(o)){
            prev=tmp;
            tmp=tmp.getNext();
        }
        
        if (tmp==null) return false;
        
        prev.setNext(tmp.getNext());
        size-=1;
        
        return true;
        
    }
    
    /**
     * Retorna un iterador para la lista
     * @return El iterador de la lista
     */
    public Iterator<T> iterator() {
         return new Iterator<T>() {

            Node<T> tmp = head;

            public boolean hasNext() {
                return tmp != null;
            }

            public T next() {
                T data = tmp.getData();
                tmp = tmp.getNext();
                return data;
            }
        };
    }
    
    /**
     * Retorna el tamano de la lista
     * @return El tamano de la lista
     */
    public int size() {
        return size;
    }
    
    /**
     * Retorna un boleano respondiendo si la lista esta o no vacia
     * @return True si la lista esta vacia, False si no
     */
    public boolean isEmpty() {
        if (size==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Retorna un objeto de la lista dado su indice
     * @return Un objeto de la lista
     */

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Iterator<T> iterator = iterator();
        for (int i=0;i<index;i++){
            iterator.next();
        }
        return iterator.next();
    }
    
    public String print(){
        String lh="";
        Node<T> tmp = head;
        while(tmp.getNext() != null){
            lh=lh+" "+tmp.getData();
            tmp = tmp.getNext();
        } 
         lh=lh+" "+tmp.getData();
         return lh;
    }

    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public T set(int index, T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(int index, T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
