package ejercicio8.enemigos;

import ejercicio8.Personaje;
import ejercicio8.objetos.Arma;

public class Soldado extends Enemigo {

    
    private Arma arma;
    public Soldado(String nombre,int energia,Arma arma){

        super(energia,nombre);
        this.arma = arma;

    }
    @Override
    public int getAtaque() {
        return arma.getPoder() ;
    }

    public boolean pelear(Personaje personaje) {
        addResumen("Comienza la batalla: ");
        addResumen(getNombre() +":\n" +"->  Ataque: "+getAtaque()+ " Energia: "+getEnergia()
                + "\n" + this.getNombre() + ":\n"+"->  Ataque: "+arma.getPoder()+ " Energia: " + getEnergia()
                +"----------------------------------");
        while((personaje.getEnergia()>0)&&(getEnergia()>0)) {

            personaje.restarEnergia(getAtaque());
            addResumen(getNombre()+" ataca! -> " + getAtaque() + " de daño!"
                    + "\n Te queda " + getEnergia() + " de energia.");
            this.restarEnergia(personaje.getAtaque());
            addResumen(getNombre()+" ataca! -> " + arma.getPoder() + " de daño!"
                    + "\n Le queda " + getEnergia() + " de energia.");
        }
        if (personaje.getEnergia()<0) { //muerto
           addResumen("RIP... ESTAS MUERTO....");
           addResumen("Reinicia el juego para volver a empezar");
            return false;
        } else return true;
    }




}
