import javax.swing.*;

public class GUI3 extends JFrame {
    private JTextField tfName;
    private JTextField tfPhoneNumber;
    private JTextField tfAddress;
    private JRadioButton ASAPRadioButton;
    private JRadioButton setTimeRadioButton;
    private JCheckBox tfyes;
    private JCheckBox tfno;
    private JLabel tfCutl;
    private JPanel mainPanel3;
    private JButton backButton;
    private JButton proceedPaymentButton;


    public GUI3() {
        setContentPane(mainPanel3);
        setTitle(" Welcome to MeowDonald :D ");
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Downloads\\kucingburger.tmp");
        setIconImage(icon.getImage());
        setSize(400, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String[] args) {
        GUI3 myFrame = new GUI3();
    }


}