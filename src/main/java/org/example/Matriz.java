package org.example;

public class Matriz <T>{
    Object[][] matriz;
    T t;

    public Matriz(int filas, int columnas) {
        this.matriz = new Object [filas][columnas];

    }
    public void set (int filas, int columnas, Object o){
        this.matriz[filas][columnas] = o;
    }
    public T get (int filas, int columnas){
        T resultado = (T)this.matriz[filas][columnas];
        return resultado;
    }
    public int filas (){
        return this.matriz.length;
    }
    public int columnas(){

        return matriz[0].length;
    }
}
