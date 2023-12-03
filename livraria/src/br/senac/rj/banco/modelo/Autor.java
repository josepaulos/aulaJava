package br.senac.rj.banco.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Autor {
	private int autorLivro;
	private String nomeAutor;
	public int getAutorlivro() {
		return autorLivro;
	}
	public void setAutorlivro(int autorlivro) {
		this.autorLivro = autorlivro;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
	public boolean cadastrarAutor(int idAutorLivro, String nomeAutor) {
		System.out.println("ID do Autor: " + idAutorLivro);
	    System.out.println("Nome do Autor: " + nomeAutor);
	    // Define a conexão
	    Connection conexao = null;
	    try {
	        conexao = Conexao.conectaBanco();
	        // Define a consulta
	        String sql = "INSERT INTO autor (idAutor, nomeAutor) VALUES (?, ?)";
	        // Prepara a consulta
	        PreparedStatement ps = conexao.prepareStatement(sql);
	        // Define os parâmetros da consulta
	        ps.setInt(1, idAutorLivro);
	        ps.setString(2, nomeAutor);

	        // Execute o INSERT
	        int totalRegistrosAfetados = ps.executeUpdate();
	        if (totalRegistrosAfetados == 0) {
	            System.out.println("Não foi feito o cadastro!!");
	            return false;
	        }
	        System.out.println("Cadastro realizado!");
	        return true;
	    } catch (SQLException erro) {
	        System.out.println("Erro ao cadastrar Autor: " + erro.toString());
	        return false;
	    } finally {
	        Conexao.fechaConexao(conexao);
	    }
	}



	
	public boolean consultarAutor(int idAutorLivro) {
		
	    // Define a conex�o
	    Connection conexao = null;
	    try {
	        conexao = Conexao.conectaBanco();
	        // Define a consulta
	        String sql = "SELECT * FROM autor WHERE idAutor=?";
	        // Prepara a consulta
	        PreparedStatement ps = conexao.prepareStatement(sql);
	        // Define os par�metros da consulta
	        ps.setInt(1, idAutorLivro); // Substitui o primeiro par�metro da consulta pelo idAutorLivro informado
	        // Executa a consulta, resultando em um objeto da classe ResultSet
	        ResultSet rs = ps.executeQuery();
	        if (!rs.isBeforeFirst()) { // Verifica se n�o est� antes do primeiro registro
	            System.out.println("Autor não cadastrado!");
	            return false; // Autor não cadastrado
	        } else {
	            // Efetua a leitura do registro da tabela
	            while (rs.next()) {
	                this.autorLivro = rs.getInt("idAutor");
	                this.nomeAutor = rs.getString("nomeAutor");
	            }
	            return true;
	        }
	    } catch (SQLException erro) {
	        System.out.println("Erro ao consultar o autor: " + erro.toString());
	        return false;
	    } finally {
	        Conexao.fechaConexao(conexao);
	    }
	}

	
	

}
