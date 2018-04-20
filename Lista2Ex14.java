import javax.swing.JOptionPane;

public class Lista2Ex14{

    public static void main(String[]args){

        JOptionPane.showMessageDialog(null,
        "Informe diferentes números nas telas a seguir para verificá-los em ordem crescente.");

        double numero1 = Double.parseDouble (JOptionPane.showInputDialog("Informe o primeiro número:"));

        double numero2 = Double.parseDouble (JOptionPane.showInputDialog("Informe o segundo número:"));

        double numero3 = Double.parseDouble (JOptionPane.showInputDialog("Informe o terceiro número:"));

        double sequencia1 = 0.0;

        double sequencia2 = 0.0;

        double sequencia3 = 0.0;

        if (numero1 < numero2 && numero1 < numero3) {
            sequencia1 = numero1;
        }else if (numero2 < numero1 && numero2 < numero3) {
            sequencia1 = numero2;          
        }else if (numero2 == numero3 && numero1 < numero2) {
            sequencia1 = numero1;
        }else if (numero1 == numero3 && numero2 < numero1) {
            sequencia1 = numero2;
        }else if (numero1 == numero2 && numero3 > numero2) {
            sequencia1 = numero1;
        }else if (numero1 == numero3 && numero2 > numero1) {
            sequencia1 = numero1;
        }else {
            sequencia1 = numero3;
        }

        if (numero1 < numero2 && numero1 > numero3) {
            sequencia2 = numero1;
        }else if (numero1 > numero2 && numero1 < numero3) {
            sequencia2 = numero1;
        }else if (numero3 > numero1 && numero3 < numero2) {
            sequencia2 = numero3;
        }else if (numero3 < numero2 && numero3 > numero1) {
            sequencia2 = numero3;
        }else {
            sequencia2 = numero2;
        }

        if (numero3 > numero2 && numero3 > numero1) {
            sequencia3 = numero3;
        }else if (numero2 > numero1 && numero2 > numero3) {
            sequencia3 = numero2;
        }else if (numero2 == numero3 && numero3 > numero2) {
            sequencia3 = numero3;
        }else if (numero1 == numero3 && numero2 > numero1) {
            sequencia3 = numero2;
        }else if (numero2 == numero3 && numero1 < numero2) {
            sequencia3 = numero3;
        }else if (numero1 == numero3 && numero2 < numero1) {
            sequencia3 = numero3;          
        }else {
            sequencia3 = numero1;
        } 

        

        JOptionPane.showMessageDialog (null, "Os números informados, em ordem crescente, são:" +
        "\n" + sequencia1 + " , " + sequencia2 + " , " + sequencia3);

    }

}    