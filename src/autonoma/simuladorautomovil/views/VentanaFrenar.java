package autonoma.simuladorautomovil.views;

import javax.swing.ImageIcon;

/**
 * Clase VentanaFrenar.
 * 
 * Esta clase representa una ventana emergente (JDialog) utilizada en la interfaz gráfica del simulador
 * para mostrar las opciones relacionadas con el frenado del vehículo.
 * La ventana muestra una animación de un automóvil deteniéndose y se cierra al hacer clic en ella.
 * 
 * @author  Cristian Camilo Salazar Arenas, Juan Sebastian Lopez Guzman
 * @version 1.0
 * @since   2025-04-11
 */
public class VentanaFrenar extends javax.swing.JDialog {

    /**
     * Constructor de la clase VentanaFrenar.
     * 
     * Inicializa los componentes de la ventana, centra la ventana en la pantalla y establece el ícono de la aplicación.
     * La ventana muestra una animación de frenado y se cierra al hacer clic en ella.
     * 
     * @param parent La ventana principal desde la cual se invoca este JDialog.
     * @param modal  Determina si esta ventana bloquea la interacción con otras ventanas mientras está activa.
     * @since 1.0
     */
    public VentanaFrenar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/LogoCarro.png")).getImage());
        }catch(Exception e){
            // Se omite manejo explícito de la excepción para evitar interrupciones visuales.
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/AutomovilDeteniendose1.gif"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
