//Implementing Flow Layout.
import java.awt.*;    
import javax.swing.*;    
    
public class FlowLayoutExample  
{   
   
    JFrame f;  
    // constructor    
    FlowLayoutExample()  
    {    
        // creating a frame object  
        f = new JFrame();    
        
        // creating the buttons  
        JButton b1 = new JButton("1");    
        JButton b2 = new JButton("2");    
        JButton b3 = new JButton("3");    
        JButton b4 = new JButton("4");    
        JButton b5 = new JButton("5");  
        JButton b6 = new JButton("6");    
        JButton b7 = new JButton("7");    
        JButton b8 = new JButton("8");    
        JButton b9 = new JButton("9");    
        // adding the buttons to frame        
        f.add(b1);
        f.add(b2); 
        f.add(b3); 
        f.add(b4);      
        f.add(b5); 
        f.add(b6);  
        f.add(b7);  
        f.add(b8);    
        f.add(b9);        
       
    // parameter less constructor is used  
    // therefore, alignment is center   
    // horizontal as well as the vertical gap is 5 units.  
    f.setLayout(new FlowLayout());    
        
    f.setSize(300, 300);    
    f.setVisible(true);    
}    
    // main method  
    public static void main(String argvs[])   
    {    
        new FlowLayoutExample();    
    }    
}    