
package ejercicio8.acciones;

import ejercicio8.Laberinto;
import ejercicio8.Personaje;
import ejercicio8.enemigos.Enemigo;



public class Luchar extends Accion{

    private String nombre = "Luchar";
    private Enemigo enemigo;

    public Luchar (Personaje personaje,Laberinto laberinto) {
        super(personaje,laberinto);
    }

    @Override
    public boolean ejecutar() {
        boolean aux=false;
      if(this.getLaberinto().getLugarActual().getEnemigo()!=null) {
         enemigo = this.getLaberinto().getLugarActual().getEnemigo();
            aux = enemigo.pelear(personaje);
//            if(enemigo instanceof Mercader) {
//                aux = personaje.pelear((Mercader) enemigo);
//            } else if(enemigo instanceof Soldado) {
//                aux = personaje.pelear((Soldado) enemigo);
//            } else if(enemigo instanceof Jugador) {
//                aux=personaje.pelear((Jugador) enemigo);
//            } else if(enemigo instanceof Pirata) {
//                personaje.pelear((Pirata) enemigo);
//                 this.addResumen(personaje.getResumenUltimaPelea());
//
//                aux=false;
//            } else aux=false;
 this.addResumen(enemigo.getResumen());
            if(aux) {
               

                if(getLaberinto().getLugarActual().getEnemigo().getObjeto()!=null) {
                    this.getLaberinto().getLugarActual().addObjeto(laberinto.getLugarActual().getEnemigo().getObjeto());//suelta el objeto al suelo
                    this.addResumen("Ha caido un objeto! : " + laberinto.getLugarActual().getEnemigo().getObjeto());
                }
                this.getLaberinto().getLugarActual().setEnemigo(null);//Elimina al enemigo
                return aux;
            } else {
                return aux;
            }

        } else {
            this.addResumen("No hay con quien luchar!");
            return false;
        }


       

        //Personaje lucha, si gana true si pierde false.
       
    }


    public Enemigo getEnemigo() {
        return enemigo;
    }


    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    @Override
    public String toString() {
        return nombre;
    }




}

