package org.example;

import java.util.LinkedList;

public class Pila<T> {
    private T t;
    LinkedList<T> pila;

    public Pila() {
        this.pila = new LinkedList<>();
    }
    public  boolean estaVacia(){
        if (this.pila.isEmpty()) {
            return true;
        }else{
            return false;
        }

    }
    public T extraer(){
        T extraido = this.pila.getLast();
        this.pila.remove(extraido);
        return extraido;
    }
    public T primero(){
        return this.pila.getLast();
    }
    public void anadir(T t){
        this.pila.push(t);
    }

    @Override
    public String toString() {
        return this.pila.toString();
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public LinkedList<T> getPila() {
        return pila;
    }

    public void setPila(LinkedList<T> pila) {
        this.pila = pila;
    }
}
