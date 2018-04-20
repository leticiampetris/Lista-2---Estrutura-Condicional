import javax.swing.JOptionPane;

public class Lista2Ex8{

    public static void main(String[]args){

        String produto1 = JOptionPane.showInputDialog(null, "CARDÁPIO:" +
        "\n" +
        "\nTIPO:            | NOME:      | VALOR:" +
        "\nBolos           | Bolo Brigadeiro      | R$ 29.50" +
        "\nBolos           | Bolo Floresta Negra      | R$  2.00" +
        "\nBolos           | Bolo Leite com Nutella      | R$ 29.23" +
        "\nBolos           | Bolo Mousse de Chocolate      | R$  7.10" +
        "\nBolos           | Bolo Nega Maluca      | R$ 19.33" +
        "\nDoces          | Bomba de Creme      | R$ 17.71"+
        "\nDoces          | Bomba de Morango      | R$  4.82" +
        "\nSanduiches| Filé Mignon com Fritas de Cheddar      | R$ 21.16" +
        "\nSanduiches| Hamburguer com Queijo, Champignon e Rúcula    | R$ 12.70" +
        "\nSanduiches| Provolone com Salame      | R$ 19.70" +
        "\nSanduiches| Vegetariano de Beringela      | R$ 28.22" +
        "\nPizzas          | Calabresa      | R$  8.98" +
        "\nPizzas          | Napolitana      | R$  0.42" +
        "\nPizzas          | Peruana      | R$ 18.36" +
        "\nPizzas          | Portuguesa      | R$ 27.50" +
        "\n" +
        "\nDigite o NOME do primeiro produto desejado:"
        );

        String produto2 = JOptionPane.showInputDialog(null, "CARDÁPIO:" +
        "\n" +
        "\nTIPO:            | NOME:      | VALOR:" +
        "\nBolos           | Bolo Brigadeiro      | R$ 29.50" +
        "\nBolos           | Bolo Floresta Negra      | R$  2.00" +
        "\nBolos           | Bolo Leite com Nutella      | R$ 29.23" +
        "\nBolos           | Bolo Mousse de Chocolate      | R$  7.10" +
        "\nBolos           | Bolo Nega Maluca      | R$ 19.33" +
        "\nDoces          | Bomba de Creme      | R$ 17.71"+
        "\nDoces          | Bomba de Morango      | R$  4.82" +
        "\nSanduiches| Filé Mignon com Fritas de Cheddar      | R$ 21.16" +
        "\nSanduiches| Hamburguer com Queijo, Champignon e Rúcula    | R$ 12.70" +
        "\nSanduiches| Provolone com Salame      | R$ 19.70" +
        "\nSanduiches| Vegetariano de Beringela      | R$ 28.22" +
        "\nPizzas          | Calabresa      | R$  8.98" +
        "\nPizzas          | Napolitana      | R$  0.42" +
        "\nPizzas          | Peruana      | R$ 18.36" +
        "\nPizzas          | Portuguesa      | R$ 27.50" +
        "\n" +
        "\nDigite o NOME do segundo produto desejado:"
        );

        String produto3 = JOptionPane.showInputDialog(null, "CARDÁPIO:" +
        "\n" +
        "\nTIPO:            | NOME:      | VALOR:" +
        "\nBolos           | Bolo Brigadeiro      | R$ 29.50" +
        "\nBolos           | Bolo Floresta Negra      | R$  2.00" +
        "\nBolos           | Bolo Leite com Nutella      | R$ 29.23" +
        "\nBolos           | Bolo Mousse de Chocolate      | R$  7.10" +
        "\nBolos           | Bolo Nega Maluca      | R$ 19.33" +
        "\nDoces          | Bomba de Creme      | R$ 17.71"+
        "\nDoces          | Bomba de Morango      | R$  4.82" +
        "\nSanduiches| Filé Mignon com Fritas de Cheddar    | R$ 21.16" +
        "\nSanduiches| Hamburguer com Queijo, Champignon e Rúcula    | R$ 12.70" +
        "\nSanduiches| Provolone com Salame      | R$ 19.70" +
        "\nSanduiches| Vegetariano de Beringela      | R$ 28.22" +
        "\nPizzas          | Calabresa      | R$  8.98" +
        "\nPizzas          | Napolitana      | R$  0.42" +
        "\nPizzas          | Peruana      | R$ 18.36" +
        "\nPizzas          | Portuguesa      | R$ 27.50" +
        "\n" +
        "\nDigite o NOME do terceiro produto desejado:"
        );

        String tipo1 = "";

        double valor1 = 0;

        if (produto1.equalsIgnoreCase("bolo brigadeiro")){
            tipo1 = "Bolos"; valor1 = 29.50;
        }else if (produto1.equalsIgnoreCase("bolo floresta negra")){
            tipo1 = "Bolos"; valor1 = 2.00;
        }else if (produto1.equalsIgnoreCase("bolo leite com nutella")){
            tipo1 = "Bolos"; valor1 = 29.23;
        }else if (produto1.equalsIgnoreCase("bolo mousse de chocolate")){
            tipo1 = "Bolos"; valor1 = 7.10;
        }else if (produto1.equalsIgnoreCase("bolo nega maluca")){
            tipo1 = "Bolos"; valor1 = 19.33;
        }else if (produto1.equalsIgnoreCase("bomba de creme")){
            tipo1 = "Doces"; valor1 = 17.71;
        }else if (produto1.equalsIgnoreCase("bomba de morango")){
            tipo1 = "Doces"; valor1 = 4.82;
        }else if (produto1.equalsIgnoreCase("filé mignon com fritas e cheddar")){
            tipo1 = "Sanduiches"; valor1 = 21.16;
        }else if (produto1.equalsIgnoreCase("hamburguer com queijo, champignon e rúcula")){
            tipo1 = "Sanduiches"; valor1 = 12.70;
        }else if (produto1.equalsIgnoreCase("provolone com salame")){
            tipo1 = "Sanduiches"; valor1 = 19.70;
        }else if (produto1.equalsIgnoreCase("vegetariano de beringela")){
            tipo1 = "Sanduiches"; valor1 = 28.22;
        }else if (produto1.equalsIgnoreCase("calabresa")){
            tipo1 = "Pizzas"; valor1 = 8.98;
        }else if (produto1.equalsIgnoreCase("napolitana")){
            tipo1 = "Pizzas"; valor1 = 0.42;
        }else if (produto1.equalsIgnoreCase("peruana")){
            tipo1 = "Pizzas"; valor1 = 18.36;
        }else if (produto1.equalsIgnoreCase("portuguesa")){
            tipo1 = "Pizzas"; valor1 = 27.50;
        }

        String tipo2 = "";

        double valor2 = 0;

        if (produto2.equalsIgnoreCase("bolo brigadeiro")){
            tipo2 = "Bolos"; valor2 = 29.50;
        }else if (produto2.equalsIgnoreCase("bolo floresta negra")){
            tipo2 = "Bolos"; valor2 = 2.00;
        }else if (produto2.equalsIgnoreCase("bolo leite com nutella")){
            tipo2 = "Bolos"; valor2 = 29.23;
        }else if (produto2.equalsIgnoreCase("bolo mousse de chocolate")){
            tipo2 = "Bolos"; valor2 = 7.10;
        }else if (produto2.equalsIgnoreCase("bolo nega maluca")){
            tipo2 = "Bolos"; valor2 = 19.33;
        }else if (produto2.equalsIgnoreCase("bomba de creme")){
            tipo2 = "Doces"; valor2 = 17.71;
        }else if (produto2.equalsIgnoreCase("bomba de morango")){
            tipo2 = "Doces"; valor2 = 4.82;
        }else if (produto2.equalsIgnoreCase("filé mignon com fritas e cheddar")){
            tipo2 = "Sanduiches"; valor2 = 21.16;
        }else if (produto2.equalsIgnoreCase("hamburguer com queijo, champignon e rúcula")){
            tipo2 = "Sanduiches"; valor2 = 12.70;
        }else if (produto2.equalsIgnoreCase("provolone com salame")){
            tipo2 = "Sanduiches"; valor2 = 19.70;
        }else if (produto2.equalsIgnoreCase("vegetariano de beringela")){
            tipo2 = "Sanduiches"; valor2 = 28.22;
        }else if (produto2.equalsIgnoreCase("calabresa")){
            tipo2 = "Pizzas"; valor2 = 8.98;
        }else if (produto2.equalsIgnoreCase("napolitana")){
            tipo2 = "Pizzas"; valor2 = 0.42;
        }else if (produto2.equalsIgnoreCase("peruana")){
            tipo2 = "Pizzas"; valor2 = 18.36;
        }else if (produto2.equalsIgnoreCase("portuguesa")){
            tipo2 = "Pizzas"; valor2 = 27.50;
        }

        String tipo3 = "";

        double valor3 = 0;

        if (produto3.equalsIgnoreCase("bolo brigadeiro")){
            tipo3 = "Bolos"; valor3 = 29.50;
        }else if (produto3.equalsIgnoreCase("bolo floresta negra")){
            tipo3 = "Bolos"; valor3 = 2.00;
        }else if (produto3.equalsIgnoreCase("bolo leite com nutella")){
            tipo3 = "Bolos"; valor3 = 29.23;
        }else if (produto3.equalsIgnoreCase("bolo mousse de chocolate")){
            tipo3 = "Bolos"; valor3 = 7.10;
        }else if (produto3.equalsIgnoreCase("bolo nega maluca")){
            tipo3 = "Bolos"; valor3 = 19.33;
        }else if (produto3.equalsIgnoreCase("bomba de creme")){
            tipo3 = "Doces"; valor3 = 17.71;
        }else if (produto3.equalsIgnoreCase("bomba de morango")){
            tipo3 = "Doces"; valor3 = 4.82;
        }else if (produto3.equalsIgnoreCase("filé mignon com fritas e cheddar")){
            tipo3 = "Sanduiches"; valor3 = 21.16;
        }else if (produto3.equalsIgnoreCase("hamburguer com queijo, champignon e rúcula")){
            tipo3 = "Sanduiches"; valor3 = 12.70;
        }else if (produto3.equalsIgnoreCase("provolone com salame")){
            tipo3 = "Sanduiches"; valor3 = 19.70;
        }else if (produto3.equalsIgnoreCase("vegetariano de beringela")){
            tipo3 = "Sanduiches"; valor3 = 28.22;
        }else if (produto3.equalsIgnoreCase("calabresa")){
            tipo3 = "Pizzas"; valor3 = 8.98;
        }else if (produto3.equalsIgnoreCase("napolitana")){
            tipo3 = "Pizzas"; valor3 = 0.42;
        }else if (produto3.equalsIgnoreCase("peruana")){
            tipo3 = "Pizzas"; valor3 = 18.36;
        }else if (produto3.equalsIgnoreCase("portuguesa")){
            tipo3 = "Pizzas"; valor3 = 27.50;
        }

        double total = valor1 + valor2 + valor3;

        JOptionPane.showMessageDialog (null, "Produtos selecionados:" +
        "\n" + produto1 + "  |  " + "R$ " + valor1 +
        "\n" + produto2 + "  |  " + "R$ " + valor2 +
        "\n" + produto3 + "  |  " + "R$ " + valor3 +
        "\nTOTAL  |  R$ " + total);

    }
}