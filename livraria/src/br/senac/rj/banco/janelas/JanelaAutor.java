package br.senac.rj.banco.janelas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import br.senac.rj.banco.modelo.Autor; 

public class JanelaAutor {
    public static JFrame criarJanelaAutor() {
        // Define a janela
        JFrame janelaAutor = new JFrame("Autor"); // Janela Normal
        janelaAutor.setResizable(false); // A janela não poderá ter o tamanho ajustado
        janelaAutor.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        janelaAutor.setSize(400, 300); // Define tamanho da janela
        // Define o layout da janela
        Container caixa = janelaAutor.getContentPane();
        caixa.setLayout(null);
        // Define os labels dos campos
        JLabel labelAutor = new JLabel("Id Autor: ");
        JLabel labelNome = new JLabel("Nome do Autor: ");
        // Posiciona os labels na janela
        labelAutor.setBounds(50, 40, 100, 20); // coluna, linha, largura, tamanho
        labelNome.setBounds(50, 120, 100, 20); // coluna, linha, largura, tamanho
        // Define os input box
        JTextField jTextAutor = new JTextField();
        JTextField jTextNome = new JTextField();
        // Define se os campos estão habilitados ou não no início
        jTextAutor.setEnabled(true);
        jTextNome.setEnabled(false);
        // Posiciona os input box
        jTextAutor.setBounds(180, 40, 50, 20);
        jTextNome.setBounds(180, 120, 150, 20);
        // Adiciona os rótulos e os input box na janela
        janelaAutor.add(labelAutor);
        janelaAutor.add(jTextAutor);
        janelaAutor.add(labelNome);
        janelaAutor.add(jTextNome);

        // Define botões e a localização deles na janela
        JButton botaoConsultar = new JButton("Consultar");
        botaoConsultar.setBounds(150, 200, 100, 20);
        janelaAutor.add(botaoConsultar);
        JButton botaoGravar = new JButton("Gravar");
        botaoGravar.setBounds(50, 200, 100, 20);
        botaoGravar.setEnabled(false);
        janelaAutor.add(botaoGravar);
        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBounds(250, 200, 100, 20);
        janelaAutor.add(botaoLimpar);

        // Define objeto autor para pesquisar no banco de dados
        Autor autor = new Autor();

        // Define ações dos botões
        botaoConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int idAutor = Integer.parseInt(jTextAutor.getText());

                    if (autor.consultarAutor(idAutor)) {
                        // Autor existe, preencher o nome
                        jTextNome.setText(autor.getNomeAutor());
                        jTextAutor.setEnabled(false);
                        botaoConsultar.setEnabled(false);
                        jTextNome.setEnabled(true);
                        jTextNome.requestFocus();
                        botaoGravar.setEnabled(true);
                    } else {
                        // Autor não existe, habilitar campo de nome para cadastrar
                        jTextNome.setText("");
                        jTextAutor.setEnabled(false);
                        botaoConsultar.setEnabled(false);
                        jTextNome.setEnabled(true);
                        jTextNome.requestFocus();
                        botaoGravar.setEnabled(true);
                    }
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(janelaAutor, "Preencha o campo Id Autor corretamente!!");
                }
            }
        });



        botaoGravar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int idAutor = Integer.parseInt(jTextAutor.getText());
                String novoNome = jTextNome.getText().trim();

                if (autor.consultarAutor(idAutor)) {
                    // Autor existe, apenas atualizar o nome
                    if (novoNome.isEmpty()) {
                        JOptionPane.showMessageDialog(janelaAutor, "Preencha o campo Nome do Autor!!");
                        return;
                    }

                    autor.setNomeAutor(novoNome);
                    // Adicione aqui a lógica para atualizar o nome no banco de dados (se necessário)
                } else {
                    // Autor não existe, cadastrar
                    if (novoNome.isEmpty()) {
                        JOptionPane.showMessageDialog(janelaAutor, "Preencha o campo Nome do Autor!!");
                        return;
                    }

                    if (!autor.cadastrarAutor(idAutor, novoNome)) {
                        JOptionPane.showMessageDialog(janelaAutor, "Erro na inclusão do autor!");
                    } else {
                        JOptionPane.showMessageDialog(janelaAutor, "Inclusão realizada!");
                    }
                }

                // Desabilitar campos e habilitar botão de consulta
                jTextAutor.setText("");
                jTextNome.setText("");
                jTextAutor.setEnabled(true);
                jTextNome.setEnabled(false);
                botaoConsultar.setEnabled(true);
                botaoGravar.setEnabled(false);
                jTextAutor.requestFocus();
            }
        });



        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextAutor.setText("");
                jTextNome.setText("");
                jTextAutor.setEnabled(true);
                jTextNome.setEnabled(false);
                botaoConsultar.setEnabled(true);
                botaoGravar.setEnabled(false);
                jTextAutor.requestFocus();
            }
        });

        return janelaAutor;
    }
}
