import java.awt.*;
import javax.swing.*;

class RegistrationForm extends JFrame
{
    //Components of the form.
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tfname;
    private JLabel gender;
    private JRadioButton m,f;
    private JLabel email_id;
    private JTextField tfemail_id;
    private JLabel address;
    private JTextArea taaddress;
    private JLabel password;
    private JTextField tfpassword;
    private JLabel c_password;
    private JTextField tfc_password;
    private JButton submit;

    //constructors to initialize the components with default value.
    public RegistrationForm()
    {
        //setting title of the registration page.
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        //user name label.
        name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100,20);
        name.setLocation(100,100);
        c.add(name);

        //user name data entry field.
        tfname = new JTextField();
        tfname.setFont(new Font("Arial", Font.PLAIN, 15));
        tfname.setSize(200,30);
        tfname.setLocation(200, 100);
        c.add(tfname);

        //user gender label.
        gender = new JLabel("Gender:");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100,20);
        gender.setLocation(100,155);
        c.add(gender);

        //user gender male radio-button.
        m = new JRadioButton("Male");
        m.setFont(new Font("Arial", Font.PLAIN, 20));
        m.setSize(200,30);
        m.setLocation(200,150);
        c.add(m);
        //user gender female radio-button.
        f = new JRadioButton("Female");
        f.setSize(200,30);
        f.setFont(new Font("Arial", Font.PLAIN, 20));
        f.setLocation(290,150);
        c.add(f);

        //user email-id label.
        email_id = new JLabel("Email-Id:");
        email_id.setFont(new Font("Arial", Font.PLAIN, 20));
        email_id.setSize(100,20);
        email_id.setLocation(100,200);
        c.add(email_id);

        //user email-id data entry field.
        tfemail_id = new JTextField();
        tfemail_id.setFont(new Font("Arial", Font.PLAIN, 15));
        tfemail_id.setSize(200,30);
        tfemail_id.setLocation(200,195);
        c.add(tfemail_id);

        //user address label.
        address = new JLabel("Address:");
        address.setFont(new Font("Arial", Font.PLAIN, 20));
        address.setSize(100,20);
        address.setLocation(100,240);
        c.add(address);

        //user address data entry field.
        taaddress = new JTextArea();
        taaddress.setFont(new Font("Arial", Font.PLAIN, 15));
        taaddress.setSize(200,60);
        taaddress.setLocation(200,245);
        taaddress.setLineWrap(true);
        c.add(taaddress);

        //user password label.
        password = new JLabel("Password:");
        password.setFont(new Font("Arial", Font.PLAIN, 20));
        password.setSize(100,20);
        password.setLocation(100,320);
        c.add(password);

        //user password data entry field.
        tfpassword = new JPasswordField();
        tfpassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tfpassword.setSize(200,30);
        tfpassword.setLocation(200,315);
        c.add(tfpassword);

        //user confirm password label.
        c_password = new JLabel("Confirm Password:");
        c_password.setFont(new Font("Arial", Font.PLAIN, 20));
        c_password.setSize(200,40);
        c_password.setLocation(100,345);
        c.add(c_password);

        //user confirm password data entry field.
        tfc_password = new JPasswordField();
        tfc_password.setFont(new Font("Arial", Font.PLAIN, 15));
        tfc_password.setSize(200,30);
        tfc_password.setLocation(200,375);
        c.add(tfc_password);

        //submit button.
        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 20));
        submit.setSize(100,20);
        submit.setLocation(190,450);
        c.add(submit);

        setVisible(true);
    }
        public static void main(String[] args)
        {
            new RegistrationForm();
        }
}