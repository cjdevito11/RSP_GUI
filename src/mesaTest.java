
import javax.swing.*;
import java.awt.*;
import static java.awt.GraphicsDevice.WindowTranslucency.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CJ
 */
public class mesaTest extends javax.swing.JFrame {

    /**
     * Creates new form mesaScreen
     */
    public mesaTest() {
        JPanel panel = new JPanel ()
        {
            // Transparent red
            Color colorA = new Color (255, 0, 0, 0);
            // Solid red
            Color colorB = new Color (255, 0, 0, 255);
            protected void paintComponent (Graphics g)
            {
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp;
                gp = new GradientPaint (0.0f, 0.0f, colorA,
                        0.0f, getHeight (),
                        colorB, true);
                g2d.setPaint (gp);
                g2d.fillRect (0, 0, getWidth (),
                        getHeight ());

            }
        };

        setContentPane(panel);
        setLayout(new GridBagLayout());
        ImageIcon icon= new ImageIcon(getClass().getResource("mesa.png"));
        jLabel1 = new javax.swing.JLabel(icon);
        jLabel1.setOpaque(true);
        add(jLabel1);

        this.setUndecorated(true);
        //this.setOpacity(0.5f);
        this.setBackground (new Color (0, 0, 0, 0));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mesaScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mesaScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mesaScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mesaScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // mesaScreen = new mesaScreen().setUndecorated(true);
               // new mesaTest().setVisible(true);
                mesaTest mt = new mesaTest();

                // Set the window to 55% opaque (45% translucent).
              //  mt.setOpacity(0.5f);
                //mt.setUndecorated(true);
                mt.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
