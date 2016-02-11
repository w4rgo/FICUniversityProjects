
package ejercicio8.acciones;

import ejercicio8.Laberinto;
import ejercicio8.Lugar;
import ejercicio8.Personaje;
import java.util.Iterator;


public class Ir extends Accion{

    private String nombre = "IR";
    private String lugar;

    public Ir (Personaje personaje,Laberinto laberinto,String lugar) {
        super(personaje,laberinto);
        this.lugar = lugar;
    }

    @Override
    public boolean ejecutar() {
            Iterator i = this.getLaberinto().getLugarActual().getSalidas().iterator();
            Lugar lugarEncontrado = null;
            boolean esta= false;
            while(i.hasNext()) {
                Lugar lugarObjetivo = (Lugar) i.next();
                if(lugar.compareTo(lugarObjetivo.toString())==0 ) {
                    lugarEncontrado = lugarObjetivo;
                    esta = true;
                    }
                }
            if (esta) {
                //Con el lugar encontrado en las posibles salidas de una habitacion
                //compruebo que no requiere llave
                if(lugarEncontrado.esBloqueado()) {
                    this.addResumen("La entrada requiere una llave...");
                    return false;
                }
                else {
                    if(this.getLaberinto().setLugarActual(lugarEncontrado)) {
            
                        this.addResumen(lugarEncontrado.getDescripcion());
                        return true;
                    }
                    else {
                        this.addResumen("El lugar " + lugar + " no existe, debes estar equivocado...");
                        return false;
                    }
                    //establecemos el lugar actual con el encontrado
                }
            } else {
                this.addResumen("El lugar " + lugar + " no existe, debes estar equivocado...");
                return false;
            }






    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
