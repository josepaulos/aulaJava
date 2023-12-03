package br.senac.rj.jdbc;

import java.util.Scanner;

public class TesteJdbc2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Inicializa��o de vari�veis
		ContaCorrenteNormal conta = new ContaCorrenteNormal();
		int opcao, agenciaPesquisa, contaPesquisa;
		boolean resultado;
		do {
			System.out.println("1 - Cadastrar conta");
			System.out.println("2 - Consultar conta");
			System.out.println("3 - Atualizar conta");
			System.out.println("4 - Encerrar");
			System.out.print("Entre com uma op��o: ");
			opcao = Integer.parseInt(sc.nextLine());
			if (opcao < 1 || opcao > 4)
				System.out.println("Op��o incorreta!");
			else {
				if (opcao != 4) {
					try {
						System.out.print("Entre com o n�mero de uma ag�ncia = ");
						agenciaPesquisa = Integer.parseInt(sc.nextLine());
						System.out.print("Entre com o n�mero da conta = ");
						contaPesquisa = Integer.parseInt(sc.nextLine());
						switch (opcao) {
						case 1:
							resultado = conta.consultarConta(agenciaPesquisa, contaPesquisa);
							if (resultado)
								System.out.println("Conta j� cadastrada!");
							else {
								System.out.print("Entre com o nome do titular = ");
								String titular = sc.nextLine();
								conta.cadastrarConta(agenciaPesquisa, contaPesquisa, titular);
							}
							break;
						case 2:
							resultado = conta.consultarConta(agenciaPesquisa, contaPesquisa);
							if (resultado) {
								System.out.println("Titular = " + conta.getTitular());
								System.out.println("Saldo = " + conta.getSaldo());
							}
							break;
						case 3:
							resultado = conta.consultarConta(agenciaPesquisa, contaPesquisa);
							if (resultado) {
								System.out.println("Nome do titular = " + conta.getTitular());
								System.out.print("Entre com o novo nome do titular = ");
								String titular = sc.nextLine();
								if (!conta.atualizarConta(agenciaPesquisa, contaPesquisa, titular))
									System.out.println("Erro na atualiza��o da conta!");
							}
							break;
						}
					} catch (NumberFormatException erro) {
						System.out.println("Entre com o formato correto dos dados!");
					} catch (Exception erro) {
						System.out.println("Erro n�o identificado: " + erro.toString());
					}
				}
			}
		} while (opcao != 4);
		System.out.println("Programa encerrado!");
		sc.close();
	}
}
