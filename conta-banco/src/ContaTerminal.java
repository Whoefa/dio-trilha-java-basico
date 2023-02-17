import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Nome Completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Digite o numero da conta: ");
        int numConta = scanner.nextInt();
        System.out.println("Digite o limite da conta: ");
        double limite = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o numero da agencia: ");
        String numAgencia = scanner.nextLine();



        System.out.println("Ola "+nomeCompleto+" obrigado por criar uma conta em nosso banco sua agencia e :"+numAgencia+" numero da conta: "+numConta+"com saldo disponivel de :"+limite);


    }
}
