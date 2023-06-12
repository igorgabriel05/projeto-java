package aula1;

import javax.swing.JOptionPane;

public class TratamentoExcecoes {

    public static void main(String[] args) {
        //Uma exceção é disparada quando o fluxo "normal" da aplicação sofre
        //algum tipo inesperada e portanto o algoritimo não sabe como
        //se comportar.
        //Ex: Conversão de tipos de dados (converter "Teste" em inteiro)
        //Ex: Tentativa de acessar uma posição inexistente dentro de um array
        //Ex: Fazer uma divisão por 0
        String idade = JOptionPane.showInputDialog("Qual é a sua idade? ");
        //verificar se o usuário é MAIO ou MENOR de idade
        try {
            int intIdade = Integer.parseInt(idade);

            if (intIdade >= 18) {
                JOptionPane.showMessageDialog(null, "Então você é maior de idade");
            } else {
                JOptionPane.showMessageDialog(null, "Então você é menor de idade");
            }
        } catch (Exception e) {
            //Executa aqui se dentro do "try" foi disparada uma exceção 
            JOptionPane.showMessageDialog(null, "Erro ao converter número: " + e.getMessage());
        }
    }
}
