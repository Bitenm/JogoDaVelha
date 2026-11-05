package Visoes;

import Classes.EstadoDaPartida;
import Classes.Jogo;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal(Jogo novoJogo) {
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);

        Cabecalho cabecalho = new Cabecalho(novoJogo);
        add(cabecalho, BorderLayout.NORTH);

        PainelTabuleiro painelTabuleiro = new PainelTabuleiro(novoJogo);
        add(painelTabuleiro, BorderLayout.CENTER);

        setVisible(true);

        novoJogo.registrarObservador(eventoJogo -> {
            if (eventoJogo.getEstadoDaPartida() == EstadoDaPartida.VITORIA) {
                JOptionPane.showMessageDialog(
                        this,
                        eventoJogo.getJogadorAtual().getNome() + " venceu a partida!",
                        "Fim de jogo",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (eventoJogo.getEstadoDaPartida() == EstadoDaPartida.EMPATE) {
                JOptionPane.showMessageDialog(
                        this,
                        "A partida terminou em empate.",
                        "Fim de jogo",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            if(eventoJogo.getEstadoDaPartida() != EstadoDaPartida.EM_ANDAMENTO){
               int resposta =  JOptionPane.showConfirmDialog(
                    this,
                    "Deseja reiniciar a partida?",
                        "Reiniciar Jogo",
                        JOptionPane.YES_NO_OPTION
                );

                if (resposta == JOptionPane.YES_OPTION) {
                    novoJogo.reiniciar();
                }
            }
        });

    }
}
