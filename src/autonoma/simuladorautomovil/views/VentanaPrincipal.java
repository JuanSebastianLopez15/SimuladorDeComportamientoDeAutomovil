package autonoma.simuladorautomovil.views;

import autonoma.simuladorautomovil.exception.FrenadoEnDetenidoException;
import autonoma.simuladorautomovil.exception.FrenadoIntensidadInvalidaException;
import autonoma.simuladorautomovil.exception.VehiculoApagadoException;
import autonoma.simuladorautomovil.exception.VehiculoYaApagadoException;
import autonoma.simuladorautomovil.exception.VehiculoYaEncendidoException;
import autonoma.simuladorautomovil.models.Taller;
import autonoma.simuladorautomovil.models.Vehiculo;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private Vehiculo carro;
    private Taller taller2;
    private VentanaTaller taller;
    public VentanaPrincipal(Vehiculo carro) {
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/LogoCarro.png")).getImage());
        }catch(Exception e){
            
        }       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNombreLanta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNombreMotor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAcelerar = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnFrenar = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnFrenoDuro = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnTaller = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtVelocidad = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblContadorVelocidad = new javax.swing.JLabel();
        btnApagar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnEncender = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel14.setText("------------------------------------------------");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/PrincipalGif.gif"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 506, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        lblNombreLanta.setFont(new java.awt.Font("ROG Fonts", 0, 14)); // NOI18N
        lblNombreLanta.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreLanta.setText("Vacio");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/Llantas.png"))); // NOI18N

        lblNombreMotor.setFont(new java.awt.Font("ROG Fonts", 0, 14)); // NOI18N
        lblNombreMotor.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreMotor.setText("Vacio");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/Motor.png"))); // NOI18N

        jLabel4.setText("-------------------------------------------------------------------------------");

        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/EquisPequena.png"))); // NOI18N

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(107, 107, 107)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreMotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreLanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreLanta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(lblNombreMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 380, 280));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setText("|");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel9.setText("|");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel10.setText("|");

        btnAcelerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcelerarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcelerarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcelerarMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/Acelerador.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout btnAcelerarLayout = new javax.swing.GroupLayout(btnAcelerar);
        btnAcelerar.setLayout(btnAcelerarLayout);
        btnAcelerarLayout.setHorizontalGroup(
            btnAcelerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAcelerarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAcelerarLayout.setVerticalGroup(
            btnAcelerarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAcelerarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFrenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFrenarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFrenarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFrenarMouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/Freno.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout btnFrenarLayout = new javax.swing.GroupLayout(btnFrenar);
        btnFrenar.setLayout(btnFrenarLayout);
        btnFrenarLayout.setHorizontalGroup(
            btnFrenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFrenarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnFrenarLayout.setVerticalGroup(
            btnFrenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFrenarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFrenoDuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFrenoDuroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFrenoDuroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFrenoDuroMouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/FrenoDuro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout btnFrenoDuroLayout = new javax.swing.GroupLayout(btnFrenoDuro);
        btnFrenoDuro.setLayout(btnFrenoDuroLayout);
        btnFrenoDuroLayout.setHorizontalGroup(
            btnFrenoDuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFrenoDuroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnFrenoDuroLayout.setVerticalGroup(
            btnFrenoDuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFrenoDuroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnTaller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTallerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTallerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTallerMouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/Taller.png"))); // NOI18N

        javax.swing.GroupLayout btnTallerLayout = new javax.swing.GroupLayout(btnTaller);
        btnTaller.setLayout(btnTallerLayout);
        btnTallerLayout.setHorizontalGroup(
            btnTallerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTallerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnTallerLayout.setVerticalGroup(
            btnTallerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTallerLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        txtVelocidad.setBackground(new java.awt.Color(255, 255, 255));
        txtVelocidad.setFont(new java.awt.Font("ROG Fonts", 0, 14)); // NOI18N
        txtVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        txtVelocidad.setText("Velocidad: ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel13.setText("|");

        lblContadorVelocidad.setBackground(new java.awt.Color(255, 255, 255));
        lblContadorVelocidad.setFont(new java.awt.Font("ROG Fonts", 0, 14)); // NOI18N
        lblContadorVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        lblContadorVelocidad.setText("nada");

        btnApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApagarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnApagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnApagarMouseExited(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/Apagar.png"))); // NOI18N

        javax.swing.GroupLayout btnApagarLayout = new javax.swing.GroupLayout(btnApagar);
        btnApagar.setLayout(btnApagarLayout);
        btnApagarLayout.setHorizontalGroup(
            btnApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnApagarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        btnApagarLayout.setVerticalGroup(
            btnApagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnApagarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEncender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncenderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEncenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEncenderMouseExited(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simuladorautomovil/images/Encender1.png"))); // NOI18N

        javax.swing.GroupLayout btnEncenderLayout = new javax.swing.GroupLayout(btnEncender);
        btnEncender.setLayout(btnEncenderLayout);
        btnEncenderLayout.setHorizontalGroup(
            btnEncenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEncenderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEncenderLayout.setVerticalGroup(
            btnEncenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEncenderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel15.setText("|");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnFrenoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnFrenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(btnAcelerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblContadorVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15))))
                .addGap(44, 44, 44)
                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnEncender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEncender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFrenoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFrenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAcelerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContadorVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnTaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 900, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcelerarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMouseEntered
        this.mouseEntered(btnAcelerar);
    }//GEN-LAST:event_btnAcelerarMouseEntered

    private void btnAcelerarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMouseExited
        this.mouseExited(btnAcelerar);
    }//GEN-LAST:event_btnAcelerarMouseExited

    private void btnFrenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenarMouseClicked
        if (this.carro == null){
            JOptionPane.showMessageDialog(this, "Primero configure las llantas y el motor del carro");
        }
        else{
            try{
            this.carro.frenar(10);
            VentanaFrenar frenar = new VentanaFrenar(this, true);
            this.lblContadorVelocidad.setText(this.carro.getVelocidadActual()+" Km/h");
            frenar.setVisible(true);
            }catch(VehiculoApagadoException | FrenadoEnDetenidoException | FrenadoIntensidadInvalidaException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnFrenarMouseClicked

    private void btnAcelerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMouseClicked
       if (this.carro == null){
            JOptionPane.showMessageDialog(this, "Primero configure las llantas y el motor del carro");
        }
       else{
           try{ 
           this.carro.acelerar(10);
           VentanaAcelerar acelerar = new VentanaAcelerar(this, true);
           this.lblContadorVelocidad.setText(this.carro.getVelocidadActual()+" Km/h");
           acelerar.setVisible(true);
           }catch(Exception e){
           JOptionPane.showMessageDialog(this, e.getMessage());
            }
       }  
    }//GEN-LAST:event_btnAcelerarMouseClicked

    private void btnFrenarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenarMouseEntered
        this.mouseEntered(btnFrenar);
    }//GEN-LAST:event_btnFrenarMouseEntered

    private void btnFrenarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenarMouseExited
        this.mouseExited(btnFrenar);
    }//GEN-LAST:event_btnFrenarMouseExited

    private void btnFrenoDuroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenoDuroMouseExited
        this.mouseExited(btnFrenoDuro);
    }//GEN-LAST:event_btnFrenoDuroMouseExited

    private void btnFrenoDuroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenoDuroMouseEntered
        this.mouseEntered(btnFrenoDuro);
    }//GEN-LAST:event_btnFrenoDuroMouseEntered

    private void btnFrenoDuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrenoDuroMouseClicked
        if (this.carro == null){
            JOptionPane.showMessageDialog(this, "Primero configure las llantas y el motor del carro");
        }
        else{
            try { 
            this.carro.frenarBruscamente();
            this.lblContadorVelocidad.setText(this.carro.getVelocidadActual() + " Km/h");
            VentanaFrenoDuro frenarBrusco = new VentanaFrenoDuro(this, true);
            frenarBrusco.setVisible(true);
            } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnFrenoDuroMouseClicked

    private void btnTallerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTallerMouseEntered
        this.mouseEntered(btnTaller);
    }//GEN-LAST:event_btnTallerMouseEntered

    private void btnTallerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTallerMouseExited
        this.mouseExited(btnTaller);
    }//GEN-LAST:event_btnTallerMouseExited

    private void btnTallerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTallerMouseClicked
        this.taller = new VentanaTaller(this,true);
        taller.setVisible(true);
    }//GEN-LAST:event_btnTallerMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        this.mouseEnteredSalir(btnSalir);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        this.mouseExitedSalir(btnSalir);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnApagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseEntered
        this.mouseEntered(btnApagar);
    }//GEN-LAST:event_btnApagarMouseEntered

    private void btnApagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseExited
        this.mouseExited(btnApagar);
    }//GEN-LAST:event_btnApagarMouseExited

    private void btnApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseClicked
        if (this.carro == null){
            JOptionPane.showMessageDialog(this, "Primero configure las llantas y el motor del carro");
        }
        else{
            try{
            this.carro.apagar();
            }catch(VehiculoYaApagadoException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
    }//GEN-LAST:event_btnApagarMouseClicked

    private void btnEncenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncenderMouseExited
        this.mouseExited(btnEncender);
    }//GEN-LAST:event_btnEncenderMouseExited

    private void btnEncenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncenderMouseEntered
        this.mouseEntered(btnEncender);
    }//GEN-LAST:event_btnEncenderMouseEntered

    private void btnEncenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncenderMouseClicked
        if (this.carro == null) {
            JOptionPane.showMessageDialog(this, "Primero configure las llantas y el motor del carro");
        } else {
            try {
                this.carro.encender(); // Puede lanzar VehiculoYaEncendidoException

                // Reproducir sonido en un hilo aparte
                new Thread(() -> {
                    try {
                        File archivoSonido = new File("src/autonoma/simuladorautomovil/sounds/EncenderCarro.wav");
                        AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivoSonido);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioStream);
                        clip.start();
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                        JOptionPane.showMessageDialog(this, "Error al reproducir el sonido: " + e.getMessage());
                        e.printStackTrace();
                    }
                }).start();

            } catch (VehiculoYaEncendidoException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEncenderMouseClicked
    /**
     * Maneja el efecto hover sobre los paneles interactivos
     * @param panel Panel que activará el cambio de color
     * @since   1.0
     */
    private void mouseEntered(JPanel panel){
        panel.setBackground(Color.decode("#7077D6"));
    }
    /**
     * Restaura el color original de los paneles al salir del hover
     * @param panel Panel que restaurará su color original
     * @since   1.0
     */
    private void mouseExited(JPanel panel){
        panel.setBackground(Color.decode("#CCC9DA"));
    }
    
    private void mouseExitedSalir(JPanel panel){
        panel.setBackground(Color.decode("#D7CAD8"));
    }
    private void mouseEnteredSalir(JPanel panel){
        panel.setBackground(Color.decode("#DB0127"));
    }
    
    public void actualizarConfiguracionVentana(Vehiculo carro){
        this.carro=carro;
        this.lblNombreLanta.setText(carro.getLlanta().getNombre());
        this.lblNombreMotor.setText(carro.getMotor().getCilindraje());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAcelerar;
    private javax.swing.JPanel btnApagar;
    private javax.swing.JPanel btnEncender;
    private javax.swing.JPanel btnFrenar;
    private javax.swing.JPanel btnFrenoDuro;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnTaller;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblContadorVelocidad;
    private javax.swing.JLabel lblNombreLanta;
    private javax.swing.JLabel lblNombreMotor;
    private javax.swing.JLabel txtVelocidad;
    // End of variables declaration//GEN-END:variables
}
