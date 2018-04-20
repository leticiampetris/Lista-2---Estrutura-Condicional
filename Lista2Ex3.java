import javax.swing.JOptionPane;

public class Lista2Ex3{

    public static void main(String[]args){

        JOptionPane.showMessageDialog(null,
        "Informe a seguir dois números para executar algumas operações.");

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog
        ("Informe o primeiro número:"));

        double numero2 = Double.parseDouble(JOptionPane.showInputDialog
        ("Informe o segundo número:"));

        int operacao = Integer.parseInt(JOptionPane.showInputDialog(
            "Selecione no menu abaixo a operação desejada e digite o número correspondente:" +
            "\n    MENU" + "\n1        Somar"+ "\n2        Subtrair" + "\n3        Multiplicar" +
            "\n4        Dividir"));

        String sinal = " s ";
        double resultado = 1.0;

        if (operacao==1){
            sinal = " + ";
            resultado = numero1 + numero2;
        }else if (operacao ==2){
            sinal = " - ";
            resultado = numero1 - numero2;
        }else if (operacao ==3){
            sinal = " * ";
            resultado = numero1 * numero2;
        }else{
            sinal = " / ";
            resultado = numero1 / numero2;
        }
        
        JOptionPane.showMessageDialog(null, "O resultado de " + numero1 + sinal + numero2 +
        " é " + resultado + ".");

    }
}