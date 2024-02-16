import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao A Life");
        System.out.println("Aqui você vai ter uma calculadora de vida, " +
                "e poderá prever o ano de sua morte");

        System.out.println("Para calcular até quando você vai viver, precisaremos de algumas" +
                " informações");

        System.out.print("Informe o seu nome: ");
        String name = scan.nextLine();

        System.out.printf("Cool, %s. Agora informe o dia de sua data de nascimento: ",name);
        int day = scan.nextInt();

        System.out.print("Agora informe o mês de sua data de nascimento: ");
        int mounth = scan.nextInt();

        System.out.print("Agora informe o ano do seu nascimento: ");
        int year = scan.nextInt();

        String birthDate = """
                %d/%d/%d
                """.formatted(day, mounth, year);

        String deathDate = """
                %d/%d/%d
                """.formatted(day, mounth, year + 100);

        System.out.println(deathDate);
    }
}