package br.senac.rj.banco.janelas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import br.senac.rj.banco.modelo.Livro;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaLivro {
    public static JFrame criarJanelaLivro() {
        Livro livro = new Livro(); // Remova 'final' aqui
        JFrame janelaLivro = new JFrame("Livro");
        janelaLivro.setResizable(false);
        janelaLivro.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        janelaLivro.setSize(400, 300);

        Container caixa = janelaLivro.getContentPane();
        caixa.setLayout(null);

        JLabel labelIdLivro = new JLabel("ID Livro:");
        JLabel labelNomeLivro = new JLabel("Nome do Livro:");
        JLabel labelIdEstante = new JLabel("ID Estante:");
        JLabel labelIdAutor = new JLabel("ID Autor:");

        labelIdLivro.setBounds(50, 40, 100, 20);
        labelNomeLivro.setBounds(50, 80, 100, 20);
        labelIdEstante.setBounds(50, 120, 100, 20);
        labelIdAutor.setBounds(50, 160, 100, 20);

        JTextField jTextIdLivro = new JTextField();
        JTextField jTextNomeLivro = new JTextField();
        JTextField jTextIdEstante = new JTextField();
        JTextField jTextIdAutor = new JTextField();

        jTextIdLivro.setBounds(180, 40, 50, 20);
        jTextNomeLivro.setBounds(180, 80, 150, 20);
        jTextIdEstante.setBounds(180, 120, 50, 20);
        jTextIdAutor.setBounds(180, 160, 50, 20);

        janelaLivro.add(labelIdLivro);
        janelaLivro.add(jTextIdLivro);
        janelaLivro.add(labelNomeLivro);
        janelaLivro.add(jTextNomeLivro);
        janelaLivro.add(labelIdEstante);
        janelaLivro.add(jTextIdEstante);
        janelaLivro.add(labelIdAutor);
        janelaLivro.add(jTextIdAutor);

        JButton botaoConsultar = new JButton("Consultar");
        botaoConsultar.setBounds(250, 40, 100, 20);
        janelaLivro.add(botaoConsultar);

        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(150, 200, 100, 20);
        janelaLivro.add(botaoCadastrar);

        JButton botaoAlterar = new JButton("Alterar");
        botaoAlterar.setBounds(50, 200, 100, 20);
        botaoAlterar.setEnabled(false);
        janelaLivro.add(botaoAlterar);

        JButton botaoExcluir = new JButton("Excluir");
        botaoExcluir.setBounds(250, 200, 100, 20);
        botaoExcluir.setEnabled(false);
        janelaLivro.add(botaoExcluir);

        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBounds(250, 240, 100, 20);
        janelaLivro.add(botaoLimpar);

        botaoConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int idLivro = Integer.parseInt(jTextIdLivro.getText());
                    Livro livroConsultado = livro.consultarLivro(idLivro);
                    if (livroConsultado != null) {
                        jTextNomeLivro.setText(livroConsultado.getNomeLivro());
                        jTextIdEstante.setText(String.valueOf(livroConsultado.getIdEstante()));
                        jTextIdAutor.setText(String.valueOf(livroConsultado.getIdAutorLivro()));
                        jTextIdLivro.setEnabled(false);
                        botaoConsultar.setEnabled(false);
                        botaoCadastrar.setEnabled(false);
                        jTextNomeLivro.setEnabled(true);
                        jTextIdEstante.setEnabled(true);
                        jTextIdAutor.setEnabled(true);
                        botaoAlterar.setEnabled(true);
                        botaoExcluir.setEnabled(true);
                    } else {
                        jTextNomeLivro.setText("");
                        jTextIdEstante.setText("");
                        jTextIdAutor.setText("");
                        jTextIdLivro.setEnabled(false);
                        botaoConsultar.setEnabled(false);
                        botaoCadastrar.setEnabled(true);
                        jTextNomeLivro.setEnabled(true);
                        jTextIdEstante.setEnabled(true);
                        jTextIdAutor.setEnabled(true);
                        botaoAlterar.setEnabled(false);
                        botaoExcluir.setEnabled(false);
                    }
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(janelaLivro, "Preencha o campo ID Livro corretamente!!");
                }
            }
        });

        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(janelaLivro, "Deseja cadastrar o livro?", "Confirmação",
                        JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    try {
                        if (!jTextIdLivro.getText().isEmpty() && !jTextNomeLivro.getText().isEmpty() &&
                            !jTextIdEstante.getText().isEmpty() && !jTextIdAutor.getText().isEmpty()) {
                            int idLivro = Integer.parseInt(jTextIdLivro.getText());
                            String novoNomeLivro = jTextNomeLivro.getText().trim();
                            int novaEstante = Integer.parseInt(jTextIdEstante.getText());
                            int novoAutorLivro = Integer.parseInt(jTextIdAutor.getText());

                            if (livro.cadastrarLivro(idLivro, novoNomeLivro, novaEstante, novoAutorLivro)) {
                                JOptionPane.showMessageDialog(janelaLivro, "Livro cadastrado com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(janelaLivro, "Erro ao cadastrar o livro!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(janelaLivro, "Preencha todos os campos!");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(janelaLivro, "Preencha os campos corretamente!");
                    }
                }
            }
        });

        botaoAlterar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(janelaLivro, "Deseja alterar o livro?", "Confirmação",
                        JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    int idLivro = Integer.parseInt(jTextIdLivro.getText());
                    String novoNomeLivro = jTextNomeLivro.getText().trim();
                    int novaEstante = Integer.parseInt(jTextIdEstante.getText());
                    int novoAutorLivro = Integer.parseInt(jTextIdAutor.getText());

                    if (livro.atualizarLivro(idLivro, novoNomeLivro, novaEstante, novoAutorLivro)) {
                        JOptionPane.showMessageDialog(janelaLivro, "Livro alterado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(janelaLivro, "Erro ao alterar o livro!");
                    }
                }
            }
        });

        botaoExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui você deve pegar o ID do livro diretamente do campo de texto
                int idLivro = Integer.parseInt(jTextIdLivro.getText());
                int resposta = JOptionPane.showConfirmDialog(janelaLivro, "Deseja excluir o livro?", "Confirmação",
                        JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    // Agora você passa o idLivro corretamente
                    if (livro.excluirLivro(idLivro)) {
                        JOptionPane.showMessageDialog(janelaLivro, "Livro excluído com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(janelaLivro, "Erro ao excluir o livro!");
                    }
                }
            }
        });



        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextIdLivro.setText("");
                jTextNomeLivro.setText("");
                jTextIdEstante.setText("");
                jTextIdAutor.setText("");
                jTextIdLivro.setEnabled(true);
                botaoConsultar.setEnabled(true);
                botaoCadastrar.setEnabled(true);
                jTextNomeLivro.setEnabled(true);
                jTextIdEstante.setEnabled(true);
                jTextIdAutor.setEnabled(true);
                botaoAlterar.setEnabled(false);
                botaoExcluir.setEnabled(false);
                jTextIdLivro.requestFocus();
            }
        });

        return janelaLivro;
    }
}
