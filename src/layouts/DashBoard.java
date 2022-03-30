package layouts;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.GridBagConstraints;

import sizes.WindowSizes;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DashBoard extends JPanel{
    private Border border;
    JButton e1;
    private   Border e1Border;
    private  GridBagConstraints gbc;
    private ArrayList<JLabel> employee = new ArrayList<>();
    
    public DashBoard(){
        
        setPreferredSize(new Dimension(200,WindowSizes.HEIGHT));
        gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());

        border = BorderFactory.createLineBorder(Color.BLACK);
        setBorder(border);
        e1Border = BorderFactory.createLineBorder(Color.BLACK);
        String[] name = {"abc", "hoho", "popo"};

      

        for(int i = 0; i<3; i++){
            e1 = new JButton(name[i]);
            gbc.insets = new Insets(5,5,5,5);
            e1.setBorder(e1Border);
            gbc.gridx = 0;
            gbc.gridy = i;
            
            add(e1, gbc);
            e1.addActionListener(new ButtonHandler());
          
        }
       
    

        

    }

    class ButtonHandler implements ActionListener{
  

    @Override
    public void actionPerformed(ActionEvent arg0) {
        
        System.out.println(arg0.getActionCommand());
    }

    }

    // class MouseHandler implements MouseListener{
       
    //     @Override
    //     public void mouseClicked(MouseEvent arg0) {
    //         System.out.println(arg0());
            
    //     }
    //     @Override
    //     public void mouseEntered(MouseEvent arg0) {
         
            
    //     }
    //     @Override
    //     public void mouseExited(MouseEvent arg0) {
            
            
    //     }
    //     @Override
    //     public void mousePressed(MouseEvent arg0) {
        
            
    //     }
    //     @Override
    //     public void mouseReleased(MouseEvent arg0) {
            
    //     }

    // }

  
}
