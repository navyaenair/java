import java.awt.*;
import java.awt.event.*;

 class MyFrame extends Frame implements ActionListener,WindowListener
 {
    Label l1=new Label("Enter First_no: ");
    Label l2=new Label("Enter Second_no: ");
    Label l3=new Label("sum: ");
    Button b1=new Button("SUM");
    Button b2=new Button("CLEAR");
    TextField t1=new TextField(10);
    TextField t2=new TextField(20);
    TextField t3=new TextField(10);
  MyFrame()
  {
   setSize(500,500);
   setVisible(true);
   setLayout(new FlowLayout());
   
   b1.addActionListener(this);
   b2.addActionListener(this);
   addWindowListener(this);
   
   add(l1);
   add(t1);
   add(l2);
   add(t2);
   add(l3);
   add(t3);
   add(b1);
   add(b2);
   }
   
   public void actionPerformed(ActionEvent e)
   {
    if(e.getSource()==b1)
    {
     String s1=t1.getText();
     int a=Integer.parseInt(s1);
     String s2=t2.getText();
     int b=Integer.parseInt(s2);
     int c=a+b;
     int d=a*b;
     t3.setText(Integer.toString(c));
     }
     else
     {
      t1.setText("");
      t2.setText("");
      t3.setText("");
      }
      };
      
      
      public void windowClosing(WindowEvent e)
  {
   System.out.println("closing....");
   System.exit(0);
  }
  
  public void windowClosed(WindowEvent e)
  {
    System.out.println("closed......");
  }
  
  
  
  public void windowOpened(WindowEvent e)
  {
    System.out.println("opened.....");
  }
  
  
  public void windowIconified(WindowEvent e)
  {
   System.out.println("iconified.....");
  }
  
  
  public void windowDeiconified(WindowEvent e)
  {
      System.out.println("deiconified");
  }
  
  
  public void windowActivated(WindowEvent e)
  {
     System.out.println("activated...");
  }
  
   public void windowDeactivated(WindowEvent e)
  {
    System.out.println("deactivated...");
  }
  }
  
  class Sum_Awt
  {
   public static void main(String args[])
   {
    MyFrame e=new MyFrame();
    }
    }
   
    
    
