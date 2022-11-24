import java.awt.*;
import java.awt.event.*;

 class Events extends Frame implements ActionListener,WindowListener
{
 Button b=new Button("ok");
 TextField t=new TextField(10);
 
 public Events()
 {
  
  add(t);
  add(b);
  setVisible(true);
  setLayout(new FlowLayout());
  setSize(300,400);
  setBackground(Color.blue);
  b.addActionListener(this);
  addWindowListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
   t.setText("LBS");
  };
  public void windowClosing(WindowEvent e)
  {
   System.out.print("closing....");
   System.exit(0);
  }
  
  public void windowClosed(WindowEvent e)
  {
    System.out.print("closed......");
  }
  
  
  
  public void windowOpened(WindowEvent e)
  {
    System.out.print("opened.....");
  }
  
  
  public void windowIconified(WindowEvent e)
  {
   System.out.print("iconified.....");
  }
  
  
  public void windowDeiconified(WindowEvent e)
  {
      System.out.print("deiconified");
  }
  
  
  public void windowActivated(WindowEvent e)
  {
     System.out.print("activated...");
  }
  
   public void windowDeactivated(WindowEvent e)
  {
    System.out.print("deactivated...");
  }
  }
  
  class Demo_Awt
  {
  
  public static void main(String args[])
  {
   Events e=new Events();
   }
   }
