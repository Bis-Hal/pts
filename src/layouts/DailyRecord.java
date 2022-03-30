package layouts;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import layouts.tabs.DailyRecordTab;
import sizes.WindowSizes;

public class DailyRecord extends JPanel {
    public DailyRecord(){
        setPreferredSize(new Dimension(WindowSizes.WIDTH,WindowSizes.HEIGHT));
        setLayout(new GridLayout(1,2));

        add(new DashBoard());
        add(new DailyRecordTab());
    }
}
