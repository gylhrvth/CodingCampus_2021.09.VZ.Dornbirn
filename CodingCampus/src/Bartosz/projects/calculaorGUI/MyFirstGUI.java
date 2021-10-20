package Bartosz.projects.calculaorGUI;

import javax.swing.*;

public class MyFirstGUI extends JFrame {
    public JLabel inputNumber1;
    public JLabel inputNumber2;
    public JLabel inputOperator;

    public JTextField userInput;

    public JButton result;

    public String operator;

    public MyFirstGUI(String Title, String operator) {

        setTitle(Title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Layout

        setSize(300, 400);
        setResizable(false);

        initComponents();

        add(inputNumber1);
        add(inputNumber2);
        add(inputOperator);

        add(userInput);
        add(result);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initComponents() {
        inputNumber1 = new JLabel("Zahl1");
        inputNumber2 = new JLabel("Zahl2");

        inputOperator = new JLabel(operator);

        userInput = new JTextField(8);

        result = new JButton("Result is: ");
    }

}
