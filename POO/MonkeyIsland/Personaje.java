package ejercicio8;

import ejercicio8.enemigos.Enemigo;
import ejercicio8.objetos.Objeto;
import ejercicio8.objetos.Arma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Personaje {
    private String[] contrainsultos;
    private final int maxEnergia ;
    private HashMap<String,ArrayList> incorrectas= new HashMap<String, ArrayList>();
    private HashMap<String,String> correctas= new HashMap<String,String>();
    private ArrayList<Objeto> inventario= new ArrayList<Objeto>();
    private Arma arma;
    private int energia;
    private String nombre="Guy";
    private String resumen;
    private boolean insultosEnCurso=false;

    public Personaje(String nombre, int energia,String [] respuestas) {
        this.energia = energia;
        this.maxEnergia = energia;
        this.nombre = nombre;
        contrainsultos = new String [respuestas.length];
        for(int i = 0; i< respuestas.length;i++) {
            ArrayList<String> descartadas = new ArrayList<String>();
            contrainsultos[i] = respuestas[i];
            incorrectas.put(respuestas[i], descartadas);

        }
    }

    public boolean esInsultosEnCurso() {
        return insultosEnCurso;
    }
    public void setInsultosEnCurso(boolean aux) {
        insultosEnCurso = aux;
    }
    public String getInsultoPorNum(int num) {
        System.out.println(contrainsultos.length);
        if(contrainsultos.length>= num) return contrainsultos[num-1];
        else return "";
    }
    public int getAtaque() {
        return arma.getPoder() ;
    }
    public String crearResumenInsultos (){
        String res ="";
            for(int i = 0; i < contrainsultos.length;i++) {
                res = res + (i+1) +"- " + contrainsultos[i] + "\n";
            }
        return res;
    }

    public String [] getContrainsultos() {
        return this.contrainsultos;
    }

    public int getMaxEnergia() {
        return this.maxEnergia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
     public Objeto buscarObjeto(String objetivo) {

        Iterator i = inventario.iterator();
        Objeto objetoEncontrado = null ;
        while(i.hasNext()){
            Objeto objeto =(Objeto) i.next();
            if(objetivo.compareTo(objeto.toString())==0) {
                objetoEncontrado=objeto;
            }
        }
       return objetoEncontrado;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setInventario ( ArrayList<Objeto> inv) {
        while(inv.iterator().hasNext()) {
            Objeto objeto = inv.iterator().next();
            this.inventario.add(objeto);
        }
    }

    public ArrayList<Objeto> getInventario() {
        return this.inventario;
    }


    public int getEnergia() {
        return energia;
    }
    public void restarEnergia(int dano) {
        this.energia=this.energia - dano;
    }

    public void cojerObjeto(Objeto objeto) {
        this.inventario.add(objeto);

    }
    public void dejarObjeto(Objeto objeto) {
        this.inventario.remove(objeto);
    }

    public boolean pelear(Enemigo enemigo) {
        return enemigo.pelear(this);
    }

    public boolean equiparArma(Arma arma) {
        this.arma = arma;
        return true;
    }


    //Parte Batalla de insultos
    
    public String responder(String insulto) {
        boolean respondida=false;
      HashMap<String,ArrayList> respuestasrestantes= incorrectas;
      ArrayList a=null;
      Map.Entry e=null;

        if(correctas.containsKey(insulto)) {
            return correctas.get(insulto);
        }else{
            while(!respondida) {
                int rand = (int) Math.round( Math.random()*contrainsultos.length );
  
                int contador=0;

                Iterator it = respuestasrestantes.entrySet().iterator();
                    while (contador <= rand && it.hasNext()) {
                        contador++;
                        e = (Map.Entry)it.next();
                        a= (ArrayList) e.getValue();
                    }
 
                        if (a!=null){
                            if(a.contains(insulto)) {
                                respuestasrestantes.remove(e.getKey().toString());
                                respondida=false;
                            } else {
                                respondida=true;
                                return e.getKey().toString();
                            }
                        }else{respondida=true;
                              return e.getKey().toString();
                            }
                   
            }

        }
        return null;
    }

    public void aprender(String insulto,String contrainsulto) {
        correctas.put(insulto, contrainsulto);
    }

    public void descartar(String insulto,String contrainsulto) {
        ArrayList<String> descartadas = new ArrayList<String>(contrainsultos.length-1);
        Iterator it = incorrectas.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry e = (Map.Entry)it.next();

                if(e.getKey().toString().matches(contrainsulto)) {
                    descartadas = (ArrayList) e.getValue();
                    if (descartadas.contains(insulto)){}else{
                        descartadas.add(insulto);
                        e.setValue(descartadas);}
                }

                }
    }

    public String getResumenUltimaPelea() {
        return this.resumen;
    }
}
