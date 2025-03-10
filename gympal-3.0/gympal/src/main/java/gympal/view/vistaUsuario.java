package gympal.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import gympal.controller.SocioController;
import gympal.dto.SocioDTO;
import gympal.models.Socio;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Rulaai
 */
public class vistaUsuario extends javax.swing.JFrame {
    SocioController socioController= SocioController.getInstance();

    /**
     * Creates new form vistaUsuario
     */
    public vistaUsuario(SocioDTO socio) {
        initComponents(socio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(SocioDTO socio) {
        Socio s = socioController.obtenerSocioPorUsuario(socio.getUsuario());

        jLabel1 = new javax.swing.JLabel();
        objetivo = new javax.swing.JTextField(socio.getObjetivo());
        jLabel2 = new javax.swing.JLabel();
        pesoActual = new javax.swing.JTextField(socio.getPeso());
        jLabel3 = new javax.swing.JLabel();
        porcentajeGrasa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        porcentajeMusculo = new javax.swing.JTextField();
        registrarMedicion = new javax.swing.JButton();
        rutina = new javax.swing.JButton();
        progreso = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField(socio.getUsuario());
        jLabel6 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField(socio.getEdad());
        cambiarObjetivo = new javax.swing.JButton();
        cierreSesion = new javax.swing.JButton();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Objetivo");

        objetivo.setEditable(false);

        jLabel2.setText("Peso Actual");

        pesoActual.setEditable(false);
        pesoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActualActionPerformed(evt);
            }
        });

        jLabel3.setText("Porcentaje de grasa");

        porcentajeGrasa.setEditable(false);
        porcentajeGrasa.setText(socio.getGrasa());

        jLabel4.setText("Porcentaje de musculo");

        porcentajeMusculo.setEditable(false);
        porcentajeMusculo.setText(socio.getMusculo());

        registrarMedicion.setText("Registrar Medicion");
        registrarMedicion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrarMedicion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        registrarMedicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                new VistaMedicion(s).setVisible(true);
                registrarMedicionActionPerformed(evt);
            }
        });

        cierreSesion.setText("CERRAR SESION");
        cierreSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                new vistaInicioSesion().setVisible(true);
                cierreSesionActionPerformed(evt);
            }
        });
        cambiarObjetivo.setText("CAMBIAR OBJETIVO");
        cambiarObjetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showMessageDialog(null,"Tenga en cuenta que con el cambio de objetivo su rutina se modificara automaticamente.");
                dispose();
               new VistaCambioObjetivo(s).setVisible(true);
                cambiarObjetivoActionPerformed(evt);
            }
        });

        rutina.setText("Rutina");

        rutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               Socio s= socioController.obtenerSocioPorUsuario(socio.getUsuario());

               dispose();
                new vistaRutina(s.getRutina().toDTO(),s.getUsuario()).setVisible(true);

                rutinaActionPerformed(evt);
            }
        });


        progreso.setText("Ver Progreso");
        progreso.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new VistaProgreso(s).setVisible(true);
            }
        });

        jLabel5.setText("Usuario");

        usuario.setEditable(false);

        jLabel6.setText("Edad");

        edad.setEditable(false);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(progreso)
                                                .addGap(18, 18, 18)
                                                .addComponent(registrarMedicion)
                                                .addGap(30, 30, 30)
                                                .addComponent(rutina))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(porcentajeMusculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(porcentajeGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cierreSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(pesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(objetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cambiarObjetivo)))))
                                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cierreSesion))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(objetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cambiarObjetivo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(pesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(porcentajeGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(porcentajeMusculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rutina)
                                        .addComponent(progreso)
                                        .addComponent(registrarMedicion))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void cierreSesionActionPerformed(ActionEvent evt) {
    }

    private void pesoActualActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void registrarMedicionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void rutinaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void cambiarObjetivoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify
    private javax.swing.JButton cambiarObjetivo;
    private javax.swing.JTextField edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField objetivo;
    private javax.swing.JTextField pesoActual;
    private javax.swing.JTextField porcentajeGrasa;
    private javax.swing.JTextField porcentajeMusculo;
    private javax.swing.JButton progreso;
    private javax.swing.JButton registrarMedicion;
    private javax.swing.JButton rutina;
    private javax.swing.JTextField usuario;
    private javax.swing.JButton cierreSesion;

    // End of variables declaration
}
