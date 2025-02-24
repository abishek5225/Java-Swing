package Form;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Form {
    public static void main(String[] args) {

        JFrame frame = new JFrame("User Form");
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(30, 30,30));

        JLabel label= new JLabel("Enter Name:");
        label.setBounds(20,20,100,25);
        label.setForeground(Color.WHITE);

        JTextField textField = new JTextField();
        textField.setBounds(120,20,180,30);
        textField.setBackground(new Color(50,50,50));
        textField.setForeground(Color.WHITE);

        JButton button = new JButton("submit");
        button.setBounds(100,70,120,35);
        button.setBackground(new Color(70,130,180));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD,14));

        JLabel outputLabel = new JLabel();
        outputLabel.setBounds(20,120,300,30);
        outputLabel.setForeground(Color.CYAN);
        outputLabel.setFont(new Font("Arial", Font.BOLD, 14));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                outputLabel.setText("Hello"+ name + "!");
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(outputLabel);

        frame.setVisible(true);

    }
}
