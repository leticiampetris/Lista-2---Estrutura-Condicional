import javax.swing.JOptionPane;

public class Lista2Ex13{

    public static void main(String[]args){

        JOptionPane.showMessageDialog(null,
        "Informe números nas telas a seguir para descobrir qual é o menor entre eles.");

        double numero1 = Double.parseDouble (JOptionPane.showInputDialog("Informe o primeiro número:"));

        double numero2 = Double.parseDouble (JOptionPane.showInputDialog("Informe o segundo número:"));

        double numeroMenor = 0.0;

        if (numero1 < numero2) {
            numeroMenor = numero1;
        }else {
            numeroMenor = numero2;
        }

        JOptionPane.showMessageDialog (null, "O menor número é " + numeroMenor + ".");

    }

}    