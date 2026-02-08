 import java.awt.*;
import java.awt.event.*;

public class MyAWTApp {
    public static void main(String[] args) {
        Frame f = new Frame("My AWT App");
        Label l = new Label("Name:");
        TextField tf = new TextField();
        Button b = new Button("Submit");

        l.setBounds(50, 50, 60, 30);
        tf.setBounds(120, 50, 100, 30);
        b.setBounds(100, 100, 80, 30);

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);

        // Enable close button
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });
    }
}
