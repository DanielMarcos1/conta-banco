import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência bancária: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o número da conta da agência: ");
        String numeroConta = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", você está na sua conta: " + numeroConta + " da agência: " + numeroAgencia + " seu saldo disponível para saque é de: " + saldoConta);
    }
}
