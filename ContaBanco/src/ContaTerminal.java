
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner input = new Scanner(System.in);

        System.out.print("Para começarmos, digite o seu nome: ");
        nomeCliente = input.nextLine();

        System.out.print("Agora digite a sua Agência: ");
        agencia = input.nextLine();

        System.out.print("Informe por favor o número da Conta: ");
        numeroConta = input.nextInt();

        System.out.print("Agora digite o seu saldo: ");
        saldo = input.nextDouble();
        input.close();
        
        System.out.println("=================");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " 
        + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!");
        System.out.println("=================");
    }
}
