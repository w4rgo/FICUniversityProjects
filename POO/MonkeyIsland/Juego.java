
package ejercicio8;

import ejercicio8.acciones.*;
import ejercicio8.enemigos.*;
import ejercicio8.objetos.*;
import java.util.ArrayList;


public class Juego extends Observado{

    private Laberinto laberinto;
    private Estado estado = new Estado();
    private Personaje personaje;
    //para la batalla de insultos
    private boolean batallaEnCurso = false;
    private String insulto;
    private int puntosPersonaje=0;
    private int puntosEnemigo=0;


    public void finalizarJuego() {
        this.addPantalla("ENHORABUENA, TE HAS ACABADO EL JUEGO");
        this.estado.setFinDeJuego();
        notificar();
    }
    
    public void setEstado(Personaje personaje,Lugar lugar) {
        this.estado.setEnergia(personaje.getEnergia());
        if(personaje.getEnergia() <0) {
            estado.setFinDeJuego();
        }
        this.estado.setInventario(personaje.getInventario());

        this.estado.setSalidas(lugar.getSalidas());
        //this.estado.setPantalla(lugar.getDescripcion());

        this.estado.setLugarActual(lugar);


        notificar();
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setPantalla(String pantalla) {
        this.estado.setPantalla(pantalla);
        notificar();
    }

    public void addPantalla(String pantalla){
        this.estado.setPantalla(this.estado.getPantalla() + "\n\n" + pantalla);
        notificar();
    }
 
    public void inicializar() {

        //Insertamos el observador de la pantalla

        //Inicializamos unas respuestas iniciales;
        String[] preg= {"Hoy con brazo poderoso a 12 hombres he vencido...","Te voy a poner el brazo en cabestrillo.","Eres el bicho más feo que haya encontrado.","Ríos de sangre correrán después de esta batalla...","Peleas como un granjero!!!"};
        String[] resp= {"Al ver tamaña barriga diríase que te los has comido.","¿Por qué? ¿Estudias para enfermera?","Me asombra que nunca a tu mujer hayas mirado.","Menudo momento para que te venga la regla, quieres una toalla ?","Que apropiado!, tu lo haces como una vaca!."};
//        String[] preg= {"1","2","3","4","5"};
//        String[] resp= {"uno","dos","tres","cuatro","cinco"};
       //inicializo personaje
        personaje = new Personaje("Guybrush",100,resp); Arma arma = new Arma("Destructora",10,100);
        personaje.cojerObjeto(arma);
        personaje.equiparArma(arma);
       //Inicializo enemigos
       
        Arma arma2 = new Arma("Alfanje",9,90);
        Soldado conserje = new Soldado("Conserje",50,arma2);
        Jugador bufon = new Jugador("Bufon",50);
        Pirata pirata = new Pirata("pirata",100,preg,resp);
        Soldado lechuck = new Soldado("Lechuck",80,arma2);
        Mercader mercader = new Mercader("Mercader",60,new ObjetoValioso("Pirita",90,90));
        //inicializo los lugares

        Lugar lugar1 = new Lugar("Entrada");
        Lugar lugar3 = new Lugar("Almacen");
        Lugar lugar2 = new Lugar("Encruzijada");
        Lugar lugar4 = new Lugar("Cuarto oscuro");
        Lugar lugar5 = new Lugar("Sala columnas");
        Lugar lugar6 = new Lugar("Calabozo");
        Lugar lugar7 = new Lugar("Celda");
        lugar5.setEnemigo(pirata);
        Llave llave1 = new Llave("Llave",25,lugar5);
        Llave llave2 = new Llave("Talisman",25,lugar6);
        Llave llave3 = new Llave("Llave de Celda",25,lugar7);
        Pocion pocion = new Pocion("Pocion de Vida",40);
        lechuck.setObjeto(llave3);
        lugar6.setEnemigo(lechuck);
        pirata.setObjeto(llave2);
        lugar6.bloquearLugar(llave2);
        mercader.setObjeto(pocion);
        lugar1.addSalida(lugar2);
        lugar1.setEnemigo(mercader);
        lugar1.setDescripcion(lugar1.getNombre() + ":\n Entras en la cueva, la primera estancia es una gruta natural, \n "
                + "al fondo se ve una puerta, la cual da a una encruzijada. Tambien ves a un mercader ambulante, contando freneticamente"
                + "sus monedas de oro, te reta a ver quien tiene el objeto de mayor valor"
                + "Que deseas hacer?"
                );
        lugar2.setDescripcion(lugar2.getNombre() + ":\n Te encuentras en una encruzijada... elige tu camino");
        lugar2.addSalida(lugar1);
        lugar2.addSalida(lugar3);
        lugar2.addSalida(lugar4);
        lugar2.addSalida(lugar5);
        lugar3.addSalida(lugar2);
        lugar3.setEnemigo(conserje);
        conserje.setObjeto(llave1);
        lugar3.setDescripcion(lugar3.getNombre() + ":\n La puerta chirria, un olor nauseabundo se escapa de su interior, \n "
                + "miras a tu alrededor y te das cuenta de que en ese lugar se almacenaban alimentos, eso si hace tiempo \n"
                + "por que ahora es todo una plantacion de moho. De repente olles un ronquido, ves al conserje dormido con una"
                + "llave colgando del pecho...");
        lugar4.addSalida(lugar2);
        lugar4.setDescripcion("Abres la puerta, esta todo a oscuras, al fondo de la estancia ves un destello, la tenue luz del \n"
                + "candil de la encruzijada, se refleja en una pequeña botella que contiene un liquido del color de la sangre."
                + "Cuando te acercas para cojerla, visto y no visto aparece un extraño vestido de bufón. Te propone un juego para vencerle.");
        lugar4.setEnemigo(bufon);
        bufon.setObjeto(new ObjetoValioso("Diamante",100,100));
        lugar5.setDescripcion(lugar4.getNombre() + ":\nLa puerta se abre con un gemido muy agudo, se nota que hace tiempo\n "
                + "que nadie la engrasa, miras a tu alrededor y la sorpresa es grande, a diferencia de las sucias estancias\n"
                + "por las que has pasado, esta es diferente, el techo se alza inalcanzable, incluso para un gigante,\n hileras"
                + "de enormes columnas se extienden ante ti. Al fondo se vislumbra una puerta, con un agujero en el medio a modo de "
                + "cerradura, del tamaño de un 'TALISMAN' \nEscuchas un crujido a tu espalada, te giras nervioso."
                + "\nTu cara es todo un poema, desencajada con un gesto de entre miedo, sorpresa e incredulidad."
                + "\nVarios esqueletos se acercan hacia ti arrastrando diversas armas, cada cual mas grotesca..."
                + "\nLa sorpresa es mas grande aun, cuando el cabecilla de los esqueletos,llamado Murray, un antiguo corsario presa de una maligna"
                + "maldicion Voodoo, te reta a una Batalla de Insultos!");
        lugar5.addSalida(lugar2);
        lugar5.addSalida(lugar6);
        lugar5.bloquearLugar(llave1);
        lugar6.setDescripcion(lugar6.getNombre() + ":\n"
                + "Desciendes por una oscura y mugrienta escalera de caracol, hacia lo que parecen ser los calabozos."
                + "Olles unos gritos de mujer provenir del fondo, y acto seguido son respondidos por una fantasmal"
                + "carcajada , salida de la garganta del Temido Pirata Fantasma Lechuck!."
                + "\nLechuck: Bienvenido pequeño saltamontes, si deseas salvar a tu chica, antes deberas probar mi espada!!");
        lugar6.addSalida(lugar5);
        lugar6.addSalida(lugar7);
        lugar7.bloquearLugar(llave3);
        lugar7.addSalida(lugar6);
        lugar7.setDescripcion(lugar7.getNombre() + ":\n Te encuentras en una celda de espacio reducido, cuyo unico mueble, es "
                + "una andrajosa cama que cuelga de dos cadenas de la pared. Escuchas un grito de alegria: ERES TU!!!Has venido a rescatarme!!!"
                + "Una bella mujer se echa a tus brazos, y comienzas a caminar hacia la salida."+
                "\n Has rescatado a tu Amada en peligro!!. ");
        lugar7.setEsFinJuego();
        ArrayList<Lugar> lugares = new <Lugar>ArrayList();
        lugares.add(lugar1);lugares.add(lugar2);lugares.add(lugar3);lugares.add(lugar4);lugares.add(lugar5);lugares.add(lugar6);
        lugares.add(lugar7);
        laberinto = new Laberinto(lugares);
    }

    public void jugar() {
        setEstado(personaje,laberinto.getLugarActual());
        setPantalla(laberinto.getLugarActual().getDescripcion());
    }

    public void entablarBatallaInsultos(int numInsulto, Pirata enemigo){
        String respuesta = personaje.getInsultoPorNum(numInsulto);
        if(enemigo.comprobarRespuesta(insulto,respuesta)) {
            puntosPersonaje = puntosPersonaje+ 1;
            setPantalla("Acertaste! llevas " + puntosPersonaje + "puntos!");
        } else {
            puntosEnemigo = puntosEnemigo + 1;
            setPantalla("Fallaste! lleva " + puntosEnemigo + "puntos tu enemigo!");
        }         
        insulto = enemigo.insultar();
        addPantalla(insulto + "\n---------------\n" + personaje.crearResumenInsultos());
        if(puntosPersonaje ==3){
            setPantalla("Ganaste la batalla de insultos!.");
            this.batallaEnCurso=false;
            this.personaje.setInsultosEnCurso(false);
            if(laberinto.getLugarActual().getEnemigo().getObjeto()!=null) {
                laberinto.getLugarActual().getObjetos().add(laberinto.getLugarActual().getEnemigo().getObjeto());
                addPantalla("Ha caido un: " + laberinto.getLugarActual().getEnemigo().getObjeto().toString());
                setEstado(personaje,laberinto.getLugarActual());
            }
            this.laberinto.getLugarActual().setEnemigo(null);
       } else if(puntosEnemigo ==3) {
            setPantalla("Perdiste la batalla de insultos!.");
            this.batallaEnCurso=false;
            this.personaje.setInsultosEnCurso(false);
            this.personaje.restarEnergia(20);
            setEstado(personaje,laberinto.getLugarActual());
      }
}

    public void recibirOrden(String [] orden) {

        String accion = orden[0];
        String objetivo = orden[1];
        Accion action = null;

        if(!this.estado.getFinDeJuego()){
            if(!personaje.esInsultosEnCurso()) {
                if(accion.compareTo("Ir")==0) { //------- IR
                    if(objetivo.compareTo("")==0)setPantalla("Debes indicar a donde Ir.");
                    else {
                        action = new Ir(personaje,laberinto,objetivo);
                        if(laberinto.getLugarActual().getEsFinJuego()) {
                            this.estado.setFinDeJuego();

                        }
                    }
                } else if(accion.compareTo("Luchar") ==0) { //------------------LUCHAR
                    if(objetivo.compareTo("")!=0) setPantalla("Escribe tan solo Luchar");
                    else {
                         action = new Luchar(personaje,laberinto);

                    }
                }else if(accion.compareTo("Cojer") ==0) { //------ Cojer
                        if (objetivo.compareTo("")==0) setPantalla("E-Debes escribir el nombre de un objeto.");
                            else {
                                 action = new Coger(personaje,laberinto,objetivo);
                            }
                } else if(accion.compareTo("Usar")==0 ) { //------ USAR
                    if(objetivo.compareTo("") ==0) setPantalla("Selecciona un objeto para usar.");
                    else {
                        action = new Usar(personaje,laberinto,objetivo);

                    }
               } else if(accion.compareTo("Mirar") == 0) {
                    if(objetivo.compareTo("")!=0) setPantalla("Escribe Mirar a secas para echar un vistazo a la estancia");
                    else {
                        action = new Mirar(personaje,laberinto);
                    }
               }else this.setPantalla("Esa accion no existe.");

                if(action!=null) {
                    if(action.ejecutar()){
                        setEstado(action.getPersonaje(),action.getLaberinto().getLugarActual());
                        setPantalla(action.getResumen());
                    } else setPantalla(action.getResumen());
                }

      } else {
            //Batalla de insultos.
             if(objetivo.matches("") && (accion.length()==1)) {
                int max = personaje.getContrainsultos().length;
                int c = (int) accion.charAt(0);

                Pirata pirata = (Pirata) laberinto.getLugarActual().getEnemigo();
                if( (c >=49) && (c<= 49+max-1)) {
                    if(batallaEnCurso) {//Resto de rondas
                        int num = c -48;
                           entablarBatallaInsultos(num,pirata);
                    } else if(c==49) {
                        //Primera Ronda
                        batallaEnCurso=true;
                        puntosPersonaje = 0;
                        puntosEnemigo = 0;
                        insulto = pirata.insultar();
                        setPantalla(insulto + "\nOpciones:\n" + personaje.crearResumenInsultos());
                    }
                    else setPantalla("Pulsa 1!!!!");
                } else {
                    setPantalla("Debe ser un numero del 1 al " + max + "\n" +  personaje.crearResumenInsultos()); 
                }
            }
         }
     }else setPantalla("EL JUEGO ESTA TERMINADO, REINICIALO PARA VOLVER A JUGAR");

    }
}
