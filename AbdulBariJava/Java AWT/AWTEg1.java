//Implementing Java AWT using inheritence.
//importing AWT class.
import java.awt.*; 
//extending Frame class to our class AWTEg1.
class AWTEg1 extends Frame
{
    //initializing the constructor.
    AWTEg1()
    {
        //Creating a button.
        Button b = new Button("Click Me!");

        //setting button position on screen.
        b.setBounds(30,100,100,30);

        //adding button into frame.
        add(b);

        //frame size 300 width and 300 height.
        setSize(300,300);

        //setting the title of frame.
        setTitle("AWT Example.");

        //no layout manager.
        setLayout(null);

        //now frame will be visible, by default it is not visible.
        setVisible(true);
    }
    public static void main(String[] args)
    {
        //creating instance of frame class.
        AWTEg1 a = new AWTEg1();
    }
} 
