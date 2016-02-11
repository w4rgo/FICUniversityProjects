package ejercicio8.objetos;

import ejercicio8.Laberinto;
import ejercicio8.Lugar;
import ejercicio8.Personaje;
import java.util.Iterator;

public class Llave extends Objeto{


    private Lugar lugar;
    
    public Llave(String nombre,int valor,Lugar lugar) {
        super(nombre,valor);
        this.lugar = lugar;
    }

    public Lugar getLugar() {
        return this.getLugar();
    }

    @Override
    public boolean usarObjeto(Personaje personaje, Laberinto laberinto) {
        if(lugar.esBloqueado()) {
             Iterator i = laberinto.getLugarActual().getSalidas().iterator() ;
             boolean esta = false;
             while(i.hasNext()) {
                 Lugar lugarEncontrado = (Lugar) i.next();
                 if(lugar.getNombre().compareTo(lugarEncontrado.getNombre()) == 0) esta = true;

             }
             if(esta) {
                 if(lugar.desbloquearLugar(this)) {
                    this.addResumen(lugar.toString() + " ha sido abierto!");
                    personaje.getInventario().remove(this);
                     return true;
                 }
                 else {
                      this.addResumen(lugar.toString() + " no se ha podido abrir!");
                     return false;
                 }//no abrio
            } else {

                 this.addResumen("En esta estancia no hay nada que abrir con esta llave");
                 return false;
            }
         }
         else {
             this.addResumen(lugar.toString() + " ya esta abierto!");
            return true;
         }//esta abierto
    }




}
