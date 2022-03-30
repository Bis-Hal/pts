package layouts;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;

import layouts.LoginContainer.HomePage;
import layouts.LoginContainer.LoginPage;
import sizes.WindowSizes;
import java.awt.Color;

public class MainFrame extends JFrame{

	public static CardLayout card;
	public static Container c;

	public MainFrame() {
		c = getContentPane();
		setBackground(Color.GRAY);
		setSize(WindowSizes.WIDTH, WindowSizes.HEIGHT);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		card = new CardLayout();

		c.setLayout(card);

		c.add("Login", new LoginPage());
		
	}
}
