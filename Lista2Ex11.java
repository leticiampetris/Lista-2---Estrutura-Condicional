import javax.swing.JOptionPane;

public class Lista2Ex11{

    public static void main(String[]args){

    double nota1 = Double.parseDouble (JOptionPane.showInputDialog(
    "Informe sua primeira nota:"));

    double nota2 = Double.parseDouble (JOptionPane.showInputDialog(
    "Informe sua segunda nota:"));

    double nota3 = Double.parseDouble (JOptionPane.showInputDialog(
    "Informe sua terceira nota:"));

    double nota4 = Double.parseDouble (JOptionPane.showInputDialog(
    "Informe sua quarta nota:"));

    double nota5 = Double.parseDouble (JOptionPane.showInputDialog(
    "Informe sua quinta nota:"));

    double media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;

    String resultado = "";

    if (media < 6.0) {
        resultado = "reprovado";
    }else if (media < 8.0) {
        resultado = "em ecuperação";
    }else {
        resultado = "aprovado";
    }

    JOptionPane.showMessageDialog (null, "RESULTADO:" +
    "\nSua média: " + media +
    "\nVocê está " + resultado + "!");

    }

}    