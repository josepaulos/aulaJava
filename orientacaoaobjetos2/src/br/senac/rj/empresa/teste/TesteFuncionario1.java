package br.senac.rj.empresa.teste;

import java.util.Scanner;

import br.senac.rj.empresa.modelo.Funcionario;

public class TesteFuncionario1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            Funcionario funcionario1 = new Funcionario();
            System.out.println("Digite o nº Registro");
            int registro = Integer.parseInt(sc.nextLine());
            funcionario1.setRegistro(registro);
            System.out.println("Digite o nome:");
            String nome = sc.nextLine();
            funcionario1.setNome(nome);
            System.out.println("Digite o nº Cargo");
            int cargo = Integer.parseInt(sc.nextLine());
            funcionario1.setCargo(cargo);
            System.out.println("Digite o salario");
            double salario = Double.parseDouble(sc.nextLine());
            funcionario1.setSalario(salario);

            System.out.println("Registro:" + funcionario1.getRegistro());
            System.out.println("Nome:" + funcionario1.getNome());
            System.out.println("Cargo:" + funcionario1.getCargo());
            System.out.println("Salário:" + funcionario1.getSalario());
            System.out.println("----------------------------------------");
            funcionario1.aplicarBonificacao();
            System.out.println("Novo Salário :" + funcionario1.getSalario());

            // Pergunta se deseja continuar
            char resposta;
            do {
                System.out.println("Deseja continuar (s/n)?");
                resposta = sc.nextLine().toLowerCase().charAt(0);
                if (resposta != 's' && resposta != 'n') {
                    System.out.println("Opção incorreta!");
                }
            } while (resposta != 's' && resposta != 'n');

            if (resposta == 'n') {
                break; // Sai do loop principal se a resposta for 'n'
            }

        } while (true);

        System.out.println("Programa encerrado.");
    }
}
