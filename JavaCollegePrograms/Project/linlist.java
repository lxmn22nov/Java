import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class linlist
{
      static JFrame jf;
      static JTextField jtf;
      static JRadioButton jrb1, jrb2;
      static JButton jb1, jb2, jb3, jb4;
      static ButtonGroup bg;
      static JLabel jl1, jl2, jl3, jl4, jl5, jl6;
      static LinkedList<Integer> ll;

      //Methods to implement stack and queue.
      public static void Add(int i)
      {
            ll.offer(i);
      }
      public static void Delete()
      {
            ll.poll();
      }
      public static void Push(int i)
      {
            ll.add(i);
      }
      public static void Pop()
      {
            ll.removeLast();
      }

      //Method to get all the elements of list in string format.
      public static String get_elements()
      {
            String elements = "";
            for(int i = 0; i < ll.size(); i++)
            {
                  elements += ll.get(i) + " ";
            }
            return elements;
      }
      public static void main(String[] args)
      {
            //creating a LinkedList.
            ll = new  LinkedList<>();

            //object to generate random integers.
            Random random = new Random();

            //inserting elements in linkedlist.
            for(int i = 0; i < 10; i++)
            {
                  ll.add(random.nextInt(100));
            }

            //initializing JFrame.
            jf = new JFrame("STACK & QUEUE IMPLEMENTATION");
            jf.setVisible(true);
            jf.setSize(400,400);
            jf.setLayout(null);
            jf.setDefaultCloseOperation(3);
            // jf.setResizable(false);

            //Initializing and Adding JLabel.
            jl1 = new JLabel("CURRENT LIST: ");
            jl1.setBounds(50,25,110,25);
            jf.add(jl1);

            jl2 = new JLabel("SELECT OPERATION: ");
            jl2.setBounds(50,150,140,25);
            jf.add(jl2);

            jl3 = new JLabel();
            jl3.setBounds(50,185,30,20);
            jf.add(jl3);

            jl4 = new JLabel();
            jl4.setBounds(50,215,30,20);
            jf.add(jl4);

            jl5 = new JLabel();
            jl5.setBounds(50,245,30,220);
            jf.add(jl5);

            jl6 = new JLabel();
            jl6.setBounds(50,275,30,20);
            jf.add(jl6);

            //Initializing and adding JTextField.
            jtf = new JTextField();
            jtf.setBounds(50, 60, 240, 40);
            jtf.setText(get_elements());
            jf.add(jtf);

            //Initializing and adding JRadio buttons.
            jrb1 = new JRadioButton("STACK");
            jrb1.setBounds(50, 110, 75, 30);
            jf.add(jrb1);

            jrb2 = new JRadioButton("QUEUE");
            jrb2.setBounds(135, 110, 75, 30);
            jf.add(jrb2);

            //initializing  ButtonGroup and adding Radio Buttons to it.
            bg = new ButtonGroup();
            bg.add(jrb1);
            bg.add(jrb2);

            //Initializing and adding JButtons.
            jb1 = new JButton("PUSH");
            jb1.setBounds(85,185,100,25);
            jb1.addActionListener(new Action1());
            jf.add(jb1);

            jb2 = new JButton("POP");
            jb2.setBounds(85,215,100,25);
            jb2.addActionListener(new Action2());
            jf.add(jb2);

            jb3 = new JButton("ADD");
            jb3.setBounds(85,245,100,25);
            jb3.addActionListener(new Action3());
            jf.add(jb3);

            jb4 = new JButton("DELETE");
            jb4.setBounds(85,275,100,25);
            jb4.addActionListener(new Action4());
            jf.add(jb4);
      }
      //ActionListener for push button.
      static class Action1 implements ActionListener
      {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                  if(jrb1.isSelected())
                  {
                        try
                        {
                              int x = Integer.parseInt(jtf.getText());
                              Push(x);
                              jtf.setText(get_elements());
                              JOptionPane.showMessageDialog(jf, "ELEMENT PUSHED INTO THE STACK.");                              
                        }
                        catch(NumberFormatException e1)
                        {
                              JOptionPane.showMessageDialog(jf, "INVALID INPUT FOR THE OPERATION.");
                              jtf.setText(get_elements());
                        }
                  }
                  else if(jrb2.isSelected())
                  {
                        JOptionPane.showMessageDialog(jf, "PUSH OPERATION CANNOT BE PERFOMED ON QUEUE.");
                        jtf.setText(get_elements());
                  }
                  else
                  {
                        JOptionPane.showMessageDialog(jf, "PLEASE SELECT EITHER STACK OR QUEUE TO PERFORM ANY OPERATION.");
                  }
            }
      }

      //ActionListener for POP button.
      static class Action2 implements ActionListener
      {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                  if(jrb1.isSelected())
                  {
                        if(ll.size() == 0)
                        {
                              JOptionPane.showMessageDialog(jf, "CANNOT POP ELEMENT FROM AN EMPTY STACK.");
                        }
                        else
                        {
                              Pop();
                              jtf.setText(get_elements());
                              JOptionPane.showMessageDialog(jf, "ELEMENTS POPPED FROM THE STACK.");
                        }
                  }
                  else if(jrb2.isSelected())
                  {
                        JOptionPane.showMessageDialog(jf, "POP OPERATION CANNOT BE PERORMED ON QUEUE.");
                        jtf.setText(get_elements());
                  }
                  else
                  {
                        JOptionPane.showMessageDialog(jf, "PLEASE SELECT EITHER STACK OR QUEUE TO PERFORM ANY OPERATION.");
                  }
            }
      }

      //ActionListener for add Button.
      static class Action3 implements ActionListener
      {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                  if(jrb2.isSelected())
                  {
                        try
                        {
                              int x = Integer.parseInt(jtf.getText());
                              Add(x);
                              jtf.setText(get_elements());
                              JOptionPane.showMessageDialog(jf, "ELEMENT ADDED TO THE QUEUE.");
                        }
                        catch(NumberFormatException e1)
                        {
                              JOptionPane.showMessageDialog(jf, "INVALID INPUT FOR THE OPERATION.");
                              jtf.setText(get_elements());
                        }
                  }
                  else if(jrb1.isSelected())
                  {
                        JOptionPane.showMessageDialog(jf, "ADD OPERATION CANNOT BE PERFORMED ON STACK.");
                        jtf.setText(get_elements());
                  }
                  else
                  {
                        JOptionPane.showMessageDialog(jf, "PLEASE SELECT EITHER STACK OR QUEUE TO PERFORM ANY OPERATION.");
                  }
            }
      }

      //ActionListener for DELETE button.
      static class Action4 implements ActionListener
      {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                  if(jrb2.isSelected())
                  {
                        if(ll.size() == 0)
                        {
                              JOptionPane.showMessageDialog(jf, "CANNOT DELETE ELEMENT FROM AN EMPTY QUEUE.");
                        }
                        else
                        {
                              Delete();
                              jtf.setText(get_elements());
                              JOptionPane.showMessageDialog(jf, "ELEMENT DELETED FROM THE QUEUE.");
                        }
                  }
                  else if(jrb1.isSelected())
                  {
                        JOptionPane.showMessageDialog(jf, "DELETE OPERATION CANNOT BE PERFORMED ON STACK.");
                        jtf.setText(get_elements());
                  }
                  else
                  {
                        JOptionPane.showMessageDialog(jf, "PLEASE SELECT EITHER STACK OR QUEUE TO PERFORM ANY OPERATION.");
                  }
            }
      }
}