/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinate_2023;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Cakahal Johnson
 */
public class Pendulum extends JPanel implements Runnable {
    
    private double angle = Math.PI / 2;
  private int length;
 
  public Pendulum(int length) {
    this.length = length;
    setDoubleBuffered(true);
  }
 
  public void paint(Graphics g) {
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, getWidth(), getHeight());
    g.setColor(Color.BLACK);
    int anchorX = getWidth() / 2, anchorY = getHeight() / 4;
    int ballX = anchorX + (int) (Math.sin(angle) * length);
    int ballY = anchorY + (int) (Math.cos(angle) * length);
    g.drawLine(anchorX, anchorY, ballX, ballY);
    g.fillOval(anchorX - 3, anchorY - 4, 7, 7);
    g.fillOval(ballX - 7, ballY - 7, 14, 14);
  }
 
  public void run() {
    double angleAccel, angleVelocity = 0, dt = 0.1;
    while (true) {
      angleAccel = -9.81 / length * Math.sin(angle);
      angleVelocity += angleAccel * dt;
      angle += angleVelocity * dt;
      repaint();
      try {
        Thread.sleep(15);
      } catch (InterruptedException ex) {
      }
    }
  }
 
  public Dimension getPreferredSize() {
    return new Dimension(2 * length + 50, length / 2 * 3);
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame f = new JFrame("Pendulum Example");
    Pendulum p = new Pendulum(100);
    f.add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
    new Thread(p).start();
  }
    
}
