/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gympal.view;

import fit.gympal.models.BajarPeso;
import fit.gympal.models.MantenerFigura;
import fit.gympal.models.TonificarCuerpo;
import gympal.models.Objetivo;
import gympal.models.Socio;

import javax.swing.*;
import java.util.Objects;

/**
 *
 * @author Rulaai
 */
public class VistaCambioObjetivo extends javax.swing.JFrame {

    /**
     * Creates new form vistaCambioRutina
     */
    public VistaCambioObjetivo(Socio socio) {
        initComponents(socio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(Socio socio) {

        tonificarCuerpo = new javax.swing.JButton();
        bajarPeso = new javax.swing.JButton();
        mantenerFigura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tonificarCuerpo.setText("TONIFICAR CUERPO");
        tonificarCuerpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (Objects.equals(socio.getObjetivo().getNombre(), "TONIFICAR CUERPO")){
                    JOptionPane.showMessageDialog(null,"No puede seleccionar su objetivo actual, por favor seleccione otro.");
                }else{

                    socio.editarObjetivo(new TonificarCuerpo());
                    JOptionPane.showMessageDialog(null,"Su objetivo fue modificado de manera exitosa.");
                    dispose();
                    new vistaUsuario(socio.toDTO()).setVisible(true);


                }
                tonificarCuerpoActionPerformed(evt);
            }
        });

        bajarPeso.setText("BAJAR PESO");
        bajarPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (Objects.equals(socio.getObjetivo().getNombre(), "BAJAR PESO")){
                    JOptionPane.showMessageDialog(null,"No puede seleccionar su objetivo actual, por favor seleccione otro.");
                }else{

                    socio.editarObjetivo(new BajarPeso());
                    JOptionPane.showMessageDialog(null,"Su objetivo fue modificado de manera exitosa.");
                    dispose();
                    new vistaUsuario(socio.toDTO()).setVisible(true);


                }
                bajarPesoActionPerformed(evt);
            }
        });

        mantenerFigura.setText("MANTENER FIGURA");
        mantenerFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (Objects.equals(socio.getObjetivo().getNombre(), "MANTENER FIGURA")){
                    JOptionPane.showMessageDialog(null,"No puede seleccionar su objetivo actual, por favor seleccione otro.");
                }else{

                    socio.editarObjetivo(new MantenerFigura());
                    JOptionPane.showMessageDialog(null,"Su objetivo fue modificado de manera exitosa.");
                    dispose();
                    new vistaUsuario(socio.toDTO()).setVisible(true);


                }
                mantenerFiguraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bajarPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tonificarCuerpo)
                                        .addComponent(mantenerFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(tonificarCuerpo)
                                .addGap(31, 31, 31)
                                .addComponent(bajarPeso)
                                .addGap(39, 39, 39)
                                .addComponent(mantenerFigura)
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void bajarPesoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mantenerFiguraActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void tonificarCuerpoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify
    private javax.swing.JButton bajarPeso;
    private javax.swing.JButton mantenerFigura;
    private javax.swing.JButton tonificarCuerpo;
    // End of variables declaration
}
