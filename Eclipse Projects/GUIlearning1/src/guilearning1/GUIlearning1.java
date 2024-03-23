package guilearning1;

import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme;
import javax.swing.UIManager;

public class GUIlearning1 {
    public static void main(String[] args) {

//        try {
//            UIManager.setLookAndFeel(new FlatAtomOneLightIJTheme() );
//        } catch (Exception ex) {
//            System.err.println("Failed to initialize LaF");
//        }

IntelliJTheme.setup( 
        GUIlearning1.class.getResourceAsStream("/Xcode-Dark.theme.json" ) 
);
       System.out.println("Hello world");
      new Main().setVisible(true);
      new Main2().setVisible(true);
    }
}
