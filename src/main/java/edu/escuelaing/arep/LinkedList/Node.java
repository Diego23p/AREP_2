package edu.escuelaing.arep.LinkedList;

/**
 * Implementacion de un nodo perteneciente a una LinkedList
 * @author Diego23p
 */
public class Node<E> {
	
	private E data;
    private Node<E> next;
    
    /**
     * Constructor para un nodo con los datos y el nodo siguiente dados
     * @param data informacion del nodo actual
     * @param next informacion del nodo contiguo en la linkedList
     */
    public Node (E data, Node<E> next){
        this.data=data;
        this.next=next;
    }
    
    /**
     * Cambia el valor del nodo contiguo
     * @param next Nuevo nodo siguiente
     */
    public void setNext(Node<E> next){
        this.next=next;
    }
    
    /**
     * Cambia el valor de un nodo
     * @param data Nuevo dato 
     */
    public void setData(E data){
        this.data=data;
    }
    
    /**
     * Retorna el siguiente nodo
     * @return Siguente Nodo
     */
    public Node<E> getNext(){
        return next;
    }
    
    /**
     * Retorna el dato del nodo actual
     * @return informacion del nodo
     */
    public E getData(){
        return data;
    }

}
