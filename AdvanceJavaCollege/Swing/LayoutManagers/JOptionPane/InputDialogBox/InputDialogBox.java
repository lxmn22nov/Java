//Implementing Input Dialog Box.
import javax.swing.*;  
public class InputDialogBox 
{  
    JFrame f;  
    InputDialogBox()
    {  
        f=new JFrame();   
        String name = JOptionPane.showInputDialog(f,"Enter Name");      
    }  
    public static void main(String[] args) 
    {  
        new InputDialogBox();  
    }  
}  