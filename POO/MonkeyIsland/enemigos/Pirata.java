
package ejercicio8.enemigos;

import ejercicio8.Personaje;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Pirata extends Enemigo{
    
    HashMap<String,String> resvalidas = new HashMap<String,String>();

    public Pirata(String nombre,int energia,String[] preg, String [] res) {
        super(energia,nombre);
        for (int i=0;i<res.length;i++){
            resvalidas.put(preg[i],res[i]);


       }
    }

    @Override
    public int getAtaque() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int devolverNumeroInsultos(){
        int contador=0;
        Iterator it = resvalidas.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            contador++;
        }
        return contador;
    }

    public String insultar() {
        int auxF = (int) Math.floor( Math.random()*(devolverNumeroInsultos()) +1);
        int contador = 0;
        String insulto="";
        Iterator it = resvalidas.entrySet().iterator();
        Map.Entry e = null ;
        while (contador < auxF) {
            e = (Map.Entry)it.next();
            insulto=e.getKey().toString();
            contador++;
        }
        return insulto;
    }

    public boolean comprobarRespuesta(String insulto,String contrainsulto) {
           System.out.println(resvalidas);
           System.out.println("Insulto - " + insulto + " contrainsulto - " + contrainsulto);
        if(resvalidas.containsValue(contrainsulto)) {
            System.out.println("esta1");
            if (resvalidas.containsKey(insulto)){
                System.out.println("esta2");
                if(contrainsulto.compareTo(resvalidas.get(insulto))==0) return true;
                else return false;
            } else return false;
        }else return false;
    }

    public boolean contiene(String insulto){

        Iterator it = resvalidas.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            if (e.getKey().toString().matches(insulto)) return true;
        }
        return false;

    }



    public void pintar(){

        Iterator it = resvalidas.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("< "+e.getKey() +" >"+ " <" + e.getValue()+" >");
        }
    }

    @Override
    public boolean pelear(Personaje personaje) {


        personaje.setInsultosEnCurso(true);
        addResumen("Empieza la batalla de insultos. Pulsa 1 para comenzar.");//
        return false;

    }



}
