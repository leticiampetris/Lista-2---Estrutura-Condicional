import javax.swing.JOptionPane;

public class Lista2Ex12{

    public static void main(String[]args){

        JOptionPane.showMessageDialog(null,
        "Informe números nas telas a seguir para descobrir qual é o maior entre eles.");

        double numero1 = Double.parseDouble (JOptionPane.showInputDialog("Informe o primeiro número:"));

        double numero2 = Double.parseDouble (JOptionPane.showInputDialog("Informe o segundo número:"));

        double numeromaior = 0.0;

        if (numero1 > numero2) {
            numeromaior = numero1;
        }else {
            numeromaior = numero2;
        }

        JOptionPane.showMessageDialog (null, "O maior número é " + numeromaior + ".");

    }

}    