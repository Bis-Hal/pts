package layouts.LoginContainer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import layouts.MainFrame;
import sizes.WindowSizes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.GridLayout;


public class LoginPage extends JPanel {
    public JButton login;
    public JTextField usenameInput,passwordInput;
    public JLabel usernameLabel, passwordLabel, companyName, imageLabel;
    private ImageIcon logo;
  
    private GridBagConstraints gbc;

    public LoginPage(){
        setPreferredSize(new Dimension(WindowSizes.WIDTH,WindowSizes.HEIGHT));
        setLayout(new GridBagLayout());

        initialize();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5,5,50,5);
        add(companyName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5,5,5,5);
        add(usernameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(5,5,5,5);
        add(usenameInput, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(5,5,5,5);
        add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = new Insets(5,5,5,5);
        add(passwordInput, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.insets = new Insets(5,5,5,5);
        add(login, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        gbc.gridheight = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        add(imageLabel, gbc);


        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                MainFrame.c.add("HomePage", new HomePage());
                MainFrame.card.show(MainFrame.c, "HomePage");
            }
        });


    }

   
    private void initialize(){
        logo = new ImageIcon("lasta_garment.jpg");
        login = new JButton("Login");
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        usenameInput = new JTextField(10);
        passwordInput = new JTextField(10);
        companyName = new JLabel("Lasta Garment Pvt.Ltd");     
        gbc = new GridBagConstraints();
        imageLabel = new JLabel(logo);
    }
}
