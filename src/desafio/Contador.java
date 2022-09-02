package desafio;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		int opcao = 1;
		while (opcao == 1) {
			System.out.println("Digite o primeiro par�metro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo par�metro");
			int parametroDois = terminal.nextInt();
			try {

				// chamando o m�todo contendo a l�gica de contagem
				formatarLinha();
				contar(parametroUm, parametroDois);
				

			} catch (ParametrosInvalidosException exception) {
				System.out.println("O segundo par�metro deve ser maior que o primeiro");
			} finally {
				formatarLinha();
				System.out.println("Digite 1 para CONTINUAR ou 2 para SAIR");
				opcao = terminal.nextInt();
			}
		}
		formatarLinha();
		System.out.println("ENCERRANDO...");
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		System.out.println(String.format("O total de n�meros exibidos ser� de: %s", contagem));
		for (int i = 0; i < contagem; i++) {
			System.out.println(String.format("Imprimindo o n�mero: %s", i));
		}
	}
	
	static void formatarLinha() {
		System.out.println("=================");
	}
}
