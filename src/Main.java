import alife.models.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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