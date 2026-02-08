
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class form {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setBounds(100,100,600,600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel name=new JLabel("Name");
        name.setBounds(0,0,10,10);
        jf.add(name);
        JTextField n=new JTextField();
        n.setBounds(20,0,40,40);
        jf.add(n);
    }
}
