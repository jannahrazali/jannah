import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class Calculator {
    private JPanel  Calculator;
    private JTextField txtDisplay;
    private JButton ACButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton button9;


    private double a, b, result;
    String op;


    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());


            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplay.getText().contains(".")) {
                    double pm = Double.parseDouble(txtDisplay.getText());
                    pm = pm * -1;
                    txtDisplay.setText(String.valueOf(pm));
                } else {
                    long PM = Long.parseLong(txtDisplay.getText());
                    PM = PM * -1;
                    txtDisplay.setText(String.valueOf(PM));

                }
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().contains(".")) {
                    txtDisplay.setText(txtDisplay.getText() + button20.getText());
                }
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "+";
                txtDisplay.setText("");

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "-";
                txtDisplay.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "*";
                txtDisplay.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "/";
                txtDisplay.setText("");
            }
        });

        a00Button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                a = Double.parseDouble(txtDisplay.getText());
                op = "%";
                txtDisplay.setText("");
            }
        });
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().isEmpty()) {
                    a = Double.parseDouble(txtDisplay.getText());
                    op = "sin";
                    performCalculation();
                } else {
                    txtDisplay.setText("0.0"); // Handle the case where txtDisplay is empty
                }
            }
        });

        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().isEmpty()) {
                    a = Double.parseDouble(txtDisplay.getText());
                    op = "cos";
                    performCalculation();
                } else {
                    txtDisplay.setText("0.0"); // Handle the case where txtDisplay is empty
                }
            }
        });




        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().isEmpty()) {
                    a = Double.parseDouble(txtDisplay.getText());
                    op = "tan";
                    performCalculation();
                } else {
                    txtDisplay.setText("0.0"); // Handle the case where txtDisplay is empty
                }
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().isEmpty()) {
                    a = Double.parseDouble(txtDisplay.getText());
                    op = "sqrt";
                    performCalculation();
                } else {
                    txtDisplay.setText("0.0"); // Handle the case where txtDisplay is empty
                }
            }
        });


        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (txtDisplay.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    txtDisplay.setText(backspace);
                    ;
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Parse the input as double
                b = Double.parseDouble(txtDisplay.getText());
                performCalculation();
            }
        });

        // Add a KeyListener to the text field to handle Enter key press
        txtDisplay.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    performCalculation();
                }
            }


        });

    }

    private void performCalculation() {
        b = Double.parseDouble(txtDisplay.getText());

        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            if (b != 0) {
                result = a / b;
            } else {
                txtDisplay.setText("Error: Division by zero");
                return; // Exit the method to prevent further execution
            }
        } else if (op.equals("%")) {
            if (b != 0) {
                result = a % b;
            } else {
                txtDisplay.setText("Error: Modulus by zero");
                return; // Exit the method to prevent further execution
            }
        } else if (op.equals("sin")) {
            result = Math.sin(b); // Convert degrees to radians
        } else if (op.equals("cos")) {
            result = Math.cos(b); // Convert degrees to radians
        } else if (op.equals("tan")) {
            result = Math.tan(b); // Convert degrees to radians
        } else if (op.equals("sqrt")) {
            result = Math.sqrt(b);
        }


        txtDisplay.setText(String.valueOf(Double.valueOf(result)));
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("Jannah's Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}