import javax.swing.JOptionPane;

public class Lista2Ex6{

    public static void main(String[]args){

Double numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));

String resposta = "dif1";

if (numero!=1){
    resposta = "é diferente de 1! ";
}else{
    resposta = "não é diferente de 1!";
}
    JOptionPane.showMessageDialog(null, "O número informado " + resposta);
    }

}