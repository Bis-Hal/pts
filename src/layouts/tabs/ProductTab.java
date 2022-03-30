package layouts.tabs;

import javax.swing.JLabel;
import javax.swing.JPanel;

import sizes.WindowSizes;

import java.awt.Color;
import java.awt.Dimension;


public class ProductTab extends JPanel{
    private JLabel text;
    public ProductTab(){
            setPreferredSize(new Dimension(WindowSizes.WIDTH,WindowSizes.HEIGHT));
            text = new JLabel("Product");
        
            add(text);
    }   
}
