
package ejercicio8.enemigos;

import ejercicio8.Personaje;
import ejercicio8.objetos.Objeto;
import ejercicio8.objetos.ObjetoValioso;
import java.util.Iterator;


public class Mercader extends Enemigo {

    ObjetoValioso objeto;

    public Mercader(String nombre,int energia, ObjetoValioso objeto) {
        super(energia,nombre);
        this.objeto = objeto;
    }
    @Override
    public int getAtaque() {
        return objeto.getValor();
    }

    @Override
    public boolean pelear(Personaje personaje) {
        int suma = 0;
        Iterator i = personaje.getInventario().iterator();
        while(i.hasNext())  {
            Objeto o = (Objeto) i.next();
            suma = o.getValor() + suma;

        }
        addResumen("Tus objetos suman: "+ suma);
        addResumen("El valor de su objeto es:" + getAtaque());
        if(suma>getAtaque()) {
            addResumen("Has humillado al mercader!");
            return true ;
        }
        else{
            addResumen("Debes buscar algun objeto valioso! has perdido la pelea");
            return false;
        }
    }
}
