import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Lista2Ex19{

    public static void main(String[]args){

        double saldoinicial = Double.parseDouble(JOptionPane.showInputDialog(null, 
        "Digite seu saldo no primeiro dia do mês:",
        "SALDO BANCÁRIO",
        JOptionPane.QUESTION_MESSAGE,
        new ImageIcon(Lista2Ex19.class.getResource("budget.png")), null, null).toString());

        double parcela = Double.parseDouble(JOptionPane.showInputDialog(null, 
        "Digite o valor das parcelas de empréstimo pagas:",
        "SALDO BANCÁRIO",
        JOptionPane.QUESTION_MESSAGE,
        new ImageIcon(Lista2Ex19.class.getResource("budget.png")), null, null).toString());

        double saques = Double.parseDouble(JOptionPane.showInputDialog(null, 
        "Digite o valor dos saques efetuados:",
        "SALDO BANCÁRIO",
        JOptionPane.QUESTION_MESSAGE,
        new ImageIcon(Lista2Ex19.class.getResource("budget.png")), null, null).toString());        

        double saldofinal = saldoinicial - parcela - saques;

        String situacao = "";

        if (saldofinal == 0.0) {
            situacao = "Saldo Neutro";
            JOptionPane.showMessageDialog (null,
            "Seu saldo atual: R$ " + saldofinal +
            "\nSua situação atual: " + situacao,
            "SALDO BANCÁRIO",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex19.class.getResource("nomoney.png")           
            ));
        }else if (saldofinal > 0.0) {
            situacao = "Saldo Positivo";   
            JOptionPane.showMessageDialog (null,
            "Seu saldo atual: R$ " + saldofinal +
            "\nSua situação atual: " + situacao,
            "SALDO BANCÁRIO",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex19.class.getResource("money.png")
            ));
        }else {
            situacao = "Saldo Negativo";
            JOptionPane.showMessageDialog (null,
            "Seu saldo atual: R$ " + saldofinal +
            "\nSua situação atual: " + situacao,
            "SALDO BANCÁRIO",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
            Lista2Ex19.class.getResource("nomoney.png")          
            ));
        }      
    }
}