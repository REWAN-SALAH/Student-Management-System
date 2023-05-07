package Project_GUI_v2;
import  java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import static java.awt.Color.*;
import java.awt.*;
import java.io.*;
public class AddStudent extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7,l8;
    JTextField t1, t2, t3, t4,t5;
    JCheckBox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5, checkbox6, checkbox7;
    JButton b;
    JTextArea area2;
    JFrame frame = new JFrame("Student management system");
    AddStudent() {
        frame.setSize(1500, 1500);
        frame.setLayout(null);
        l1 = new JLabel("Add New Student ");
        l1.setBounds(500, 50, 250, 20);
        frame.add(l1);
        l2 = new JLabel("Student First Name :");
        l2.setBounds(50, 100, 250, 20);
        frame.add(l2);
        t1 = new JTextField();
        t1.setBounds(250, 100, 250, 20);
        frame.add(t1);
        l3 = new JLabel("Student Last Name :");
        l3.setBounds(50, 150, 250, 20);
        frame.add(l3);
        t2 = new JTextField();
        t2.setBounds(250, 150, 250, 20);
        frame.add(t2);
        l5 = new JLabel(" ID:");
        l5.setBounds(50, 200, 250, 20);
        frame.add(l5);
        t3 = new JTextField();
        t3.setBounds(250, 200, 250, 20);
        t3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (t3.getText().length() >= 4 )
                    e.consume();
            }
        });
        frame.add(t3);
        frame.add(l5);
        l4 = new JLabel("Choose the courses you want (knowing that minimum number of courses is 3) :");
        l4.setBounds(50, 250, 500, 20);
        frame.add(l4);
        checkbox1 = new JCheckBox(" intro Computer Science ");
        checkbox1.setBounds(50, 280, 500, 20);
        frame.add(checkbox1);
        checkbox2 = new JCheckBox("programming1");
        checkbox2.setBounds(50, 320, 500, 20);
        frame.add(checkbox2);
        checkbox3 = new JCheckBox(" intro to data science");
        checkbox3.setBounds(50, 350, 500, 20);
        frame.add(checkbox3);
        checkbox4 = new JCheckBox(" Linear Algebra");
        checkbox4.setBounds(50, 400, 500, 20);
        frame.add(checkbox4);
        checkbox5 = new JCheckBox(" Calculus ");
        checkbox5.setBounds(50, 450, 500, 20);
        frame.add(checkbox5);
        checkbox6 = new JCheckBox("critical thinking ");
        checkbox6.setBounds(50, 500, 500, 20);
        frame.add(checkbox6);
        checkbox7 = new JCheckBox(" Political Science ");
        checkbox7.setBounds(50, 550, 500, 20);
        frame.add(checkbox7);
        l6 = new JLabel("Show required to pay");
        l6.setBounds(50, 600, 300, 30);
        frame.add(l6);
        b = new JButton("Show ");
        b.setBounds(100, 650, 80, 30);
        b.addActionListener(this);
        frame.add(b);
        l7 = new JLabel("your payment ");
        l7.setBounds(550, 80, 300, 30);
        frame.add(l7);
        t4 = new JTextField();
        t4.setBounds(650, 90, 200, 20);
        frame.add(t4);
        l8= new JLabel("The year you joined ");
        l8.setBounds(550,120,200,30);
        frame.add(l8);
        t5= new JTextField();
        t5.setBounds(700, 120, 100, 30);
        t5.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (t5.getText().length() >= 4 )
                    e.consume();
            }
        });
        frame.add(t5);
        area2 = new JTextArea();
        area2.setBounds(650, 300, 450, 240);
        frame.add(area2);
        final JButton showStatus = new JButton("status ");
        frame.add(showStatus);
        showStatus.setBounds(650,200, 150, 30);
        JButton b2 = new JButton("Reset");
        frame.add(b2);
        b2.setBounds(850, 200, 150, 30);
        b2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(
                            ActionEvent e)
                    {
                        area2.setText("");
                        t1.setText("");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                        t5.setText("");
                    }
                });
        frame.add(b);
        Color c = new Color(213, 158, 72);
        frame.getContentPane().setBackground(c);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        showStatus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area2.setText(
                        "--------------------------------"
                                + "-----------Add New Student ----"
                                + "--------------------------"
                                + "--------------------------"
                                + "-------------------\n");

                area2.setText(area2.getText()
                        + "Student Name: "
                        + t1.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Student last Name: "
                        + t2.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "ID: "
                        + t3.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Your payment : "
                        + t4.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Year you joined  : "
                        + t5.getText()
                        + "\n");
                if (checkbox1.isSelected()) {
                    area2.setText(area2.getText()
                            + "\n"+"Wants to Join in intro to computer science   ");
                }
                if (checkbox2.isSelected()) {
                    area2.setText(area2.getText()
                            +"\n" + "Wants to Join in programming 1  ");
                }

                if (checkbox3.isSelected()) {
                    area2.setText(area2.getText()
                            + "\n"+"Wants to Join in  intro to data science  ");
                }
                if (checkbox4.isSelected()) {
                    area2.setText(area2.getText()
                            + "\n"+"Wants to Join in linear algebra ");
                }
                if (checkbox5.isSelected()) {
                    area2.setText(area2.getText()
                            + "\n"+"Wants to Join in calculus ");
                }
                if (checkbox6.isSelected()) {
                    area2.setText(area2.getText()
                            + "\n"+"Wants to Join in critical thinking  ");
                }
                if (checkbox7.isSelected()) {
                    area2.setText(area2.getText()
                            +"\n"+"Wants to Join in political science");
                }
                if (e.getSource() == showStatus) {
                    try {
                        FileWriter fw
                                = new FileWriter(
                                "student.txt", true);
                        fw.write(area2.getText());
                        fw.close();
                    } catch (Exception ae) {
                        System.out.println(ae);
                    }
                }

                JOptionPane.showMessageDialog(
                        area2, "DATA SAVED SUCCESSFULLY");
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";
        if (checkbox1.isSelected()) {
            amount += 900;
            msg = "intro to computer science(3h) : 900\n";
        }
        if (checkbox2.isSelected()) {
            amount += 900;
            msg += "programming1(3h): 900\n";
        }
        if (checkbox3.isSelected()) {
            amount += 900;
            msg += "intro to data science (3h) : 900\n";
        }
        if (checkbox4.isSelected()) {
            amount += 900;
            msg += "Linear algebra (3h): 900\n";
        }
        if (checkbox5.isSelected()) {
            amount += 600;
            msg += "critical thinking (2h) : 600\n";
        }
        if (checkbox6.isSelected()) {
            amount += 600;
            msg += "political Science (2h) : 600\n";
        }
        msg += "-----------------\n";
        JOptionPane.showMessageDialog(this, msg + "Total: " + amount);
    }
    public static void main(String[] args) {
        new AddStudent();
    }
}