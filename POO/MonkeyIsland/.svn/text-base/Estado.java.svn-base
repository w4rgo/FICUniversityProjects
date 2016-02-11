package ejercicio8;


import ejercicio8.objetos.Objeto;
import java.util.ArrayList;
import java.util.Iterator;


public class Estado {

    private int energia=0;
    private ArrayList <Objeto> inventario=new ArrayList<Objeto>();
    private ArrayList <Lugar> salidas=new ArrayList<Lugar>();
    private ArrayList acciones = new ArrayList();
    private String pantalla="";
    private Lugar lugarActual= null;
    private boolean finDeJuego=false;

    Estado () {
       
        acciones.add("Usar");
        acciones.add("Ir");
        acciones.add("Luchar");
        acciones.add("Cojer");
        acciones.add("Mirar");

        
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setFinDeJuego() {
        this.finDeJuego = true;
    }

    public boolean getFinDeJuego() {
        return this.finDeJuego ;
    }

    public ArrayList <Objeto> getInventario() {
        return inventario;
    }

    public ArrayList <Lugar> getSalidas() {
        return salidas;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public void setInventario(ArrayList <Objeto> inventario) {
        this.inventario.clear();
        Iterator i = inventario.iterator();
        while(i.hasNext()) {
            this.inventario.add((Objeto) i.next());
        }
        
    }

    public void setSalidas(ArrayList <Lugar> salidas) {
         this.salidas.clear();
        Iterator i = salidas.iterator();
        while(i.hasNext()) {
            this.salidas.add((Lugar) i.next());
        }
    }

    public void setAcciones(ArrayList  Acciones) {
        this.acciones.clear();
        Iterator i = acciones.iterator();
        while(i.hasNext()) {
            this.acciones.add( i.next());
        }
    }

    public ArrayList getAcciones() {
        return acciones;
    }

    public void setLugarActual(Lugar lugar) {
        this.lugarActual = lugar;
    }

    public Lugar getLugarActual() {
        return this.lugarActual;
    }

}
