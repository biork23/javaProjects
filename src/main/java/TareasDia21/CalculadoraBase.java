package TareasDia21;

import java.awt.*;

import javax.management.loading.PrivateClassLoader;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class CalculadoraBase extends JFrame implements ActionListener{

    private JTextField textField;
    
    private double primerNumero;
    private String operacionPendiente;

    private JPanel contentPane;
    

    public CalculadoraBase() {
        setTitle("calculadora");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,4));

        String[] botones ={
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C"
        };

        for(String boton : botones) {
            JButton button = new JButton(boton);
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

     public void actionPerformed(ActionEvent e) {
        String valorBoton = ((JButton) e.getSource()).getText();

        switch (valorBoton) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case ".":
                textField.setText(textField.getText() + valorBoton);
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                primerNumero = Double.parseDouble(textField.getText());
                operacionPendiente = valorBoton;
                textField.setText("");
                break;
            case "=":
                double segundoNumero = Double.parseDouble(textField.getText());
                double resultado = calcularResultado(primerNumero, segundoNumero, operacionPendiente);
                textField.setText(String.valueOf(resultado));
                break;
                
            case "C":
                textField.setText("");
                break;
        }
    }

    private double calcularResultado(double primerNumero, double segundoNumero, String operacion) {
        switch (operacion) {
            case "+":
                return primerNumero + segundoNumero;
            case "-":
                return primerNumero - segundoNumero;
            case "*":
                return primerNumero * segundoNumero;
            case "/":
                return primerNumero / segundoNumero;
            default:
                return 0;
                
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraBase calculadora = new CalculadoraBase();
            calculadora.setVisible(true);
        });
    }

}

