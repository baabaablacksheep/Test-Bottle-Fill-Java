import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Demo implements MouseListener{

    private static JButton fillButton = new JButton();
    private static JButton drainButton = new JButton();
    private static JTextField textField = new JTextField();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bottle Fill Example");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        fillButton.setText("Fill");
        fillButton.setBounds(50,100,80,20);

        drainButton.setText("Drain");
        drainButton.setBounds(200,100,80,20);

        fillButton.addMouseListener(new Demo());
        drainButton.addMouseListener(new Demo());

        textField=new JTextField();
        textField.setBounds(50,50, 250,20);


        //fillButton.addActionListener(e -> textField.setText("Welcome to The Jungle"));

        panel.add(fillButton);
        panel.add(drainButton);
        panel.add(textField);



        frame.add(panel);
        frame.setSize(800, 640);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource().equals(fillButton)){
            textField.setText("Mouse Pressed By Fill!");
        }
        else{
            textField.setText("Mouse Pressed By Drain!");
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource().equals(fillButton)){
            textField.setText("Mouse Released By Fill!");
        }
        else{
            textField.setText("Mouse Released By Drain!");
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource().equals(fillButton)){
            textField.setText("Mouse Has Entered to Fill!");
        }
        else{
            textField.setText("Mouse Has Entered to Drain!");
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource().equals(fillButton)) {
            textField.setText("Mouse Has Gone Away From Fill");
        }
        else{
            textField.setText("Mouse Has Gone Away From Drain");
        }
    }
}
