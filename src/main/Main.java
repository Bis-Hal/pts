package main;

import javax.swing.UIManager;
import layouts.MainFrame;

public class Main {

	public static void main(String[] args) {
	
		String look = "com.jtattoo.plaf.graphite.GraphiteLookAndFeel";
		try{
			UIManager.setLookAndFeel(look);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		new MainFrame();
	
	
	}

}
