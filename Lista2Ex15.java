import javax.swing.JOptionPane;

public class Lista2Ex15{

    public static void main(String[]args){

        JOptionPane.showMessageDialog(null,
        "Informe diferentes números nas telas a seguir para verificá-los em ordem decrescente.");

        double numero1 = Double.parseDouble (JOptionPane.showInputDialog("Informe o primeiro número:"));

        double numero2 = Double.parseDouble (JOptionPane.showInputDialog("Informe o segundo número:"));

        double numero3 = Double.parseDouble (JOptionPane.showInputDialog("Informe o terceiro número:"));

        if (numero1 <= numero3 && numero1 <= numero2 && numero2 <= numero3) {
            JOptionPane.showMessageDialog (null, "Os números informados, em ordem decrescente, são:" +
        "\n" + numero3 + " , " + numero2 + " , " + numero1);
        }else if (numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1) {
            JOptionPane.showMessageDialog (null, "Os números informados, em ordem decrescente, são:" +
        "\n" + numero1 + " , " + numero2 + " , " + numero3);
        }else if (numero1 <= numero3 && numero1 <= numero2 && numero2 >= numero3) {
            JOptionPane.showMessageDialog (null, "Os números informados, em ordem decrescente, são:" +
        "\n" + numero2 + " , " + numero3 + " , " + numero1);
        }else if (numero1 >= numero3 && numero1 >= numero2 && numero2 <= numero3) {
            JOptionPane.showMessageDialog (null, "Os números informados, em ordem decrescente, são:" +
        "\n" + numero1 + " , " + numero3 + " , " + numero2);
        }else if (numero1 <= numero3 && numero1 >= numero2 && numero2 <= numero3) {
            JOptionPane.showMessageDialog (null, "Os números informados, em ordem decrescente, são:" +
        "\n" + numero3 + " , " + numero1 + " , " + numero2);
        }else if (numero1 <= numero3 && numero1 >= numero2 && numero2 <= numero3) {
            JOptionPane.showMessageDialog (null, "Os números informados, em ordem decrescente, são:" +
        "\n" + numero3 + " , " + numero1 + " , " + numero2);
        }else {
            JOptionPane.showMessageDialog (null, "Os números informados, em ordem decrescente, são:" +
        "\n" + numero2 + " , " + numero1 + " , " + numero3);
        }

    }

}    