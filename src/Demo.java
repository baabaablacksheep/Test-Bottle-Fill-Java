import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");

        JPanel panel = new JPanel();
        panel.setLayout(null);
//        panel.setLayout(new GridLayout());
//        panel.setLayout(new FlowLayout());

        JButton button = new JButton();
        button.setText("Press Me");
        button.setBounds(100,100,100,20);

        JTextField textField=new JTextField();
        textField.setBounds(50,50, 150,20);


        button.addActionListener(e -> textField.setText("Welcome to The Jungle"));

        panel.add(button);
        panel.add(textField);



        frame.add(panel);
        frame.setSize(800, 640);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}