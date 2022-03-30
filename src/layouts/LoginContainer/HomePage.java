package layouts.LoginContainer;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import layouts.DailyRecord;
import layouts.tabs.MachineryTab;
import layouts.tabs.ProductTab;
import sizes.WindowSizes;
import java.awt.Dimension;


public class HomePage extends JPanel{

    private JTabbedPane items;

    public HomePage(){
        setPreferredSize(new Dimension(WindowSizes.WIDTH, WindowSizes.HEIGHT));
        
        initialize();

        items.addTab("Product", new ProductTab());
        items.addTab("Machine", new MachineryTab());
        items.addTab("Daily Record", new DailyRecord());
        add(items);
        
    }

    private void initialize(){
            items =  new JTabbedPane();
    }
    
}
