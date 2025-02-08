import java.util.*;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Calculadora básica
        System.out.print("Digite um número número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        System.out.print("Digite outro número: ");
        double num2 = scanner.nextDouble();
        
        switch (operador) {
            case '+': System.out.println("Resultado: " + (num1 + num2)); break;
            case '-': System.out.println("Resultado: " + (num1 - num2)); break;
            case '*': System.out.println("Resultado: " + (num1 * num2)); break;
            case '/': System.out.println("Resultado: " + (num2 != 0 ? (num1 / num2) : "Erro: divisão por zero")); break;
            default: System.out.println("Operador inválido");
        }
        
        // 2. Verificação de palíndromo
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next().toLowerCase();
        String invertida = new StringBuilder(palavra).reverse().toString();
        System.out.println(palavra.equals(invertida) ? "É um palíndromo" : "Não é um palíndromo");
        
        // 3. Sequência de Fibonacci
        System.out.print("Digite um número, será usado para a sequência de Fibonacci: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }
        System.out.println();
        
        // 4. Número invertido
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        String numeroInvertido = new StringBuilder(String.valueOf(numero)).reverse().toString();
        System.out.println("Número invertido: " + numeroInvertido);
        
        // 5. Verificação de anagramas
        System.out.print("Digite uma palavra: ");
        String palavra1 = scanner.next().toLowerCase();
        System.out.print("Digite outra palavra: ");
        String palavra2 = scanner.next().toLowerCase();
        char[] arr1 = palavra1.toCharArray();
        char[] arr2 = palavra2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2) ? "Estas palavras são anagramas" : "Estas palavras não são anagramas");
        
        // 6. Jogo de adivinhação
        Random random = new Random();
        int numeroAleatorio = random.nextInt(50) + 1;
        int tentativa;
        do {
            System.out.print("Adivinhe o número (entre 1 e 50): ");
            tentativa = scanner.nextInt();
            if (tentativa == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou.");
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        } while (tentativa != numeroAleatorio);
        
        // 7. Contagem de palavras em uma frase
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        String[] palavras = frase.trim().split("\\s+");
        System.out.println("Número de palavras na frase: " + palavras.length);
        
        scanner.close();
    }
}

