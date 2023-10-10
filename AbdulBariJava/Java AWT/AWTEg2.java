//Implementing Java AWT using association.
//importing AWT class.
import java.awt.*;

//class AWTEg2 directly creates instances of frame class.
class AWTEg2 
{
    //initializing using constructor.
    AWTEg2()
    {
        //creating a frame.
        Frame f = new Frame();

        //creating a label.
        Label l = new Label("Name:");

        //creating a button.
        Button b = new Button("SUBIT");

        //creating a textfield.
        TextField tf = new TextField();

        //setting positions of above components in the frame.
        l.setBounds(20,80,45,30);
        tf.setBounds(70,80,150,30);
        b.setBounds(220,80,80,30);

        //adding components into frame.
        f.add(l);
        f.add(tf);
        f.add(b);

        //frame size of 300 width and 300 height.
        f.setSize(400,300);

        //setting the title of frame.
        f.setTitle("Employee Info");

        //no layout.
        f.setLayout(null);

        //setting visibility of frame.
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        //creating instance of frame class.
        AWTEg2 a = new AWTEg2();
    }
}