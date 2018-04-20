import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Lista2Ex21{

    public static void main(String[]args){

        JOptionPane.showMessageDialog(null,
        "Informe nas telas seguintes as medidas dos 3 lados de um triângulo.");

        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira medida:"));
        
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda medida:"));
        
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira medida:"));

        String triangulo = "";

        if (lado1 >= (lado2 + lado3) || lado2 >= (lado1 + lado3) || lado3 >= (lado1 + lado2)) {
            triangulo = "não pode ser um triângulo.";
            JOptionPane.showMessageDialog(null, "A figura cujas medidas foram informadas " +
            triangulo, "ERRO",
            JOptionPane.ERROR_MESSAGE,
            null);
        }else if (lado1 == lado2 && lado2 == lado3) {
            triangulo = "é um triângulo equilátero.";
            JOptionPane.showMessageDialog(null, "A figura cujas medidas foram informadas " +
            triangulo, null,
            JOptionPane.ERROR_MESSAGE,
            new ImageIcon(
            Lista2Ex21.class.getResource("equilatero.png")
            ));
        }else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            triangulo = "é um triângulo isósceles.";
        }else {
            triangulo = "é um triângulo escaleno.";
        }
             
              
    }
}