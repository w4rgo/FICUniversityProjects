package ejercicio8;

import ejercicio8.acciones.Accion;
import ejercicio8.objetos.Objeto;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;

public class Interfaz extends javax.swing.JFrame implements Observador {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textPantalla = new javax.swing.JTextPane();
        textEnergia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textInventario = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        textSalidas = new javax.swing.JList();
        botonOk = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        textPrompt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAcciones = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(textPantalla);

        textEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEnergiaActionPerformed(evt);
            }
        });

        textInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textInventarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(textInventario);

        textSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSalidasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(textSalidas);

        botonOk.setText("OK");
        botonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOkActionPerformed(evt);
            }
        });
        botonOk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonOkKeyPressed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        textPrompt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPromptActionPerformed(evt);
            }
        });

        jLabel1.setText("Energía:");
        jLabel1.setOpaque(true);

        jLabel2.setText("Inventario:");
        jLabel2.setOpaque(true);

        jLabel3.setText("Lugares");

        textAcciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textAccionesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(textAcciones);

        jLabel4.setText("Acciones:");

        jLabel5.setText("Pantalla:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textEnergia)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textPrompt, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonOk, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOk)
                    .addComponent(textPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-----------


   private String accion="";
   private String objetivo="";
    private void textEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEnergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEnergiaActionPerformed

    private void botonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOkActionPerformed

        this.textPantalla.setText(this.textPantalla.getText() + "\n"+ this.textPrompt.getText() );
        String [] prompt = this.textPrompt.getText().split(" ",2);
     
        if(prompt.length ==0) this.textPantalla.setText(this.textPantalla.getText() + "\n" + "Debes introducir una orden.");
        else {
            if(prompt.length == 1) {

                accion = prompt[0];

                if(accion.compareTo("") ==0) this.textPantalla.setText(this.textPantalla.getText() + "\n" + "Debes introducir una orden.");


            } else if(prompt.length == 2) {
                accion = prompt[0];
                objetivo = prompt[1];
            }
        }
        
        String [] ordenes = {accion,objetivo};
        juegoEnCurso.recibirOrden(ordenes);
        
        textPrompt.setText("");
        accion = "";
        objetivo = "";



    }//GEN-LAST:event_botonOkActionPerformed

    private void textInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textInventarioMouseClicked
        this.textPrompt.setText(this.textPrompt.getText()+" " + textInventario.getSelectedValue().toString());
    
    }//GEN-LAST:event_textInventarioMouseClicked

    private void textSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalidasMouseClicked
        this.textPrompt.setText(textPrompt.getText()+ " " + textSalidas.getSelectedValue().toString());
     //   this.objetivo = textSalidas.getSelectedValue().toString();
    }//GEN-LAST:event_textSalidasMouseClicked

    private void botonOkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonOkKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_botonOkKeyPressed

    private void textAccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAccionesMouseClicked
        this.textPrompt.setText( textAcciones.getSelectedValue().toString());
         // this.accion = textAcciones.getSelectedValue().toString();
    }//GEN-LAST:event_textAccionesMouseClicked

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.textPrompt.setText("");
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void textPromptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPromptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPromptActionPerformed

    /**
    * @param args the command line arguments
    */
    private static Interfaz interfaz = new Interfaz();
    private static Juego juegoEnCurso = new Juego();

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                interfaz.setVisible(true);

            }


        });

        juegoEnCurso.inicializar();
        juegoEnCurso.insertar(interfaz);    //insertamos observador
        juegoEnCurso.jugar();

        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList textAcciones;
    private javax.swing.JTextField textEnergia;
    private javax.swing.JList textInventario;
    private javax.swing.JTextPane textPantalla;
    private javax.swing.JTextField textPrompt;
    private javax.swing.JList textSalidas;
    // End of variables declaration//GEN-END:variables

    private void actualizarPantalla(String texto) {
        textPantalla.setText( texto);

    }
    private void actualizarEnergia(int energia ) {
        textEnergia.setText(Integer.toString(energia));
    }
    private void actualizarInventario(ArrayList <Objeto> inventario) {

        Iterator i = inventario.iterator();
        DefaultListModel modelo = new DefaultListModel();
        while(i.hasNext()) {
            Object objeto =  i.next();
        System.out.println(objeto.toString());
            modelo.addElement(objeto.toString() );

        }
        this.textInventario.setModel(modelo);
    }

    private void actualizarSalidas(ArrayList <Lugar> salidas) {
        Iterator i = salidas.iterator();
        DefaultListModel modelo = new DefaultListModel();
        while(i.hasNext()) {
            Object lugar = i.next();
            modelo.addElement(lugar.toString() );
        }
        this.textSalidas.setModel(modelo);
    }
private void actualizarAcciones(ArrayList <Accion> acciones) {
        Iterator i = acciones.iterator();
        DefaultListModel modelo = new DefaultListModel();
        while(i.hasNext()) {
            Object lugar = i.next();
            modelo.addElement(lugar.toString() );
        }
        this.textAcciones.setModel(modelo);
    }

    public void actualizar() {
        Estado estado = juegoEnCurso.getEstado();


        actualizarPantalla(estado.getPantalla());
        actualizarInventario(estado.getInventario());
        actualizarEnergia(estado.getEnergia());
        actualizarSalidas(estado.getSalidas());
        actualizarAcciones(estado.getAcciones());
    }
}
