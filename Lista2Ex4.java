import javax.swing.JOptionPane;

public class Lista2Ex4{

    public static void main(String[]args){

Double numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));

String resposta = "par";

if (numero %2==0){
    resposta = " é par! ";
}else{
    resposta = " não é par!";
}
    JOptionPane.showMessageDialog(null, "O número " + numero + resposta);
    }

}