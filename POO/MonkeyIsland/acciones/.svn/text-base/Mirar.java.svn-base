package ejercicio8.acciones;
import ejercicio8.Laberinto;
import ejercicio8.Personaje;
import java.util.Iterator;


public class Mirar extends Accion{

    private String nombre = "Mirar";


    public Mirar (Personaje personaje,Laberinto laberinto) {
        super(personaje,laberinto);
    }


    @Override
    public boolean ejecutar() {
        this.addResumen(laberinto.getLugarActual().getDescripcion());
        Iterator i = laberinto.getLugarActual().getObjetos().iterator();
        String aux = "";
        this.addResumen("-----------------\nObjetos en este lugar:");
        while(i.hasNext()) {
            aux = aux + " - " + i.next().toString();

        }this.addResumen(aux);
        if(laberinto.getLugarActual().getEnemigo()!=null) {
        this.addResumen("-----------------\nEnemigos en este lugar:");
        this.addResumen(laberinto.getLugarActual().getEnemigo().getNombre());}
        

        return true;

    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
