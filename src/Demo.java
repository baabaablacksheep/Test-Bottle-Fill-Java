import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Demo implements MouseListener {

    static JButton fillButton = new JButton();
    static JButton drainButton = new JButton();
    static JTextField textField = new JTextField();
    static JLabel flaskImageLabel;
    static ImageIcon flaskImage;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Bottle Fill Example");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        flaskImage = new ImageIcon("./resources/flask.png");
        flaskImageLabel = new JLabel(flaskImage);
        flaskImageLabel.setBounds(0,0,628,720);

        fillButton.setText("Fill");
        fillButton.setBounds(50, 750, 80, 20);

        drainButton.setText("Drain");
        drainButton.setBounds(200, 750, 80, 20);

        fillButton.addMouseListener(new Demo());
        drainButton.addMouseListener(new Demo());

        textField = new JTextField();
        textField.setBounds(50, 50, 250, 20);

        panel.add(flaskImageLabel);
        panel.add(fillButton);
        panel.add(drainButton);
        panel.add(textField);


        frame.add(panel);
        frame.setSize(630, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource().equals(fillButton)) {
            FillThread obj=new FillThread("First Thread");
            obj.start();
            //textField.setText("Mouse Pressed By Fill!");

        } else {
            DrainThread obj=new DrainThread("Second Thread");
            obj.start();
            //textField.setText("Mouse Pressed By Drain!");
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource().equals(fillButton)) {
            textField.setText("Mouse Released By Fill!");
        } else {
            textField.setText("Mouse Released By Drain!");
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource().equals(fillButton)) {
            textField.setText("Mouse Has Entered to Fill!");
        } else {
            textField.setText("Mouse Has Entered to Drain!");
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource().equals(fillButton)) {
            textField.setText("Mouse Has Gone Away From Fill");
        } else {
            textField.setText("Mouse Has Gone Away From Drain");
        }
    }
}

class FillThread implements Runnable{

    private Thread t;
    private String threadName;

    public FillThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        new Demo().textField.setText("Ha HA Ha Thread Runs!");
    }
    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
class DrainThread implements Runnable{

    private Thread t;
    private String threadName;

    public DrainThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        new Demo().textField.setText("Ha HA Ha Second Thread Runs!");
    }
    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
