import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator {
    private JPanel Caculator;
    private JTextField txtDisplay1;
    private JButton button1;
    private JButton button2;
    private JButton xButton;
    private JButton button4;
    private JButton ACButton;
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
    double a, b, result;
    String op;
    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText("");
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText(txtDisplay1.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText(txtDisplay1.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText(txtDisplay1.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText(txtDisplay1.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText(txtDisplay1.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText(txtDisplay1.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText(txtDisplay1.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText(txtDisplay1.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText(txtDisplay1.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText(txtDisplay1.getText() + a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay1.setText(txtDisplay1.getText() + a00Button.getText());
            }
        });

        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay1.getText().contains(".")) {
                    txtDisplay1.setText(txtDisplay1.getText() + button20.getText());
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay1.getText());
                op = "+";
                txtDisplay1.setText(" ");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay1.getText());
                op = "-";
                txtDisplay1.setText(" ");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay1.getText());
                op = "*";
                txtDisplay1.setText(" ");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay1.getText());
                op = "/";
                txtDisplay1.setText(" ");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                int length = txtDisplay1.getText().length();

                if (length > 0) {
                    StringBuilder strB = new StringBuilder(txtDisplay1.getText());
                    strB.deleteCharAt(length - 1);
                    backspace = String.valueOf(strB);
                    txtDisplay1.setText((backspace));
                }
            }
        });

        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplay1.getText().contains("."))
                {
                    double pm = Double.parseDouble(txtDisplay1.getText());
                    pm = pm*(-1);
                    txtDisplay1.setText(String.valueOf(pm));
                } else
                {
                    int pm = Integer.parseInt(txtDisplay1.getText());
                    pm = pm*(-1)
                    ;
                    txtDisplay1.setText(String.valueOf(pm));
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtDisplay1.getText());

                if (op == "+") {
                    result = a + b;
                    txtDisplay1.setText(String.valueOf(result));
                } else if (op == "-") {
                    result = a - b;
                    txtDisplay1.setText(String.valueOf(result));
                } else if (op == "*") {
                    result = a * b;
                    txtDisplay1.setText(String.valueOf(result));
                } else if (op == "/") {
                    result = a / b;
                    txtDisplay1.setText(String.valueOf(result));
                }
            }
        });



    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Caculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
