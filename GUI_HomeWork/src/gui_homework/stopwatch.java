/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_homework;

/**
 *
 * @author Cakahal Johnson
 */
public class stopwatch extends javax.swing.JFrame {

    /**
     * Creates new form stopwatch
     */
    
    static int milliseconds = 00;
    static int seconds = 00;
    static int minutes = 00;
    static int hours = 00;
    
    static boolean state = true;
    
    public stopwatch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        millisecond = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STOPWATCH");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 130, 40));

        jLabel2.setFont(new java.awt.Font("Artifakt Element", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CAKAHAL JOHNSON");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 380, 40));

        millisecond.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        millisecond.setText("00");
        jPanel1.add(millisecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 110, 60));

        second.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        second.setForeground(new java.awt.Color(51, 0, 51));
        second.setText("00:");
        jPanel1.add(second, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 130, 70));

        minute.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        minute.setForeground(new java.awt.Color(51, 0, 51));
        minute.setText("00:");
        jPanel1.add(minute, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 120, 70));

        hour.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        hour.setForeground(new java.awt.Color(51, 0, 51));
        hour.setText("00:");
        jPanel1.add(hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, 70));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 130, 40));

        Button1.setBackground(new java.awt.Color(0, 204, 0));
        Button1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Button1.setText("Start");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        jPanel1.add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 40));

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Stop");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 110, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_homework/bike.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        
        state = true;
        
        Thread t = new Thread()
        {
        
            public void run(){
                             
                for(;;)
                {
                  if (state == true)
                  {
                      try {
                          sleep(1);
                          if(milliseconds > 1000)
                          {
                              milliseconds =0;
                              seconds++;
                          }
                          if(seconds > 60)
                          {
                              milliseconds =0;
                              seconds =0;
                              minutes++;
                          }
                          if(minutes > 60)
                          {
                              milliseconds =0;
                              seconds = 0;
                              minutes = 0;
                              hours++;
                          }
                          
                         millisecond.setText(" : "+milliseconds);
                          
                          
                          milliseconds++;
                          second.setText(" : "+seconds);
                          minute.setText(" : "+minutes);
                          hour.setText(" : "+hours);
                          
                          
                      } catch (Exception e) {
                      }
                  }  
                else
                {
                     break;   
                }
            }
         }
        };
          t.start();
    }//GEN-LAST:event_Button1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        state = false;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        state = false;
        
        hours = 0;
        minutes = 0;
        seconds = 0;
        milliseconds = 0;
        
        hour.setText("00 : ");
        minute.setText("00 : ");
        second.setText("00 : ");
        millisecond.setText("00");


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stopwatch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JLabel hour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel millisecond;
    private javax.swing.JLabel minute;
    private javax.swing.JLabel second;
    // End of variables declaration//GEN-END:variables
}
