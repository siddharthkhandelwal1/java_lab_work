import java.awt.*;
import java.awt.event.*;
class mylist extends Frame implements ItemListener
{
 List l;
 mylist()
 {
	 setLayout(new FlowLayout());
  l=new List(3);
  l.add("metasploit");
  l.add("nmap");
  l.add("wireshark");
  l.add("snoden");
  l.setBounds(100,260,70,40);
        
  add(l);
  l.addItemListener(this);
  addWindowListener( new WindowAdapter()
  {
    public void windowClosing(WindowEvent we)
	{
	  System.exit(0);
	}
	});
 }
   public void itemStateChanged(ItemEvent ie)
   {
    repaint();
	}
	public static void main(String[] args)
	{
	 mylist ml=new mylist();
	 ml.setSize(400,400);
	 ml.setVisible(true);
	 }
	 }
© 2021 GitHub, Inc.
