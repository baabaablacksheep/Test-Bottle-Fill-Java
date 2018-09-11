import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Demo {
    public static JButton button= new JButton();
    public static JTextField textField = new JTextField();
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        button.setText("Press Me");
        button.setBounds(100,100,100,20);

        textField=new JTextField();
        textField.setBounds(50,50, 150,20);


        //button.addActionListener(e -> textField.setText("Welcome to The Jungle"));

        panel.add(button);
        panel.add(textField);



        frame.add(panel);
        frame.setSize(800, 640);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MouseObserver implements MouseListener {

    MouseObserver(){
        Demo.button.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {
        Demo.textField.setText("Mouse Clicked.........");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Demo.textField.setText("Mouse Released.........");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
