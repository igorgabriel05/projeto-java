package aula1;

import javax.swing.JOptionPane;

public class BibliotecaJOptionPane {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World!");
        
        String nome = JOptionPane.showInputDialog("Por favor digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + ", Seja bem vindo(a).");
        
        // 0 - Usuário clicou em "Sim"
        // 1 - Usuário clicou em "Não"
        // 2 - Usuário clicou em "Cancelar"
        
        int resposta = JOptionPane.showConfirmDialog(null, "Escolha uma das opções: ");
        
        if(resposta == 0){
            JOptionPane.showMessageDialog(null, "Você clicou em SIM");
        }else if(resposta == 1){
            JOptionPane.showMessageDialog(null, "Você clicou em NÃO");
        }else{
            JOptionPane.showMessageDialog(null, "Você clicou em CANCELAR");
        }
    }
}
