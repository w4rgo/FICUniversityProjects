
package ejercicio8;

import ejercicio8.enemigos.Enemigo;
import ejercicio8.objetos.Objeto;
import java.util.ArrayList;
import java.util.Iterator;


public class Lugar {

    private String nombre;

    private ArrayList<Lugar> salidas = new <Lugar>ArrayList();
    private ArrayList<Objeto> objetos = new <Objeto>ArrayList();
    private boolean bloqueada = false;
    private Objeto objetoLlave = null;
    private Enemigo enemigo;
    private boolean esFinJuego=false;
    private String descripcion;

    Lugar(String nombre){
        this.nombre = nombre;
    }
    public void addSalida(Lugar salida) {
        salidas.add(salida);
    }
    
    public void addSalida(ArrayList<Lugar> salidas) {
        Iterator i = salidas.iterator();
        while(i.hasNext()) {
            this.salidas.add((Lugar)i.next());
        }
    }

    public ArrayList<Lugar> getSalidas() {
        return this.salidas;
    }

    public void setDescripcion(String desc) {
        this.descripcion = desc;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setObjetos(ArrayList<Objeto> objetos) {
        this.objetos.clear();
        Iterator i = objetos.iterator();
       while(i.hasNext()) {
            Objeto objeto = (Objeto) i.next();
            this.objetos.add(objeto);
    
        } 
    }

    public void addObjeto(Objeto objeto) {
        objetos.add(objeto);
    }
    public void delObjeto(Objeto objeto) {
        objetos.remove(objeto);
    }

    public ArrayList<Objeto> getObjetos() {
        return this.objetos;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esBloqueado() {
        return this.bloqueada;
    }

    public void bloquearLugar(Objeto llave) {
        this.bloqueada = true;
        this.objetoLlave = llave;
    }

    public Objeto getLlave() {
        return this.objetoLlave;
    }

    public boolean desbloquearLugar(Objeto llave) {

        if(llave.getNombre().compareTo(this.objetoLlave.getNombre())==0) {
            this.bloqueada = false;
            this.objetoLlave = null;
            return true;
        } else {
            
            return false;
        }
    }

    public void setNombre(String nombre) {
        this.nombre= nombre;
    }

    public boolean getEsFinJuego() {
        return this.esFinJuego;
    }

    public void setEsFinJuego() {
        this.esFinJuego = true;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
