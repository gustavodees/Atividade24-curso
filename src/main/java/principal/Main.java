package principal;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de vezes que o caso vai se repetir!"));

       for (int i = 0; i < n; i++) {
           double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das médias " + n + " vezes"));
           double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das médias " + n + " vezes"));
           double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das médias " + n + " vezes"));

        double media = ((a * 2.0 + b * 3.0 + c * 5.0) / 10.0);
        JOptionPane.showMessageDialog(null,"O valor da média ponderada é: " + media);
       }


    }
}