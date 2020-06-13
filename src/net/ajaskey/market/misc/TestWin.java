package net.ajaskey.market.misc;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class TestWin {

  private JFrame frame;

  /**
   * Create the application.
   */
  public TestWin() {
    this.initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    this.frame = new JFrame();
    this.frame.setBounds(100, 100, 450, 300);
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        try {
          final TestWin window = new TestWin();
          window.frame.setVisible(true);
        }
        catch (final Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

}
