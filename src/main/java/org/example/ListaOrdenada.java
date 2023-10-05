package org.example;

import java.util.Collections;
import java.util.LinkedList;

public class ListaOrdenada<E extends Comparable<E>> {
    LinkedList<E> ListaOrdenada;
    E e;

    public ListaOrdenada() {
        ListaOrdenada = new LinkedList<>();
    }
    public void add (E o){
        ListaOrdenada.add(o);
        Collections.sort(ListaOrdenada);
    }
    public E get (int index){
        return ListaOrdenada.get(index);
    }
    public int size(){
        return ListaOrdenada.size();
    }
    public boolean isEmpty(){
        return ListaOrdenada.isEmpty();
    }
    public boolean remove(E o){
        Collections.sort(ListaOrdenada);
        return ListaOrdenada.remove(o);

    }
    public int indexOf(E o){
        return ListaOrdenada.indexOf(o);
    }

    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "ListaOrdenada=" + ListaOrdenada.toString() +
                '}';
    }
}
