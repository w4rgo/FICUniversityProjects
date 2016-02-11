package ejercicio8.objetos;

import ejercicio8.Laberinto;
import ejercicio8.Lugar;
import ejercicio8.Personaje;

public class Pocion extends Objeto{

    public Pocion(String nombre,int valor) {
        super(nombre,valor);
        
    }

    public Lugar getLugar() {
        return this.getLugar();
    }


    @Override
    public boolean usarObjeto(Personaje personaje, Laberinto laberinto) {

        if(personaje.getEnergia()<personaje.getMaxEnergia()) {

          
            //tiene la hp baja se puede curar
            int hpRecuperada = 0 ;
            if(this.getValor() + personaje.getEnergia() > personaje.getMaxEnergia()) {

                  System.out.println("Entra");
                hpRecuperada = personaje.getMaxEnergia()-personaje.getEnergia();
                personaje.setEnergia(personaje.getMaxEnergia());
                this.addResumen("Te bebes la pocion, una mueca de asco se dibuja en tu cara, pero enseguida notas bienestar."
                + "\nHas recuperado " + hpRecuperada);
                personaje.getInventario().remove(this);
                return true;
            }
            else {

                  System.out.println(personaje.getMaxEnergia());
                hpRecuperada = this.getValor();
                personaje.setEnergia(this.getValor()+ personaje.getEnergia());
                this.addResumen("Te bebes la pocion, una mueca de asco se dibuja en tu cara, pero enseguida notas bienestar."
                + "\nHas recuperado " + hpRecuperada);
                personaje.getInventario().remove(this);
                return true;
            }
        } else{
            this.addResumen( "No te hace falta esta pocion...");
            return false;
        }

    }


}
