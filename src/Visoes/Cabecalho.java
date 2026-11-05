package Visoes;

import Classes.EstadoDaPartida;
import Classes.Jogo;

import javax.swing.*;
import java.awt.*;

public class Cabecalho extends JPanel {
    public Cabecalho(Jogo novoJogo) {
        setLayout(new GridLayout(2, 1));

        setPreferredSize(new Dimension(0, 80));


        JLabel titulo = new JLabel("Jogo da Velha");
        JLabel jogador = new JLabel("");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        jogador.setFont(new Font("Arial", Font.BOLD, 15));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        jogador.setHorizontalAlignment(SwingConstants.LEFT);
        add(titulo);
        add(jogador);
        novoJogo.registrarObservador(eventoJogo->{
            if(eventoJogo.getEstadoDaPartida() == EstadoDaPartida.EM_ANDAMENTO){
                jogador.setText("Vez do jogador(a): " + eventoJogo.getJogadorAtual().getNome());
            }
        });
    }

}
