import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIjannah {
    public JPanel mainpanel; // JPanel to hold the main components
    private JTextField textfieldwordinsert;
    private JButton countButton;
    private JButton padColourButton;
    private JLabel wordcountlabel;


    public GUIjannah() { // Constructor for GUIjannah class
    countButton.addActionListener(new ActionListener() { // Add ActionListener to the countButton
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == countButton) {   //the formula @ function for the counting the word user has input
                String text = textfieldwordinsert.getText(); // Get the text frominput JTextField
                String words[] = text.split("\\s"); // Split the text into an array
                wordcountlabel.setText("Word Counter: " + words.length); // Set the text of the wordcountlabel to display the word count
            }

        }
    });
}
    public static void main(String[] args) {
        JFrame frame = new JFrame("Word Count Tool"); // Create a JFrame with the title "Word Count Tool"
        frame.setContentPane(new GUIjannah().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true); // make it visible to the user
    }
}
