import javax.swing.JOptionPane;

public class Lista2Ex1{

    public static void main(String[]args){

Double numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));

String resposta = "positivo";

if (numero>0){
    resposta = "é positivo! ";
}else{
    resposta = "não é positivo!";
}
    JOptionPane.showMessageDialog(null, "O número informado " + resposta);
    }

}