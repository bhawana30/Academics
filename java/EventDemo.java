import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class EventDemo {
JLabel jlab;
EventDemo() {
JFrame jfrm = new JFrame("An Event Example");
jfrm.setLayout(new FlowLayout()); // Specify FlowLayout for the layout manager.
jfrm.setSize(220, 90);
// jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Button b=new Button("alpha");
// JButton jbtnAlpha = new JButton("Alpha");
JButton jbtnBeta = new JButton("Beta");
b.addActionListener(new ActionListener() { // Add action listener for Alpha.
public void actionPerformed(ActionEvent ae) {
jlab.setText("Alpha was pressed.");
}
});
jbtnBeta.addActionListener(new ActionListener() { // Add action listener for Beta.
public void actionPerformed(ActionEvent ae) {
jlab.setText("Beta was pressed.");
}
}
);
jfrm.add(b);
jfrm.add(jbtnBeta);
jlab = new JLabel("Press a button."); // Create a text-based label.
jfrm.add(jlab);
jfrm.setVisible(true);
}
public static void main(String args[]) {
// SwingUtilities.invokeLater(new Runnable() { // Create the frame on the event dispatching thread.
// public void run() {
new EventDemo();
}
// });
}
