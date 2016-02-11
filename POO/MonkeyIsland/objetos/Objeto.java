
package ejercicio8.objetos;

import ejercicio8.Laberinto;
import ejercicio8.Personaje;

public abstract class Objeto {

    private String nombre;
    private int valor;
    private String resumen ="";
    public Objeto(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    public String getNombre() {
        return nombre;
    }
    public int getValor() {
        return valor;
    }
    public String getResumen() {
        return this.resumen;
    }
   public void addResumen(String cadena) {
        this.resumen = this.resumen + "\n" + cadena;
    }
    public abstract boolean usarObjeto(Personaje personaje,Laberinto laberinto);


    @Override
    public String toString() {
        return this.nombre;
    }
    
}

