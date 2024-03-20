import alife.models.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            1. Melhorias:
                1.1. aplicação de construtores na classe;
                1.2. fazer uma análise do que podem ou não ser comportamentos do usuário para
                dessa maneira alocar melhor na classe ou criar algo especificamente para
                comportamentos.
                1.3. gerar um numero aleatório para cada interação com usuário.
            2. Bug fix:
                2.1. o programa permite que o usuário preencha dados nulos ou que quebram o
                programa, implementar algo que venha a prevenir esse comportamento;
         */


        Person user = new Person();
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao A Life");
        System.out.println("Aqui você vai ter uma calculadora de vida, " +
                "e poderá prever o ano de sua morte");

        System.out.println("Para calcular até quando você vai viver, precisaremos de algumas" +
                " informações");

        System.out.print("Informe o seu nome: ");
        user.setName(scan.nextLine());

        System.out.printf("Cool, %s. Agora informe o dia de sua data de nascimento: ", user.getName());
        user.setDay(scan.nextInt());

        System.out.print("Agora informe o mês de sua data de nascimento: ");
        user.setMounth(scan.nextInt());

        System.out.print("Agora informe o ano do seu nascimento: ");
        user.setYear(scan.nextInt());

        user.setBirthDate();
        user.setDeathDate();

        System.out.println(user.showDetails());
    }
}