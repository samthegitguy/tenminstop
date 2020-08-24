import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
 
/* FrameDemo.java requires no other files. */
public class main {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Time for your break. Time for your break. Time for your break. Very obnoxious");
 
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(1650, 1080));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
 
        //Display the window.
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);
    }
    public static void main(String[] args) throws InterruptedException {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        for (int i = 0; i < 10000; i++) { // i < arbritary 
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
            Thread.sleep(600000);
             
          }
    }
}
