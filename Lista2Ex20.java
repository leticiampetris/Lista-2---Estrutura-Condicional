import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Lista2Ex20{

    public static void main(String[]args){

        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, 
        "Digite seu peso:",
        "CÁLCULO DO IMC",
        JOptionPane.QUESTION_MESSAGE,
        null, null, null).toString());

        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, 
        "Digite sua altura:",
        "CÁLCULO DO IMC",
        JOptionPane.QUESTION_MESSAGE,
        null, null, null).toString());

        double imc = peso / (altura * altura);

        String classificacao = "";

        if (imc < 10) {
            classificacao = "Desnutrição Grau V";
            JOptionPane.showMessageDialog (null,
            "Seu IMC: " + imc +
            "\nSua situação atual: " + classificacao,
            "CÁLCULO DO IMC",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex20.class.getResource("unhealthy.png")           
            ));
        }else if (imc < 13) {
            classificacao = "Desnutrição Grau IV";
            JOptionPane.showMessageDialog (null,
            "Seu IMC: " + imc +
            "\nSua situação atual: " + classificacao,
            "CÁLCULO DO IMC",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex20.class.getResource("unhealthy.png")           
            ));
        }else if (imc < 16) {
            classificacao = "Desnutrição Grau III";
            JOptionPane.showMessageDialog (null,
            "Seu IMC: " + imc +
            "\nSua situação atual: " + classificacao,
            "CÁLCULO DO IMC",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex20.class.getResource("unhealthy.png")           
            ));
        }else if (imc < 17) {
            classificacao = "Desnutrição Grau II";
            JOptionPane.showMessageDialog (null,
            "Seu IMC: " + imc +
            "\nSua situação atual: " + classificacao,
            "CÁLCULO DO IMC",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex20.class.getResource("unhealthy.png")           
            ));
        }else if (imc < 18.5) {
            classificacao = "Desnutrição Grau I";
            JOptionPane.showMessageDialog (null,
            "Seu IMC: " + imc +
            "\nSua situação atual: " + classificacao,
            "CÁLCULO DO IMC",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex20.class.getResource("unhealthy.png")           
            ));
        }else if (imc < 25) {
            classificacao = "Normal";
            JOptionPane.showMessageDialog (null,
            "Seu IMC: " + imc +
            "\nSua situação atual: " + classificacao,
            "CÁLCULO DO IMC",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex20.class.getResource("healthy.png")           
            ));
        }else if (imc < 30) {
            classificacao = "Pré-Obesidade";
            JOptionPane.showMessageDialog (null,
            "Seu IMC: " + imc +
            "\nSua situação atual: " + classificacao,
            "CÁLCULO DO IMC",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex20.class.getResource("fat.png")           
            ));
        }else if (imc < 35) {
            classificacao = "Obesidade grau 1";
            JOptionPane.showMessageDialog (null,
            "Seu IMC: " + imc +
            "\nSua situação atual: " + classificacao,
            "CÁLCULO DO IMC",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex20.class.getResource("fat.png")           
            ));
        }else if (imc < 40) {
            classificacao = "Obesidade grau II";
            JOptionPane.showMessageDialog (null,
            "Seu IMC: " + imc +
            "\nSua situação atual: " + classificacao,
            "CÁLCULO DO IMC",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex20.class.getResource("fat.png")           
            ));
        }else {
                classificacao = "Obesidade grau III";
                JOptionPane.showMessageDialog (null,
                "Seu IMC: " + imc +
                "\nSua situação atual: " + classificacao,
                "CÁLCULO DO IMC",
                JOptionPane.WARNING_MESSAGE,
                new ImageIcon(
                Lista2Ex20.class.getResource("fat.png")           
                ));
        }
              
    }
}