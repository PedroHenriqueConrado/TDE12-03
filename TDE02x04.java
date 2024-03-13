import java.util.Scanner;

public class TDE02x04 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir o número de degraus
        System.out.print("Digite o número de degraus da escada: ");
        int numDegraus = scanner.nextInt();

        // Fechando o objeto Scanner para evitar vazamento de recursos
        scanner.close();

        // Iterando sobre o número de degraus e imprimindo a escada
        for (int i = 1; i <= numDegraus; i++) {
            // Imprimindo espaços antes de cada degrau
            for (int j = 1; j <= numDegraus - i; j++) {
                System.out.print(" ");
            }

            // Imprimindo degrau atual
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }

            // Indo para a próxima linha após cada degrau
            System.out.println();
        }
    }
}
