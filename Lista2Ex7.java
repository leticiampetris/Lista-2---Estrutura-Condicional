import javax.swing.JOptionPane;

public class Lista2Ex7{

    public static void main(String[]args){

        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        String texto = "";

        if(numero % 2 == 0){
            texto = "é par";
        }else{
            texto = "é ímpar";
        }
    
        if(numero > 0){
            texto = texto + "\né positivo";
        }else if(numero == 0){
            texto = texto + "\né neutro";
        }else{
            texto = texto + "\né negativo";
        }

        if(numero > 10){
            texto = texto + "\né maior que 10";
        }else{
            texto = texto + "\nnão é maior que 10";
        }

        if(numero <= 50){
            texto = texto + "\né menor ou igual a 50";
        }else{
            texto = texto + "\nnão é menor ou igual a 50";
        }    

        if (numero < -10){
            texto = texto + "\né menor que -10";
        }else{
            texto = texto + "\nnão é menor que -10";
        }

        if (numero >= 30){
            texto = texto + "\né maior ou igual a 30";
        }else{
            texto = texto + "\nnão é maior ou igual a 30";
        }

        if (numero != 1){
            texto = texto + "\né diferente de 1";
        }else{
            texto = texto + "\nnão é diferente de 1";
        }

    JOptionPane.showMessageDialog(null, "O número " + numero +
    ":\n" + texto);

    }
}