
package ejercicio8.acciones;

import ejercicio8.Laberinto;
import ejercicio8.Personaje;
import ejercicio8.objetos.Objeto;


public class Usar extends Accion{

    private String nombre = "Usar";
    private String objeto = "";

    public Usar (Personaje personaje,Laberinto laberinto,String objeto) {
       super(personaje,laberinto);
       this.objeto = objeto;

    }



    @Override
    public boolean ejecutar() {

        Objeto objeto = personaje.buscarObjeto(this.objeto);
        if(objeto == null) {
            this.addResumen("No tienes dicho objeto.");
            return false;     
        } else {
            objeto.usarObjeto(personaje, laberinto);
            this.addResumen(objeto.getResumen());
            return true;
        }

         
    }



    @Override
    public String toString() {
        return this.nombre;
    }


}

