package layouts.tabs;



import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import sizes.WindowSizes;


public class DailyRecordTab extends JPanel {

	private JLabel small,medium,large,xl,xxl;
	private JTextField smallInput, mediumInput, largeInput, xlInput, xxlInput;
	private JButton record;

	private GridBagConstraints gbc;

	private String smallLabel = "Small";
	private String mediumLabel = "Medium";
	private String largeLabel = "Large";
	private String xlLabel = "XL";
	private String xxlLabel = "XXL";

	private String recordLabel = "Record";

	private int textFieldSize = 10;
  
	public DailyRecordTab() {
		setPreferredSize(new Dimension(WindowSizes.WIDTH,WindowSizes.HEIGHT));
		setLayout(new GridBagLayout());
		initialize();

		gbc.gridx = 0;
		gbc.gridy = 0;
		add(small, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		add(smallInput, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		add(medium, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		add(mediumInput, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		add(large, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		add(largeInput, gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		add(xl, gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		add(xlInput, gbc);

		gbc.gridx = 0;
		gbc.gridy = 4;
		add(xxl, gbc);

		gbc.gridx = 1;
		gbc.gridy = 4;
		add(xxlInput, gbc);

		gbc.gridx = 1;
		gbc.gridy = 5;
		add(record, gbc);
	}

	private void initialize(){

		gbc = new GridBagConstraints();
		small = new JLabel(smallLabel);
		medium = new JLabel(mediumLabel);
		large = new JLabel(largeLabel);
		xl = new JLabel(xlLabel);
		xxl = new JLabel(xxlLabel);

		smallInput = new JTextField(textFieldSize);
		mediumInput = new JTextField(textFieldSize);
		largeInput = new JTextField(textFieldSize);
		xlInput = new JTextField(textFieldSize);
		xxlInput = new JTextField(textFieldSize);

	
		record = new JButton(recordLabel);

	}
}
