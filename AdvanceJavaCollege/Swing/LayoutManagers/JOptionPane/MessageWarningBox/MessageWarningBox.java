//Implementing Message Warning Box.
import javax.swing.*;  
public class MessageWarningBox
{  
    JFrame f;  
    MessageWarningBox()
    {  
        f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Warning!","Alert",JOptionPane.WARNING_MESSAGE);     
    }  
    public static void main(String[] args) 
    {  
        new MessageWarningBox();  
    }  
}  