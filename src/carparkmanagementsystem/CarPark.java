package carparkmanagementsystem;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class CarPark {
    public static void main(String[] args) {
        FlatMacLightLaf.setup();     
        UIDefaults defaults = UIManager.getLookAndFeelDefaults();
        HomeUI home = new HomeUI();
        home.setVisible(true);
    }
    
}
