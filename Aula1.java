package aula1;

import java.util.Scanner;

public class Aula1 {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, informe o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Seja bem vindo(a), Sr(a) " + nome + ".");

        System.out.print(nome + ", informe a sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Sua idade é " + idade + ".");
    }

}
