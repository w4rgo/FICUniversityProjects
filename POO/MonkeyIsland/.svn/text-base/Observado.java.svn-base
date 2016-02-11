
package ejercicio8;

import java.util.ArrayList;
import java.util.Iterator;

public class Observado {

    ArrayList <Observador> lista = new ArrayList<Observador>();

    public void insertar(Observador observer){
        lista.add(observer);
    }
    public void eliminar(Observador observer) {
        if (lista.contains(observer)) lista.remove(observer);
    }

    public void notificar() {

        Iterator i = lista.iterator();

        while(i.hasNext()) {
            Observador observer =(Observador) i.next();
            observer.actualizar();
        }

    }


}