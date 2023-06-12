package aula1;

import javax.swing.JOptionPane;

public class Conversao {
    public static void main(String[] args){
        //Argumento para ler 1 número (via JOptionPane) e exibir um alerta
        //com o quadrado desse número
        //Ex:   Input: 5
        //Exibe: 25
        String num = JOptionPane.showInputDialog("Informe um número: ");
        //Efetuar uma operação matematica na var "num"
        //Logo, a gente precisa converter a String "num" em um tipo de dado numérico
        int x = Integer.parseInt(num);
        int quadrado = x * x;
        
        String result = String.valueOf(quadrado);
        JOptionPane.showMessageDialog(null, "O quadrado de " + num + " é igual a " + result);
        
        //Converter String para double: Double.parseDouble
        //Converter String para boolean: Boolean.parseBoolean
        //Converter double/boolean/int para String: String.valueOf()
        
    }
}
