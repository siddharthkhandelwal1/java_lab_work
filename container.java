  
import java.awt.*;


public class Container  {

        public static void main(String[] args){

            Frame f1 = new Frame();
            Checkbox p1 = new Checkbox(" java");
            TextField y1 = new TextField(10);
            Choice r = new Choice();
            r.setBounds(100, 100, 75, 75);
            r.add("snowden");
            r.add("wireshark");
            r.add("nmap");
            r.add("metasploit");
            f1.add(r);
            f1.add(p1);
            f1.add(y1);

            f1.setVisible(true);
            f1.setSize(500, 500);
            f1.setLayout(new FlowLayout());
        }
    }             
