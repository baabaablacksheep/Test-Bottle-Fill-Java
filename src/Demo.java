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
        fillButton.setBounds(50,100,100,20);

        drainButton.setText("Drain");
        drainButton.setBounds(170,100,100,20);

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
        textField.setText("Mouse Pressed!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        textField.setText("Mouse Released!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        textField.setText("Mouse Has Entered!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        textField.setText("Mouse Has Gone Away");
    }
}
