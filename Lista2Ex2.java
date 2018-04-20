import javax.swing.JOptionPane;

public class Lista2Ex2{

    public static void main(String[]args){

Double numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));

String resposta = "negativo";

if (numero<0){
    resposta = "é negativo! ";
}else{
    resposta = "não é negativo!";
}
    JOptionPane.showMessageDialog(null, "O número informado " + resposta);
    }

}