
package ejercicio8.acciones;

import ejercicio8.Laberinto;
import ejercicio8.Personaje;

public abstract class Accion {

    private String resumen="";
    Personaje personaje;
    Laberinto laberinto;
    Accion(Personaje personaje, Laberinto laberinto) {
        this.personaje = personaje;
        this.laberinto = laberinto;
    }

    public Personaje getPersonaje() {
        return personaje;
    }
    public Laberinto getLaberinto() {
        return laberinto;
    }
    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
    public void setLaberinto(Laberinto laberinto){
        this.laberinto = laberinto;
    }
    public String getResumen() {
        return this.resumen;
    }
    public void addResumen(String cadena) {
        this.resumen = this.resumen + "\n" + cadena;
    }

    public abstract boolean ejecutar();
    @Override
    public abstract String toString();
}
