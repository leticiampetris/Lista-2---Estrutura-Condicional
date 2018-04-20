import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Lista2Ex19{

    public static void main(String[]args){

        double saldoinicial = Double.parseDouble(JOptionPane.showInputDialog(null, 
        "Digite seu saldo no primeiro dia do mês:",
        "SALDO BANCÁRIO",
        JOptionPane.QUESTION_MESSAGE,
        new ImageIcon(Lista2Ex19.class.getResource("money.png")), null, null).toString());

        double saldoinicial = Double.parseDouble(JOptionPane.showInputDialog(null, 
        "Digite seu saldo no primeiro dia do mês:",
        "SALDO BANCÁRIO",
        JOptionPane.QUESTION_MESSAGE,
        new ImageIcon(Lista2Ex19.class.getResource("money.png")), null, null).toString());



        String escala = JOptionPane.showInputDialog (null,
        "Selecione a escala de origem:",
        "CONVERSÃO DE TEMPERATURA",
        JOptionPane.QUESTION_MESSAGE,
        new ImageIcon(
            Lista2Ex16.class.getResource("thermometer.png")),
        new Object []{
            "", "Celsius", "Farenheit", "Kelvin"
            }, "").toString();

        String escala2 = JOptionPane.showInputDialog (null,
        "Selecione a escala para conversão:",
        "CONVERSÃO DE TEMPERATURA",
        JOptionPane.WARNING_MESSAGE,
        new ImageIcon(
            Lista2Ex16.class.getResource("thermometer.png")),
        new Object []{
            "", "Celsius", "Farenheit", "Kelvin"
            }, "").toString();

        double temperatura2 = 0.0;

        if (escala.equals("Celsius") && escala2.equals("Farenheit")) {
            temperatura2 = temperatura * 1.8 + 32;
        } else if (escala.equals("Farenheit") && escala2.equals("Celsius")) {
            temperatura2 = (temperatura - 32) / 1.8;
        } else if (escala.equals("Farenheit") && escala2.equals("Kelvin")) {
            temperatura2 = (temperatura -32) /1.8 + 273.15;
        } else if (escala.equals("Kelvin") && escala2.equals("Farenheit")) {
            temperatura2 = (temperatura - 273.15 ) * 1.8 + 32;
        } else if (escala.equals("Kelvin") && escala2.equals("Celsius")) {
            temperatura2 = temperatura - 273.15;
        } else if (escala.equals("Celsius") && escala2.equals("Kelvin")) {
            temperatura2 = temperatura + 273.15;
        }


        JOptionPane.showMessageDialog (null,
        "A temperatura " + temperatura + "° " + escala +
        " equivale a " + temperatura2 + "° " + escala2, "CONVERSÃO DE TEMPERATURA",
        JOptionPane.WARNING_MESSAGE,
        new ImageIcon(
            Lista2Ex16.class.getResource("thermometer.png")
        ));

    }

}