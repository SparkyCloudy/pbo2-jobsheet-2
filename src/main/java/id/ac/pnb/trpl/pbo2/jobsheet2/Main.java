package id.ac.pnb.trpl.pbo2.jobsheet2;

import id.ac.pnb.trpl.pbo2.jobsheet2.view.DataDosen;
import id.ac.pnb.trpl.pbo2.jobsheet2.view.LoginForm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

  public static void main(String[] args) {
    Main main = new Main();
//    main.testGui();
    main.loginform();
  }

  private void testGui() {
    DataDosen dataDosen = new DataDosen();
    JFrame frame = new JFrame();
    JPanel mainPanel = dataDosen.getPanelMain();

    frame.setTitle("Aplikasi CRUD Dosen");
    frame.setContentPane(mainPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setResizable(false);

    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      SwingUtilities.updateComponentTreeUI(frame);
    } catch (UnsupportedLookAndFeelException | ClassNotFoundException |
             InstantiationException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }

    frame.setVisible(true);
  }
  private void loginform(){
    LoginForm loginForm = new LoginForm();
    JFrame frame = new JFrame();
    JPanel mainPanel = loginForm.getPanelMain();

    frame.setTitle("Login Dosen");
    frame.setContentPane(mainPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setResizable(false);

    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      SwingUtilities.updateComponentTreeUI(frame);
    } catch (UnsupportedLookAndFeelException | ClassNotFoundException |
             InstantiationException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }

    frame.setVisible(true);
  }
}
