package util;

import java.util.Scanner;

public class Entrada {
    private static final Scanner scanner = new Scanner(System.in);

    public static int lerNumero(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. " + mensagem);
            scanner.next(); // descarta a entrada inválida
        }
        int numero = scanner.nextInt();
        scanner.nextLine(); // consome o \n pendente
        return numero;
    }

    public static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
}