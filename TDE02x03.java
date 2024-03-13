import java.util.Scanner;

public class TDE02x03 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir uma string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        // Fechando o objeto Scanner para evitar vazamento de recursos
        scanner.close();

        // Contadores para caracteres maiúsculos, minúsculos, dígitos e caracteres especiais
        int maiusculos = 0;
        int minusculos = 0;
        int digitos = 0;
        int especiais = 0;

        // Iterando sobre cada caractere da string para contagem
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                maiusculos++;
            } else if (Character.isLowerCase(ch)) {
                minusculos++;
            } else if (Character.isDigit(ch)) {
                digitos++;
            } else {
                especiais++;
            }
        }

        // Imprimindo os resultados
        System.out.println("Caracteres maiúsculos: " + maiusculos);
        System.out.println("Caracteres minúsculos: " + minusculos);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Caracteres especiais: " + especiais);
    }
}
