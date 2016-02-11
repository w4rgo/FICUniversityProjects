
package ejercicio8.acciones;

import ejercicio8.Laberinto;

import ejercicio8.Personaje;

import ejercicio8.objetos.Objeto;
import java.util.Iterator;


public class Coger extends Accion{

    private String nombre = "Cojer";
    private String objetivo;

    public Coger (Personaje personaje,Laberinto laberinto,String objetivo) {
        super(personaje,laberinto);
        this.objetivo = objetivo;
    }

    @Override
    public boolean ejecutar() {
        if(!laberinto.getLugarActual().getObjetos().isEmpty()){
            Iterator i = laberinto.getLugarActual().getObjetos().iterator();
            boolean esta =false;
            Objeto objetoEncontrado = null ;
            while(i.hasNext()){
                Objeto objeto =(Objeto) i.next();
                if(objetivo.compareTo(objeto.toString())==0) {
                    objetoEncontrado=objeto;
                    esta =true;
                }
            }
            if (esta) {                //-----
                if(this.getLaberinto().getLugarActual().getObjetos().contains(objetoEncontrado)) {
                    personaje.cojerObjeto(objetoEncontrado);
                    this.getLaberinto().getLugarActual().delObjeto(objetoEncontrado);
                    this.addResumen("Has cojido : " + objetoEncontrado.getNombre());
                    return true;
                } else {
                    this.addResumen ("No habia ningun objeto con ese nombre.");
                    return false;
                }
            }  else {
                this.addResumen("El objeto "+ objetivo+" no esta aqui.");
                return false;
            }
       //Personaje lucha, si gana true si pierde} false.
        } else {
            this.addResumen("No hay objetos en esta sala.");
            return false;
        }
    }
    @Override
    public String toString() {
        return nombre;
    }




}