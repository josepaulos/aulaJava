package br.senac.rj.banco.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Livro {
    private int idLivro;
    private String nomeLivro;
    private int idEstante;
    private int idAutor;

    public int getIdLivro() {
        return idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public int getIdEstante() {
        return idEstante;
    }

    public int getIdAutorLivro() {
        return idAutor;
    }

    public boolean cadastrarLivro(int idLivro, String nomeLivro, int idEstante, int idAutor) {
        // Define a conexão
        Connection conexao = null;
        try {
            conexao = Conexao.conectaBanco();
            // Verifica se o livro já existe
            Livro livroExistente = consultarLivro(idLivro);
            if (livroExistente != null) {
                System.out.println("Livro já existe!");
                return false;
            }

            // Define a consulta
            String sql = "INSERT INTO livro (idLivro, nomeLivro, idEstante, autorLivro) VALUES (?, ?, ?, ?)";
            // Prepara a consulta
            PreparedStatement ps = conexao.prepareStatement(sql);
            // Define os parâmetros da consulta
            ps.setInt(1, idLivro);
            ps.setString(2, nomeLivro);
            ps.setInt(3, idEstante);
            ps.setInt(4, idAutor);

            // Execute o INSERT
            int totalRegistrosAfetados = ps.executeUpdate();
            if (totalRegistrosAfetados == 0) {
                System.out.println("Não foi feito o cadastro!!");
                return false;
            }
            System.out.println("Cadastro realizado!");
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao cadastrar o livro: " + erro.toString());
            return false;
        } finally {
            Conexao.fechaConexao(conexao);
        }
    }

    public Livro consultarLivro(int idLivro) {
    	
        // Define a conexão
        Connection conexao = null;
        try {
            conexao = Conexao.conectaBanco();
            // Define a consulta
            String sql = "SELECT * FROM livro WHERE idLivro=?";
            // Prepara a consulta
            PreparedStatement ps = conexao.prepareStatement(sql);
            // Define os parâmetros da consulta
            ps.setInt(1, idLivro);
            // Executa a consulta, resultando em um objeto da classe ResultSet
            ResultSet rs = ps.executeQuery();
            if (!rs.isBeforeFirst()) {
                System.out.println("Livro não cadastrado!");
                return null; // Livro não cadastrado
            } else {
                // Efetua a leitura do registro da tabela
                rs.next();
                Livro livro = new Livro();
                livro.idLivro = rs.getInt("idLivro");
                livro.nomeLivro = rs.getString("nomeLivro");
                livro.idEstante = rs.getInt("idEstante");
                livro.idAutor = rs.getInt("autorLivro");
                return livro;
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao consultar o livro: " + erro.toString());
            return null;
        } finally {
            Conexao.fechaConexao(conexao);
        }
    }


    public boolean atualizarLivro(int idLivro, String nomeLivro, int idEstante, int idAutor) {
    	
    	
        // Verifica se o livro já existe
        Livro livroExistente = consultarLivro(idLivro);
        if (livroExistente == null)
            return false;
        else {
            // Define a conexão
            Connection conexao = null;
            try {
                conexao = Conexao.conectaBanco();
                // Define a consulta
                String sql = "UPDATE livro SET nomeLivro=?, idEstante=?, autorLivro=? WHERE idLivro=?";
                // Prepara a consulta
                PreparedStatement ps = conexao.prepareStatement(sql);
                // Define os parâmetros da atualização
                ps.setString(1, nomeLivro);
                ps.setInt(2, idEstante);
                ps.setInt(3, idAutor);
                ps.setInt(4, idLivro);
                int totalRegistrosAfetados = ps.executeUpdate();
                if (totalRegistrosAfetados == 0)
                    System.out.println("Não foi feita a atualização!");
                else
                    System.out.println("Atualização realizada!");
                return true;
            } catch (SQLException erro) {
                System.out.println("Erro ao atualizar o livro: " + erro.toString());
                return false;
            } finally {
                Conexao.fechaConexao(conexao);
            }
        }
    }

    public boolean excluirLivro(int idLivro) {
        System.out.println("Tentando excluir livro com ID: " + idLivro);

        // Verifica se o livro existe antes de excluir
        Livro livroExistente = consultarLivro(idLivro);

        if (livroExistente == null) {
            System.out.println("Livro não encontrado para exclusão!");
            return false;
        }

        // Define a conexão
        Connection conexao = null;
        try {
            conexao = Conexao.conectaBanco();
            // Define a consulta
            String sql = "DELETE FROM livro WHERE idLivro=?";
            // Prepara a consulta
            PreparedStatement ps = conexao.prepareStatement(sql);
            // Define o parâmetro da consulta
            ps.setInt(1, idLivro);
            int totalRegistrosAfetados = ps.executeUpdate();
            if (totalRegistrosAfetados == 0) {
                System.out.println("Erro ao excluir o livro!");
                return false;
            } else {
                System.out.println("Exclusão realizada!");
                return true;
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao excluir o livro: " + erro.toString());
            return false;
        } finally {
            Conexao.fechaConexao(conexao);
        }
    }

    
    
    }


