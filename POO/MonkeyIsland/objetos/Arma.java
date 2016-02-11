package ejercicio8.objetos;

import ejercicio8.Laberinto;
import ejercicio8.Personaje;

public class Arma extends Objeto{

    private int poder;
    private int valor;
    public Arma(String nombre,int poder,int valor) {
        super(nombre,valor);
        this.poder = poder;

    }

    public int getPoder() {
        return this.poder;
    }

    @Override
    public boolean usarObjeto(Personaje personaje, Laberinto laberinto) {
        personaje.equiparArma(this);
        this.addResumen(this.getNombre() + " ha sido equipada como arma!");
        this.addResumen("Ahora tienes " + this.poder + " de poder!");
        return true;
    }


}
