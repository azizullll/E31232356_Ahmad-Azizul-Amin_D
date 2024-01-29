package GUIEventHandling;

import java.awt.*;
import java.awt.event.*;

class CloseFrame3 extends Frame {

    Label label;
    
    CFListener w = new CFListener(this);

    CloseFrame3(String title) {
        super(title);
        label = new Label("Close the frame.");
        this.addWindowListener(w);
    }

    void launchFrame() {
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String args[]) {
        CloseFrame cf = new CloseFrame("Close Window Example");
        cf.launchFrame();
    }
}
    class CFListener extends WindowAdapter {

        CloseFrame3 ref;

        CFListener(CloseFrame3 ref) {
            this.ref = ref;
        }

        public void windowClosing(WindowEvent e) {
            ref.dispose();
            System.exit(1);
        }
    }
