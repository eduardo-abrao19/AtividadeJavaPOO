package atividade19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        Calendario calendario = new Calendario(ano);

        System.out.print("Digite uma data para verificar se é feriado (dd/MM/yyyy): ");
        String dataInput = scanner.next();
        
        try {
            LocalDate data = LocalDate.parse(dataInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            if (calendario.ehFeriado(data)) {
                System.out.printf("%s é feriado: %s%n", data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), calendario.getFeriado(data));
            } else {
                System.out.printf("%s não é feriado.%n", data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida! Por favor, use o formato dd/MM/yyyy.");
        }

        System.out.print("Digite a primeira data (dd/MM/yyyy): ");
        String data1Input = scanner.next();
        System.out.print("Digite a segunda data (dd/MM/yyyy): ");
        String data2Input = scanner.next();

        try {
            LocalDate data1 = LocalDate.parse(data1Input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate data2 = LocalDate.parse(data2Input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            long diasDiferenca = calendario.diferencaDias(data1, data2);
            System.out.printf("A diferença em dias entre %s e %s é %d dias.%n",
                    data1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    diasDiferenca);
        } catch (DateTimeParseException e) {
            System.out.println("Uma das datas digitadas é inválida! Por favor, use o formato dd/MM/yyyy.");
        }
    }
}


