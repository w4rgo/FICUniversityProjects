
package ejercicio8.enemigos;

import ejercicio8.Personaje;
import ejercicio8.objetos.Objeto;

public abstract class Enemigo {
    private Objeto objeto;
    private int energia;
    private String nombre;
    private String resumen="";

    public Enemigo(int energia,String nombre){
        this.energia = energia;
        this.nombre = nombre;
    }

    public abstract int getAtaque();

    public abstract boolean pelear(Personaje personaje);

    public void restarEnergia(int dano) {
        this.energia=this.energia - dano;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEnergia() {
        return this.energia;
    }

    public Objeto getObjeto() {
        return this.objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public String getResumen() {
        String res = this.resumen;
        this.resumen="";
            return res;
    }

    public void addResumen(String cadena) {
        this.resumen = this.resumen + "\n" + cadena;
    }

    
}
