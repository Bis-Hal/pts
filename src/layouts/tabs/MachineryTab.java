package layouts.tabs;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import sizes.WindowSizes;

import java.awt.*;
import java.awt.GridBagConstraints;


public class MachineryTab extends JPanel {
	private JLabel machineName,numberOfMachine;
	private JTextField machineNameInput, numberOfMachineInput;
	private JButton addMachine, increase, decrease;
	private GridBagConstraints gbc;
	
	


	public MachineryTab() {
		initialize();
		setPreferredSize(new Dimension(WindowSizes.WIDTH,WindowSizes.HEIGHT));
		setBackground(Color.GRAY);
		setLayout(new GridBagLayout());

		gbc.insets = new Insets(5,5,5,5);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(machineName, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		add(machineNameInput, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		add(numberOfMachine, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		add(numberOfMachineInput, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		add(addMachine,gbc);
		
	}

	private void initialize(){
		machineName = new JLabel("Machine Name");
		numberOfMachine = new JLabel("Number of Machine");
		machineNameInput = new JTextField(20);
		numberOfMachineInput = new JTextField(20);
		addMachine = new JButton("Add");
		gbc = new GridBagConstraints();
		increase = new JButton();
		decrease = new JButton();
	}
}
