
package ejercicio8.objetos;

import ejercicio8.Laberinto;
import ejercicio8.Personaje;


public class ObjetoValioso extends Objeto {

    private int quilates;
    public ObjetoValioso(String nombre,int quilates, int valor) {
        super(nombre,valor);
        this.quilates = quilates;
        

    }

    @Override
    public int getValor() {
       return quilates*super.getValor();
    }


    @Override
    public boolean usarObjeto(Personaje personaje, Laberinto laberinto) {
        return false ; 
    }
}
