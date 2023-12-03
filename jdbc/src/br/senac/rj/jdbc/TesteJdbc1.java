package br.senac.rj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Scanner;


public class TesteJdbc1 {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost/banco"; // URL do banco de dados
			String user = "root"; //nome do usu�rio do banco
			String password = ""; //senha do usu�rio no banco
			Connection conn = DriverManager.getConnection(url, user, password);
			// Define a consulta
			String sql = "select * from conta where agencia=?";
			// Prepara a consulta
			PreparedStatement ps = conn.prepareStatement(sql);
			// Obt�m n�mero da ag�ncia a ser pesquisada
			Scanner sc = new Scanner(System.in);
			System.out.print("Entre com o n�mero de uma ag�ncia = ");
			int agenciaPesquisa = Integer.parseInt(sc.nextLine());
			ps.setInt(1, agenciaPesquisa);	// Substitui o primeiro par�metro da consulta pela ag�ncia informada	
			// Executa a consulta, resultando em um objeto da classe ResultSet
			ResultSet rs = ps.executeQuery();
			if (!rs.isBeforeFirst()) { // Verifica se n�o est� antes do primeiro registro
				System.out.println("N�o foram encontrados registros!");
			}
			else
			{
				// Efetua a leitura dos registros da tabela
				int totalRegistros = 0;
				while (rs.next()) {
				    int agencia = rs.getInt("agencia");
				    int numero = rs.getInt("numero");
				    String titular = rs.getString("titular");
				    double saldo = rs.getDouble("saldo");
				    // Apresenta os valores dos campos da tabela
				    System.out.println("N�mero do registro = " + rs.getRow());
				    System.out.println("Ag�ncia=" + agencia);
				    System.out.println("N�mero da conta=" + numero);
				    System.out.println("Titular=" + titular);
				    System.out.println("Saldo=" + NumberFormat.getCurrencyInstance().format(saldo));
				    System.out.println();
				    totalRegistros++;
				}
				System.out.println("Total de registros = " + totalRegistros);
			}
			sc.close();
		} catch (Exception erro) {
			System.out.println("Erro: " + erro.toString());
		}
	}
}
