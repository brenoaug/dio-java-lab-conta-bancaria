import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o seu nome e sobrenome?");
		String nomeCliente = ler.next();
		String sobrenomeCliente = ler.next();
		
		System.out.println("Qual é o número da sua conta:");
		int numeroConta = ler.nextInt();
		
		System.out.println("Qual é a sua agencia?");
		String agencia = ler.next();
		
		System.out.println("Digite seu saldo");
		double saldo = ler.nextDouble();
		
		System.out.println("Olá " + nomeCliente +" " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " reais já está disponível para saque.");
		
	}

}
