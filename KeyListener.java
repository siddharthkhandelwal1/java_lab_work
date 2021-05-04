import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class keyListener extends Frame implements KeyListener{
    TextField t = new TextField(22);
    keyListener() {
        t.addKeyListener(this);
        add(t);
        t.setBounds(100, 30, 100, 70);
        t.setFocusable(true);
        t.setFont(new Font("monospaced", Font.BOLD, 14));
    }

    public static void main(String[] args) {

        keyListener k1 = new keyListener();
        k1.setSize(600,600);
        k1.setVisible(true);


    }


    @Override
    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();
        t.setText("you typed this key"+" "+ ch);

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
