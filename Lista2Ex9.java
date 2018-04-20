import javax.swing.JOptionPane;

public class Lista2Ex9{

    public static void main(String[]args){

        JOptionPane.showMessageDialog(null,
        "Digite as medidas de quatro lados de uma determinada figura.");
        
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira medida:"));

        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda medida:"));

        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira medida:"));

        double lado4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta medida:"));

        String figura = "";

        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado4) {
            figura = "pode ser um quadrado.";
        }else {
            figura = "não pode ser um quadrado.";
        }

        JOptionPane.showMessageDialog(null,
        "A figura cujas medidas foram informadas " + figura);

    }

}

    