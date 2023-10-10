//Implementing Message Dialog Box.
import javax.swing.*;  
public class MessageDialogBoxExample 
{  
    JFrame f;  
    MessageDialogBoxExample()
    {  
        f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Hello, Welcome to Java Swing.");  
    }  
    public static void main(String[] args) 
    {  
        new MessageDialogBoxExample();  
    }  
}  