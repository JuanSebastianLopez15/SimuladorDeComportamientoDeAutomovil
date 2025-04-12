package autonoma.simuladorautomovil.views;

import autonoma.simuladorautomovil.models.Llanta;
import autonoma.simuladorautomovil.models.Motor;
import autonoma.simuladorautomovil.models.Taller;
import autonoma.simuladorautomovil.models.Vehiculo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

/**
 * VentanaTaller es una ventana emergente (JDialog) que permite al usuario
 * configurar el vehículo seleccionando las llantas y el motor. 
 * También proporciona la opción de actualizar los valores de configuración del vehículo.
 * 
 * @author  Cristian Camilo Salazar Arenas, Juan Sebastian Lopez Guzman
 * @version 1.0
 * @since   2025-04-12
 */
public class VentanaTaller extends javax.swing.JDialog {

    // Instancia de la ventana principal que contiene el vehículo.
    private VentanaPrincipal ventana;
    
    /**
     * Constructor de la clase VentanaTaller.
     * 
     * Este constructor inicializa los componentes de la ventana, establece su ubicación
     * relativa en la pantalla, configura el ícono de la aplicación y llena los combobox 
     * con las opciones de llantas y motor disponibles.
     * 
     * @param parent La ventana principal desde la cual se invoca este JDialog.
     * @param modal  Determina si esta ventana bloquea la interacción con otras ventanas mientras está activa.
     * @since 1.0
     */
    public VentanaTaller(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.ventana=(VentanaPrincipal)parent;
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/LogoCarro.png")).getImage());
        }catch(Exception e){
            
        }
        this.combLlantas.setModel(new DefaultComboBoxModel<>(Llanta.values()));
        this.combMotor.setModel(new DefaultComboBoxModel<>(Motor.values()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combMotor = new javax.swing.JComboBox<>();
        combLlantas = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnConfirmarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/Motor.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/Llantas.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel1.add(combMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 290, -1));

        combLlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combLlantasActionPerformed(evt);
            }
        });
        jPanel1.add(combLlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 290, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 110, -1));

        btnConfirmarCambios.setText("Confirmar cambios");
        btnConfirmarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combLlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combLlantasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combLlantasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCambiosActionPerformed
        
        Llanta llantaSeleccionada= (Llanta)this.combLlantas.getSelectedItem();
        Motor motorSeleccionado= (Motor)this.combMotor.getSelectedItem();
        Vehiculo carro = new Vehiculo(motorSeleccionado, llantaSeleccionada);
        Taller taller = new Taller();
        try {
            taller.actualizarConfiguracion(carro);
            this.ventana.actualizarConfiguracionVentana(carro);
        } catch (IOException ex) {
            Logger.getLogger(VentanaTaller.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnConfirmarCambiosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmarCambios;
    private javax.swing.JComboBox<Llanta> combLlantas;
    private javax.swing.JComboBox<Motor> combMotor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
