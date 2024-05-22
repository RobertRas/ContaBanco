import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criado um objeto para receber dados
        Scanner entrada = new Scanner(System.in);

        //recebo o nome do cliente
        System.out.println("Digite seu nome:");
        String nomeUsuario = entrada.nextLine();


        //recebo o número da agência
        System.out.println("Digite o número da sua agência: ");
        String agencia =  entrada.nextLine();


        //recebo o número sa conta
        System.out.println("Digite o número da sua conta: ");
        int numeroConta = entrada.nextInt();
        
        //recebo o valor do saldo
        System.out.println("Digite o seu Saldo: ");
        double saldo = entrada.nextDouble();

        //mostro na tela a mensagem conforme dados inseridos
        System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numeroConta + " e seu saldo "+ saldo + " já está disponível para saque");

    }
}
