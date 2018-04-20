import javax.swing.JOptionPane;

public class Lista2Ex5{

    public static void main(String[]args){

Double numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));

String resposta = "impar";

if (numero %2!=0){
    resposta = " é ímpar! ";
}else{
    resposta = " não é ímpar!";
}
    JOptionPane.showMessageDialog(null, "O número " + numero + resposta);
    }

}