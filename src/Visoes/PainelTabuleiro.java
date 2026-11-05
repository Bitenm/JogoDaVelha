package Visoes;

import Classes.Jogo;
import Classes.TipoEventoJogo;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {
    public PainelTabuleiro(Jogo novoJogo) {
        setLayout(new GridLayout(3, 3, 4, 4));
        setBackground(new Color(203, 213, 225));
        BotaoCasa[][] matriz = new BotaoCasa[3][3];


        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                int linhaAtual = linha;
                int colunaAtual = coluna;
                BotaoCasa botaoCasa = new BotaoCasa();

                botaoCasa.addActionListener(evento ->{
                    novoJogo.Jogada(linhaAtual,colunaAtual);
                });

                add(botaoCasa);
                matriz[linhaAtual][colunaAtual] = botaoCasa;

            }
        }

        novoJogo.registrarObservador(eventoJogo-> {
            if(eventoJogo.getTipoEventoJogo() == TipoEventoJogo.JOGADA){
                matriz[eventoJogo.getLinha()][eventoJogo.getColuna()].setText(String.valueOf(eventoJogo.getSimbolo()));
            } else if(eventoJogo.getTipoEventoJogo() == TipoEventoJogo.REINICIO){

                for (int linha = 0; linha < 3; linha++) {
                    for (int coluna = 0; coluna < 3; coluna++) {
                        matriz[linha][coluna].setText("");
                    }
                }

            }
        });

    }
}
