package id.ac.pnb.trpl.pbo2.jobsheet2.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JPanel panelLogin;
    private JPasswordField passwordform;
    private JButton loginButton;
    private JButton batalButton;
    private JTextField usernameform;
    private JButton keluarButton;
    private JLabel TopLabel;

    public JPanel getPanelMain() {
        return panelLogin;
    }

    public LoginForm() {
        createUIComponent();
        batalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameform.setText("");
                passwordform.setText("");
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void createUIComponent(){
        TopLabel.setFont(new Font("Fira Code", Font.BOLD, 28));
    }
}
