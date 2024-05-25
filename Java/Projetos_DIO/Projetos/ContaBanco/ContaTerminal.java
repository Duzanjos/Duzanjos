import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = leia.next();

        System.out.println("Agora o número da conta.");
        int numero = leia.nextInt();
        leia.nextLine();

        System.out.println("Qual o seu nome completo?");
        String nomeCliente = leia.nextLine();

        System.out.println("Qual o seu saldo?");
        double saldo = leia.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+
        numero+" e o seu saldo "+saldo+" já está disponível para saque.");
        
        leia.close();
    }
}
