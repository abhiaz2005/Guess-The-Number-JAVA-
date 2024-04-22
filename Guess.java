import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Guess extends JFrame implements ActionListener {
    private JFrame jFrame;
    private JTextField jTextField;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, guess, restart;
    private JLabel jLabel;
    String wrong = "You Guessed Wrong :) Click Restart";
    int rand;

    Guess() {
        rand = (int) (Math.random() * 100) + 1;
        jFrame = new JFrame("Number Guessing Game");
        jLabel = new JLabel("Guess The Number between 1 - 100");
        jTextField = new JTextField();
        jTextField.setBounds(45, 45, 280, 50);
        jLabel.setBounds(50, 10, 250, 30);

        // instance of buttons
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        guess = new JButton("Guess");
        restart = new JButton("Restart");

        // size and position of buttons
        // 1st line
        one.setBounds(50, 100, 60, 60);
        two.setBounds(160, 100, 60, 60);
        three.setBounds(270, 100, 60, 60);
        // 2nd line
        four.setBounds(50, 170, 60, 60);
        five.setBounds(160, 170, 60, 60);
        six.setBounds(270, 170, 60, 60);
        // 3rd line
        seven.setBounds(50, 240, 60, 60);
        eight.setBounds(160, 240, 60, 60);
        nine.setBounds(270, 240, 60, 60);
        // 4th line
        zero.setBounds(50, 310, 60, 60);
        guess.setBounds(140, 310, 100, 60);
        restart.setBounds(250, 310, 100, 60);

        // editable
        jTextField.setEditable(false);

        // add
        jFrame.add(jTextField);
        jFrame.add(jLabel);
        jFrame.add(one);
        jFrame.add(two);
        jFrame.add(three);
        jFrame.add(four);
        jFrame.add(five);
        jFrame.add(six);
        jFrame.add(seven);
        jFrame.add(eight);
        jFrame.add(nine);
        jFrame.add(zero);
        jFrame.add(restart);
        jFrame.add(guess);

        // ActionPerformed
        ActionListeners();

        jLabel.setFont(new java.awt.Font("STKaiti", 1, 15));
        jTextField.setFont(new java.awt.Font("STKaiti", Font.BOLD, 15));
        jFrame.setLayout(null);
        jFrame.getContentPane().setBackground(Color.RED);
        jFrame.setSize(450, 450);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void ActionListeners() {
        // actionlistener
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent one) {
                jTextField.setText(jTextField.getText() + "1");
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent teo) {
                jTextField.setText(jTextField.getText() + "2");
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent three) {
                jTextField.setText(jTextField.getText() + "3");
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent four) {
                jTextField.setText(jTextField.getText() + "4");
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent five) {
                jTextField.setText(jTextField.getText() + "5");
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent six) {
                jTextField.setText(jTextField.getText() + "6");
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent seven) {
                jTextField.setText(jTextField.getText() + "7");
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent eight) {
                jTextField.setText(jTextField.getText() + "8");
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent nine) {
                jTextField.setText(jTextField.getText() + "9");
            }
        });

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent zero) {
                jTextField.setText(jTextField.getText() + "0");
            }
        });

        guess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent zero) {
                int hint1 = rand + (int) (Math.random() * 20) + 1;
                int hint2 = rand - (int) (Math.random() * 20) + 1;
                int choose = Integer.parseInt(jTextField.getText());
                if (rand == choose) {
                    jLabel.setText("Your Choice the correct choice .");
                    jTextField.setText(" Number is: " + choose);
                } else {
                    jTextField.setText("Your Choice :" + choose);
                    jLabel.setText("Number is between " + hint1 + " &" + hint2);
                }
            }
        });

        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent zero) {
                jTextField.setText("");
                jLabel.setText("You can Guess ->");
            }
        });

    }

    public static void main(String[] args) {
        new Guess();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
